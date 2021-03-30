package com.fc.test.shiro;


import com.fc.test.model.*;
import com.fc.test.service.impl.*;
import com.fc.test.util.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: shiro的自定义realm
 * Realm：域，Shiro从从Realm获取安全数据（如用户、角色、权限），就是说SecurityManager要验证用户身份，那么它需要从Realm获取相应的用户进行比较以确定用户身份是否合法；也需要从Realm得到用户相应的角色/权限进行验证用户是否能进行操作；可以把Realm看成DataSource，即安全数据源。
 * @Author 张小黑的猫
 * @data 2019-05-22 17:51
 */

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private TSysUserServiceImpl tSysUserService;
    @Autowired
    private TSysRoleServiceImpl tRoleService;
    @Autowired
    private TSysRoleUserServiceImpl tRoleUserService;
    @Autowired
    private TSysPermissionRoleServiceImpl tPermissionRoleService;
    @Autowired
    private TSysPermissionServiceImpl tPermissionService;
    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.获取用户输入的账号
        String username = (String)token.getPrincipal();
        //2.通过username从数据库中查找到user实体
        //通过criteria构造查询条件

        TSysUserExample userExample = new TSysUserExample();
        userExample.setOrderByClause("username asc"); //asc升序,desc降序排列
        userExample.setDistinct(false); //去除重复,true是选择不重复记录,false反之
        TSysUserExample.Criteria criteria = userExample.createCriteria(); //构造自定义查询条件
        criteria.andUsernameEqualTo(username);

        List<TSysUser> user = tSysUserService.selectByExample(userExample);

        if(user.size()==0){
            return null;
        }
        System.out.println(user.get(0));
        //3.通过SimpleAuthenticationInfo做身份处理
        SimpleAuthenticationInfo simpleAuthenticationInfo =
                new SimpleAuthenticationInfo(user.get(0),user.get(0).getPassword(),ByteSource.Util.bytes(user.get(0).getSalt()),getName());
        //4.用户账号状态验证等其他业务操作
      /*  if(!user.getAvailable()){
            throw new AuthenticationException("该账号已经被禁用");
        }*/
        //5.返回身份处理对象
        return simpleAuthenticationInfo;
    }

    @Override
    /**
     * 授权
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        //获取当前登录的用户
        TSysUser user = (TSysUser) principal.getPrimaryPrincipal();
        //通过SimpleAuthenticationInfo做授权
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //添加角色

        TSysRoleUserExample roleUserExample = new TSysRoleUserExample();
        roleUserExample.setDistinct(true);
        TSysRoleUserExample.Criteria criteria = roleUserExample.createCriteria();
        criteria.andSysUserIdEqualTo(user.getId());
        //获取用户角色
        List<TSysRoleUser> tSysRoleUsers = tRoleUserService.selectByExample(roleUserExample);
        //获取角色
        TSysRoleExample roleExample = new TSysRoleExample();
        roleExample.setDistinct(true);
        TSysRoleExample.Criteria criteria3 = roleExample.createCriteria();
        List<String> roles = new ArrayList<>();
        for (TSysRoleUser tSysRoleUser : tSysRoleUsers) {
            roles.add(tSysRoleUser.getSysRoleId());
        }
        criteria3.andIdIn(roles);
        //获取用户角色
        List<TSysRole> tSysRoles = tRoleService.selectByExample(roleExample);
        Set<String> roleNames = new HashSet<>();
        for (TSysRole tSysRole : tSysRoles) {
            roleNames.add(tSysRole.getName());
            simpleAuthorizationInfo.addRole(tSysRole.getName());
            TSysPermissionRoleExample tSysPermissionRoleExample = new TSysPermissionRoleExample();
            tSysPermissionRoleExample.setDistinct(true);
            TSysPermissionRoleExample.Criteria criteria2 = tSysPermissionRoleExample.createCriteria();
            criteria2.andRoleIdEqualTo(tSysRole.getId());
            List<TSysPermissionRole> permissionRoles = tPermissionRoleService.selectByExample(tSysPermissionRoleExample);
            //获取角色对应的权限
            for(TSysPermissionRole  p:permissionRoles){
                TSysPermissionExample tSysPermissionExample = new TSysPermissionExample();
                tSysPermissionExample.setDistinct(true);
                TSysPermissionExample.Criteria criteria4 = tSysPermissionExample.createCriteria();
                criteria4.andIdEqualTo(p.getPermissionId());
                List<TSysPermission> permissions = tPermissionService.selectByExample(tSysPermissionExample);
                List<String> list = new ArrayList<>();
                for (TSysPermission permission : permissions) {
                    list.add(permission.getPerms());
                }
                //添加权限,非空集合
                List<String> collect = list.stream().filter(item -> item != null).collect(Collectors.toList());
                simpleAuthorizationInfo.addStringPermissions(collect);
            }
        }
        //添加角色
        simpleAuthorizationInfo.addRoles(roleNames);

        return simpleAuthorizationInfo;
    }

    /**
     * 清理缓存权限
     */
    public void clearCachedAuthorizationInfo()
    {
        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }


    public List<String> getPermissions(){
        List<String> list = new ArrayList<>();
        list.add("sing");
        list.add("rap");
        list.add("jump");
        list.add("basketball");
        return list;
    }
}
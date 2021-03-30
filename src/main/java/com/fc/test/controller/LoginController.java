package com.fc.test.controller;

import com.fc.test.model.TSysUser;
import com.fc.test.service.impl.TSysUserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.MessageUtils;

import java.util.UUID;

/**
 * @Description 登录
 * @Author 张小黑的猫
 * @data 2019-05-22 18:17
 */
@Controller
public class LoginController {

    @Autowired
    private TSysUserServiceImpl tSysUserService;

    @ApiOperation(value="登入页",notes="登入页")
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @ApiOperation(value="注册页",notes="注册页")
    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @ApiOperation(value="注册",notes="注册")
    @PostMapping("/register")
    public String register(String username,String password){
        String msg = "";


        if (StringUtils.isEmpty(username))
        {
            msg = "用户名不能为空";
        }
        else if (StringUtils.isEmpty(password))
        {
            msg = "用户密码不能为空";
        }
        else
        {
            TSysUser user = new TSysUser();
            //生成盐（部分，需要存入数据库中）
            String randomSalt=new SecureRandomNumberGenerator().nextBytes().toHex();
            user.setSalt(randomSalt);
            //将原始密码加盐（上面生成的盐），并且用md5算法加密2次，将最后结果存入数据库中
            String result = new Md5Hash(password,randomSalt,2).toString();
            user.setPassword(result);
            user.setId(UUID.randomUUID().toString());
            user.setUsername(username);
            user.setNickname(password);
            int regFlag = tSysUserService.insertSelective(user);

            if (regFlag<1)
            {

                msg = "注册失败,请联系系统管理人员";
            }
            else
            {

            }
        }
        return "/login";
    }

    @ApiOperation(value="登入",notes="登入")
    @PostMapping("/login")
    public String login(String username, String password, Model model){
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);


        try {
            //主体提交登录请求到SecurityManager
            currentUser.login(token);
        }catch (IncorrectCredentialsException ice){
            token.clear();
            model.addAttribute("msg","密码不正确");
        }catch(UnknownAccountException uae){
            token.clear();
            model.addAttribute("msg","账号不存在");
        }catch(AuthenticationException ae){
            token.clear();
            model.addAttribute("msg","状态不正常");
        }
        if(currentUser.isAuthenticated()){
            System.out.println("认证成功");
            model.addAttribute("username",username);
            return "redirect:/";
        }else{
            token.clear();

            return  "/login";
        }
    }


}
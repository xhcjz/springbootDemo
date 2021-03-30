package com.fc.test.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WeddingController {
    private static Logger logger= LoggerFactory.getLogger(WeddingController.class);

    private String prefix = "wedding";

    @GetMapping("/")
    public String index(){

        return prefix+"/index";

    }

    @GetMapping("/contact")
    public String contact(){
        Subject subject = SecurityUtils.getSubject();
        if(subject.hasRole("管理员")){
            return prefix+"/contact";
        }
        else {
            return prefix+"/index";
        }


    }
    @GetMapping("/gallery")
    @RequiresPermissions("system:log:list")
    public String gallery(){

        return prefix+"/gallery";

    }
    @GetMapping("/about")
    @RequiresRoles("管理员")
    public String about(){

        return prefix+"/about";

    }
}

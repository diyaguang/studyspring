package com.dygstudio.studyspring.annotation;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18-11:14
 * @Description:
 */
@Controller("userController")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("userController ... save ...");
    }
}

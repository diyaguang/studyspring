package com.dygstudio.studyspring.annotation;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18-11:10
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;
    public void save(){
        this.userDao.save();
        System.out.println("userservice .... save ...");
    }
}

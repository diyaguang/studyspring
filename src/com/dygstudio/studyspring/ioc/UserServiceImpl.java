package com.dygstudio.studyspring.ioc;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/17-14:08
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void say(){
        userDao.say();
        System.out.println("userService say hello World !");
    }
}

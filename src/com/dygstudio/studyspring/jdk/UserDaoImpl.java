package com.dygstudio.studyspring.jdk;

import org.springframework.stereotype.Repository;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18 16:14
 * @Description:
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void addUser(){
        System.out.println("添加用户");
    }
    public void deleteUser(){
        System.out.println("删除用户");
    }
}

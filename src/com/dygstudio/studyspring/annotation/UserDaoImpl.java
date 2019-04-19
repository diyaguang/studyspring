package com.dygstudio.studyspring.annotation;

import org.springframework.stereotype.Repository;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/18-11:07
 * @Description:
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
    public void save(){
        System.out.println("userdao...save...");
    }
}

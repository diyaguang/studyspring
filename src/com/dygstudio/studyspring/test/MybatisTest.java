package com.dygstudio.studyspring.test;

import com.dygstudio.studyspring.po.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @Project: StudySpring
 * @Author: diyaguang
 * @CreateDate: 2019/4/26 14:22
 * @Description:
 */
public class MybatisTest {
    public void findCustomerByIdTest() throws Exception{
        //读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据配置文件构建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过 SqlSessionFactory 创建 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过 SqlSession 执行映射文件中定义的 SQL，并放回映射结果
        Customer customer = sqlSession.selectOne("com.dygstudio.studyspring.mapper.CustomerMapper.findCustomerById",1);
        System.out.println(customer.toString());
        //关闭 SqlSession
        sqlSession.close();
    }
}

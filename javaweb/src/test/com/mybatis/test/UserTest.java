package com.mybatis.test;

import com.mybadis.dao.UserDao;
import com.mybadis.pojo.User;
import com.mybadis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;

public class UserTest {

    @Test
    public  void test1(){
        User user=new User();
        user.setName("yy");
        user.setPrice("11000");
/*        Date date=new Date();
        user.setCreateDate(date);*/
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        UserDao dao=sqlSession.getMapper(UserDao.class);
        System.out.println(dao.addUser(user));
        //所有的增删改
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}

package com.mybatis.test;

import com.mybadis.dao.UserDao;
import com.mybadis.pojo.User;
import com.mybadis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

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
    @Test
    public void  test2(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserDao dao=sqlSession.getMapper(UserDao.class);

        User user=dao.findById(2);
        System.out.println(user.getName());

        SqlSessionUtil.closeSqlSession(sqlSession);
    }

    @Test
    public  void  test3(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        UserDao dao=sqlSession.getMapper(UserDao.class);
        List<User> list=dao.findAll();
        for (User user:list) {
            System.out.println(user.getName());
        }
    }
}

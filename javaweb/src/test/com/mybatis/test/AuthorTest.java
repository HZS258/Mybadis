package com.mybatis.test;

import com.mybadis.dao.AuthorDao;
import com.mybadis.pojo.Author;
import com.mybadis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AuthorTest {
    @Test
    public void test1(){
        Author author=new Author();
        author.setName("王宝宝");
        author.setSex('女');
        author.setBirthday("1994-01-20");
        author.setAddress("衡阳市");
        author.setPhone("2828888");
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        System.out.println(dao.addAuthor(author));
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
   @Test
    public void  test2(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        //Author author=dao.findById(1);
        System.out.println(dao.findById(2));
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
     @Test
    public void test3(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        List<Author> list=dao.findAll();
        for (Author author:list) {
            System.out.println(author.getName());
        }

    }
    @Test
    public  void test4(){
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        System.out.println(dao.deleteAuthor(2));
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
    @Test
    public void test5(){
        Author author=new Author();
        author.setId(1);
        author.setName("老王");
        SqlSession sqlSession=SqlSessionUtil.getSqlSession();
        AuthorDao dao=sqlSession.getMapper(AuthorDao.class);
        System.out.println(dao.updateAuthor(author));
        sqlSession.commit();
        SqlSessionUtil.closeSqlSession(sqlSession);
    }
}

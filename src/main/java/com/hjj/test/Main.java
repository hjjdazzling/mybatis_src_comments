package com.hjj.test;

import com.hjj.test.dao.UserDao;
import com.hjj.test.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author shkstart
 * @create 2021-02-03 15:13
 */
public class Main {
  public static void main(String[] args) throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    //build方法初始化DefaultSqlSessionFactory进行返回
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    //SqlSession相当于一个Connection数据库连接对象  SqlSession是非线程安全的
    try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
      UserDao userDao = sqlSession.getMapper(UserDao.class);
      User user = userDao.findById(14);
      System.out.println(user);

      User user2 = userDao.findById(14);
      System.out.println(user2);
      System.out.println(user == user2);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

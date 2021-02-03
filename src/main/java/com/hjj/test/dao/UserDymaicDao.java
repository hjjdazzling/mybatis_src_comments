package com.hjj.test.dao;


import com.hjj.test.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-01-30 14:16
 */
public interface UserDymaicDao {
    List<User> find(User user);

   void update(User user);

   List<User> findByIdList(@Param("idList") List<Integer> idList);

   Integer insertAll(@Param("userList") List<User> userList);

    Integer insertAll2(@Param("userList") List<User> userList);


    List<User> find2(Integer id);
}

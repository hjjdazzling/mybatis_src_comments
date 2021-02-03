package com.hjj.test.dao;


import com.hjj.test.po.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao {

    User findById(Integer id);

    User findByUserNameAndPassword(@Param("username") String username, @Param("password") String password);

    User findByIdAndName(@Param("id") Integer id, @Param("username") String username);

    Integer insertUser(User user);

    Boolean updateUser(User user);

    Long deleteById(Integer id);

    User findByMap(Map<String, Object> map);

    User find(User user);

    User findByList(List<Integer> ids);

    List<User> getByLikeName(String name);


    /**
     * key 是列名 vlaue 是值
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdReturnMap(Integer id);

    /**
     * key 是主键id
     * @MapKey  指定key对应的数据库的列名
     * @param name
     * @return
     */
    @MapKey("id")
    Map<Integer, User> getUsersReturnMap(String name);

    User getUserById2(Integer id);

    User getUserAndDepartment(Integer id);

    User getByDepartmentId(Integer id);
}

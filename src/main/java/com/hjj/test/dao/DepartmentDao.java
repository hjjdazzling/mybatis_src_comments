package com.hjj.test.dao;


import com.hjj.test.po.Department;

/**
 * @author shkstart
 * @create 2021-01-29 17:06
 */
public interface DepartmentDao {
    Department getById(Integer id);

    Department getById2(Integer id);

    Department getByIdStep(Integer id);
}

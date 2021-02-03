package com.hjj.test.po;

import java.util.List;
import java.util.Objects;

/**
 * @author shkstart
 * @create 2021-01-29 16:39
 */
public class Department {
    private Integer id;
    private String departmentName;
    private List<User> userList;

    public Department() {}

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", userList=" + userList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Department that = (Department) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(userList, that.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentName, userList);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}

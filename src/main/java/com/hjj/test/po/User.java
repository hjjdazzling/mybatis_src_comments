package com.hjj.test.po;

import java.util.Objects;

/**
 * @author shkstart
 * @create 2021-02-03 15:14
 */
public class User {
  private Integer id;

  private String username;

  private String password;

  private Department department;

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", department=" + department +
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
    User user = (User) o;
    return Objects.equals(id, user.id) &&
      Objects.equals(username, user.username) &&
      Objects.equals(password, user.password) &&
      Objects.equals(department, user.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, password, department);
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

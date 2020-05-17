package lqx.dao;

import lqx.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();
    int addUser(User user);
    int updateUser(User user);
}

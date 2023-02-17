package top.wuml.overall.dao;

import top.wuml.overall.entity.User;

public interface UserDao {
    int addUser(User user);

    User findUser(User userDto);
}

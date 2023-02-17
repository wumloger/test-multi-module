package top.wuml.overall.service;

import top.wuml.overall.entity.User;

public interface UserService {
    User loginIn(String account, String password);

}

package top.wuml.overall.service.impl;

import top.wuml.overall.dao.UserDao;
import top.wuml.overall.dao.impl.UserDaoImpl;
import top.wuml.overall.entity.User;
import top.wuml.overall.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao= new UserDaoImpl();
    @Override
    public User loginIn(String account, String password) {
        User user = new User();
        user.setAccount(account);
        user.setPassWord(password);
        User u = userDao.findUser(user);
        if (u != null){
            return u;
        }else{
            return null;
        }

    }

    @Override
    public Boolean addUser(User user) {
        return null;
    }

    @Override
    public User findUser(User user) {
        if (user != null){
            return userDao.findUser(user);
        }else{
            return null;
        }


    }


}

import org.junit.jupiter.api.Test;

import top.wuml.overall.dao.UserDao;
import top.wuml.overall.dao.impl.UserDaoImpl;
import top.wuml.overall.entity.User;

import javax.xml.crypto.Data;

public class UserTest {
    private UserDao userDao = new UserDaoImpl();

    @Test
    void addUser(){
        User user = new User();
        user.setAccount("aaaaaa");
        user.setPassWord("123456");
        userDao.addUser(user);
    }
    @Test
    void findUser(){
        User user = new User();
        user.setAccount("mqxu@qq.com");
        user.setPassWord("698d51a19d8a121ce581499d7b701668");
        User userValue = userDao.findUser(user);
        System.out.println(userValue);
    }
}

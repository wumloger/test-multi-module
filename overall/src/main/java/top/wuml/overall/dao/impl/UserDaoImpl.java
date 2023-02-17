package top.wuml.overall.dao.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import top.wuml.overall.dao.UserDao;
import top.wuml.overall.entity.User;
import top.wuml.overall.util.JdbcUtil;

public class UserDaoImpl implements UserDao {
        private final JdbcTemplate template = new JdbcTemplate(JdbcUtil.getDataSource());
    @Override
    public int addUser(User user) {
        String sql = "insert into t_user(account,password,nickname,avatar) values(?,?,?,?)";
        return template.update(sql,user.getAccount(),user.getPassWord(),user.getNickName(),user.getAvatar());
    }

    @Override
    public User findUser(User userDto) {
        String sql = "select * from t_user where account = ? and password = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),userDto.getAccount(),userDto.getPassWord());
    }
}

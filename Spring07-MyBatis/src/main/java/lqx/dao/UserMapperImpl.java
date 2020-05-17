package lqx.dao;

import lqx.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUsers() {
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsers();
        for (User u:users){
            System.out.println(u.toString());
        }
        sqlSession.getMapper(UserMapper.class).addUser(new User(4,"jason","asdsada"));
        sqlSession.getMapper(UserMapper.class).updateUser(new User(3,"lqx","asda"));
        return users;
    }

    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    public int updateUser(User user) {
        return sqlSession.getMapper(UserMapper.class).updateUser(user);
    }
}

import lqx.MybatisUtils;
import lqx.dao.UserMapper;
import lqx.dao.UserMapperImpl;
import lqx.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class mytest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        for(User u:userMapper.getUsers()){
            System.out.println(u.toString());
        }
    }

    @Test
    public void spring_mybatisTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapperImpl");
        List<User> users = userMapper.getUsers();

    }
}

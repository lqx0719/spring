import Dao.UserDaoImpl;
import Dao.UserMysqlImpl;
import Service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testIOC {
    public static void main(String[] args) {
//        UserServiceImpl userServiceImpl = new UserServiceImpl();
//        userServiceImpl.setUserDao(new UserMysqlImpl());
//        userServiceImpl.getUser();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}

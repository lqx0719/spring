import lqx.LqxConfig;
import lqx.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {

    }
    @Test
    public void Test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(LqxConfig.class);
        User user = context.getBean("getUser",User.class);
        System.out.println(user.getName());
    }
}

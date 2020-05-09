import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /*
        * Student{name='lqx',
        *         address=Address{address='null'},
        *         infos={id=123456789, 身份证=987654321},
        *         games=[LOL],
        *         courses=[Chinese],
        *         property={email=827509127@qq.com},
        *         wife='null'}

         * */
    }
}

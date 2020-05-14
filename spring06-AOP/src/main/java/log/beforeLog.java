package log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class beforeLog implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName()+" 准备执行！");
    }

}

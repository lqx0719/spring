package log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class afterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("已经执行完"+method.getName());
    }
}

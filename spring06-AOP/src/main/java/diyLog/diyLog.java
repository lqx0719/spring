package diyLog;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class diyLog {
    @Before("execution(* lqx.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before!");
    }

    @After("execution(* lqx.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("After!");
    }

    @Around("execution(* lqx.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
//        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}

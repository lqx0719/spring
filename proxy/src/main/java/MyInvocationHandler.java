import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler,HelloWorld {
    HelloWorld helloWorld;

    public MyInvocationHandler(HelloWorld helloWorld){
        this.helloWorld = helloWorld;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy begin!");
        method.invoke(helloWorld,args);
        return null;
    }

    public void sayHello() {
        HelloWorld h = (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(),helloWorld.getClass().getInterfaces(),this);
        h.sayHello();

    }

    public void sayBye() {
        HelloWorld h = (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(),helloWorld.getClass().getInterfaces(),this);
        h.sayBye();
    }
}

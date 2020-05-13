public class MyTest {
    public static void main(String[] args) {
        HelloWorldImpl impl = new HelloWorldImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(impl);
        myInvocationHandler.sayHello();
        myInvocationHandler.sayBye();
    }
}

package agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class No2 {

    public static void main(String[] args) {

        UserInter userInter = new LoginAndRegister();
        UserInter proxyUser = (UserInter) Proxy.newProxyInstance(userInter.getClass().getClassLoader(), userInter.getClass().getInterfaces(), new MyInvocationHandler(userInter));
        proxyUser.register("Happy");
        proxyUser.login("Happy");
    }

}

class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行前：" + method.getName());
        Object object = method.invoke(target, args);
        System.out.println("执行结束：" + method.getName());
        return object;
    }
}

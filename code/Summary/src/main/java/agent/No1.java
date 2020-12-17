package agent;

//静态代理
public class No1 {

    public static void main(String[] args) {
        UserInter userInter = new LoginAndRegister();
        UserInter proxyUser = new LoginAndRegisterProxy(userInter);
        proxyUser.register("Happy");
        proxyUser.login("Happy");

    }

}

interface UserInter {

    /**
     * 登录
     *
     * @param name name
     */
    void login(String name);

    /**
     * 注册
     *
     * @param name name
     */
    void register(String name);
}

class LoginAndRegister implements UserInter {

    @Override
    public void login(String userName) {
        System.out.println("我是登录方法");
    }

    @Override
    public void register(String name) {
        System.out.println("我是注册方法");
    }

}

class LoginAndRegisterProxy implements UserInter {

    private UserInter userInter;

    public LoginAndRegisterProxy(UserInter userInter) {
        this.userInter = userInter;
    }

    @Override
    public void login(String userName) {
        System.out.println("调用登录接口的时间：" + System.currentTimeMillis());
        userInter.login(userName);
    }

    @Override
    public void register(String name) {
        System.out.println("调用注册接口的时间：" + System.currentTimeMillis());
        userInter.register(name);
    }

}
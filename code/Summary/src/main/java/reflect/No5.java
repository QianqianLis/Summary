package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//调用类的方法
public class No5 {

    public static void main(String[] args) {

        Chestnut chestnut = new Chestnut();
        Class nutClass = chestnut.getClass();
        Class[] paraType = {String.class};
        try {
            //获取方法
            Method method = nutClass.getDeclaredMethod("printWork", paraType);
            method.setAccessible(true);
            Object[] arg = {"Today has no work!"};
            //执行
            method.invoke(chestnut, arg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

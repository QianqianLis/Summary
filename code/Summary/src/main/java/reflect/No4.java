package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//调用构造方法
public class No4 {

    public static void main(String[] args) {
        Chestnut chestnut = new Chestnut();
        Class nutClass = chestnut.getClass();

        try {
            //调用公共方法
            Class[] sType = {String.class};
            Constructor sConstructor = nutClass.getDeclaredConstructor(sType);
            sConstructor.newInstance("Happy");

            //调用私有方法
            Class[] isType = {int.class, String.class};
            Constructor isConstructor = nutClass.getDeclaredConstructor(isType);
            isConstructor.setAccessible(true);
            isConstructor.newInstance(4,"Happy");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}




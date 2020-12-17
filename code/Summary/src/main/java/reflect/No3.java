package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.util.Date;

//类声明的构造方法
public class No3 {
    public static void main(String[] args) {

        Chestnut chestnut = new Chestnut();
        Class nutClass = chestnut.getClass();

        //1.所有构造方法
        Constructor[] constructors;

        constructors = nutClass.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.print(Modifier.toString(constructors[i].getModifiers()) + " 参数：");
            Class[] paraType = constructors[i].getParameterTypes();
            for (int j = 0; j < paraType.length; j++) {
                System.out.print(paraType[j].getName() + " ");
            }
            System.out.println();
        }

        //2.指定构造方法
        try {
            //默认无参构造函数
            Constructor defaultConstructor = nutClass.getDeclaredConstructor();

            //固定参数构造方法
            Class[] paraType = {int.class, String.class};
            Constructor isConstructor = nutClass.getDeclaredConstructor(paraType);

            System.out.print(Modifier.toString(isConstructor.getModifiers()) + " 参数：");
            Class[] type = isConstructor.getParameterTypes();
            for (int i = 0; i < type.length; i++) {
                System.out.print(paraType[i].getName() + " ");
            }
            System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Chestnut {
    private int num;
    private String name;

    public Chestnut() {
    }

    public Chestnut(int num) {
        this.num = num;
    }

    public Chestnut(String name) {
        this.name = name;
        System.out.println("Chestnut's name is " + name);
    }

    private Chestnut(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("There is " + num + " nut, name is " + name);
    }

    private void printWork(String work){
        System.out.println(work);
    }
}

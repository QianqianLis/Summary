package reflect;

import java.util.Date;

//返回此对象的运行时类
public class No1 {

    public static void main(String[] args) {


        Date date = new Date();
        Class dateClass = date.getClass();
        System.out.println(dateClass.getName());//结果：java.util.Date
    }
}

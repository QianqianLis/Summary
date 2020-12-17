package reflect;

import java.lang.reflect.Field;

//修改类的私有字段
public class No6 {

    public static void main(String[] args) {

        Chestnut chestnut = new Chestnut("Liquors");
        Class nutClass = chestnut.getClass();
        try {
            Field name = nutClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(chestnut, "Diffey");
            System.out.println("name is " + name.get(chestnut).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

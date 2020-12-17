package reflect;

//返回给定字符串名称的类或接口相关联的类对象
public class No2 {
    public static void main(String[] args) {
        String className = "java.util.Date";
        Class rDate = null;
        try {
            rDate = Class.forName(className);
            System.out.println(rDate.getName());//结果：java.util.Date
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

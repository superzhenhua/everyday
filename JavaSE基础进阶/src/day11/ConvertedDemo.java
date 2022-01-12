package day11;

import java.io.*;

public class ConvertedDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象
        user user =new user("zhangsan","password");
        //对参数的基本流做一个包装,让其更加强大
        ObjectOutputStream ojs =new ObjectOutputStream(new FileOutputStream("a.ser"));
        //写对象
        ojs.writeObject(user);
        //释放资源
        ojs.close();
        //
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.ser"));

        //读对象
        Object user1 = (user) ois.readObject();
        ois.close();
    }
}

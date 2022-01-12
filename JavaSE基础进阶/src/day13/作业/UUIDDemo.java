package day13.作业;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        //随机获取一个uuid对象
        UUID uuid = UUID.randomUUID();
        //将该对象用字符串的形式表示
        String s = uuid.toString();
        System.out.println(s);
    }
}

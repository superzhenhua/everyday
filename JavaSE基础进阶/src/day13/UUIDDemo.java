package day13;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        //生成一个随机的UUID对象
        UUID uuid = UUID.randomUUID();
        //将该对象用字符串的形式表示
        String s = uuid.toString().replace("-", "");
        System.out.println(s);

    }
}

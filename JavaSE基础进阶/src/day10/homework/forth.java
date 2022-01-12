package day10.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class forth {
    public static void main(String[] args) throws IOException {
        File file = new File( "D:\\aa");
        FileOutputStream fileOutputStream = new FileOutputStream("JavaEE\\Day11\\aa.txt",true);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zs", 18));
        list.add(new Student("ls", 19));
        list.add(new Student("ww", 20));
        list.add(new Student("zl", 21));

        for (Student student : list) {
           fileOutputStream.write( student.toString().getBytes(),0, student.toString().getBytes().length);
           fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();



    }
}

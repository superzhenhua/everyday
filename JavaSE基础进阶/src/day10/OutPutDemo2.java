package day10;
//1.7及其以后版本
import java.io.FileOutputStream;
/*
try(创建要被释放资源的代码){
正常代码
}catch(Exception e){
处理方案
}
*/
public class OutPutDemo2 {
    public static void main(String[] args) {
        try(FileOutputStream fos =new FileOutputStream("D:\\b.txt")) {
            fos.write(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

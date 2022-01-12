package day03.Lambda带参不带返回值联系;

public class Text {
    public static void main(String[] args) {
        //需求一:匿名内部类实现
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("匿名内部类实现"+msg);
            }
        });
        //需求二
        useStringHandler(msg -> System.out.println("匿名内部类实现"+msg));
    }
    //在测试类中
    public static void useStringHandler(StringHandler stringHandler){
        stringHandler.printMessage("道北吴彦祖");
    }
}
//创建接口
interface StringHandler{
    //在接口提供抽象方法,带参数
    public abstract void printMessage(String msg);

}


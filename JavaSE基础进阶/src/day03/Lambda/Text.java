package day03.Lambda;
/*
Lambda练习1】
                1. 编写一个接口ShowHandler
                2. 在接口中提供一个抽象方法show，该方法无参，无返回值
                3. 在测试类中ShowHandlerTest中存在一个方法，useShowHandler
                   方法的参数是ShowHandler类型的
                4. 在useShowHandler方法内部调用了ShowHandler的show方法
                5. 完成需求1和需求2
 */
public class Text {
    public static void main(String[] args) {
        //需求一:使用匿名内部类完成方法调用
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("使用匿名内部类完成方法调用");
            }
        });
            //需求二:使用Lambda表达式完成方法调用
        useShowHandler(() -> System.out.println("使用匿名内部类完成方法调用"));


    }
    //在测试类中存在一个useShowHandler方法
    public static void useShowHandler(ShowHandler showHandler){
        //在useShowHandler方法内部调用ShowHandler的show方法
        showHandler.show();
    }
}
//创建一个接口
interface ShowHandler{
    public abstract void show();
}
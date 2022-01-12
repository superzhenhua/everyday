package day06;

public class tryCatch {
    public static void main(String[] args) {
        aaa();
    }

    private static void aaa() {
        try{
            bbb();//包裹异常代码
        }catch(RuntimeException e){
            System.out.println("bbb把异常交给我了我只能自己处理了");
        }
        System.out.println(222);
        System.out.println(222);
        System.out.println(222);
    }

    public static void bbb(){
        System.out.println(111);
        System.out.println(111);
        System.out.println(111);

        throw new RuntimeException();
    }
}

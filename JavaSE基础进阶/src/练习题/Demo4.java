
package 练习题;

import java.util.*;


/*有四种水果(苹果，香蕉，西瓜，橘子)
        1. 给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复。
        2. 根据商品号查询对应的商品。
        3. 如果查不到输出：“查无此商品”
        4. 如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜*/

public class Demo4 {
    public static void main(String[] args) {
        //定义一个map集合,商品号代表键,值代表水果类型
        Map<String, String> fruits = new HashMap<>();
        //存储数据 ,先获取id
        String id = getId(fruits);
        fruits.put(id,"苹果");

        id = getId(fruits);
        fruits.put(id,"香蕉");

        id = getId(fruits);
        fruits.put(id,"西瓜");

        id = getId(fruits);
        fruits.put(id,"橘子");

        System.out.println(fruits);

        System.out.println("请输入要查询的商品号");
        Scanner sc =new Scanner(System.in);
        String inputId = sc.nextLine();

        String result = fruits.get(inputId);
        //判断结果
        if(result==null){
            System.out.println("查无此商品");
        }else{
            System.out.println("您要查询的商品是:"+result);
        }

    }
    //先获取一个id
    public static String getId(Map<String, String> fruits){
        String productId =null;
        while (true) {
            productId = getProductId();
            //判断集合中是否已经存在一个键的值就是productId
            if(fruits.containsKey(productId)){
                //如果存在,重新获取
                continue;
            }else{
                break;
            }
        }
            return productId;
    }
    //定义一个获取商品id的方法
    public static String getProductId() {
        String  ProductId = "";
        //创建随机键盘
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            int num = r.nextInt(10);
            ProductId += num;
        }
        return ProductId;
    }
}


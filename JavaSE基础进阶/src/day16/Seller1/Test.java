package day16.Seller1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建被代理对象
            Seller seller =new Lenovo();

            //创建代理对象
        Class[] interfaces={Seller.class};
        Seller proxy = (Seller) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader()
                ,
                interfaces
                ,
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //获取正在被调用方法的方法名
                        String name = method.getName();
                        if("sell".equals(name)){
                            //增强
                            System.out.println("车接");
                            //增强参数
                            int arg1 = (int) args[0];
                            arg1-=2000;
                            args[0]=arg1;
                            Object result = method.invoke(seller, args);
                            System.out.println("车送");
                            return result+"+鼠标垫";
                            }  else{
                            Object result = method.invoke(seller, args);
                            return result;

                        }

                    }
                }
        );
        //用户使用代理对象调用方法
        String result = proxy.sell(12000);
        System.out.println(result);
        System.out.println("========");
        proxy.repair(800);
    }
}

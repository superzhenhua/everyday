package day16.Seller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //创建被代理对象
        Seller seller = new Lenovo();
        //需求:销量在减少,需要服务升级:车接,车送,赠送鼠标垫
        //创建代理对象
        /*
        固定格式:Proxy.newProxyInstance(
               ClassLoader loder ,类加载器
               Class[] interfaces, 代理对象需要实现哪些接口，就是由这个参数指定 Class[] interfaces = {Seller.class};
               InvocationHandler h,是个接口,需要传递该接口的实现类对象,里面的invoke方法，用来提供服务，增强的代码都需要写到这里

                new InvocationHandler() {
                每当用户使用代理对象，调用一次方法，那么这个invoke方法就会执行一次
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                }

        )

        */
        Class[] interfaces = {Seller.class};
        Seller proxy= (Seller) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader()
                ,
                interfaces
                ,
                new InvocationHandler() {
                    //每当用户使用代理对象，调用一次方法，那么这个invoke方法就会执行一次

                    /**
                     * @param proxy  生成的代理对象  该参数一般不使用
                     * @param method  描述当前正在被调用的方法，用户使用代理对象调用哪个方法，method描述的就是哪个方法
                     * @param args  用户调用方法时，传递的参数
                     * @return 执行完方法后的结果
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //增强 要增强卖电脑的方法 车接,车送,赠送鼠标垫
                        //获取到正在被调用方法的方法名
                        String name = method.getName();
                        //判断该方法名是不是sell
                        if("sell".equals(name)){
                            //增强
                            System.out.println("车接");
                            //对参数增强
                            int arg1 = (int) args[0];
                            arg1-=2000;
                            args[0]=arg1;
                            //直接调用被代理对象的方法
                            Object result = method.invoke(seller, args);
                            System.out.println("车送");
                            return result+"+鼠标垫";
                        }else{
                            //不是,不增强,直接调用被代理对象的方法
                            Object result = method.invoke(seller, args);
                            return result;
                        }

                    }
                }

        );
        //用户使用代理对象调用方法
        String result = proxy.sell(12000);
        System.out.println(result);
        System.out.println("**********************************");
        proxy.repair(800);

    }
}

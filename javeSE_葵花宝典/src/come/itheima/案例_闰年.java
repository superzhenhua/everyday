package come.itheima;

/*
分析并完成以下需求:
    1.中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰（年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）
    2.请打印出1988年到2019年的所有闰年年份
 */
public class 案例_闰年 {
    public static void main(String[] args) {
        //遍历
        for (int i = 1988; i <= 2019; i++) {
            //if语句判断
            if ((i % 4 == 0 || i % 100 != 0) && i % 400 == 0) {
                System.out.println("闰年年份是:"+i);
            }
        }

    }
}

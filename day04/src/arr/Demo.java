package arr;

/*
定义一个int类型数据,元素自拟
打印数组元素的和,还有平均值
 */
public class Demo {
    public static void main(String[] args) {
        //定义求和
        int sum = 0;
        //定义数组
        int []arr={34,54,144,12,34,45};
        //遍历
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        //求平均数
        double avg = (double)sum/arr.length;
        //打印
        System.out.println(sum);
        System.out.println(avg);

    }

}

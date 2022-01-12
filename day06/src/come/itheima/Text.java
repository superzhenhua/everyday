package come.itheima;
/*
        元素基本查找 int getIndex(int[] arr,int num);
            在一个数组中,找一个指定的数据
                存在,返回该数据对应的索引
                不存在,返回-1
     */
public class Text {
    public static void main(String[] args) {
        //获取数组
        int[]arr={12,23,34,5,41,2};
        //赋值调用
        int index = ArraryTools.getIndex(arr,12);
        //判断index
        if(index==-1){
            System.out.println("不存在");
        }else{
            System.out.println("返回数据对用的索引为:"+index);
        }
    }
    //定义方法
    public static int getIndex(int[] arr,int num){
        //定义index
        int index=-1;
        //遍历
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index=i;
                break;
            }
        }
        //循环完 返回
        return index;
    }
}

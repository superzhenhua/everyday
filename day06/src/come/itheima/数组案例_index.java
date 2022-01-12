package come.itheima;

/*
        元素基本查找 int getIndex(int[] arr,int num);
            在一个数组中,找一个指定的数据
                存在,返回该数据对应的索引
                不存在,返回-1
     */
public class 数组案例_index {
    public static void main(String[] args) {
        //定义数组
        int [] arr={12,23,34,45,65,1};
        //赋值调用方法
        int index = getIndex(arr,12);
        //对索引进行判断
        if(index==-1){
            System.out.println("不存在");
        }else{
            System.out.println("数据的索引是:"+index);
        }


    }

    //定义一个方法
    public static int getIndex(int[] arr, int num) {
        //定义变量index,用于记录索引
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //进行判断
            if (num == arr[i]) {
                //对索引进行赋值
                index = i;
                break;
            }
        }
        //循环结束返回
        return index;
    }


}

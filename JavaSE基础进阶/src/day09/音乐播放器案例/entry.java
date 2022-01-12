package day09.音乐播放器案例;

import java.util.Scanner;

/*需求分析：
        播放列表管理
        播放器管理
        1、播放列表管理主要功能：
        将歌曲添加到主播放列表
        将歌曲添加到平台播放列表
        通过歌曲id查询播放列表中的歌曲
        通过歌曲名称查询播放列表中的歌曲
        修改播放列表中的歌曲
        删除播放列表中的歌曲
        显示播放列表中的所有歌曲
        导出歌单
        2、播放器管理主要功能：
        向播放器添加播放列表
        向播放器删除播放列表
        通过名字查询播放列表信息
        显示所有播放列表名称*/
public class entry {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc =new Scanner(System.in);
        System.out.println("欢迎来到网易云音乐");
        System.out.println("1--播放列表管理   2--播放器管理    0--退出");
        //提示
        while (true) {
            System.out.println("请输入你的选择");
            int choose =sc.nextInt();
            switch(choose){
                case 1 :
                    //System.out.println("1.播放列表管理");
                    //创建播放列表对象

                    break;
                case 2 :
                    System.out.println("2.播放器管理");
                    break;
                case 0 :
                    System.out.println();
                  System.exit(0);
                default:
                    System.out.println("您输入的功能尚未开发请重新输入");
                    break;
            }
        }


    }
}

package javase03;

public class Break {
    public static void main(String[] args) {
         /*
    break 语句用于终止某个语句块的执行 ， 一般使用在 switch 或者循环 [for , whie ,do-while] 中
            基本语法 ：
            {
            ...
            }
            break;
             {
            ...
            }
        */

        //细节
        /*
        （1）break语句可以指定退出哪层
        （2）label1是标签，由程序员指定。
        （3）break后指定到哪个label就退出到哪里
        （4）在实际的开发中，尽量不要使用标签
        （5）如果没有指定break，默认退出最近的循环体
         */
        int i = 1;
        while(i<=4){
            i++;
            System.out.println("i="+i);
            if (i==2){
                break;
            }
            System.out.println("i="+i);
        }

        //附加
        //return ： return在表示方法时，表示跳出该方法;return使用在main方法中表示退出程序
    }

}

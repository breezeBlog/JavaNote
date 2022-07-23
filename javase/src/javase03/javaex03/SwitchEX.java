package javase03.javaex03;

import java.util.Scanner;

public class SwitchEX {
    public static void main(String[] args) {
        /*

            1.请编写一个程序，该程序可以接收一个字符， 比如:a,b,c,d,e,f,
            2. a表示星期一，b表示星期-二
            3.根据用户的输入显示相依的信息，要求使用switch语句完成

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入a-c");
        char c  = sc.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("今天星期一");
            break;
            case 'b':
                System.out.println("今天星期2");
                break;
            case 'c':
                System.out.println("今天星期3");
                break;
            default:
                System.out.println("输入不正确请重新输入");
        }

    }
}

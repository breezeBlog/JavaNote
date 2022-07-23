package javase03.javaex03;

import java.util.Scanner;

public class JavaEX03 {
    public static void main(String[] args) {
        /*
        1 · 编程实现如下功能
        某人有 100,000 元 ， 每经过一次路口 ， 需要交费 ， 规则如下 ：
        1 ） 当现金 > 50000 时 ， 每次交 5 ％
        2 ） 当现金 < = 50000 时 ， 每次交 1000
        编程计算该人可以经过多少次路口 ， 要求 ： 使用 while break 方式完成
         */

        //自测
         double i = 100000;
         int count = 0;
         while (i>50000.0){
             i=i-i*0.05;
             count++;
             if (i<=50000.0){
                 break;
             }
         }
         while (i<=50000.0){
             i=i-1000.0;
             count++;
             if(i<=1000.0){
                 break;
             }
         }
         System.out.println(count);
         System.out.println(153/100+"+"+153/10%10+"+"+153%10);

         /*
        2 · 实现判断一个整数 ， 属于哪个范围 ： 大于 0 ； 小于 0 ； 等于 0
        3 · 判断一个年份是否为闰年
        4 · 判断一个整数是否是水仙花数 ， 所谓水仙花数是指一个 3 位数 ， 其各个位上数字立方
        和等于其本身 。 例如 ： 153 = 1 * 1 * 1 + 3 * 3 * 3 + 5 * 5 * 5
          */

        //自测2
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int  a = sc.nextInt();
        if(a>0){
            System.out.println("该整数"+a+">0");
        }else if (a<0){
            System.out.println("该整数"+a+"<0");
        }else {
            System.out.println("该整数"+a+"=0");
        }

        //自测3


        //自测4
        int b = sc.nextInt();
        if (b>=100 && b<=999){
            if (b == (b/100) * (b/100) * (b/100) + (b/10%10) * (b/10%10) * (b/10%10) + (b%10) * (b%10) * (b%10)){
                System.out.println("整数"+b+"是水仙花数");
            }else{
                System.out.println("整数"+b+"不是水仙花数");
            }
        }else {
            System.out.println("请输入一个三位数");
        }

        /*
        5 · 看看下面代码输出什么 ？
                int m=O,n=3;
                if(m>O) {
                    if(n>2)
                        System.out.printIn("OK1");
                    else
                        System.out.printIn("OK2");
         */

        //自测
        //输出 空

        /*
        6 · 输出 1 - 100 之间的不能被 5 整除的数 ， 每 5 个一行
        7 · 输出小写的 a-z 以及大写的 Z-A
        8 · 求出 1 - 1 / 2 + 1 / 3 - 1 / 4 .... 1 / 100 的和
        9 · 求 1 + （ 1 + 2 ） + （ 1 + 2 + 3 ） + （ 1 + 2 + 3 + 4 ） + ... + （ 1 + 2 + 3 + ... + 100 ） 的结果
         */

        //自测6
        int count1 = 0;
        for (int num = 1; num <= 100; num++){
            if (num % 5 != 0){
                System.out.print(num+"\t");
                count1++;
                if (count1==5){
                    count1=0;
                    System.out.println("");
                }
            }
        }

        //答案6
        /**
        int count1 = 0;
        for (int num = 1; num <= 100; num++){
            if (num % 5 != 0){
                System.out.print(num+",");
                count1++;
                if (count1%5==0){
                    System.out.println();
                }
            }
        }
         */

        //自测7
        char ch = 'a';
        char ch0 = 'A';
        for (int num1 = 0; num1<26; num1++){
            char ch1 = (char) (ch + num1);
            char ch2 = (char)(ch0 + num1);
            System.out.print(ch1);
            System.out.println(ch2);
        }

        //答案7
        for (char c1 = 'a' ;c1<='z';c1++){
            System.out.print(c1+"");
        }
        for (char c1 = 'Z'; c1>='A';c1--){
            System.out.print(c1+" ");
        }


        //自测8
        int n = 1;
        double sum1 = 0;
        while(n<=100){
            double sum0 = 1/n;
            n++;
            double sum = 1/n;
            double sum2 = sum0-sum;
            sum1 = sum2+sum1;
        }
        System.out.println(sum1);

        //答案8  注意 / 的数据类型
        /**
        double sum =0;
        for (int i = 1 ;i<=100;i++){
            //判断奇偶
            if (i%2 !=0){//奇数
                sum=sum+1.0/i;
            }else {
                sum=sum-1.0/i;
            }
        }
        System.out.println("sum="+sum);
         */

        //自测9
        //  求 1 + （ 1 + 2 ） + （ 1 + 2 + 3 ） + （ 1 + 2 + 3 + 4 ） + ... + （ 1 + 2 + 3 + ... + 100 ） 的结果
        int sum3 = 0;
        for (int i0 =1 ; i0<=100;i0++){
            int sum2 = 0;
            sum2 = sum2 +i0;
            sum3 = sum2+sum3;
        }
        System.out.println(sum3);

        //答案9
        /**
        int sum = 0 ;
        for(int i =1;i<=100;i++){
            for (int j=1;j<=i;j++){//内层对1-i进行循环
                sum+=j;
            }
        }
        System.out.println("sum=" +sum);
         */
    }
}

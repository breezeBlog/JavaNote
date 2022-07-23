package javase03.javaex03;

public class ForEX {
    public static void main(String[] args) {
        //1.打印1 ~ 100之间所有是9的倍数的整数，统计个数及总和.
        int count = 0;
        int i = 1;
        int sum = 0;
        for (; i<=100; i++){
            if (i%9==0){
                count = count+1;
                sum = sum+i;
            }
        }
        System.out.println(count+","+sum);

        /*
        2.完成下面的表达式输出
        0+5=5
        1+4=5
        2+3=5
        3+2=5
        4+1=5
        5+0=5
         */
        int a = -1;
        int b = 5;
        for (;a<5;){
            for (;b>=0;b--) {
                a++;
                System.out.println(a + "+" + b + "+" + "=" + (a + b));
            }
        }
        System.out.println("-------------------------------");
        //加餐:99乘法表
        for (int w =1;w<=9 ;w++) {
            for (int q = 1; q <= w; q++) {
                    System.out.println(q + "*" + w + "=" + q * w);

            }
        }
    }
}

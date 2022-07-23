package javase03.javaex03;

import java.util.Objects;
import java.util.Scanner;

public class BreakEX {
    public static void main(String[] args) {
        /*
        1）1-100以内的数求和，求出当和第一次大于20的当前数【for+ ·break】

        2）实现登录验证，有3次机会，如果用户名为”丁真”密码“666”提示登录成功，
        否则提示还有几次机会，请使用for+break完成
         */


        //自测1
        /*
        int sum = 0;
        for (int i = 1; i<=100 ; i++){
             sum = sum+i;
            if (sum>=20){
                System.out.println(sum);
                break;
            }
         */

        //答案1
        int sum = 0;
        for (int i = 1; i<=100 ; i++){
            sum = sum+i;
            if (sum>=20){
                System.out.println("当前数i="+i);
                System.out.println(sum);
                break;
            }
        }


        //自测2
        Scanner sc = new Scanner(System.in);
        String name0 = "丁真";
        int pass = 666;
        for (int i = 3 ;i<4 ; i--){
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            int password = sc.nextInt();
            if (Objects.equals(name, name0) && password==pass){
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("输入错误你还有"+i+"次机会");
                if (i==0){
                    System.out.println("次数已用尽，请稍后再试");
                    break;
                }
            }

        }

    }
}

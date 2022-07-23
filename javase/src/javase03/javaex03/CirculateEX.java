package javase03.javaex03;

import java.util.Objects;
import java.util.Scanner;

public class CirculateEX {

	public static void main(String[] args) {
		//if
		/**
		 1.对下列代码，若有输出，指出输出结果。
		 int x = 7;
		 int y = 4;
		 if(x>5){
		 if(y>5){
		 System.out.println(x + y);
		 }
		 System.out.println("韩顺平教育~ ");
		 } else
		 System.out.println("x is+ x);
		 */
		//自测
		System.out.println("韩顺平教育~ ");
		//答案
		//韩顺平教育~

		/**
		 2.编写程序，声明2个double型变量并赋值。判断第一个数大于10.0， 且第2个数小于20.0，打印两数之和。
		 3.定义两个变量int,判断二者的和，是否能被3又能被5整除，打印提示信息
		 4.判断一个年份是否是闰年，闰年的条件是符合下面二者之: (1)年份能被4整除，但不能被1 00整除(2)能被400整除
		 */
		/**
		//自测2
		double d1 = 12.5;
		double d2 = 0.25;
		if(d1>10.0 & d2<20.0 ){
			System.out.println("d1+d2=" + (d1+d2));
		}
		//自测3
		int i1 = 6;
		int i2 = 9;
		int i3 =  i1+i2;
		if (i3%3==0 && i3%5==0) {
			System.out.println("既可以被3整除又可以被5整除");
		}else {
			System.out.println("F");
		}
		//自测4
		int a =365;
		if(a%4==0 && a%100!=0){
			if (a%400==0){
				System.out.println("是润年");
			}
		}
		System.out.println("F");
		*/

		//答案2
		double d1 = 12.5;
		double d2 = 0.25;
		if(d1>10.0 & d2<20.0 ){
			System.out.println("d1+d2=" + (d1+d2));
		}
		//答案3
		int i1 = 6;
		int i2 = 9;
		int i3 =  i1+i2;
		if (i3%3==0 && i3%5==0) {
			System.out.println("既可以被3整除又可以被5整除");
		}else {
			System.out.println("F");
		}
		//答案4
		int a =365;
		if((a%4==0 && a%100!=0) || (a%400==0)){
				System.out.println("是润年");
		}
		System.out.println("F");

		//下列代码输出什么
		boolean b = true;
		if(b == false) // (
			System.out.println("a");
		else if(b)
			System.out.println("b");
		else if(!b)
			System.out.println("c");
		else
			System.out.println("d");

		//自测
		//b

		//答案
		//b

		/**
		出票系统:根据淡旺季的月份和年龄，打印票价[课后练习]
		旺季:
		成人(18-60) ： 60
		儿童(<18) :半价
		老人(>60) :1/3
		淡季:
		成人: 40
		其他: 20
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份为淡季还是旺季");
		String month = sc.next();
		System.out.println("请输入年龄");
		int age = sc.nextInt();
		String m1 = "淡季";
		String m2 = "旺季";

		if(Objects.equals(month, m1)){
			if (18<age && age<60){
				System.out.println("您需要交费40元");
			}else {
				System.out.println("您需要交费20元");
			}
		} else {
			if( 18<age && age<60){
				System.out.println("您需要交费60元");
			}else if ( 18>age){
				System.out.println("您需要交费30元");
			}else {
				System.out.println("您需要交费20元");
			}
		}


	}

}

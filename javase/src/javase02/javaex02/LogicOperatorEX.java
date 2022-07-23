/**
 * 1、
 * int x= 5;
 * int y=5;
 * if(x++==6 & ++y==6){ //逻辑与
 * 		x= 11;
 * }
 * System.out.println("x="+x+",y="+y);
 *
 * 2、
 * int x=5,y=5;
 * if(x++==6 && ++y==6){
 *		 X= 11;
 *}
 *System.out.println("x="+x+",y="+y);
 *
 *3、
 *	int x=5,y= 5;
 *	if(x++==5 | ++y==5){
 *		X =11;
 *}
 *System.out.println("x="+x+",y="+y);
 *
 *4、
 *	int x=5,y= 5;
 *	if(x++==5 || ++y==5){
 *		X =11;
 *}
 *System.out.println("x="+x+",y="+y);
 *
 *5、
 * boolean x=true;
 boolean y=false;
 short z=46;
 if( (z++==46)&& (y=true) ){
 z++}
 if((x=false) || (++z==49)){ z++}
 System. out.println("z="+z);

 写出结果
 */

package javase02.javaex02;

public class LogicOperatorEX {

	public static void main(String[] args) {
		//自测
		//1、6  6
		//2、6  5
		//3、11  6
		//4、11  5
		//48


		//答案
		//1、6  6
		//2、6  5
		//3、11  6
		//4、11  5
		//5、50

		//案例:实现三个数的最大值
		int n1 = 55;
		int n2 = 56;
		int n3 = 57;

		//自测
		int n4 = n1 > n2 ? n1 : n2;
		int max = n4 > n3 ? n4 : n3;
		System.out.println(max);

		//答案
		int max0 = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println(max0);
	}

}

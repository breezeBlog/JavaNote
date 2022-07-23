
//运算符介绍
/**
 * 一般 + - / * %
 * 	++ 	:
 * 自增(前) :先运算后取值  a=2;b=++a;  a=3;b=3
 * 自增(后) :先取值后运算  a=2;b=a++;  a=3;b=2
 * 	-- 	:
 * 自减(前) :先运算后取值  a=2;b=- -a  a= 1;b= 1
 * 自减(后) :先取值后运算  a=2;b=a- -  a=1;b=2
 */
package javase02;

public class ArithmeticalOperator {

	public static void main(String[] args) {
		// /使用
		System.out.println(10 / 4); //从数学来看是2.5, java中2
		System.out.println(10.0 / 4); //java是2.5
		double d = 10 / 4;// java中10 / 4 = 2，2=>2.0
		System.out.println(d);//是2.0

		//%取模,取余
		//在%的本质看一个公式!!!!  a%b=a-a/b*b  !!!!

		//-10%3=>-10-(-10)/3*3 =-10+9=-1
		//10 % -3=10一10/(-3)*(-3) =10-9=1
		//-10%-3=(-10)-(-10)/(-3)*(-3)= -10+ 9=-1
		System.out.println(10 % 3); 	//1
		System.out.println( -10 % 3); 	// -1
		System.out.println(10 % -3); 	//1
		System.out.println( -10 % -3);	//-1

		//  ++使用
		//独立语句时  i++ == ++i
		//表达式时
		int i = 10;
		int j = i++; //后++  -->  先 j=i 后 i=i+1  -->  j =10  i =11
		int k = ++i; //前++  -->  先 i=i+1 后 j=i  -->   j =11  i =11
	}

}

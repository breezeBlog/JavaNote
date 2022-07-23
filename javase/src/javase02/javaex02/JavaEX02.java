
/**
 * 1.计算下列表达式的结果
 10/3=?;10/5=?;10%2=?;-10.5%3=?;
 2.试说出下面代码的结果
 int i= 66;
 System.out.println(++i+i);
 3.在Java中，以下赋值语句正确的是()。
 A) int num1=(int)"18"; //错误应该Integer.parselnt("18") ;
 B) int num2= 18.0;
 C) double num3 = 3d;
 D) double num4= 8;
 E) int i=48; char ch = i+1;
 F) byte b = 19; shorts = b+2;
 4.试写出将String转换成double类型的语句，以及将char类型转换成String的语句,举例说明即可


 */

package javase02.javaex02;

public class JavaEX02 {

	public static void main(String[] args) {

		//自测
		// 3 2 0 -1.5
		// 134
		// C D
		// String a = "1234" double a1 = Double.parseDouble(a) ; char b = 's'  String b1 = s +""

		//答案
		// 3 2 0 -1.5
		// 134
		/**
		 A) int num1=(int)"18"; //错误应该Integer.parselnt("18" )
		 B) int num2=18.0; //错误 double -> int
		 .C) double num3=3d; //ok
		 D) double num4=8; //ok int -> double
		 E) int i=48; char ch = i+1; //错误int-> char
		 F) byteb = 19; shorts = b+2; //错误int -> short
		 */
		String a = "1234" ;
		double a1 = Double.parseDouble(a) ;
		char b = 's';
		String b1 = b +"" ;
	}

}

/**
 * 判断是否能够通过编译
 1.  short s = 12;
 s = s-9;
 2.  byte b = 10;
 b=b+11;
 b = (byte)(b+ 11);
 3.	char C = 'a';
 int i=16;
 float d = .314F;
 double result= C+ i + d;
 4.	byte b = 16;
 short S = 14;
 short t= S + b;

 */
package javase01.javaex01;

public class DatatypesEX {

	public static void main(String[] args) {

		//自测 ：false
//		s = s-9;
//		b=b+11;
//		short t= S + b;

		//答案 ：false
//		s = s-9; //int -> short
//		b=b+11;	 //int -> byte
//		short t= S + b; // int -> short
	}

}

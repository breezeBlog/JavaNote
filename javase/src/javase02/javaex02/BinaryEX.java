//进制和位运算
package javase02.javaex02;

public class BinaryEX {

	public static void main(String[] args) {
		/** 2&3  ~-2  ~2  2|3  2^3 */

		//自测
		//转化为补码
		/** 010=2  010=2  010=-3  */


		//答案

		//1.  先得到2的补码=> 2的原码00000000 00000000 00000000 00000010
		//   2的补码00000000 00000000 00000000 00000010
		//2. 3的补码3的原码00000000 00000000 00000000 00000011
		//   3的补码00000000 00000000 00000000 00000011
		//3.按位&
		//00000000 00000000 00000000 00000010
		//00000000 00000000 00000000 00000011
		//00000000 00000000 00000000 00000010 &运算后的补码
		//运算后的原码也是00000000 00000000 00000000 00000010
		//结果就是2
		System.out.println(2&3);//2

		//推导
		//1.先得到-2的原码10000000 00000000 00000000 00000010
		//2. -2的反码       11111111 11111111 11111111 11111101
		//3. -2的补码       11111111 11111111 11111111 11111110
		//4. ~-2操作         00000000 00000000 00000000 00000001  运算后的补码
		//5.运算后的原码就是00000000 00000000 00000000 00000001 => 1
		System.out.println(~-2);//1

		//推导
		//1. 得到2的补码  00000000 00000000 00000000 00000010
		//2. ~2操作         11111111 11111111 11111111 11111101 运 算后的补码
		//3. 运算后的反码 11111111 11111111 11111111 11111100
		//4.运算后的原码  10000000 00000000 00000000 00000011=>-3
		System . out. println(~2); //-3


	}

}
//程序中+号的使用
/**
 *
 1.当左右两边都是数值型时，则做加法运算

 2.当左右两边有一方为字符串，则做拼接运算
 */
package javase01;

public class Plus {

	public static void main(String[] args) {

		/**
		 1.当左右两边都是数值型时，则做加法运算
		 2.当左右两边有一-方为字符串，则做拼接运算
		 */
		System.out.println(100 + 98); //198
		System.out.println("100" + 98);//10098

		System.out.println(100 + 3 + "hello");//103hello
		System.out.println("hello" + 100 +3);//hello1003
	}

}

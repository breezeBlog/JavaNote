package javase02.javaex02;

public class ArithmeticalOperatorEX {

	public static void main(String[] args) {
		//ex1
		/**
		 * 1.面试题1
		 int i=1;
		 i=i++;
		 System.out.println(i);
		 问:结果是多少?为什么?
		 2.面试题2
		 int i=1;
		 i= ++i;
		 System.out.println(i);
		 */

		//自测1
		System.out.println(1);
		System.out.println(2);

		//答案1
		//1和2

		//ex2
		/**int i1 = 10;
		 *int i2 = 20;
		 int i = i1 ++
		 System.out.print("i="+i);
		 System.out.println("i2="+i2);
		 i = --i2;
		 System.out.print("i=" +i);
		 System.out.println("i2="+i2);
		 输出结果为什么？
		 */

		//自测2
		// i=10  i2 =20  ; i =19  i2 =19

		//答案2
		// i=10  i2 =20  ; i =19  i2 =19

		//ex3
		/**
		 * 	1.假如还有59天放假，问:合xx个星期零xx天
		 * 2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为: 5/9*(华氏
		 * 	 温度-1 00),请求出华氏温度对应的摄氏温度。[234.5]
		 */

		//自测3
		int a = 59;
		int b = a/7;
		int c = a%7;
		System.out.println("合"+b+"个星期零"+c+"天");

		double m =234.5;
		double n = 5/9*(m-100);
		System.out.println(n);

		//答案3
		//(1) 使用int变量days保存天数
		//(2)一个星期是7天星期数weeks : days / 7零xx天leftDays days % 7
		//(3) 输出
		//代码
		int days = 59;
		int weeks=days/7;
		int leftDays = days % 7;
		System.out.println(days + "天合"+ weeks+"星期零"+leftDays +"天" );
		//(1)先定义一个double huaShi 变量保存华氏温度
		//(2)根据给出的公式，进行计算即可5/9*(华氏温度-100)
		//考虑数学公式和java语言的特性
		//(3)将得到的结果保存到double sheShi
		//走代码
		double huaShi =234.6;
		double sheShi = 5.0 / 9*(huaShi - 100);
		System.out.println("华氏温度" +huaShi+"对应的摄氏温度="+ sheShi);


	}

}

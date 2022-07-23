package javase02.javaex02;

public class IdentifierrulesEX {

	public static void main(String[] args) {
		/*
		 * 判断正误
		hsp
		hsp12
		1hsp
		h-S
		x h
		h$4
		class
		int
		double
		public
		static
		goto
		stu_name
		*/

		//自测
		//T T F F F T F F F F F F T

		//答案
		//T T F F F T F F F F F F T

		/**
		 1.包名:多单词组成时所有字母都小写: aaa.bbb.ccc //比如com.hsp.crm

		 2.类名、接口名:多单词组成时，所有单词的首字母大写: XxxYyyZzz
		 比如: TankShotGame  大驼峰

		 3.变量名、方法名:多单词组成时，第一个单词首字母小写，第二个单词开始每个
		 单词首字母大写: xxxYyyZzz
		 比如: tankShotGame  小驼峰

		 4.常量名:所有字母都大写。多单词时每个单词用下划线连接: XXX YYY ZzZ
		 比如:定义一个所得税率TAX_ RATE

		 5.后面我们学习到类，包，接口，等时，我们的命名规范要这样遵守，更加详细的
		 看文档.
		 */

	}

}

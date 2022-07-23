/**
 * 看看下面代码输出什么
 int n1;
 n1 = 13;
 int n2;
 n2 =17;
 int n3;
 n3 = n1+ n2;
 System.out.println("n3 ="+ n3);
 int n4 = 38;
 int n5 = n4- n3;
 System.out.println("n5 ="+ n5);

 2.使用char类型，分别保存\n \t \r \\ 1 2 3等字符，并打印输出
 Homework02java

 3.编程，保存两本书名，用+拼接，看效果。保存两个性别，用加号拼接，看效果
 保存两本书价格，用加号拼接，看效果Homework03.java

 4.编程实现如下效果Homework04.java
 姓名		年龄		成绩		性别		爱好
 XX		XX		XX		XX		XX
 要求:
 1)用变量将姓名、年龄、成绩、性别、爱好存储
 2)使用+
 3)添加适当的注释
 4)添加转义字符，使用一条语句输出

 */
package javase01.javaex01;

public class JavaEX01 {

	public static void main(String[] args) {
		//自主1

		/**
		 n3 =30;
		 n5 =8
		 */
		//答案
		System.out.println("n3=30");
		System.out.println("n5=8");

		//自主2
		/**	char a = '\n';
		 char b = '\t';
		 char c = '\r';
		 char d = '\\';
		 char e = '1';
		 char f = '2';
		 char g = '3';
		 System.out.println();
		 */
		//教程
		char a = '\n';
		char b = '\t';
		char c = '\r';
		char d = '\\';
		char e = '1';
		char f = '2';
		char g = '3';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

		//自主3
		/**	String book1 = "aa";
		 String book2 = "bb";
		 String gender1 = "男";
		 String gender2 = "女";
		 int book3 =10;
		 int book4 =20;
		 System.out.println(book1+book2);
		 System.out.println(gender1+gender2);
		 System.out.println(book3+book4);
		 */
		//教程
		String book1 = "aa";
		String book2 = "bb";
		char gender1 = '男';
		char gender2 = '女';
		double book3=10.10;
		double book4=12.20;
		System.out.println(book1+book2);
		System.out.println(gender1+gender2);//对应符合码值计算
		System.out.println(book3+book4);

		//自主4
		String names = "姓名";
		String ages = "年龄";
		String grades = "成绩";
		String gender = "性别";
		String hobby = "爱好	";
		String name = "mmm";
		int age = 20;
		double grad = 99.5;
		char gen = '男';
		String hob = "love";
		System.out.println(names+"\t"+ages+"\t"+grades+"\t"+gender+"\t"+hobby+"\n"+name+"\t"+age+"\t"+grad+"\t"+gen+"\t"+hob);
	}

}

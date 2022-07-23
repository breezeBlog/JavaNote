//变量的使用和细节
/**
 * 	变量使用注意事项
 *
 1.变量表示内存中的一个存储区域[不同的变量，类型不同，占用的空间大小不同，比如: int 4个字节，double就是8个字节]

 2.该区域有自己的名称[变量名]和类型[数据类型]

 3.变量必须先声明，后使用，即有顺序

 4.该区域的数据可以在同一类型范围内不断变化

 5.变量在同一个作用域内不能重名

 6.变量=变量名+值+数据类型，这点请大家注意。 变量三要素

 */
package javase01;

public class varDetail {

	public static void main(String[] args) {

		//变量必须先声明，后使用，即有顺序
		int a=50;//int
		System.out.println(a);//50

		//该区域的数据/值可以在同一类型范围内不断变化
		//a ="jack"; //错
		a=88; //对
		System.out.println(a);//88

		//变量在同一个作用域内不能重名
		//int a = 77;//错误
	}

}

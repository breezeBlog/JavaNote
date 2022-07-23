//	转义字符的使用
package javase01;

public class ChangeChar {

	public static void main(String[] args) {
		//	\t	:一个制表位，实现对齐功能
		System.out.println("abc\tabc\tabc" );
		//	\n	：换行符
		System.out.println("abc\nabc\nabc\n");
		//	\\	:一个\
		System.out.println("abc\\abc\\abc");
		//	\'	:一个'
		System.out.println("a\'b\'c");
		//	\"	:一个"
		System.out.println("a\"b\"c");
		//	\r	:一个回车
		System.out.println("abc\rabc\rabc");
	}

}

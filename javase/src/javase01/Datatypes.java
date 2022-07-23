//数据类型的使用与细节
package javase01;

public class Datatypes {

	public static void main(String[] args) {
		//整型的类型
		/**
		 类型				占用存储空间				范围
		 byte [字节]			1字节			-128 ~ 127
		 为啥存放的范围是这个= >二进制(二进制我们详解)
		 short [短整型]		2字节			-(2^15) ~2^15-1
		 -32768 ~ 32767
		 int [整型]			4字节			-2^31~2^31-1
		 -2147483648 - 2147483647
		 long [长整型]		8字节			-2^63 ~ 2^63-1
		 */

		//浮点数类型

		/**
		 单精度float			4字节			-3.40338 ~ 3.403E38

		 双精度double			8字节			-1.798E308 ~ 1.798308
		 */

		//浮点型使用细节

		/**
		 1.与整数类型类似，Java 浮点类型也有固定的范围和字段长度，不受具体OS的影响。[float 4个字节double是8个字节]

		 2.Java的浮点型常量默认为double型，声明float型常量，须后加‘f'或.'F'

		 3.浮点型常量有两种表示形式十进制数形式:如: 5.12512.0f.512 (必须有小数点)
		 科学计数法形式:如: 5.12e2[] 5.12E-2[]

		 4.通常情况下，应该使用double型，因为它比float型更精确。[举例说明]
		 double num9 = 2.1 234567851;
		 float num10 = 2.1234567851F;

		 5.浮点数使用陷阱:2.7和8.1/3比较
		 */
		//Java 的浮点型常量(具体值)默认为double型， 声明float型常量， 须后加‘f’或“F '
		//float num1 = 1.1; //对不对?错误      	字节错误
		float num2 = 1.1F; //对的
		double num3= 1.1; //对
		double num4 = 1.1f; //对
		//+进制数形式:如: 5.12  512.0f  .512==0.512 ( 必须有小数点)
		double num5 =123; //等价0.123
		System.out.println(num5) ;
		//科学计 数法形式:如: 5.12e2 [5.12*10的2次方] 5.12E-2[5.12/10的2次方]
		System.out.println(5.12e2);//512

		//通常情况下，应该使用double型， 因为它比float型更精确。
		//[举例说明]double num9 = 2.1234567851;float num10 = 2.1234567851F ;
		double num9 = 2.1234567851;
		float num10 = 2.1234567851F ;
		System.out.println( num9) ;
		System.out.println(num10) ;

		//浮点数使用陷阱: 2.7和8.1/3比较
		//看看一段代码
		double num11 = 2.7;
		double num12 =8.1/3;//2.7
		System.out.println( num11);//2.7
		System.out.println(num12);//接近2.7的一个小数，而不是2.7

		//字符类型
		/**
		 基本介绍
		 字符类型可以表示单个字符，字符类型是char, char是两个字节(可以存放汉字)，
		 多个字符我们用字符串String(我们后面详细讲解String)
		 */
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '韩';
		char c4 = 97;//说明:字符类型可以直接存放一个数字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		//字符类型的细节
		/**
		 1.字符常量是用单引号('')括起来的单个字符。例如:charc1='a';charc2='中';charc3='9';

		 2. Java中还允许使用转义字符'\'来将其后的字符转变为特殊字符型常量。
		 例如: char c3 = '\n' ; // '\n'表示换行符

		 3.在java中，char的本质是一个整数，在输出时，是unicode码对应的字符。
		 http://tool.chinaz.com/Tools/Unicode.aspx

		 4.可以直接给char赋一个整数， 然后输出时，会按照对应的unicode字符输出[97]

		 5. char类型是可以进行运算的，相当于-一个整数，因为它都对应有Unicode码.
		 */
		//在 java中，char的本质是 一个整数，在输出时，是unicode码对 应的字符
		char char1=97;
		System.out.println(char1); // a
		char char2 ='a'; //输出'a'对应的数字
		System.out.println((int)char2);
		//char类型是可以进行运算的，相当于一个整数，因为它都对应有Unicode码.
		System.out.println( 'a'+10);//107
		char c5 = 'b' + 1;  //98+1==> 99
		System.out.println((int)c5); //99
		System.out.println(c5); //9⑨->对应的字符

		/**
		 字符类型本质探讨
		 1.字符型存储到计算机中，需要将字符对应的码值(整数)找出来,比如'a'
		 存储:'a' ==>码值97 ==>二进制==>存储
		 读取:二进制=> 97 ===> 'a' =>显示

		 2.字符和码值的对应关系是通过字符编码表决定的(是规定好)


		 介绍一下字符编码表[sublime测试]	了解即可
		 ASCII (ASCII编码表一-个字节表示, 一个128个字符)
		 Unicode (Unicode编码表固定大小的编码使用两个字节来表示字符，字母和汉字统一都是占用两个
		 字节，这样浪费空间)
		 utf-8 (编码表，大小可变的编码字母使用1个字节，汉字使用3个字节)
		 gbk (可以表示汉字，而且范围广,字母使用1个字节，汉字2个字节)
		 gb2312 (可以表示汉字，gb2312 < gbk)
		 big5码(繁体中文，台湾，香港)
		 */

		//boolean类型
		/**
		 1.布尔类型也叫boolean类型，booolean类型数据只允许取值true和false,无null
		 2. boolean类型占1 个字节。
		 B. boolean类型适于逻辑运算，- -般用于程序流程控制[这个后面会详细介绍]:
		 */
		boolean isPass = true;
		if(isPass == true) {
			System . out . println("考试通过，恭喜");
		} else {
			System.out.println("考试失败");
		}
	}

}

package javase01;

public class Typecasting {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//数据类型的自动转换
		/**
		 1.有多种类型的数据混合运算时，系统首先自动将所有数据换成容量最大的那种数据类型，然后再进行计算。
		 2. (byte, short)和char之间不会相互自动转换。
		 3. byte, short, char他们三者可以计算，在计算时首先转换为int类型。
		 4. boolean不参与转换
		 6.自动提升原则:表达式结果的类型自动提升为操作数中最大的类型
		 */
		int n1 = 10; //ok
		//float d1 = n1 + 1.1;//错误n1 + 1.1 =>结果类型是double
		//double d1 = n1 + 1.1;//对 n1 + 1.1 =>结果类型是double
		float d1 = n1 + 1.1F;//对n1 + 1.1 =>结果类型是float
		byte b1=10;//对-128-127
		// int n2 =10; //n2 是int
		//byteb2=n2;//错误，原因:如果是变量赋值，
		//char c1 = b1; //错误，原因 byte 不能自动转成char
		byte b2 =1;
		byte b3 =2;
		short s1 = 1;
		//shorts2=b2+s1;//错，b2+s1=>int
		int s2=b2+s1;//对，b2+s1=>int
		//byte b4=b2+b3;//错误:b2+b3=>int

		//强制类型转换
		/**
		 1.自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加
		 上强制转换符( ),但可能造成精度降低或溢出，格外要注意。
		 2.强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		 3.char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		 4.byte和short类型在进行运算时，当做int类型处理。
		 */
		int i = (int)1.9;
		System . out . println(i);
		int j = 100;
		byte byte1 = (byte)j;
		System . out . println(byte1);

		//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5; //编译错误 double -> int
		int y = (int)(10*3.5+6*1.5);
		System.out.println(y);
		//char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char _c1 = 100;
		int m = 100;
		//char _c2 = m;
		char _c3 = (char)m;
		System.out.println(_c3);
		//byte和short类型在进行运算时，当做int类型处理。

		//String类型转换
		//基本数据类型->String
		int i1 = 100;
		float f1 = 1.1F ;
		double dou1 = 4.5;
		boolean boo1 = true;
		String a1 =n1+"";
		String a2 =f1 +"";
		String a3 = dou1 +"";
		String a4 =boo1 +"";
		System.out.println(a1 + ";"+a2+";"+a3+";"+a4+";");

		//String->对应的基本数据类型
		String s5 ="123" ;
		//会在00P讲对象和方法的时候回详细
		//解读使用基本数据类型对应的包装类，的相应方法，得到基本数据类型
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5) ;
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong( s5) ;
		byte num5 =Byte.parseByte(s5) ;
		boolean b = Boolean.parseBoolean("true") ;
		short num6 = Short.parseShort(s5);

		//detail
		/**
		 1.在将String类型转成基本数据类型时，要确保String类型能够转成有效的数据，比如我们可以把"123" ,转成一个整数，但是不能把"hello"转成一个整数
		 2.如果格式不正确，就会抛出异常，程序就会终止，这个问题在异常处理章节中，会处理
		 */

	}

}

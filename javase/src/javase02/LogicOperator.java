/**
 * 关系运算符：== <= >= < > !=
 *
 * 逻辑运算符： & && | ||  ！ ^
 *
 * 赋值运算符：= += -= %= /= *=
 * 		a十=b;[等价a=a +b;]
 a-=b;[等价 a = a-b]
 *
 * 说明逻辑运算规则:
 1. a&b: &叫逻辑与:规则:当a和b同时为true ,则结果为true,否则为false

 2. a&&b : &&叫短路与:规则:当a和b同时为true ,则结果为true,否则为false

 3. ab: |叫逻辑或，规则:当a和b ,只要有一个为true ,则结果为true,否则为false

 4. allb: |叫短路或，规则:当a和b ,只要有一个为true ,则结果为true,否则为false

 5. !a :叫取反，或者非运算。当a为true,则结果为false,当a为false是，结果为true

 6. a^b:叫逻辑异或，当a和b不同时，则结果为true,否则为false

 三元运算符：条件表达式?表达式1:表达式2;
 运算规则:
 1.如果条件表达式为true,运算后的结果是表达式1;
 2.如果条件表达式为false,运算后的结果是表达式2;

 运算优先级：		1) (,{}等
 2)单目运行++
 3)算术运算符
 4)位移运算符
 5)比较运算符
 6)逻辑运算符
 7)三元运算符
 8)赋值运算符



 */
package javase02;

public class LogicOperator {

	public static void main(String[] args) {

		//区别&   &&
		int a= 4;
		int b=9;
		//对于&&短路与而言， 如果第一个条件为false ,后面的条件不再判断
		if(a<1 && ++b<50){
			System.out.println( " ok300");
		}
		System.out.println("a="+ a +"b=" + b);//4 9
		int A= 4;
		int B=9;
		//对于&逻辑与而言，如果第一个条件为false ,后面的条件仍然会判断
		if(A<1 & ++B<50){
			System.out.println("ok300");
		}
		System. out. println( "A=" +A+"B=" + B);//4 10

		//区别|  ||
		int i1 = 4;
		int i2 = 9;
		//对于&&短路与而言， 如果第一个条件为true ,后面的条件不再判断
		if(i1<5 || ++i2<50) {
			System.out.println(true);
		}
		System.out.println(i1+"  "+i2);//4  9

		int i3 = 4;
		int i4 = 9;
		//对于|短路与而言， 如果第一个条件为true ,后面的条件仍然会判断
		if(i1<5 | ++i2<50) {
			System.out.println(true);
		}
		System.out.println(i1+"  "+i2);//4  10


		//a^b: 叫逻辑异或，当a和b.不同时，则结果为true, 否则为false
		boolean bool=(10>1)^(3>5);
		System.out.println("bool=" + bool);//T





	}
}


package javase03;

public class Switch {
    public static void main(String[] args) {
   /*
    switch(表达式){
        case常量1: //当...
        语句块1;
        break;
        case常量2;
        语句块2;
        break;
        ...
        case常量n;
        语句块n;
        break;
        default:
            default语句块;
            break;
    */
        //说明
    /*
        1. switch关键字，表示swtich分支
        2.表达式对应一-个值
        3. case常量1 :当表达式的值等于常量1,就执行语句块1
        4. break :表示退出swtich
        5.如果和case常量1匹配，就执行语句块1,如果没有匹配，就继续四配case常量2
        6.如果一个都没有匹配上，执行default(默认)
     */
        //细节
        /*
        1.表达式数据类型，应和case 后的常量类型一致，或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int
        2.switch(表达式)中表达式的返回值必须是: (byte,short,int,char,enum,.String)
        3. case子句中的值必须是常量,而不能是变量
        4. default子包是可选的， 当没有匹配的case时，执行default
           如果 没有default子句，没有匹配任何常量，则没有输出
        5. break语句用来在执行完一一个case分支后使程序跳出switch语句块如果没有写break,程序会顺序执行到switch结尾
        */
        }
}

package javase03;

public class Continue {
    public static void main(String[] args) {
        /*
        1 ） continue 语句用于结束本次循环 ， 继续执行下一次循环 ．
        2 ） continue 语句出现多层嵌套的循环语句体中时 ， 可以通过标签指明要跳过的是哪一层循环 ， 这个和前面的标签的使用的规则一样 ·
        基本语法 ：
        {
        ...
        continue,
        ...
        }
        以 while 使用 continue 为例 ， 画出示意图
         */
        int i = 1;
        while(i<=4){
            i++;
            System.out.println("i="+i);
            if (i==2){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}

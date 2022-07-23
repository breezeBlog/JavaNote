package javase03.javaex03;

import java.util.Scanner;

public class WhileEX{
    public static void main(String[] args) {

    /*
            1. 打印1- -100之间所有能被3整除的数
            2. 打印40 -200之间所有的偶数
     */

        int a = 1;
        while (a <= 100) {
            a++;
            if (a % 3 == 0) {
                System.out.println(a);
            }
        }

        int b=40;
        while (b<=200){
            b++;
            if (b%2==0){
                System.out.println(b);
            }
        }
        /*
            do...while · ·
        1 ） 打印 1 一 100
        2 ） 计算 1 一 100 的和
        3 ） 统计 1 - 200 之间能被 5 整除但不能被 3 整除的个数 (DoWhileExe
        4 ） 如果李三不还钱 ， 则老韩将一直使出五连鞭 ， 直到李三说还钱为止
        [System.out.printIn(" 老韩问 ： 还钱吗 ？ y/n")] do...while · ·
         */
        int i1 = 1;
        do {
            i1++;
            System.out.println(i1);
        } while (i1<=100);

        int i2=0;
        do {
            i1++;
            i2=i1+i2;
            System.out.println(i2);
        }  while (i1<=100);

        do {
            i1++;
            if (i1%5==0 && i1%3!=0) {
                System.out.println(i1);
            }
        } while (i1<=200);

        Scanner sc =  new Scanner(System.in);
        char anuwer = ' ';
        do {
            System.out.println("使出五连鞭");
            System.out.println("老韩问 ： 还钱吗 ？ y/n");
            anuwer = sc.next().charAt(0);
            System.out.println("他的回答是："+anuwer);
        } while (anuwer != 'y');

        // 双层 for
        /*
        写出输出：
         for(int i = 0 ； i < 2 ； i++) { // 先思考
               for( int j = 0 ； j < 3 ； j++) {
                System.out.printIn("i=" + i + "j=" + j);
         */
        //自测
        //输出i=1 j=2
        //答案   内层循环结束后才再执行外层
        for(int i = 0 ; i < 2 ; i++) { // 先思考
            for( int j = 0 ; j < 3 ; j++) {
                System.out.println("i=" + i + "j=" + j);
            }
        }
        /*
        1. 统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级
        的平均分【学生的成绩从键盘输入
        2.统计三个班及格人数，每个班有5名同学。
        3.打印出九九乘法表[课后题]
         */

        //自测1
        /*
        double egrades = 0;
        double grades = 0;
        double sum = 0;
        double e = 0;
        for (int cla1 = 1 ; cla1<=3 ;cla1++){
            for (int stu = 1 ;stu<=5;stu++){
                System.out.println("请输入班级"+cla1+"成绩"+stu);
                double grade = sc.nextInt();
                grades += grade;
                egrades = grades/stu;
                System.out.println("该班平均成绩为"+egrades);
            }
            sum = grades+sum;
            e = sum/cla1;
            System.out.println("总成绩为"+sum+"总平均成绩为"+e);
        }
        */
        //答案
        Scanner myScanner = new Scanner(System.in) ;
        double tota1Score= 0; // 累积所有学生的成绩
        int passNum= 0;// 累积及格人数
        int c1assNum = 3;// 班级个数
        int stuNum= 5; // 学生个数
        for( int i = 1 ;i<=c1assNum; i++) {//i 表示班级
            double sum = 0;//班级总分
            for (int j = 1; j <= stuNum; j++) {//j表示学生
                System.out.println("请数第" + i + "个班的第" + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                //当有一个学生成绩>=60 ，passNum++
                if (score >= 60) {
                    passNum++;
                }
                sum += score;//累计
                System.out.println("成绩为" + score);
            }
            //因为sum是5个学生的总成绩
            System.out.println("sum=" + sum + "平均分=" + (sum / stuNum));
            //把sum累积到totalScore
            tota1Score += sum;
        }
        System.out.println("三个班总分="+tota1Score+"平均分="+tota1Score/(c1assNum*stuNum));
        System.out.println("及格人数"+passNum);

        //自测2
        int count = 0;
        for (int cla2 = 1 ; cla2<=3 ;cla2++){
            for (int stu1 = 1 ;stu1<=5;stu1++){
                System.out.println("请输入班级"+cla2+"成绩"+stu1);
                double grade1 = sc.nextInt();
                if(grade1<60){
                    count ++;
                }
            }
        }
         System.out.println("3个班不及格人数为"+count);


        /*
        使用for循环完成下面的案例
        请编写 个程序， 可以接收 个整数表示层数 （totallevel） 打印出金字塔。

                    *
                  *   *
                *       *
               ***********
        */
        int totalLevel = 60;
        for (int i = 1; i <= totalLevel; i++) {
            for (int m = 1 ;m<=totalLevel-i; m++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                if(j==1 || j== (2*i-1) || i==totalLevel){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}

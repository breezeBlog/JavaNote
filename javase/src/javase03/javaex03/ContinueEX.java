package javase03.javaex03;

public class ContinueEX {
    public static void main(String[] args) {
        /*
        label1:
        for (int j = 0; j<4; j++){
            lable2:
            for (int i =0; i<10; i++){
                if (i==2){
                    //看看分别输出什么值，并分析
                    continue ; //等价 continue lable2
                }
                System.out.println("i=" + i);
            }
        }

         */
        //自测
        /*
        i=  0   1   0   1   0   1   0   1
         */

        //答案
        label1:
        for (int j = 0; j<4; j++){
            lable2:
            for (int i =0; i<10; i++){
                if (i==2){
                    //看看分别输出什么值，并分析
                    continue ; //等价 continue lable2
                }
                System.out.println("i=" + i);
            }
        }



    }
}

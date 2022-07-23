package text0;

public class Text0 {
    public static void main(String[] args) {
        int sum=0;
        for(int i =1;i<=100;i++){
            for (int j=1;j<=i;j++){//内层对1-i进行循环
                sum+=j;
            }
        }
        System.out.println("sum=" +sum);
    }
}

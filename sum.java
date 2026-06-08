import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n=n/10;
        }
        System.out.print(sum);
    }
}

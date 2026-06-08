import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit=0;
        int m=n;
            while (n > 0) {
                int N = n % 10;
                digit += Math.pow(N, 3);
                n = n / 10;
            }
        System.out.println(digit);
    if(digit==m){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not Armstrong");
    }
    }
}

import java.util.Scanner;

public class NthPrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        int count = 0;
        int num = 2;
        int result = 0;
        
        while (count < n) {
            int divisors = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    divisors++;
                }
            }
            
            if (divisors == 2) {
                count++;
                result = num;
            }
            num++;
        }
        
        System.out.println(n + "th Prime: " + result);
    }
}

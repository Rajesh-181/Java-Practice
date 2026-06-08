
public class All3DigitArmstrongSimple {
    public static void main(String[] args) {
        System.out.println("All 3-digit Armstrong numbers:");
        
        for (int i = 100; i <= 999; i++) {
            int num = i;
            int sum = 0;
            
            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit * digit * digit;
                num = num / 10;
            }
            
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

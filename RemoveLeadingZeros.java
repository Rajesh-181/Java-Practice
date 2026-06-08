import java.util.Scanner;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String s1 = sc.nextLine();
        
        long result = Long.parseLong(s1);
        System.out.println("Result: " + result);
    }
}

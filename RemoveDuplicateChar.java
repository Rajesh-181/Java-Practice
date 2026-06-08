import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String s1 = sc.nextLine();
        
        String res = "";
        int n = s1.length();
        
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            if (!res.contains(c + "")) {
                res += c;
            }
        }
        
        System.out.println("Result: " + res);
    }
}

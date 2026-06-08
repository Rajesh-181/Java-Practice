import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String s1 = sc.nextLine();
        
        String vowels = "aAeEiIoOuU";
        int n = vowels.length();
        
        for (int i = 0; i < n; i++) {
            char c = vowels.charAt(i);
            if (s1.contains(c + "")) {
                s1 = s1.replace(c + "", "");
            }
        }
        
        System.out.println("Result: " + s1);
    }
}

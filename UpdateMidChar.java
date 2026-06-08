import java.util.Scanner;

public class UpdateMidChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter character to find: ");
        String charToFind = sc.nextLine();
        
        System.out.print("Enter replacement character: ");
        String replacement = sc.nextLine();
        
        char c = charToFind.charAt(0);
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        
        int targetPos = (count + 1) / 2;
        int current = 0;
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                current++;
                if (current == targetPos) {
                    result += replacement;
                } else {
                    result += s.charAt(i);
                }
            } else {
                result += s.charAt(i);
            }
        }
        
        System.out.println("Result: " + result);
    }
}

import java.util.Scanner;

public class palindrome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int org =n;
    int digit=0;
    while(n>0) {
        int s = n % 10;
        digit = digit * 10 + s;
        n = n / 10;

    }
    if(digit==org){
        System.out.println("PALINDROME");
    }
    else{
        System.out.println("NOT PALINDROME");
    }
}
}

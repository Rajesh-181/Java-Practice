import java.util.Scanner;
public class sumoftwodimarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] []  arr= new int[3][3];
        int sum=0;
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[k].length;l++){
                arr[k][l]= sc.nextInt();
            }
        }
        int flag=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
    if(i !=j && arr[i][j]!=0) {
        flag = 0;
        break;
    }
                }
            }
        if(flag==1){
            System.out.println("Diagnoal");
        }
        else{
            System.out.println("not diagnoal");
        }
    }
}

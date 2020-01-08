import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           int a=input.nextInt();
           int b=input.nextInt();
           arr[i]=a+b;
       }
       for(int i=0;i<n;i++){
           System.out.println(arr[i]);
       }
}
}
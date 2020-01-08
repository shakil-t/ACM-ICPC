import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (scan.hasNext()){
            int n=scan.nextInt();
            int m=scan.nextInt();
            int days=0;
            while (n!=0){
                if(days%m==0 && n>=m){
                    n++;
                }
                n--;
                days++;
            }
            System.out.println(days);
        }
    }
}
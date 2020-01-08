import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int first=0;
        int second=0;
        int draw=0;
        for(int i=1;i<=6;i++){
            if(Math.abs(a-i)<Math.abs(b-i))
                first++;
            else if(Math.abs(a-i)==Math.abs(b-i))
                draw++;
            else
                second++;   
        }
        System.out.print(first+" "+draw+" "+second);
    }
    
}
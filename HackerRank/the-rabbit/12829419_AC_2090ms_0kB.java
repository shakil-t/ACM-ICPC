import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
            int p=scan.nextInt();
            for(int k=1;true;k++){
                int low=(k*(k+1))/2;
                int high=((k+1)*(k+2))/2-1;
                if(low<=p && p<=high){
                    System.out.println(k);
                    break;
                }
            }
        }
}
}
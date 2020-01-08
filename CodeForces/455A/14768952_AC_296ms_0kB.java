import java.util.Scanner;

public class BoredomACM {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long[] occurance=new long[100005];
        //how many times a number has appeared in the sequence?
        for(int i=0;i<n;i++){
            int temp=scan.nextInt();
            occurance[temp]++;
        }
        long[] p=new long[100004];
        p[0]=0;
        p[1]=occurance[1];
        for(int j=2;j<p.length;j++){
            p[j]=Math.max(p[j-1], (p[j-2]+occurance[j]*j));
        }
        System.out.println(p[p.length-1]);
    }
    
}

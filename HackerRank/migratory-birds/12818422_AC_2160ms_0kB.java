import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int[] ar=new int[5];
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int temp=scan.nextInt();
            ar[temp-1]++;
        }
        int max=0;
        int ID=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
                ID=i+1;
            }
        }
        System.out.println(ID);
}
}
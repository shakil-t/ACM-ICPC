import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] a,int low, int high, int key){
        int middle=low+(high-low)/2;
        if(low==high){
            return low;
        }
        if(low==high-1){
            if(a[middle]>=key){
                return low;
            }else{
                return high;
            }
        }
        if(a[middle]>=key){
            return binarySearch(a, low, middle, key);
        }else{
            return binarySearch(a, middle, high, key);
            }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] pileOfWorms=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                int temp=input.nextInt();
                pileOfWorms[i]=temp;
            }else{
                int temp=input.nextInt();
                pileOfWorms[i]=pileOfWorms[i-1]+temp;
            }
    }
        int m=input.nextInt();
        int[] juicyWorms=new int[m];
        for(int j=0;j<m;j++){
            int lable=input.nextInt();
            juicyWorms[j]=lable;
        }
        for(int k=0;k<m;k++){
            int position=binarySearch(pileOfWorms, 0, n-1, juicyWorms[k]);
            System.out.println(++position);
        }
}
}
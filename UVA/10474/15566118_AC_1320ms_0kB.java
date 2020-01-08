import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int binarySearch(int[] a,int low, int high, int key){
        if(high>=low){
            int middle=low+(high-low)/2;
            if(a[middle]==key){
               return middle;
            }else{
                if(a[middle]>key){
                    return binarySearch(a, low, middle-1, key);
                }else{
                    return binarySearch(a, middle+1, high, key);
                }
            }
    }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int caseNum=1;
        while(input.hasNext()){
            int n=input.nextInt();
            int q=input.nextInt();
            if(n==0 && q==0){
                return;
            }else{
                int[] marbles=new int[n];
                for(int i=0;i<n;i++){
                    marbles[i]=input.nextInt();
                }
                Arrays.sort(marbles);
                System.out.println("CASE# "+caseNum+":");
                for(int j=0;j<q;j++){
                    int query=input.nextInt();
                    int position=binarySearch(marbles, 0, n-1, query);
                    if(position==-1){
                        System.out.println(query+" not found");
                    }else{
                        for(int k=position-1;k>=0;k--){
                            if(marbles[k]!=query){
                                position=k+1;
                                break;
                            }else{
                                position=k;
                                continue;
                            }
                        }
                        position++;
                        System.out.println(query+" found at "+position);
                    }
                }
                caseNum++;
            }
        }
    }
    
}
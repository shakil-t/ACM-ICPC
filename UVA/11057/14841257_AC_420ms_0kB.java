import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int getMin(long[] a){
        long min=a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<min && a[i]!=0){
                min=a[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            long n=input.nextLong();
            long[] prices=new long[(int)n];
            long counter=0;
            long[] difference=new long[(int)n];
            long[] savingi=new long[(int)n];
            long[] savingj=new long[(int)n];
            for(int i=0;i<n;i++){
                prices[i]=input.nextLong();
            }
            Arrays.sort(prices);
            long money=input.nextLong();
            long i=0;
            long j=n-1;
            while(i<j){
                if(prices[(int)i]+prices[(int)j]==money){
                    difference[(int)counter]=prices[(int)j]-prices[(int)i];
                    savingi[(int)counter]=prices[(int)i];
                    savingj[(int)counter]=prices[(int)j];
                    counter++;
                    i++;
                    j--;
                }else{
                    if(prices[(int)i]+prices[(int)j]<=money){
                        i++;
                    }else{
                        if(prices[(int)i]+prices[(int)j]>=money){
                            j--;
                        }
                    }
                }
            }
            int index=getMin(difference);
            //System.out.println(index);
            //System.out.println(counter);
            if(counter==1){
                System.out.println("Peter should buy books whose prices are "+savingi[index]+" and "+savingj[index]+".");
                System.out.println();
            }else{
                System.out.println("Peter should buy books whose prices are "+savingi[index]+" and "+savingj[index]+".");
                System.out.println();
            }
        }

    }
    
}
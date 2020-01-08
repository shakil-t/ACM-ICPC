import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ai;
        int counter=1;
        int max1=1;
        int max2=1;
        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i=0; i<n; i++){
            ai=scan.nextInt();
            array[i]=ai;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                counter++;
                if(max1<counter){
                    max1 = counter;
                }
            }
            else {
                max2 = counter;
                counter = 1;
            }
        }
        if (max1<max2){
            System.out.println(max2);
        }
        else{
            System.out.println(max1);
        }
    }
}
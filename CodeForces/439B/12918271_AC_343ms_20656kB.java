import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        long subjects=input.nextLong();
        long x=input.nextLong();
        boolean lessThanOne=true;
        int index=-1;
        long minHour=0;
        ArrayList<Long> chapters=new ArrayList<Long>();
        for(int i=0;i<subjects;i++){
            chapters.add(input.nextLong());
        }
        Collections.sort(chapters);
        for(int j=0;j<subjects;j++){
            minHour+=chapters.get(j)*(x);
            x--;
            if(x<=1){
                lessThanOne=false;
                index=j;
                break;
            }
        }
        if(lessThanOne==false){
            for(int k=index+1;k<subjects;k++){
                minHour+=chapters.get(k);
            }
        }
        System.out.println(minHour);
}
}
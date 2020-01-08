import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int N=input.nextInt();
            if(N==0){
                return;
            }
            PriorityQueue<Integer> p=new PriorityQueue<Integer>();
            for(int i=0;i<N;i++){
                p.add(input.nextInt());
            }
            int sum=0;
            int total=0;
            while(p.size()!=1){
                sum=p.poll()+p.poll();
                total+=sum;
                p.add(sum);
            }
            System.out.println(total);
        }
    }
    
}
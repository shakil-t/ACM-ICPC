import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       ArrayList<Integer> flowersPrice=new ArrayList<Integer>();
       int flowers=input.nextInt();
       int friends=input.nextInt();
       for(int i=0;i<flowers;i++){
           flowersPrice.add(input.nextInt());
       }
       Collections.sort(flowersPrice, Collections.reverseOrder());
       int buy=0;
       int friend=0;
       int price=0;
       for(int j:flowersPrice){
           price+=(buy+1)*j;
           friend++;
           if(friend==friends){
               friend=0;
               buy++;
           }
       }
       System.out.print(price);
}
}
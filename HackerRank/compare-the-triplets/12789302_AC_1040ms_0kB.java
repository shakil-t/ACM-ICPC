import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int[] aliceTriplet=new int[3];
       int[] bobTriplet=new int[3];
       int aliceScore=0;
       int bobScore=0;
       for(int i=0;i<aliceTriplet.length;i++){
           aliceTriplet[i]=input.nextInt();
       }
       for(int j=0;j<bobTriplet.length;j++){
           bobTriplet[j]=input.nextInt();
       }
       for(int k=0;k<3;k++){
           if(aliceTriplet[k]>bobTriplet[k]){
               aliceScore++;
           }else{
               if(aliceTriplet[k]<bobTriplet[k]){
                   bobScore++;
           }
       }
}
       System.out.print(aliceScore+" "+bobScore);
}
}
import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class Partition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int B=0;
        int C=0;
        int temp;
        for(int i=0;i<n;i++){
            temp=input.nextInt();
            if(temp>0 || temp==0){
                B+=temp;
            }else{
                C+=temp;
            }
        }
        System.out.println(B-C);
    }
    
}
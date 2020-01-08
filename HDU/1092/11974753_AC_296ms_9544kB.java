import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
        int sum=0;
        int a=input.nextInt();
        if(a==0){
            return;
        }else{
            int b;
            for(int i=0;i<a;i++){
                b=input.nextInt();
                sum+=b;
            }
            System.out.println(sum);
        }
        }
}
}
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for(int i=0;i<T;i++){
            int n=input.nextInt();
            int[] A=new int[n];
            for(int j=0;j<n;j++){
                A[j]=input.nextInt();
            }
            int match=1;
            while(match>0){
                int action=0;
                for(int k=0;k<A.length-2;k++){
                int min=Math.min(A[k], A[k+1]);
                min=Math.min(min, A[k+2]);
                int first=A[k];
                int sec=A[k+1];
                int third=A[k+2];
                if(min==A[k+1]){
                    action++;
                    A[k]=sec;
                    A[k+1]=third;
                    A[k+2]=first;
                }else{
                    if(min==A[k+2]){
                        action++;
        		A[k]=third;
    			A[k+1]=first;
    			A[k+2]=sec;
                    }
                }
            }
                match=action;
        }
            if(A[A.length-1]>A[A.length-2]){
        		System.out.print("YES\n");
        	}else{
        		System.out.print("NO\n");
        	}
}
}
}
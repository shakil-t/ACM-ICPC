import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++){
            int n=scan.nextInt();
            int[] num=new int[n];
            for(int j=0;j<n;j++){
                num[j]=scan.nextInt();
            }
            int match=1;
            while(match>0){
                int action=0;
                for(int k=0;k<num.length-2;k++){
                int min=Math.min(num[k], num[k+1]);
                min=Math.min(min, num[k+2]);
                int first=num[k];
                int second=num[k+1];
                int third=num[k+2];
                if(min==num[k+1]){
                    action++;
                    num[k]=second;
                    num[k+1]=third;
                    num[k+2]=first;
                }else{
                    if(min==num[k+2]){
                        action++;
        		num[k]=third;
    			num[k+1]=first;
    			num[k+2]=second;
                    }
                }
            }
                match=action;
        }
            if(num[num.length-1]>num[num.length-2]){
        		System.out.print("YES\n");
        	}else{
        		System.out.print("NO\n");
        	}
}
}
}

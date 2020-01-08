import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		int sum=(int)'a'-s.charAt(0);
		if(sum<0) {
			sum=sum*-1;
		}
		if(sum>13) {
			sum=26-sum;
		}
		for(int i=0;i<s.length()-1;i++) {
			int temp=(int)s.charAt(i)-s.charAt(i+1);
			if(temp<0) {
				temp=temp*-1;
			}
			if(temp<=13) {
				sum+=temp;
			}else {
				temp=26-temp;
				sum+=temp;
			}
		}
		System.out.println(sum);
}
}

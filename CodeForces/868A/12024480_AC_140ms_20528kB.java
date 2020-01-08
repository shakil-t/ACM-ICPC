import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int n = in.nextInt();
		String [] ar = new String[n];
		for(int i = 0; i < n; i++){
			ar[i] = in.next();
		}
		for(String temp1: ar){
			for(String temp2: ar){
				if((temp1 + temp2).contains(s)){
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
	}

}
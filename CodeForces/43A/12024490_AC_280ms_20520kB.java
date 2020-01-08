import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    
    
    int goal=input.nextInt();
		 String []a= new String[goal];
		 
		for(int i=0; i<goal;i++){
		a[i] = input.next();
		 
		}
		String team1=a[0];
		String team2 = null;
		int count1 =1;
		int count2 =0;
		
		for(int i=0; i<goal;i++){
			if(a[0].equals(a[i])){
                count1=count1+1;
				continue;
			}
			else{
				team2=a[i];
				count2= count2+1;
			}
		}
		
	
		if(count1>count2){
			System.out.println(team1);
		}
		else{
			System.out.println(team2);
		}
		
	}

}
	   		 			  	     
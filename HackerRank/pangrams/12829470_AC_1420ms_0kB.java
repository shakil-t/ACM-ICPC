import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        boolean[] alphabet=new boolean[26];
        String s=scan.nextLine();
        s=s.toLowerCase();
        s=s.replaceAll(" ", "");
        for(int i=0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']=true;
        }
        boolean isPangram=true;
        for(int j=0;j<alphabet.length;j++){
            if(alphabet[j]==false){
                isPangram=false;
                break;
        }
        }
        if(isPangram==true){
            System.out.println("pangram");
        }else{
            System.out.println("not pangram");
}
}
}
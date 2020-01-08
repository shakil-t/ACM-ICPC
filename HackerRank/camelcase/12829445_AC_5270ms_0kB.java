import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int words=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>64 && s.charAt(i)<91){
                words++;
            }
        }
        System.out.println(words);
}
}
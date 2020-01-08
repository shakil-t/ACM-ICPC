import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
             String line = input.next();
             ArrayList<String> h=new ArrayList<>();
             for(int i=0;i<line.length();i++){
                 String s=line.substring(line.length()-i-1,line.length());
                 s+=line.substring(0,line.length()-i);
                 if(!h.contains(s)){
                     h.add(s);
                 }
                 
             }
             System.out.println(h.size());
        }
    }
    
}
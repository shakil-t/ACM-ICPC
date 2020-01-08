import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String shift=input.next();
        String typedByMole=input.next();
        String keyboard="qwertyuiopasdfghjkl;zxcvbnm,./";
        String originalMessage="";
        for(int i=0;i<typedByMole.length();i++){
            for(int j=0;j<keyboard.length();j++){
                if(typedByMole.charAt(i)==keyboard.charAt(j) && 
                        shift.equalsIgnoreCase("R")){
                    originalMessage+=keyboard.charAt(j-1);
                }else{
                    if(typedByMole.charAt(i)==keyboard.charAt(j) && 
                        shift.equalsIgnoreCase("L")){
                        originalMessage+=keyboard.charAt(j+1);
                    }
                }
            }
        }
        System.out.println(originalMessage);
    }
}
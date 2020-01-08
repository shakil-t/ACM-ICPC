import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static String replace(String word){
        List<Character>temp=Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
		ArrayList<Character> alphabet=new ArrayList<Character>(temp);
		char[]chars=word.toCharArray();
		for(char c:chars){
                    if(c!='?'){
                        if(alphabet.contains((char)c)){
                            alphabet.remove(new Character(c));
                        }else{
                            return "-1";
                        }
                    }				
                }
		
                for(int i=0;i<chars.length;i++){
                    if(chars[i]=='?'){
                        chars[i]=alphabet.get(0);
                        alphabet.remove(0);
                    }
                }
		
                String result=new String(chars);
                return result;
	}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        if(word.length()<26){
            System.out.println(-1);
        }
        if(word.length()==26){
            String result=replace(word);
            System.out.println(result);
        }
        if(word.length()>26){
            String result=null;
            for(int i=0;i<=word.length()-26;i++){
                String temp1=word.substring(i, i+26);
                String temp2=replace(temp1);
                if(!temp2.equals("-1")){
                    result=word.substring(0,i).concat(temp2).concat(word.substring(i+26));
                    break;
                }
            }
            if(result==null){
                System.out.println(-1);
            }else{
                char[]chars=result.toCharArray();
                for(int i=0;i<chars.length;i++){
                    if(chars[i]=='?'){
                        chars[i]='A';
                    }
                }
                result=new String(chars);
                System.out.println(result);
            }
        }
    }
}
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static String sortString(String str){
        char temp[]=str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for(int i=0;i<T;i++){
            String s=input.next();
            int n=s.length();
            int result=0;
            for(int j=1;j<n;j++){
                HashMap<String, Integer> map=new HashMap<String, Integer>();
                for(int k=0;k<n-j+1;k++){
                    String subS=s.substring(k, k+j);
                    subS=sortString(subS);
                    if(map.containsKey(subS)){
                        int value=map.get(subS);
                        value++;
                        map.replace(subS, value);
                    }else{
                        map.put(subS, 1);
                    }
                    result+=map.get(subS)-1;
                }
            }
            System.out.println(result);
}
}
}
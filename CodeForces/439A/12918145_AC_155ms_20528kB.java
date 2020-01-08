import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int songs=input.nextInt();
        int d=input.nextInt();
        int timeForSongs=(songs-1)*10;
        int jokes=(songs-1)*2;
        for(int i=0;i<songs;i++){
            timeForSongs+=input.nextInt();
        }
        if(timeForSongs>d){
            System.out.println("-1");
        }else{
            while(timeForSongs<d){
            if(timeForSongs+5<=d){
                timeForSongs+=5;
                jokes++;
            }else{
                break;
            }
        }
            System.out.println(jokes);
}
}
}
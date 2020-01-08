import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cities=input.nextInt();
        int k=input.nextInt();
        //k is the range constant
        int[] towerStatus=new int[cities];
        for(int i= 0; i<cities;i++){
            towerStatus[i]=input.nextInt();
        }
        int lastOnTower=-k;
        int possibleTower=-k;
        int change=0;
        for(int i=0;i<cities;i++){
            if(towerStatus[i]==1){
                possibleTower=i;
            }
            if(lastOnTower==possibleTower && i-lastOnTower==2*k-1){
                change=-1;
                break;
            }
            if(lastOnTower==possibleTower && i==cities-1){
                change=-1;
                break;
            }
            if(lastOnTower!=possibleTower && possibleTower>=cities-k){
                change++;
                break;
            }
            if(lastOnTower!=possibleTower && i-lastOnTower==2*k-1){
                lastOnTower=possibleTower;
                change++;
            }
        }
        System.out.println(change);

           }
       }
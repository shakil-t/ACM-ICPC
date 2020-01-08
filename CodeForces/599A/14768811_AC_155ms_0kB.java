import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int d1=input.nextInt();
        int d2=input.nextInt();
        int d3=input.nextInt();
        int getBackToHouse=2*d1+2*d2;
        int fromShop1ToShop2=d1+d2+d3;
        int shop2=2*d2+2*d3;
        int shop1=2*d1+2*d3;
        int min=Math.min(Math.min(getBackToHouse, fromShop1ToShop2), Math.min(shop1, shop2));
        System.out.println(min);
    }
    
}
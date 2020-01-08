import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String contestName = input.next();
            int counter = 0;
            String[] names = {"Danil", "Olya", "Slava", "Ann", "Nikita"};
            
            for (int i=0; i<names.length; i++) {
                for (int j=0; j<contestName.length()-(names[i].length()-1); j++) {
                    if (contestName.substring(j, j+names[i].length()).equals(names[i])) {
                        counter ++;
                    }
                }
            }
            
            if (counter == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
}
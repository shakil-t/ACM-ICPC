import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Emergency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        while (input.hasNext()) {
            long n = input.nextLong();
            long x = input.nextLong();
            ArrayList<Long> subjects=new ArrayList<Long>();
            for (int i=0; i<n; i++) {
                subjects.add(input.nextLong());
            }
            
            Collections.sort(subjects);
            long ans = 0;
            for (int i=0; i<n; i++) {
                ans += (subjects.get(i) * x);
                if (x > 1) {
                    x--;
                }
            }
            
            System.out.println(ans);
        }
    }
    
}
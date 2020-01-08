import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int[] input = new int[testCases];
        int max = 0, counter = 0;
        for (int i = 0; i < testCases; i++) {
            input[i] = scan.nextInt();
            if (input[i] > max) {
                max = input[i];
            }
        }
        for (int i = 0; i < testCases; i++) {
            if (input[i] < max) {
                counter += max - input[i];
            }
        }
        System.out.println(counter);
    }
}
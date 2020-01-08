import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int q=input.nextInt();
        for(int i=0; i<q; i ++){
            int n=input.nextInt();
            int[][] matrix=new int[2*n][2*n];
            for (int j=0;j<2*n;j ++){
                for (int k=0;k<2*n;k ++){
                    matrix[j][k]=input.nextInt();
                }
            }
            System.out.println(getMaxSum(matrix));
        }
    }
    
    public static int getMaxSum(int[][] m) {
        int sum=0;
        int s=m.length-1;
        for (int i=0; i<m.length / 2;i ++) {
            for (int j=0; j<m.length / 2;j ++) {
                sum += Math.max(Math.max(m[i][j], m[s - i][j]), Math.max(m[i][s - j], m[s - i][s - j]));
            }
        }
        return sum;
    }
}
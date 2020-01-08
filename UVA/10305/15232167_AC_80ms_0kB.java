import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static Stack s=new Stack();
    public static void dfs(int[][] matrix, int node, int[] color){
        color[node]=1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[node][i]==1){
                if(color[i]==0){
                    dfs(matrix, i, color);
                }
            }
        }
        color[node]=2;
        s.push(node);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            int m=input.nextInt();
            if(n==0 && m==0){
                return;
            }
            int[][] adj=new int[n][n];
            int[] color=new int[n];
            for(int k=0;k<n;k++){
                color[k]=0;
            }
            for(int k=0;k<m;k++){
                int i=input.nextInt();
                int j=input.nextInt();
                adj[i-1][j-1]=1;
            }
            for(int k=0;k<n;k++){
                if(color[k]==0){
                    dfs(adj, k, color);
                }
            }
            while(!(s.isEmpty())){
                int temp=(Integer)s.pop();
                System.out.print(++temp);
                System.out.print(" ");
            }
            s.clear();
            System.out.println();
        }
    }
    
}
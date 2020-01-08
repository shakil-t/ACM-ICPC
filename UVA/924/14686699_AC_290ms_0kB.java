import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        HashMap<Integer, Set<Integer>> adj=new HashMap<Integer, Set<Integer>>();
        int employees=input.nextInt();
        for(int i=0;i<employees;i++){
            int numberOfFriends=input.nextInt();
            Set<Integer> v=new HashSet<>();
            for(int j=0;j<numberOfFriends;j++){
                int freind=input.nextInt();
                v.add(freind);
            }
            adj.put(i, v);
        }
        int testCases=input.nextInt();
        for(int i=0;i<testCases;i++){
            int source=input.nextInt();
            int[] d=new int[employees];
            int[] c=new int[employees+1];
            boolean[] visited=new boolean[employees];
            Queue<Integer> q=new LinkedList<Integer>();
            visited[source]=true;
            q.add(source);
            while(!(q.isEmpty())){
                int temp=q.remove();
                Iterator<Integer> j=adj.get(temp).iterator();
                while(j.hasNext()){
                    int next=j.next();
                    if(!(visited[next])){
                        visited[next]=true;
                        q.add(next);
                        d[next]=d[temp]+1;
                        c[d[next]]++;
                    }
                }
            }
            int max=0;
            int day=0;
            for(int k=0;k<employees;k++){
                if(c[k]>max){
                    max=c[k];
                    day=k;
                }
            }
            if(max!=0){
                System.out.println(max+" "+day);
            }else{
                System.out.println("0");
            }
        }
    }
    
}
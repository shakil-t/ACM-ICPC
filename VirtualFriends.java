/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtual.friends;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class VirtualFriends {

    /**
     * @param args the command line arguments
     */
    public static int[] parent;
    public static int find(int x){
        if(parent[x]==x){
            return x;
        }
        parent[x]=find(parent[x]);
        return parent[x];
    }
    public static void merge(int x, int y){
        parent[find(y)]=find(x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int testCases=input.nextInt();
        for(int i=0;i<testCases;i++){
            int F=input.nextInt();
            //number of friendships formed
            HashMap<String, Integer> friendship=new HashMap<String, Integer>();
            int friends=0;
            int merge=1;
            for(int j=0;j<F;j++){
                String friend1=input.next();
                String friend2=input.next();
                if(!(friendship.containsKey(friend1))){
                    friendship.put(friend1, friends);
                    friends++;
                }
                if(!(friendship.containsKey(friend2))){
                    friendship.put(friend2, friends);
                    friends++;
                }
                parent=new int[friends];
                for(int k=0;k<friends;k++){
                    parent[k]=k;
                }
                int temp1=friendship.get(friend1);
                int temp2=friendship.get(friend2);
                merge(temp1, temp2);
                merge++;
                System.out.println(merge);
            }
        }
    }
    
}

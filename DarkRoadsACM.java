/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dark.roads.acm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author shakil
 */
class Edge {
    public final int v;
    public final int w;
    public final int weight;
    
    public Edge(int v, int w, int weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    
}
public class DarkRoadsACM {

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
        while(input.hasNext()){
            List<Edge> edges=new ArrayList<Edge>();
            int m=input.nextInt();
            //m is the number of junctions
            int n=input.nextInt();
            //n is the number of roads
            if (n==0 && m==0){
                return;
            }
            int illuminated=0;
            for(int i=0;i<n;i++){
                int x=input.nextInt();
                int y=input.nextInt();
                int distance=input.nextInt();
                illuminated+=distance;
                Edge e=new Edge(x, y, distance);
                edges.add(e);
            }
            Collections.sort(edges, new Comparator<Edge>() {
                @Override
                public int compare(Edge x, Edge y) {
                    if(x.weight==y.weight){
                        return 0;
                    }else{
                        if(x.weight<y.weight){
                            return -1;
                        }else{
                            return +1;
                        }
                    }
                }
            });
            parent=new int[m];
            for(int j=0;j<m;j++){
                parent[j]=j;
            }
            int MST=0;
            for(Edge e:edges){
                if(find(e.v)!=find(e.w)){
                    merge(e.v, e.w);
                    MST+=e.weight;
                }
            }
            System.out.println(illuminated-MST);
        }
    }
}

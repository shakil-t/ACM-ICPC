/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.all.acm;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class AddAllACM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int N=input.nextInt();
            if(N==0){
                return;
            }
            PriorityQueue<Integer> p=new PriorityQueue<Integer>();
            for(int i=0;i<N;i++){
                p.add(input.nextInt());
            }
            int sum=0;
            int total=0;
            while(p.size()!=1){
                sum=p.poll()+p.poll();
                total+=sum;
                p.add(sum);
            }
            System.out.println(total);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valhalla.siege.acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class ValhallaSiegeACM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int q=scan.nextInt();
        long[] sum=new long[n];
        sum[0]=scan.nextLong();
        for(int i=1;i<n;i++) {
            sum[i]=sum[i-1]+scan.nextLong();
        }
        long totalSum=0;
        int index;
        int answer;
        while(q-->0){
            long temp=scan.nextLong();
            totalSum+=temp;
            if(totalSum>=sum[n-1]){
                totalSum=0; 
                answer=n;
            }else{
                index=Arrays.binarySearch(sum, totalSum);
                if(index<0){
                    index=-index-2;
                }
                answer=n-(index+1);
            }	
            System.out.println(answer);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sagheer.and.nubian.market.acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class SagheerAndNubianMarketACM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
        int s=scan.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<prices.length;i++){
            prices[i]=scan.nextInt();
        }
	int low=0;
        int high=n;
	long totalPrice=0;
	while(low<=high){
            int middle=(low+high)/2;
            long[] cost=new long[n];
            for(int i=0;i<n;i++){
                cost[i]=prices[i]+(long)(i+1)*middle;
            }
            Arrays.sort(cost);
            long sum = 0;
            for(int i=0;i<middle;++i){
                sum+=cost[i];
            }
            if(sum>s){
                high=middle-1;
            }else{
                low=middle+1;
                totalPrice=sum;
            }
        }
	System.out.println(low-1+" "+totalPrice);
    }
    
}

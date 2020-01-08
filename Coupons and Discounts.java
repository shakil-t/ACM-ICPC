/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coupons.and.discounts;

import java.util.Scanner;

/**
 *
 * @author shakil
 */
public class CouponsAndDiscounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] day=new int[n];
        String output="YES";
        for(int i=0;i<n;i++){
            day[i]=input.nextInt();
        }
        int discount=2;
        int coupon=1;
        for(int j=0;j<n;j++){
            day[j]=day[j]%discount;
            if(day[j]==1 && j+1<n && day[j+1]>0){
                day[j+1]-=coupon;
            }else{
                if(day[j]==0){
                    continue;
                }else{
                    output="NO";
                    break;
                }
            }
        }
        System.out.println(output);
    }
}

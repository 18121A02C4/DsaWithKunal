package com.coding;

import java.util.*;
public class TugOfWar {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        solve(arr,0,new ArrayList<Integer>(),new ArrayList<>(),0,0);
        System.out.println(ans);

    }
    static int minddiff=Integer.MAX_VALUE;
    static String ans="";

    private static void solve(int[] arr, int i, ArrayList<Integer> set1, ArrayList set2, int j, int k) {
        // TODO Auto-generated method stub
        if(i==arr.length) {
            int delta=Math.abs(j-k);
            if(delta<minddiff) {
                minddiff=delta;
                ans=set1+" "+set2;
            }
            return;
        }
        if(set1.size()<(arr.length+1)/2) {
            set1.add(arr[i]);
            solve(arr,i+1,set1,set2,j+arr[i],k);
            set1.remove(Integer.valueOf(arr[i]));
//			set1.remove(set1.size()-1);
        }

        if(set2.size()<(arr.length+1)/2) {
            set2.add(arr[i]);
            solve(arr,i+1,set1,set2,j,k+arr[i]);
//			set2.remove(set2.size()-1);
            set2.remove(Integer.valueOf(arr[i]));

        }

    }

}

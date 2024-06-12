package com.coding;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
        try{
            System.out.println("కర్మణ్యే వాధికారస్తే మా ఫలేషు కదాచన");

            System.out.println("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।");

        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        String[] arr={"shashank","reddy","peta"};
        String ans=String.join("*",arr);
//        System.out.println(ans);
//        System.out.println(1.0==1.0);
//        System.out.println(Integer.valueOf("2147483647").equals(Integer.valueOf("2147483647")));
//        System.out.println(compareVersion("1.0","1.0.0"));
//        System.out.println(maxSum(new int[]{2,4,5,8,10},new int[]{4,6,8,9}));
        System.out.println(findMaxK(new int[]{-104,-449,-318,-930,-195,579,-410,822,-814,-388,-863,174,-814,919,-877,993,741,741,-623,-4,-4,542,997,239,447,-317,409,-487,-34,6,-914,607,-622,915,573,666,-229,165,841,-820,703}));


    }
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        System.out.println(Arrays.toString(nums));
        while(i<j){
            if(Math.abs(nums[i])==Math.abs(nums[j])&&nums[i]!=nums[j]){
                return nums[j];
            }
            else if(Math.abs(nums[i])>Math.abs(nums[j])){
                i++;
            }else{
                j--;
            }
        }
        return -1;
    }
    public static int maxSum(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int sum1=0;
        int sum2=0;
        int ans=0;

        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                sum1+=nums1[i];
                i++;
                if(nums1[i]==nums2[j]){
                    sum1+=nums1[i];
                    sum2+=nums2[j];
                    ans+=Math.max(sum1,sum2);
                    sum1=0;
                    sum2=0;
                    i++;
                    j++;
                }
            }
            else if(nums2[j]<nums1[i]){
                sum2+=nums2[j];

                j++;
                if(nums1[i]==nums2[j]){
                    sum2+=nums2[j];
                    sum1+=nums1[i];
                    ans+=Math.max(sum1,sum2);
                    sum1=0;
                    sum2=0;
                    i++;
                    j++;
                }
            }
            else{
                ans+=nums1[i];
                i++;
                j++;
            }
        }
        ans+=Math.max(sum1,sum2);
        return ans;
    }
    public static int compareVersion(String version1, String version2) {
        int sum1=0;
        int sum2=0;
        int f1=0;
        int f2=0;
        int i=0;
        int j=0;
        while(i<version1.length()&&j<version2.length()){
            if(version1.charAt(i)=='.'&&version2.charAt(j)=='.'){
                if(sum1>sum2){
                    return 1;
                }else if(sum1<sum2){
                    return -1;
                }else{
                    sum1=0;
                    sum2=0;
                    f1=0;
                    f2=0;
                    i++;j++;
                    continue;
                }
            }
            if(version1.charAt(i)=='.'){
                f1=1;
            }
            if(version2.charAt(j)=='.'){
                f2=1;
            }
            if(version1.charAt(i)!='.'){
                sum1+=Integer.parseInt(String.valueOf(version1.charAt(i)));
            }
            if(version2.charAt(j)!='.'){
                sum2+=Integer.parseInt(String.valueOf(version2.charAt(j)));
            }
            if(f1==0){
                i++;
            }
            if(f2==0){
                j++;
            }

        }

        if(version1.length()>version2.length()){
            while(i<=version1.length()-1){
                if(version1.charAt(i)=='.'){
                    if(sum1>sum2){
                        return 1;
                    }else if(sum1<sum2){
                        return -1;
                    }else{
                        sum1=0;
                        sum2=0;
                    }
                }
                if(version1.charAt(i)!='.'){
                    sum1+=Integer.parseInt(String.valueOf(version1.charAt(i)));
                }
                i++;
            }
        }else{
            while(j<=version2.length()-1){
                if(version2.charAt(j)=='.'){
                    if(sum1>sum2){
                        return 1;
                    }else if(sum1<sum2){
                        return -1;
                    }else{
                        sum1=0;
                        sum2=0;
                    }
                }
                if(version2.charAt(j)!='.'){
                    sum2+=Integer.parseInt(String.valueOf(version2.charAt(j)));
                }
                j++;
            }
        }
        if(i==version1.length()&&j==version2.length()){
            if(sum1>sum2){
                return 1;
            }else if(sum1<sum2){
                return -1;
            }else{
                return 0;
            }
        }
        return 0;
    }

//    public static int myAtoi(String s) {
//        String ans="";
//        // String[] a=s.split("\\.");
//        // for(int i=0;i<a.length;i++){
//        //     ans+=no(a[i]);
//        // }
//        System.out.println(s.trim());
//        System.out.println(s);
//        s=s.trim();
//        if(s.charAt(0)=='+'||s.charAt(0)=='-'){
//            ans=no(s);
//        }else{
//            s='0'+s;
//            ans=no(s);
//        }
//        System.out.println(ans);
//        int b=Integer.valueOf(ans);
//        return b>=-2147483648&&b<=2147483647?b:(b<-2147483648?-2147483648:2147483647);
//
//    }
//    public static String no(String s){
//        // s.trim();
//        String k=""+s.charAt(0);
//        for(int i=1;i<s.length();i++){
//            // if(s.charAt(i)=='+'||s.charAt(i)=='-'){
//            //     k+=s.charAt(i);
//            // }
//            if(s.charAt(i)>='0' &&s.charAt(i)<='9'){
//                k+=s.charAt(i);
//            }else if(s.charAt(i)=='.'){
//                k+=s.charAt(i);
//            }else{
//                return k;
//            }
//
//        }
//        return k;
//    }
public static int beautySum(String s) {
    int ans=0;
    for(int i=0;i<s.length();i++){
        int[] arr=new int[26];
        for(int j=i;j<s.length();j++){
            arr[s.charAt(j)-'a']++;
            int diff=max(arr)-min(arr);
            ans+=diff;
        }
    }
    return ans;
}
    public static int min(int[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public static int max(int [] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    String s=String.join(".","shashank","reddy");
}
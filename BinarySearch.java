package Sample;

import java.util.Scanner;
public class Binary {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size :");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("enter target :");
        int target=sc.nextInt();
        int res=BinarySearch(nums,target); 
        if(res!=-1){
        System.out.println("target element index is :"+res);
        }
        else{
            System.out.println("Element not found..!");
        }
    }
public static int BinarySearch(int[] nums,int target){
    int left=0;
    int right=nums.length-1;
    while (left<=right) {
        int mid=(left+right)/2;
    if(target==nums[mid]){
        return mid;
    }
    else if(nums[mid]<target){
      left=mid+1;
    }
    else{
       right=mid-1;
    }
}
    return -1;
}
}

package Test;

import java.util.Arrays;

import java.util.Arrays;

public class MinPairSum
{   
	public static void main(String[] args) {
		int[] nums= {5,3,5,2,1,5,5,2,3,1};
		MinPairSum ob= new MinPairSum();
		int max= ob.minPairSum(nums);
		System.out.println(max);
	}
	public int minPairSum(int[] nums) {
		
		//5,3,5,2,1,5,5,2,3,1
		
		Arrays.sort(nums); 
		System.out.println(Arrays.toString(nums)); //1, 1, 2, 2, 3, 3, 5, 5, 5, 5
		int[] arr1= new int[nums.length/2];
		int[] arr2= new int[nums.length/2];
		int[] arr3=new int[nums.length/2];
		for(int i=0;i<nums.length/2;i++){
			arr1[i]=nums[i]; 
		}
		System.out.println("arr1==>"+Arrays.toString(arr1));//1,1,2,2,3
		int j=0;
		int n=nums.length-1; //nums.length/2=5
		//System.out.println(n);
		while(j<nums.length/2 && n>=nums.length/2){
			//System.out.println(nums[n]);
			arr2[j]=nums[n];
			j++;n--;
		}
		System.out.println("aar2==>"+Arrays.toString(arr2)); //5,5,5,5,3
		int max=0;
		for(int i=0;i<=arr1.length-1;i++){
			arr3[i]=arr1[i]+arr2[i];
			//System.out.println(Arrays.toString(arr3));//[6, 6, 7, 7, 6]
			
			//System.out.println(max);
		}
		max=arr3[0];
		for(int i=0;i<arr3.length;i++) {
			if(arr3[i]>max) 
				max=arr3[i];
		}
		return max;
	}
}

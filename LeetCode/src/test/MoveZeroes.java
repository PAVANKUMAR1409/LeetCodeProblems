package test;

import java.util.Arrays;

public class MoveZeroes 
{
	public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0){
                	int a=0;
                   for(int k=0;i<nums.length-1;i++) {
                	   a=nums[nums.length-1-k];
                	   nums[nums.length-1-k]=nums[i];
                   }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		moveZeroes(nums);
	}
}

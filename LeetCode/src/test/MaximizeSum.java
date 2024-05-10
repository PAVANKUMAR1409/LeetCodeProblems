package test;

public class MaximizeSum 
{
	public static int maxmiSize(int[] nums, int k) {
		int sum=0;
		for(int i=0;i<3;i++) {
			int maxNum=maxNum(nums);
			int j=maxNumIndex(nums);
			sum+=maxNum;
			nums[j]=sum+1;
		}
		
		
		return sum;
	}
	private static int maxNumIndex(int[] nums) {
		int maxNum=0,i=0,j=0;
		while(i<nums.length) {
			if(nums[i]>maxNum)
				maxNum=nums[i];
			j=i++;
		}
		return j;
		
	}
	private static int maxNum(int[] nums) {
		int maxNum=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>maxNum)
				maxNum=nums[i];
		}
		return maxNum;
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		int k=3;
		int sum=maxmiSize(nums, k);
		System.out.println(sum);
	}
}

package test;

public class ArithmeticTriplets 
{
	public static int arithmeticTriplets(int[] nums, int diff) 
	{
		int count=0;
		//0,1,4,6,7,10
		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
            	if(nums[j]-nums[i]==diff) {
            		for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
            	}
                
            }
        }
		return count;
    }
	public static void main(String[] args) {
		int[] nums= {0,1,4,6,7,10};
		int diff=3;
		int res=arithmeticTriplets(nums, diff);
		System.out.println(res);
	}
}

/*
 	nums[j]-nums[i]=diff
 	nums[k]-nums[j]=diff
 	
 	nums[j]=diff+nums[i]
 	
 	nums[k]-diff-nums[i]=diff
 	nums[k]-nums[i]=2*diff
  
  
  
 */

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
 
 class solution
 {
    public static int[] twosum(int[] nums, int target)
    {
        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0] =i;
                    arr[1] =j;
                    break;
                }
            }
        }

        return arr;
    }

        public static  void main(String[] args)
        {
            int nums[]={2,7,11,15};
            int target=9;

            int[] result = twosum(nums, target);
            System.out.println(result[0] +"," +result[1]);
        }

    }

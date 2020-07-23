package answer;

public class num_53 {
    public int maxSubArray(int[] nums) {
        /*int sum,thissum;
        thissum=0;
        sum=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                thissum+=nums[i];
            }else {
                thissum=nums[i];
            }
            sum=Math.max(sum,thissum);
        }
        return sum;
    }*/
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
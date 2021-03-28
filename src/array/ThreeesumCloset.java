package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeesumCloset {
    public int threeSumCloset(int[] nums,int target){
        Arrays.sort(nums);
        int start,end,mid;
        int ans=nums[0]+nums[1]+nums[2];
        for(start=0;start<nums.length;start++){
            mid=start+1;
            end=nums.length-1;
            while(mid<end){
                int sum=nums[start]+nums[mid]+nums[end];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans=sum;
                }
                if(sum>target){
                    end--;
                }else if(sum<target){
                    mid++;
                }else if(sum==target){
                    return sum;
                }
            }
        }
        return ans;
    }
}
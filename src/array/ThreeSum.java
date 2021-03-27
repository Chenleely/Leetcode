package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(nums.length<3){return result;}

        Arrays.sort(nums);
        int n=nums.length;
        int i,j,index;
        for(i=0;i<n&&nums[i]<=0;i++){
            if(i>0&&nums[i]==nums[i-1]){continue;}
            index=i+1;
            j=n-1;
            while(index<j){
                int sum=nums[i]+nums[index]+nums[j];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[index],nums[j]));
                    while(index<j&&nums[index]==nums[index+1]){index++;}
                    while(index<j&&nums[j]==nums[j-1]){j--;}
                    index++;
                    j--;
                }else if(sum>0){
                    j--;
                }else if(sum<0){
                    index++;
                }
            }
        }
        return result;
    }
}
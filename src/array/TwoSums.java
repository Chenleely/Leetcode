package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public int[] twoSum_1(int[] nums, int target) {
        HashMap resultMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(resultMap.containsKey(target-nums[i])){
                return new int[]{(int)resultMap.get(target-nums[i]),i};
            }
            resultMap.put(nums[i], i);
        }
        return new int[0];
    }
    //
    }
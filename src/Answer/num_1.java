package answer;

import java.util.Arrays;
import java.util.HashMap;

/*
* 问题描述：
* 给定一个整数数组 nums 和一个整数目标值 target，
* 请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
* 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
* 你可以按任意顺序返回答案。
* */
public class num_1 {
    //1.暴力解：双重遍历数组
    //  时间复杂度：O(n^2)
    public int[] twoSum1(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    //2.哈希表
    //时间复杂度：O(n)
    public int[] twoSum2(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            //判断hashmap中是否存在于target-x相等的元素，如果有，则返回，否则将值作为key，索引作为value放入
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

}

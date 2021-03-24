package array;

import java.util.HashMap;

public class TwoSums_1 {
    //首先考虑暴力解的情况
    public int[] twoSum_1(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[0];
    }
    //对暴力查找进行优化：
    /* 
        可以将暴力查找优化为二分查找
    */
    public int[] twoSum_2(int[] numbers, int target) {
        //先固定一个数，然后二分查找寻找另一个数
        for(int i=0;i<numbers.length;i++){
            int left,right,center;
            left=i+1;right=numbers.length-1;center=(left+right)/2;
            while(left<=right){
                int val=target-numbers[i];
                if(numbers[center]==val){
                    return new int[]{i+1,center+1};
                }else if(numbers[center]>val){
                    right=center-1;
                }else if(numbers[center]<val){
                    left=center+1;
                }
            }
        }

        return new int[0];
    }
    //对二分查找再次优化，改为哈希查找
    public int[] twoSum_3(int[] numbers, int target) {
        HashMap resultMap=new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++){
            if(resultMap.containsKey(target-numbers[i])){
                return new int[]{(int)resultMap.get(target-numbers[i])+1,i+1};
            }
            resultMap.put(numbers[i], i);
        }
        return new int[0];
    }

    //双指针探测
    public int[] twoSum_4(int[] numbers, int target) {
        int left,right;
        left=0;
        right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else if(sum==target){
                return new int[]{left+1,right+1};
            }
        }
        return new int[0];
    }
}
package array;

public class RemoveDuplicates {
    /* 
        Description:
            给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
            不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
        Example:
            输入：nums = [0,0,1,1,1,2,2,3,3,4]
            输出：5, nums = [0,1,2,3,4]
            解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。
                  不需要考虑数组中超出新长度后面的元素。
    */
    public int removeDuplicates(int[] nums) {
        int slow,fast;
        slow=0;
        fast=0;
        while(fast<nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }else{
                nums[++slow]=nums[fast];
                fast++;
            }
        }
        return slow+1;//slow为下标，加1才是数组的长度
    }
}
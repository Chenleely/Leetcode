package array;

public class RemoveDuplicates_two {
    /* 
        Description:
            给定一个增序排列数组 nums ，你需要在 原地 删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
            不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
        Example:
            输入：nums = [0,0,1,1,1,1,2,3,3]
            输出：7, nums = [0,0,1,1,2,3,3]
            解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 
            你不需要考虑数组中超出新长度后面的元素。
    */
    public int removeDuplicates(int[] nums) {
        int slow,fast;
        int length=nums.length;
        if(length<3){return length;}
        slow=0;
        fast=1;
        int index=slow;
        int counter=0;//用于统计相同的次数
        while(fast<length){
            if(nums[slow]==nums[fast]){
                counter++;
                if(counter>1){
                    slow++;
                    length=removeElement(nums,fast);
                    counter=0;
                }
                fast++;
                
            }else{
                
            }
        }
        return slow+1;
    }
    //如果Counter>1，那么就将多余的元素从数组中移除
    private int removeElement(int[] nums,int index){
        int val=nums[index];
        int length=nums.length;
        for(int i=index;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return length;
    }
}
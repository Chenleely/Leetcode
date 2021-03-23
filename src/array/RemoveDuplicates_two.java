package array;

import java.util.HashMap;

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
    //多余删除：O(N^2)
    public int removeDuplicates_1(int[] nums) {
        int length,i,j,counter;
        length=nums.length;
        counter=1;

        i=1;
        while(i<length){
            if(nums[i-1]==nums[i]){
                counter++;
                //相同的数如果多于两对，那么就把多余的删除
                if(counter>2){
                    this.removeElement(nums,i);
                    i--;
                    length--;
                }
            }else{
                counter=1;
            }
            i++;
        }
        return length;
    }
    //如果Counter>1，那么就将多余的元素从数组中移除
    private int[] removeElement(int[] nums,int index){
        for(int i=index+1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        return nums;
    }
    //滑动窗口法:O(N^2
    public int removeDuplicates_2(int[] nums){
        int start,end,windowLen,length;
        length=nums.length;
        start=0;
        windowLen=3;
        end=start+windowLen-1;
        if(length<3){return length;}

        while(end<length){
            //只有当滑动窗口内都是相同的元素时才进行处理
            if(nums[start]==nums[start+1]&&nums[start]==nums[end]){
                for(int i=end;i<length-1;i++){
                    nums[i]=nums[i+1];
                }
                length--;
            }else{
                start++;
                end++;
            }  
        }
        return length;
    }
    //双指针覆盖:O(N)
    public int removeDuplicates_3(int[] nums) {
        int slow,fast,length,counter;
        length=nums.length;
        slow=1;
        fast=1;
        counter=1;

        while(fast<length){
            //如果碰到相同元素则将counter加1，碰到不同的元素将Counter置为1
            if(nums[fast]==nums[fast-1]){
                counter++;
            }else{
                counter=1;
            }
            //
            //如果相同的次数小于等于2，就把fast所指的元素复制到slow，如果大于2了，那么不进行复制，只是递增fast
            //最后得到的数组，[0,slow]这个范围内都是相同次数小于等于2的元素
            // 
            if(counter<=2){
                nums[slow++]=nums[fast];
            }
            fast++;
        }
        return slow;
    }
    
   
}
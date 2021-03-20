package array;

public class move_zero {
    //Description:给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序
    /* 
    *demands:
        必须在原数组上操作，不能拷贝额外的数组。
        尽量减少操作次数。
     example:
        输入: [0,1,0,3,12]
        输出: [1,3,12,0,0]
    */
    public void moveZeroes(int[] nums) {
        //双指针？
        //test<:只考虑到交换0，没有考虑到这样做可能会导致数组中非零的数顺序改变
        // int i=0;
        // int j=nums.length-1;
        // //i为左指针，j为右指针
        // while(i<j){
        //     while(nums[j]==0){
        //         j--;
        //     }
        //     if(nums[i]==0){
        //         swap(i, j, nums);
        //     }
        //     i++;
        // }
        int left,right;
        int n=nums.length;
        left=right=0;
        while(right<n){
            if(nums[right]!=0){
                swap(left,right,nums);
                left++;
            }
            right++;
        }
        
    }
    //
    public void moveZeros1(int[] nums){
        int left,right;
        int n=nums.length;
        left=-1;
        right=0;
        while (right<n){
            if(nums[right]!=0){
                nums[++left]=nums[right];
            }
            right++;
        }
        left++;
        while (left<n){
            nums[left]=0;
            left++;
        }
    }
    private void swap(int a,int b,int[] nums){
        int temp=nums[b];
        nums[b]=nums[a];
        nums[a]=temp;
    } 
}
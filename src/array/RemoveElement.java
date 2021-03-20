package array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int oldlength=nums.length;
        int fast,slow;
        fast=0;
        slow=0;
        while (fast<oldlength){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
    public int removeElement1(int[] nums, int val) {
        int right,left;
        int n=nums.length;
        right=n-1;
        left=0;
        while (left<right){
            if(nums[left]==val){
               nums[left]=nums[right--];
            }else {
                //每次迭代都检查，避免出现交换的元素是要删除的元素
                left++;
            }
        }
        return right;
    }
}

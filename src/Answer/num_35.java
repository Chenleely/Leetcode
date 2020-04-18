package answer;

public class num_35 {
    //二分查找（非递归实现）
    public int searchInsert(int[] nums, int target) {
        int left=0;int right=nums.length-1;int center;
        while (left<=right){
            center= left + (right - left) / 2;//防止整型溢出
            if(target==nums[center]){
                return center;
            }else if(target>nums[center]){
                left=center+1;
            }else {
                right=center-1;
            }
        }
       return left;
    }
    //二分查找（递归实现）
    public int searchInsert1(int[] nums, int target) {
        int pos=BinarySearch(nums,0,nums.length-1,target);
        return pos;
    }
    private int BinarySearch(int[] nums,int left,int right, int target){
        if(left<=right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                BinarySearch(nums, mid + 1, right, target);
            } else {
                BinarySearch(nums, left, mid - 1, target);
            }
        }
        return right-1;
    }

}

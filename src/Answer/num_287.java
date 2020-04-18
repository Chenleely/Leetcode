package answer;

import java.util.Arrays;

public class num_287 {
    //利用抽屉原理：
    // 把多于n+1个的物体放到n个抽屉里，则至少有一个抽屉里的东西不少于两件。

    //如果存在相同的数，那么
    public int findDuplicate(int[] nums) {
        int slow,fast,ptr1,ptr2;
        slow=fast=0;
        slow=nums[slow];
        fast=nums[nums[fast]];
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        ptr1=0;
        ptr2=slow;
        while (ptr1!=ptr2){
            ptr1=nums[ptr1];
            ptr2=nums[ptr2];
        }
        return nums[slow];




            /*int n = nums.length - 1;
            int low = 1;
            int high = n;
            while (low < high) {
                int mid = (low + high) >>> 1;
                int count = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] <= mid) {
                        count++;
                    }
                }
                if (count > mid) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;*/
    }


}

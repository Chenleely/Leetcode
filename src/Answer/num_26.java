package Answer;

public class num_26 {
    //采用快慢指针，i用于指示当前最后一个元素，j扫描数组元素，如果碰到有与i指向的元素相等，则j跳过，否则指定i的下一个元素为j目前指向，最后返回i+1即为数组长度
    //如果不考虑空间消耗，可以考虑使用Hashset进行散列
    public int removeDuplicates(int[] nums) {
        int i,j,len,sum;
        len=nums.length;
        i=0;
        for(j=1;j<=len-1;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i;
    }
}

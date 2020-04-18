package answer;
public class num_27 {
    //与26类似的双指针法
    public int removeElement(int[] nums, int val) {
        int i,j,len;
        len=nums.length;
        i=0;
        for(j=0;j<len;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}

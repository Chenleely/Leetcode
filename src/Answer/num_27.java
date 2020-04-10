package Answer;
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

    /*public static void main(String[] args) {
        num_27 n=new num_27();
        int[] test={2};
        int len=n.removeElement(test,3);
        for(int i=0;i<len-1;i++){
            System.out.print(test[i]+" ");
        }
    }*/
}

package array;

public class MaxArea {
    public int maxArea(int[] height) {
        if(height.length==1){return height[0];}
        int i,j;
        i=0;j=height.length-1;
        int maxarea=0;
        while(i<j){
            int width=j-i;
            int thisarea=Math.min(height[i], height[j])*width;
            if(thisarea>maxarea){
                maxarea=thisarea;
            }
            if(height[i]>height[j]){
                j--;
            }else if(height[i]<height[j]){
                i++;
            }else{
                i++;
            }
        }
        return maxarea;
    }
}
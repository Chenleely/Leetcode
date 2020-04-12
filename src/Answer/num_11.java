package Answer;

public class num_11 {
    public int maxArea(int[] height) {
        //求(right-left)*Max(nums[left],nums[right])的最大值，采用双指针，从两端开始往里移动指针，找到面积最大的矩形。
        //时间复杂度：O(N),空间复杂度：O(1)
        int i, j, area, maxarea;
        i = 0;
        j = height.length - 1;
        area = (j - i) * Math.min(height[i], height[j]);
        maxarea = area;
        while (i <= j) {
            area = (j - i) * Math.min(height[i], height[j]);
            if (area > maxarea) {
                maxarea=area;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxarea;
    }


}

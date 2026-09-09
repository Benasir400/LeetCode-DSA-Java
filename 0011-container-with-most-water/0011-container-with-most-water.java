class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n - 1;
        int area = 0;
        while (left < right) {
            int curarea = Math.min(height[left], height[right]) * (right - left);
            area=Math.max(area,curarea);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}
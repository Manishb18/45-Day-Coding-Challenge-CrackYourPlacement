public class containerWithMostWater {
    public static void main(String[] args) {
        int height[] ={1,2,3,4,5};
        System.out.print(maxArea(height));
    }
    static int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int area = Math.min(height[l], height[r])*(r-l);
            if(area > max){
                max = area;
            }
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}

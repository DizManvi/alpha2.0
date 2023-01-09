package Arrays;
import java.util.*;
public class trappedRainWater {
    public static int trappedrain( int height[]){
        //declaring leftmax
        int h= height.length;
        int leftMax[] = new int[h];
        leftMax[0]= height[0];
        for (int i=1 ; i<h; i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }
        //declaring right max

        int rightMax[] = new int[height.length];
        rightMax[h-1]= height[h-1];
        for (int i= h-2; i>=0; i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }
        int trapped_water=0;
        for (int i=0; i<h; i++){
            int water_level = Math.min( leftMax[i], rightMax[i]);
            trapped_water+= water_level-height[i];
        }
        return trapped_water;

    }

    public static void main(String[] args) {
        int pole_height[]= {4,2,0,6,3,2,5};
        System.out.println( trappedrain(pole_height));
    }
}

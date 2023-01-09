package Arrays;

public class maxSubArray_bruteForce {
    public static void subarray(int arr[]) {   //no of elements= n(n+1)/2
        int curr_sum = 0;   //time complexity is o(n^3) , bad time complexity
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curr_sum = 0;
                for (int k = start; k <= end; k++) {
                    curr_sum += arr[k];
                }
                System.out.print(curr_sum);
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
                System.out.println();

            }
        }
        System.out.println("max_sum is " + max_sum);
    }

    public static void main(String[] args) {
        int array[]={1,-2,6,-1,3};
        subarray(array);
    }
}
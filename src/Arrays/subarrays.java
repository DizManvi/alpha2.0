package Arrays;

public class subarrays {
    public static void subarray( int arr[]){   //no of elements= n(n+1)/2
        int count=0;
        for (int i=0 ; i<arr.length;i++){
            int start=i;
            for(int j=i; j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start; k<=end;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
                System.out.println("the sum of the subarray is "+sum);
            }
            System.out.println();
        }
        System.out.println("total no of subarrays "+ count);
    }
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};
        subarray(array);
    }
}

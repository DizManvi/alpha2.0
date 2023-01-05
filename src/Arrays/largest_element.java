package Arrays;

public class largest_element {
    //method-1
    public static int maxfunc(int[] arr){
        int max_ele= arr[0];
        for ( int i=0 ; i<arr.length ; i++){
            if(arr[i]>max_ele){
                max_ele=arr[i];
            }
        }
        return max_ele;
    }
    //method-2
    public static int largest(int[] arr){
        int max_ele= Integer.MIN_VALUE;
        for ( int i=0 ; i<arr.length ; i++){
            if(arr[i]>max_ele){
                max_ele=arr[i];
            }
        }
        return max_ele;
    }

    public static void main(String[] args) {
        int array[] = {45,78,56,91,34,899,45,900};
//        int largest_ele= maxfunc(array);
        System.out.println(largest(array));
    }
}

package Arrays;
import java.util.*;
public class reverse_array {
    public static void reverse( int arr[]){
        // arr ={1,2,3,4,5} rev_arr= {5,4,3,2,1}
        int first=0;int last= arr.length-1;
        while (first<last){
            int temp= arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first ++;
            last--;
        }

    }

    public static void main(String[] args) {
        int arr[]= {34,8,9,45};
        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

package Arrays;
import java.util.*;
public class binarysearch {
    // arr= {23,45,67,78,90} find 78
    public static int binary_search(int arr[], int key){
        int start=0; int end= arr.length-1;
        while(start<=end) {  //recursive loop
            int mid_ele =(start + end) / 2;
            if (key > arr[mid_ele]) {   // element is right side of the mid_ele
                start = mid_ele + 1;
            }
            if (key == arr[mid_ele]) { //middle element is the key
                return mid_ele;
            }
            if (key < arr[mid_ele]) {
                end = mid_ele - 1; //element is left side of the mid_ele
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int count[]={23,45,67,78,90};
        int index= binary_search(count, 90);
        if(index==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("element is found at "+index+" position");
        }

    }


}

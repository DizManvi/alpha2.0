package Arrays;
import java.util.*;
public class binarysearch {
    // arr= {1,2,3,4,5,6} find 5
    public static int binary_search(int arr[], int key){
        int start=0; int end= arr.length-1;
        while(start<=end){  //recursive loop
            int mid_ele = (int)(start+end)/2;
            if(key > arr[mid_ele]) {   // element is right side of the mid_ele
                for (int i = mid_ele; i < arr.length; i++) {
                    if (arr[i] == key) {
                        return i;
                    }
                }
            } else if (key==mid_ele) { //middle element is the key
                return mid_ele;
            }
            else{
                for(int i=0; i< mid_ele; i++){  //element is left side of the mid_ele
                    if(arr[i]==key){
                        return i;
                    }
                }
            }
            }
    return -1;
    }

    public static void main(String[] args) {
        int count[]={23,45,67,78,90};
        int index= binary_search(count, 78);
        if(index==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("element is found at "+index+" position");
        }

    }


}

package Arrays;
import java.util.*;
public class basics {
    public static void update(int arr[]){  //creation of a method for updation
        for(int i=0; i<arr.length ; i++){
            arr[i] = arr[i]+5;
        }
    }
    public static void main(String[] args) {
//        //insertion in an Array
//        int Marks[] = new int[100];
//        Scanner sc = new Scanner(System.in);
//
//         Marks[0]= sc.nextInt();
//         Marks[1]= sc.nextInt();
//         Marks[2]= sc.nextInt();
//
//         System.out.println(Marks[0]);
//         System.out.println(Marks[1]);
//         System.out.println(Marks[2]);

        //updation of an Array
        int marks[] = {24,25,18};
        update(marks);
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }

        System.out.println();

    }
}

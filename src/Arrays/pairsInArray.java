package Arrays;

public class pairsInArray {
    public static void pair( int arr[]){    //time complexity is o(n^2) since two loops(nested)
        int pair_count=0;
        for( int i=0; i<arr.length;i++){    // worst tc = o(n)
            for(int j=i+1; j<arr.length; j++){   //tc = n+(n-1)+(n-2)..... => proportional to n --->o(n)
                System.out.print("("+arr[i]+" "+arr[j]+")");
                pair_count++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs= " +pair_count);
    }

    public static void main(String[] args) {
        int array[]= {3,5,7,9,2,8,6,4,6,7};
        pair(array);
    }
}

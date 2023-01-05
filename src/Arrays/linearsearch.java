package Arrays;


    import java.util.* ;

    public class linearsearch {
        public static int search(int arr[], int key){
            for ( int i =0 ; i< arr.length ; i++){
                if( arr[i]== key){
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {

            int marks[] = {90,97,98,100};
            int index = search (marks, 56);
            if(index == -1){
                System.out.println("element is not present");
            }
            else{
                System.out.println("element is at " + index + " index");
            }


        }



    }



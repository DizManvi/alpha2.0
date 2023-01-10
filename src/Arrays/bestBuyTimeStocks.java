package Arrays;
import java.util.*;
public class bestBuyTimeStocks {

    // this is my own method which striked me first time I approached this problem. Has a bad time complexity of O(n^3)
    public static void bestbuytime(int arr[]) {
        int n = arr.length;
        int minCP = Integer.MAX_VALUE;  // minCP = infinity
        int profit[] = new int[n];
        //every value will be lesser than minCP , initiate a loop now
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                profit[0] = 0;
            }
            if (i>0){
                for (int j=0; j<i; j++){
                    if ( arr[j]< minCP){
                        minCP =arr[j];  //minCP found
                    }
                    profit[i]= arr[i]-minCP;
                    if (profit[i]<0){
                        profit[i]=0;
                    }
                }
            }
        }
        int maxProfit = Integer.MIN_VALUE;
        int profitday = 0;
        for (int k = 0; k < n; k++) {
            if (profit[k] > maxProfit) {
                maxProfit = profit[k];
                profitday = k+1;
            }
        }
        System.out.println("The best time to buy a stock is on Day "+ profitday + " and the max profit will be "+ maxProfit);

    }


    public static void main(String[] args) {
        int sellprice[]= {7,6,4,3,1};
        bestbuytime(sellprice);

    }
}

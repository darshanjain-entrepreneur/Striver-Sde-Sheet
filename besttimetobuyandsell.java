import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
      
    int ans =0;
    int buy = prices.get(0);
    int sell =0;

for(int i = 1; i < prices.size(); i++){

   if(prices.get(i) <= buy){
       buy = prices.get(i);
   }else{

       sell = prices.get(i);
       ans = Math.max(ans , sell - buy);
   }




}

return ans;

    }
}
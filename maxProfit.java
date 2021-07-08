class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int getMinIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];
                getMinIndex = i;
            }      
        }
        int high = 0;
        for (int i = getMinIndex; i < prices.length; i++) {
            if (i > getMinIndex ){
               if(prices[i]>high){
                   high = prices[i];
               } 
            }
        }
         return high - min;       
    }
    
}
class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int MaxP=0;

        while(r<prices.length)
        {
            if(prices[l]<prices[r])
            {
                int profit=prices[r]-prices[l];
                MaxP=Math.max(MaxP, profit);
            }
            else{
                l=r;
            }
            r++;
        }
        return MaxP;
    }
}

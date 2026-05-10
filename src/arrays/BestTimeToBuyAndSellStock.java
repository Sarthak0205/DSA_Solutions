package arrays;

/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Topic: Arrays, Greedy
Difficulty: Easy

Approach:
- Maintain the minimum price seen so far while traversing the array.
- For every current price, calculate possible profit:
    currentProfit = currentPrice - minPrice
- Update maximum profit only if currentProfit is greater.
- If a smaller price is found, update minPrice.

Why this works:
- We only need the cheapest buying price before the current day.
- This avoids checking every possible pair manually.
- Single traversal is enough.

Time Complexity: O(n)
Space Complexity: O(1)

Learning Notes:
- Learned running minimum pattern.
- Learned running maximum profit update.
- Greedy thinking can reduce nested loop solutions.
- continue keyword can help logically separate buy-price updates.
*/

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        int currProfit;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
                continue;
            }
            currProfit=prices[i]-minPrice;
            if(currProfit>maxProfit){
                maxProfit=currProfit;
            }
        }
        return maxProfit;
    }
}

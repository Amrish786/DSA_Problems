package ProblemsSolution;

public class BuyAndSell {
    public static int maxProfit(int[] prices)
    {
        int min=100000;//assume according to array element first is max and rest is min so max(1) and min(0)
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
            }
            if( max< (prices[i]-min))
                max=prices[i]-min;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
}

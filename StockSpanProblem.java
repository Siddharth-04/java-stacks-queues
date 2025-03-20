//Problem: For each day in a stock price array,
// calculate the span (number of consecutive days the price was
// less than or equal to the current day's price).
//int [] price = {100,80,60,70,60,75,85};
//Output :        [1, 1, 1, 2, 1, 4, 6]


public class StockSpanProblem {
    public static void main(String[] args) {
        int [] price = {100,80,60,70,60,75,85};
        Stack st = new Stack(6);
        int [] ans = new int[price.length];

        for(int i=0;i<price.length;i++){
            while(!st.isEmpty() && price[st.peek()]<price[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=(i-st.peek());
            }

            st.push(i);
        }

        //printing output
        for(int i=0;i<price.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
//1 1 1 2 1 4 6

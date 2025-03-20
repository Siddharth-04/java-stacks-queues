public class CircleTourProblem {
    public static int solution(int [] gas,int[] cost){
        int deficit=0,balance=0,start=0;

        for(int i=0 ; i<gas.length ; i++)
        {
            balance += gas[i]-cost[i];

            if(balance<0){
                deficit+=balance;
                start=i+1;
                balance=0;
            }
        }

        if(deficit+balance>=0){
            return start;
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] gas = {1,2,3,4,5};
        int [] cost = {3,4,5,1,2};

        int answer = solution(gas,cost);
        System.out.println(answer);
    }
}

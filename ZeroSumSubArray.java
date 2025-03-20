import java.util.ArrayList;
import java.util.HashMap;

class Pair{
    int a;
    int b;

    Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

}
public class ZeroSumSubArray {
    public static ArrayList<Pair> zeroSumSubarray(int [] arr, int n) {
        ArrayList<Pair> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum==0){
                ans.add(new Pair(0, i)); // from start to ith index

            }

            ArrayList<Integer> existSum= new ArrayList<>();

            if(map.containsKey(sum)){
                existSum = map.get(sum);

                for(int j : existSum){
                    ans.add(new Pair(j+1, i));
                }
            }
            map.put(sum, existSum);
            existSum.add(i);

        }
        return ans;
    }

    public static void display(ArrayList<Pair> ans){
        for(Pair p : ans){
            System.out.println(p.a+" "+p.b);
        }
    }

    public static void main(String[] args) {
        int [] arr = {6,3,-1,-3,4,-2,2,4,6,-12,-7};
        ArrayList<Pair> ans = zeroSumSubarray(arr, arr.length);
        display(ans);
    }
}

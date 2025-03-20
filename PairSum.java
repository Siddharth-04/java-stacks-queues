import java.util.ArrayList;
import java.util.HashMap;

public class PairSum {
    public static ArrayList<Pair> findPairSum(int[]arr, int sum) {
        ArrayList<Pair> pairs = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int complement = sum - arr[i];
            if(map.containsKey(complement)){
                pairs.add(new Pair(arr[i], complement));
            }
            map.put(arr[i], 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int [] arr = {2,7,5,4,5,8,1};
        ArrayList<Pair> ans = findPairSum(arr, 9);
        ZeroSumSubArray.display(ans);
    }
}
//7 2
//4 5
//1 8
//5 4
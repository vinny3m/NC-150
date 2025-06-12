
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoS(int[] nums, int t){
        int[] result= new int[2];

        HashMap<Integer, Integer> h= new HashMap<>();
        //inserted all values to hashmap number and its index 
        for(int i=0; i<nums.length; i++){
            h.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int rt= t-nums[i];
             if (h.containsKey(rt) && h.get(rt) != i) {
            result[0] = i;
            result[1] = h.get(rt);
            return result;
        }
        }







        return result;
    }

    public static void main(String args[]){
        TwoSum t= new TwoSum();
        int[] input= {2,4,3,1};
        int[] result=t.twoS(input , 5);
        System.out.println(Arrays.toString(result));

    }
}

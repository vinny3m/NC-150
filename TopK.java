import java.util.*;
public class TopK {

    public int[] top(int[] nums, int k){

        int[] result= new int[k];
        HashMap<Integer, Integer> h= new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(h.containsKey(nums[i])){
                int currentValue = h.get(nums[i]);
                h.put(nums[i],currentValue+1 );
            }
            else{
                h.put(nums[i], 1);

            }
        }


        // for(int i:nums){
        //      h.put(i, h.getOrDefault(i, 0) + 1);
        // }

        List<Map.Entry<Integer, Integer>>  lst= new ArrayList<>(h.entrySet());
        lst.sort((a, b) -> b.getValue() - a.getValue());


        for(int i=0; i<k; i++){
            result[i]= lst.get(i).getKey();
            
        }


        return result;
    }

      public static void main(String args[]){
            
            TopK k = new TopK();
            int[] input= {1,1,2,3,4,4,5,5,5};
            System.out.println(Arrays.toString(k.top(input, 2)));
        }
    
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class TopK_2_onlyWithHashMaps {

    public int[] top(int[] nums, int k){

        HashMap<Integer, Integer> h= new HashMap<>();
        int[] re= new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(h.containsKey(nums[i])){
                int cv= h.get(nums[i]);
                h.put(nums[i], cv+1);
            }
            else{
                h.put(nums[i], 1);
            }
        }


        HashMap<Integer, ArrayList<Integer>> reverseMap = new HashMap<>();
        int maxFreq = 0;

        for (Integer key : h.keySet()) {
            int freq = h.get(key);
            if (reverseMap.containsKey(freq)) {
                ArrayList<Integer> list = reverseMap.get(freq);
                list.add(key);
                reverseMap.put(freq, list);
            } else {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(key);
                reverseMap.put(freq, newList);
            }

            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        
        int[] res = new int[k];
        int index = 0;

        for (int i = maxFreq; i >= 1 && index < k; i--) {
            if (reverseMap.containsKey(i)) {
                ArrayList<Integer> list = reverseMap.get(i);
                for (int j = 0; j < list.size() && index < k; j++) {
                    res[index] = list.get(j);
                    index++;
                }
            }
        }

        return res;
    }

      public static void main(String args[]){
            
            TopK k = new TopK();
            int[] input= {1,1,2,3,4,4,5,5,5};
            System.out.println(Arrays.toString(k.top(input, 2)));
        }
    
}

    


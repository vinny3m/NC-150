import java.util.*;

public class new1 {
    public List<List<String>> grpAna(String[] str){

        HashMap<String, List<String>> h= new HashMap<>();

        for(String s:str){
           // convert string to chararray and sort it 

           char[] ca= s.toCharArray();
           Arrays.sort(ca); //its in chars convert to string

           String sa= new String(ca);

           //need to chack that sorted part is there in hashmap or not 

           h.putIfAbsent(sa, new ArrayList<String>());


           h.get(sa).add(s);
        }


        return new ArrayList<>(h.values());

        



    }
    public static void main(String args[]){

        new1 n= new new1();
        String[] input= {"eat", "tae", "meat", "meta"};
       
        List<List<String>> r= n.grpAna(input);
        for(List<String> j:r){
            System.out.println(j);
        }

    }
}



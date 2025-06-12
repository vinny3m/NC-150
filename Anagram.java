import java.util.*;

public class Anagram {

    public boolean isAnagram(String[] str){
        HashSet<String> h= new HashSet<>();
        int count=0;

        for(String w:str){
            char[] nw= w.toCharArray();
            Arrays.sort(nw);
            String sortedWord= new String(nw);

            if(h.contains(sortedWord)){

                count --;
            }
            else{
                h.add(sortedWord);
                count++;
            }


        }
        if(count<=0){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String args[]){
        Anagram a= new Anagram();
        String[] input= {"ate","tea"};
        boolean r= a.isAnagram(input);
        System.out.println(r);

    }
}

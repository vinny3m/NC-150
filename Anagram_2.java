import java.util.*;
public class Anagram_2 {
    public boolean isAnagram(String[] str){

        char[] ba= str[0].toCharArray();
        Arrays.sort(ba);
        String baseArray= new String(ba);

        for(int i=1;i<str.length; i++){

            char[] sa=str[i].toCharArray();
            Arrays.sort(sa);
            String sortedArray= new String(sa);
            if( !(sortedArray.equals(baseArray))){
                return false;
            }
        }


        return true;
    }

    public static void main(String args[]){
        Anagram_2 a= new Anagram_2();
         String[] input= {"ate","tea","nj"};
        boolean r= a.isAnagram(input);
        System.out.println(r);

    }
}

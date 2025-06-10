public class Contains_duplicate{

    public boolean dup(int[] arr){


        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++){

                if(arr[i] == arr[j]){
                   
                    System.out.println(arr[i] + ", " + arr[j]);
                     return true;
                }
            }
        }

        return false;

    }

    public static void main(String args[]){
        Contains_duplicate cd= new Contains_duplicate();
      int[] inp = new int[]{1, 3, 2,2, 4, 5, 7};

       boolean res= cd.dup(inp);
       System.out.println(res);

    }
    
}

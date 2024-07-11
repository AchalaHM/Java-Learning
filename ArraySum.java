public class ArraySum {

   public static void main(String args[]){

       int[] arr = {1,3,2,4,5,4};

       int sum = 0;
       int n = arr.length;

       for (int i = 0 ; i< n ; i++){
           sum += arr[i];
       }

       System.out.println("Sum : "+ sum);
   }
}

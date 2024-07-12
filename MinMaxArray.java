public class MinMaxArray {
    public static void main(String[] args){

        int[] arr1 = {23,43,56,42,78,98, 2, 31 };

        int min = arr1[0];
        int max = arr1[0];

        for (int i = 0;  i <arr1.length ; i++ ){
            if(arr1[i] < min){
                min = arr1[i];
            }

            if (arr1[i] > max){
                max = arr1[i];
            }
        }

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : "+ max);
    }
}

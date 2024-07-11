import java.util.Arrays;
import java.util.Scanner;

public class Anargram {

    public static void main(String args[]){

        Scanner input1 = new Scanner(System.in);


        try {
            System.out.println("Enter first word : ");
            String word1 = input1.nextLine();
            System.out.println("Enter second word : ");
            String word2 = input1.nextLine();

            if (checkAnargram(word1, word2)){
                System.out.println(word1 + " and "+ word2 + " are anargrams");
            } else {
                System.out.println(word1 + " and "+ word2 + " are not anargrams");
            }
        } finally {
            input1.close();

        }
    }

    public static boolean checkAnargram(String str1, String str2){
        str1 = str1.replaceAll("//s","");
        str2 = str2.replaceAll("//s", "");

        if (str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

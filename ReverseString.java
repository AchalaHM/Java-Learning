import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = scanner.nextLine();

        String reverseString = new StringBuilder(word).reverse().toString();
        System.out.println("reverse String : " + reverseString);
    }
}

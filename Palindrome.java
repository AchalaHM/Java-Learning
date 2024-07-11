import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner inputText = new Scanner(System.in);
        try {
            System.out.println("Enter the text: ");
            String text = inputText.nextLine();
            if (checkPalindrome(text)) {
                System.out.println("Text is a palindrome.");
            } else {
                System.out.println("Text is not a palindrome.");
            }
        } finally {
            inputText.close();
        }

    }

    public static boolean checkPalindrome(String text){


        if(text.length() == 1){
            System.out.println("Text is single character. Single characters always palindrome");
            return true;
        }else if (text.isEmpty()) {
            System.out.println("Text is Empty. Empty text always palindrome");
            return true;
        }

        String originalText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(originalText).reverse().toString();

        if (originalText.equals(reversedText)) {
            System.out.println("Text is palindrome");
            return true;
        } else {
            System.out.println("Text is not palindrome");
            return true;
        }
    }
}

// By AchalaHM

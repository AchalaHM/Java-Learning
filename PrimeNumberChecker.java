import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        if(checkPrime(n)){
            System.out.println(n+" is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean checkPrime(int num){
        if (num <= 1){
            return false;
        }else {
            for (int i = 2 ; i <= Math.sqrt(num) ; i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}

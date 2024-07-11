public class FizzBuzz {

    public static void main(String args[]){
        int N = 100;

        for (int i= 0 ; i <= N ; i++){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

// By AchalaHM

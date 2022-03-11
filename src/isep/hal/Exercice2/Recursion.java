package isep.hal.Exercice2;

public class Recursion {
    //: f = N! = 1 * 2 * 3 * ... * N;
    // f! = N! = N * (N-1)!
    public long factorialRec(int num) {
        //check if num is equal to 0
        if (num == 0) {
            return 1;
        }

        return  num * factorialRec(num - 1);
    }

    // fact 5 = 5 * 4 * 3 * 2 * 1
    public long factorialLoop(int num) {
        long fact = num;
        for (int i = num - 1; i > 0;  i--) {
            fact = fact * i;
        }

        return fact;
    }


    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        long result = recursion.factorialRec(3);

        System.out.println("Factorial: " + result);
    }

}

package isep.hal.Exercice2;

public class Loops {
    public void FactorialLoop() {
        int a = 3;
        int b = 1;

        for (int i = 1; i <= a; i++) {
            b = i * b;
        }
        System.out.println("Factorial of " + a + " is equal to " + b);

    }
    public static void main(String... args) {
        Loops loops = new Loops();


        loops.FactorialLoop();
    }
}



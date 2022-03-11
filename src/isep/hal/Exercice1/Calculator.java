package isep.hal.Exercice1;

/**
 * x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0
 */

public class Calculator {
    // create a constant (static means that it will be not changes and share to all instances ; final means that we can not assign a new value to the constant)
    // constants are always written like this LADKAD_ADAFA
    public static final double GRAVITY_CONSTANT = 9.8;
    public static final double ANOTHER_CONSTANT = 0.5;
    //variables
    int fallingTime = 0;
    double initialPosition = 0;
    double initialVelocity = 0;
    //default constructor
    public Calculator() {
    }

    public Calculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }
    //formula
    public void calculate() {
        double finalPosition = (fallingTime * fallingTime)  // we can writte (Math.pow(fallingTime,2)
                * (GRAVITY_CONSTANT * ANOTHER_CONSTANT)
                + (initialVelocity * fallingTime)
                + initialPosition;

        System.out.println("Position in " + fallingTime + " seconds:" + finalPosition);
    }
    // to run the code
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 5, 23);

        calculator.calculate();
    }

}

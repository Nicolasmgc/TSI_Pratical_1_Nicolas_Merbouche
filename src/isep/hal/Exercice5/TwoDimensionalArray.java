package isep.hal.Exercice5;

import java.util.Random;

public class TwoDimensionalArray {
    public void createRandomArray() {
        int size = 10;
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = new Random().nextInt(0, 10);

                System.out.print(array[i][j] + " ");

            }
        }

            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int sum = 0;
            int min2 = Integer.MAX_VALUE, max2 = Integer.MIN_VALUE;
            int sum2 = 0;

            double avg;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++){
                    int current = array[i][0];
                    if(min > current) {
                        min = current;
                    }
                    if(max < current) {
                        max = current;
                    }
                    sum += current;
                    int current2 = array[0][j];
                    if(min2 > current2) {
                        min2 = current2;
                    }
                    if(max2 < current2) {
                        max2 = current2;
                    }
                    sum2 += current2;


                }

            }
        System.out.println("\n========= MIN, MAX and AVG =============");
        System.out.printf(" For the first column : Min value is %d and Max value is %d", min, max);
        System.out.printf("\n For the first column : Average is %d", (sum/ array.length));
        System.out.println("\n========= MIN, MAX and AVG =============");
        System.out.printf(" For the second column : Min value is %d and Max value is %d", min2, max2);
        System.out.printf("\n For the second column : Average is %d", (sum2/ array.length));


    }

    public static void main(String[] args) {
        TwoDimensionalArray myArray = new TwoDimensionalArray();
        myArray.createRandomArray();

    }

}
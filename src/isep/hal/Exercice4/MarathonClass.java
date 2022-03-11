package isep.hal.Exercice4;



public class MarathonClass {
    public static void printResults(){
        String[] name = new String[] {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] results = new int[]{341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265};
        for( int i = 0; i <= name.length; i++) {


            System.out.printf("\n %s did a score of %d", name[i], results[i]);
        }

    }
    public static void main(String[]args) {

        MarathonClass arrays = new MarathonClass();

        arrays.printResults();
    }
}

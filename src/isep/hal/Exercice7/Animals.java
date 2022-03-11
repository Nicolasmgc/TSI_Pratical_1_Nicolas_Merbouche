package isep.hal.Exercice7;



public class Animals {
    public static void main(String... args){
        Dog d1 = new Dog("Guylain");
        Cat c1 = new Cat("Joon");
        Fox f1 = new Fox("Anais");

        d1.sound();
        c1.sound();
        f1.sound();
        d1.printName();
        c1.printName();
        f1.printName();


    }

}

package isep.hal.Exercice7;

public class Dog implements Animal, Domestic{
    final String name;

    public Dog(String name){
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("Dog's name is " + name);


    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

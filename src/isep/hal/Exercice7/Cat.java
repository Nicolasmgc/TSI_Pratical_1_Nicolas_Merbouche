package isep.hal.Exercice7;

public class Cat implements Animal, Domestic{
    final String name;

    public Cat(String name){
        this.name = name;

    }


    @Override
    public void printName() {
        System.out.println("Cat's name is " + name);

    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

package isep.hal.Exercice7;

public class Fox implements Animal, Domestic{
    final String name;

    public Fox(String name){
        this.name =name;
    }

    @Override
    public void printName() {
        System.out.println("Fox's name is " + name);
    }

    @Override
    public void sound() {
        System.out.println("Wa-pow");

    }
}

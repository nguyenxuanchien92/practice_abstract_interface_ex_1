import entities.*;
import interfaces.Edible;

public class Main {
    public static void main(String[] args) {

        Animals[] animals = new  Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for(Animals animal : animals){

            System.out.println(animal.makeSound());

            if(animal instanceof Chicken){
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}

package entities;

import interfaces.Edible;

import java.security.spec.ECField;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return "mổ thóc";
    }
}

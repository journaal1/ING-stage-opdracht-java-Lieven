package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;

/**
 * Dog class representing a dog animal in the zoo.
 */
public class Dog extends Animal implements iCarnivore, iTrickAction {
    private final String EAT_TEXT;
    public String trick;


    public Dog(String name) {
        super(name);
        super.helloText = "Woef Woef";
        EAT_TEXT = "nomnomnom lovely Woef";
    }
    @Override
    public void eatMeat() {
        System.out.println(EAT_TEXT);
    }

    @Override
    public void performTrick() {
        trick = "Rolls";
        System.out.println(trick);
    }
}

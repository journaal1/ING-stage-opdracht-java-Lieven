package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iHerbivore;
/**
 * Hippo class representing a hippo animal in the zoo.
 */
public class Hippo extends Animal implements iHerbivore {
    private final String EAT_TEXT;

    public Hippo(String name)
    {
        super(name);
        super.helloText = "splash";
        EAT_TEXT = "munch munch lovely";
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(EAT_TEXT);
    }
}

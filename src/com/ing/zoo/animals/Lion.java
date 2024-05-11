package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iCarnivore;
/**
 * Lion class representing a Lion animal in the zoo.
 */
public class Lion extends Animal implements iCarnivore {
    private final String EAT_TEXT;

    public Lion(String name)
    {
        super(name);
        super.helloText = "roooaoaaaaar";
        EAT_TEXT = "nomnomnom thx mate";
    }

    @Override
    public void eatMeat()
    {
        System.out.println(EAT_TEXT);
    }
}

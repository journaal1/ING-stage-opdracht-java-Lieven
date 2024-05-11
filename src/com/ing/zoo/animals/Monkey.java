package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iHerbivore;
/**
 * Monkey class representing a monkey animal in the zoo.
 */
public class Monkey extends Animal implements iHerbivore {
    private final String EAT_TEXT;

    public Monkey(String name) {
        super(name);
        EAT_TEXT = "OeH OEH AHHH AHH YAMMIE";
    }

    @Override
    public void eatLeaves() {
        System.out.println(EAT_TEXT);
    }
}

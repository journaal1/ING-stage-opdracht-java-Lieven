package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iHerbivore;

/**
 * Zebra class representing a zebra animal in the zoo.
 */
public class Zebra extends Animal implements iHerbivore {
    public final String EAT_TEXT;

    public Zebra(String name) {
        super(name);
        super.helloText = "Baarrrk";
        EAT_TEXT = "munch munch zank yee bra";
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(EAT_TEXT);
    }
}

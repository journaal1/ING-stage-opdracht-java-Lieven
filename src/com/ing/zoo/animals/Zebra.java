package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iHerbivore;

public class Zebra extends Animal implements iHerbivore {
    public String eatText;

    public Zebra() {
        super.name = "Zebra";
        super.helloText = "Baarrrk";
        eatText = "munch munch zank yee bra";
    }

    public void eatLeaves()
    {
        System.out.println(eatText);
    }
}

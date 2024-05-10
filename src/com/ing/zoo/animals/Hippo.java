package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iHerbivore;

public class Hippo extends Animal implements iHerbivore {
    public String eatText;

    public Hippo()
    {
        super.name = "Hippo";
        super.helloText = "splash";
        eatText = "munch munch lovely";
    }

    public void eatLeaves()
    {
        System.out.println(eatText);
    }
}

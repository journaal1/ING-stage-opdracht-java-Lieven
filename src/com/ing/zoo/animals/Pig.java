package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;
import com.ing.zoo.animals.feedingtypes.iHerbivore;

import java.util.Random;

public class Pig extends Animal implements iHerbivore, iCarnivore, iTrickAction {
    public String eatText;
    public String trick;

    public Pig()
    {
        super.name = "Pig";
        super.helloText = "Oink Oink";
        eatText = "munch munch oink";
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "rolls in the mud";
        }
        else
        {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}

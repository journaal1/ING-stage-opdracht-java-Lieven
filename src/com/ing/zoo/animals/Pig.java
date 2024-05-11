package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;
import com.ing.zoo.animals.feedingtypes.iHerbivore;

import java.util.Random;
/**
 * Pig class representing a pig animal in the zoo.
 */
public class Pig extends Animal implements iHerbivore, iCarnivore, iTrickAction {
    public final String EAT_TEXT;
    public String trick;

    public Pig(String name)
    {
        super(name);
        super.helloText = "Oink Oink";
        EAT_TEXT = "munch munch oink";
    }

    @Override
    public void eatLeaves()
    {
        System.out.println(EAT_TEXT);
    }

    @Override
    public void eatMeat()
    {
        System.out.println(EAT_TEXT);
    }

    @Override
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

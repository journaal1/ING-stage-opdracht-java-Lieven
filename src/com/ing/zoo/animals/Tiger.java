package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;
import java.util.Random;

/**
 * Tiger class representing a tiger animal in the zoo.
 * Extends Animal class and implements iCarnivore and iTrickAction interfaces.
 */
public class Tiger extends Animal implements iCarnivore, iTrickAction{
    public final String EAT_TEXT;
    public String trick;

    public Tiger(String name)
    {
        super(name);
        super.helloText = "Rwaarrrr";
        EAT_TEXT = "NomNom RWaaarrr";
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
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}

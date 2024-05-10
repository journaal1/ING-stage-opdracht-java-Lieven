package com.ing.zoo.animals;

import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;

import java.util.Random;

public class Tiger extends Animal implements iCarnivore, iTrickAction{
    public String eatText;
    public String trick;

    public Tiger()
    {
        super.name = "Tiger";
        super.helloText = "Rwaarrrr";
        eatText = "NomNom RWaaarrr";
    }

    public void sayHello()
    {
        System.out.println(helloText);
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
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}

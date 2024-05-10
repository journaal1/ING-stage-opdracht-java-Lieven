package com.ing.zoo.animals;

import com.ing.zoo.animals.feedingtypes.iCarnivore;

public class Lion extends Animal implements iCarnivore {
    public String eatText;

    public Lion()
    {
        super.name = "Lion";
        super.helloText = "roooaoaaaaar";
        eatText = "nomnomnom thx mate";
    }

    public void sayHello()
    {
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        System.out.println(eatText);
    }
}

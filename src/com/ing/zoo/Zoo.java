package com.ing.zoo;


import com.ing.zoo.animals.*;
import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;
import com.ing.zoo.animals.feedingtypes.iHerbivore;

import java.util.*;

public class Zoo {
    public static void main(String[] args)
    {
        Map<String, Animal> animals = new HashMap<>();
        
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";
        
        String animalName;
        String command = null;
        Animal animal = null;


        Lion henk = new Lion();
        henk.name = "henk";
        animals.put(henk.name, henk);
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        animals.put(elsa.name, elsa);
        Pig dora = new Pig();
        dora.name = "dora";
        animals.put(dora.name, dora);
        Tiger wally = new Tiger();
        wally.name = "wally";
        animals.put(wally.name, wally);
        Zebra marty = new Zebra();
        marty.name = "marty";
        animals.put(marty.name, marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        for (String cmd : commands) {
            if (input.contains(cmd)) {
                command = cmd;
                break;
            }
        }
        if (command != null) {
            animalName = input.substring(input.indexOf(command) + command.length()).trim();
            animal = animals.get(animalName);
        }

        if(animal != null){
            if (command.equals(commands[0])) {
                animal.sayHello();
            }
            else if (command.equals(commands[1]) && animal instanceof iHerbivore) {
                ((iHerbivore) animal).eatLeaves();
            }
            else if (command.equals(commands[2]) && animal instanceof iCarnivore) {
                ((iCarnivore) animal).eatMeat();
            }
            else if (command.equals(commands[3]) && animal instanceof iTrickAction) {
                ((iTrickAction) animal).performTrick();
            }
            else {
                System.out.println("Looks like animal named: " + animal.name);
                System.out.println("can't perform that action");
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}

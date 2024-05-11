package com.ing.zoo;


import com.ing.zoo.animals.*;
import com.ing.zoo.commands.CommandHandler;
import com.ing.zoo.commands.Commands;

import java.util.*;

/**
 * Zoo class that allows you to make each animal inside the zoo follow a command.
 */
public class Zoo {
    public static void main(String[] args)
    {
        //Used a Hashmap to easily look up animals by name;
        Map<String, Animal> animals = new HashMap<>();
        Commands command = null;
        Animal animal = null;

        //setup zoo
        Lion henk = new Lion("henk");
        Hippo elsa = new Hippo("elsa");
        Pig dora = new Pig("dora");
        Tiger wally = new Tiger("wally");
        Zebra marty = new Zebra("marty");
        Dog woefie = new Dog("woefie");
        Monkey benny = new Monkey("benny");
        animals.put(henk.name, henk);
        animals.put(elsa.name, elsa);
        animals.put(dora.name, dora);
        animals.put(wally.name, wally);
        animals.put(marty.name, marty);
        animals.put(woefie.name, woefie);
        animals.put(benny.name, benny);

        //setup scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        //checks if input contains real command. if it does trim the command from the input
        for (Commands cmd : Commands.values()) {
            String cmdString = cmd.name().toLowerCase().replace("_", " ");
            if (input.contains(cmdString)) {
                command = cmd;
                input = input.substring(input.indexOf(cmdString) + cmdString.length()).trim();
                animal = animals.get(input);
                break;
            }
        }

        //handle invalid command
        if(command == null){
            System.out.println("Unknown command: " + input);
            System.out.println("Try a valid command like: ");
            for (Commands cmd : Commands.values()) {
                System.out.println(cmd.name().toLowerCase().replace("_", " "));
            }
            return;
        }

        //handle case of invalid name input
        if(animal == null && !input.isEmpty()){
            System.out.println(input + " is not a valid animal name");
            System.out.println("Try a valid name like: ");
            System.out.println(animals.keySet());
            return;
        }
        //handle output for a specific animal or for all.
        if(animal == null){
            CommandHandler.handleCommand(command, animals);
        }
        else {
            CommandHandler.handleCommand(command, animal, animals);
        }
    }
}

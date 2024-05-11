package com.ing.zoo.commands;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.actions.iTrickAction;
import com.ing.zoo.animals.feedingtypes.iCarnivore;
import com.ing.zoo.animals.feedingtypes.iHerbivore;
import java.util.Map;

/**
 * CommandHandler class to handle different commands in the zoo.
 */
public class CommandHandler {
    /**
     * handle commands without specific animals.
     *
     * @param command the command to be executed
     * @param animals map containing all animals in the zoo
     */
    public static void handleCommand(Commands command, Map<String, Animal> animals) {
        switch (command) {
            case HELLO:
                animals.values().forEach(Animal::sayHello);
                break;
            case GIVE_LEAVES:
                animals.values().stream()
                        .filter(a -> a instanceof iHerbivore)
                        .forEach(a -> ((iHerbivore) a).eatLeaves());
                break;
            case GIVE_MEAT:
                animals.values().stream()
                        .filter(a -> a instanceof iCarnivore)
                        .forEach(a -> ((iCarnivore) a).eatMeat());
                break;
            case PERFORM_TRICK:
                animals.values().stream()
                        .filter(a -> a instanceof iTrickAction)
                        .forEach(a -> ((iTrickAction) a).performTrick());
                break;
            default:
                System.out.println("Could not find your command: " + command);
        }
    }

    /**
     * handle commands with specific animals.
     *
     * @param command the command to be executed
     * @param animal  the animal on which the command will be executed
     * @param animals map containing all animals in the zoo
     */
    public static void handleCommand(Commands command, Animal animal, Map<String, Animal> animals) {
        switch (command) {
            case HELLO:
                animal.sayHello();
                break;
            case GIVE_LEAVES:
                if (animal instanceof iHerbivore) {
                    ((iHerbivore) animal).eatLeaves();
                } else {
                    handleInvalidCommand(animal);
                }
                break;
            case GIVE_MEAT:
                if (animal instanceof iCarnivore) {
                    ((iCarnivore) animal).eatMeat();
                } else {
                    handleInvalidCommand(animal);
                }
                break;
            case PERFORM_TRICK:
                if (animal instanceof iTrickAction) {
                    ((iTrickAction) animal).performTrick();
                } else {
                    handleInvalidCommand(animal);
                }
                break;
            default:
                System.out.println("Could not find your command: " + command);
        }
    }

    /**
     * handle invalid commands for a specific animal.
     *
     * @param animal the animal for which the command is invalid
     */
    private static void handleInvalidCommand(Animal animal) {
        System.out.println("Looks like animal named: " + animal.name);
        System.out.println("can't perform that action");
    }
}

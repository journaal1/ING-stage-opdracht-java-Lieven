package com.ing.zoo.animals;

/**
 * Abstract animal class implements a name and helloText.
 */
public abstract class Animal {
    public String name;
    public String helloText;

    public Animal(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println(helloText);
    };
}

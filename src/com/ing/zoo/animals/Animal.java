package com.ing.zoo.animals;

public abstract class Animal {
    public String name;
    public String helloText;

    public void sayHello(){
        System.out.println(helloText);
    };
}

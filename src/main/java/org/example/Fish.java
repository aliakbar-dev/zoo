package org.example;

public class Fish extends Animal {

    public Fish(int age, String gender, long weight) {
        super(age, gender, weight);
    }

    public void swim() {
        System.out.println("swimming");
    }

}

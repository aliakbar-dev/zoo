package org.example;

public class Bird extends Animal {

    public Bird(int age, String gender, long weight) {
        super(age, gender, weight);
    }

//    public void fly() {
//        System.out.println("flying ...");
//    }

    @Override
    public void eat() {
        System.out.println("eating ...");
    }
}

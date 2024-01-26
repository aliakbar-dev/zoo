package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class Animal {
    private int age;
    private String gender;
    private long weight;

    public Animal(int age, String gender, long weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("eating ...");
    }

    public void sleep() {
        System.out.println("sleeping ...");
    }

}

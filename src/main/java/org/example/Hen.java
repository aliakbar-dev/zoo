package org.example;

public class Hen extends Bird {
    public Hen(int age, String gender, long weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }

}

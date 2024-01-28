package org.example;

public class Main {

    public static void main(String[] args) {
        final Bird owl = new Owl(8, "M", 8);
        owl.fly();

        System.out.println("----------------------------------");

        final Bird hen = new Hen(40, "M", 40);
//        hen.fly();

        System.out.println("----------------------------------");

        final Bird kabootar = new Kabootar(40, "M", 40);
        kabootar.setAge(21);


        kabootar.fly();
    }

}
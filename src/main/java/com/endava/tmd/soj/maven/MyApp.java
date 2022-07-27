package com.endava.tmd.soj.maven;

import com.endava.tmd.soj.maven.model.Person;

public class MyApp {

    public static void main(final String[] args) {
        if (args.length == 2) {
            greet(args[0], args[1]);
        } else {
            greet();
        }
    }

    private static void greet() {
        System.out.println("Salutare prietene!");
    }

    private static void greet(final String firstName, final String lastName) {
        final var person = new Person(firstName, lastName);
        System.out.println("Am construit persoana: " + person);
        System.out.println("Salutare " + person.getFirstName() + " " + person.getLastName());
    }

}

package com.utkusenocak.builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("utku").surname("senocak").address("Istanbul").build();
        person.showPerson();
    }
}

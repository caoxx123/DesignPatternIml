package io.caoxx123.o2StructuralModel.o8FilterPattern.demo;

public class Person {
    private String name;
    private String gender;
    private String marialStatus;

    public Person(String name, String gender, String marialStatus) {
        this.name = name;
        this.gender = gender;
        this.marialStatus = marialStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMarialStatus() {
        return marialStatus;
    }
}

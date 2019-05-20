package io.caoxx123.o2StructuralModel.o8FilterPattern.service;

import io.caoxx123.o2StructuralModel.o8FilterPattern.demo.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}

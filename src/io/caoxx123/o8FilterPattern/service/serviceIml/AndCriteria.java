package io.caoxx123.o8FilterPattern.service.serviceIml;

import io.caoxx123.o8FilterPattern.demo.Person;
import io.caoxx123.o8FilterPattern.service.Criteria;

import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria=criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteria);
    }
}

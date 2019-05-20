package io.caoxx123.o8FilterPattern.service.serviceIml;

import io.caoxx123.o8FilterPattern.demo.Person;
import io.caoxx123.o8FilterPattern.service.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemal implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> listFemal=new ArrayList<Person>();
        for (Person person:persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                listFemal.add(person);
            }
        }
        return listFemal;
    }
}

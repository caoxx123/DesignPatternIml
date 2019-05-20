package io.caoxx123.o8FilterPattern.service.serviceIml;

import io.caoxx123.o8FilterPattern.demo.Person;
import io.caoxx123.o8FilterPattern.service.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> listMale = new ArrayList<Person>();
        for (Person person : persons
        ) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                listMale.add(person);
            }
        }
        return listMale;
    }
}

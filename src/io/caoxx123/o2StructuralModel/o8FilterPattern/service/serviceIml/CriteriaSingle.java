package io.caoxx123.o2StructuralModel.o8FilterPattern.service.serviceIml;

import io.caoxx123.o2StructuralModel.o8FilterPattern.demo.Person;
import io.caoxx123.o2StructuralModel.o8FilterPattern.service.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> listSingle=new ArrayList<Person>();
        for (Person person:persons){
            if (person.getMarialStatus().equalsIgnoreCase("SINGLE")){
                listSingle.add(person);
            }
        }
        return listSingle;
    }
}

package io.caoxx123.o2StructuralModel.o8FilterPattern.service.serviceIml;

import io.caoxx123.o2StructuralModel.o8FilterPattern.demo.Person;
import io.caoxx123.o2StructuralModel.o8FilterPattern.service.Criteria;

import java.util.ArrayList;
import java.util.List;

public class OrCriteria implements Criteria {
    private  Criteria criteria;
    private  Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> listFirstCriteria=new ArrayList<Person>();
        List<Person> listOtherCriteria=new ArrayList<Person>();
        listFirstCriteria=criteria.meetCriteria(persons);
        listOtherCriteria=otherCriteria.meetCriteria(persons);
        for (Person person:listOtherCriteria){
            if (!listFirstCriteria.contains(person)){
                listFirstCriteria.add(person);
            }
        }
        return listFirstCriteria;
    }
}

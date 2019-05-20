package io.caoxx123.o2StructuralModel.o8FilterPattern.demo;

import io.caoxx123.o2StructuralModel.o8FilterPattern.service.Criteria;
import io.caoxx123.o2StructuralModel.o8FilterPattern.service.serviceIml.*;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemal();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Male");
        System.out.println("----------------------------------------------------------");
        printPerson(male.meetCriteria(persons));
        System.out.println("----------------------------------------------------------");
        System.out.println("FeMale");
        System.out.println("----------------------------------------------------------");
        printPerson(female.meetCriteria(persons));
        System.out.println("----------------------------------------------------------");
        System.out.println("Single");
        System.out.println("----------------------------------------------------------");
        printPerson(single.meetCriteria(persons));
        System.out.println("----------------------------------------------------------");
        System.out.println("SignleMale");
        System.out.println("----------------------------------------------------------");
        printPerson(singleMale.meetCriteria(persons));
        System.out.println("----------------------------------------------------------");
        System.out.println("SignleMaleOrFemal");
        System.out.println("----------------------------------------------------------");
        printPerson(singleOrFemale.meetCriteria(persons));
        System.out.println("----------------------------------------------------------");
    }
        public static void printPerson(List<Person> persons){
            for (Person person:persons){
                System.out.println("name:"+person.getName()+": Gneder:"+person.getGender()+": Marial:"+person.getMarialStatus());
            }
        }
}

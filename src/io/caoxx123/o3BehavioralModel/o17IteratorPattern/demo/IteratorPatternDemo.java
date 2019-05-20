package io.caoxx123.o3BehavioralModel.o17IteratorPattern.demo;

import io.caoxx123.o3BehavioralModel.o17IteratorPattern.service.Iterator;
import io.caoxx123.o3BehavioralModel.o17IteratorPattern.service.ServiceIml.NameRepository;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository=new NameRepository();
        for (Iterator iterator=nameRepository.getIterator();iterator.hasNext();){
            System.out.println((String) iterator.next());
        }
    }
}

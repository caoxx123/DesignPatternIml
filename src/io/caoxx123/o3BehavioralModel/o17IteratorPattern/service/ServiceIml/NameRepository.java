package io.caoxx123.o3BehavioralModel.o17IteratorPattern.service.ServiceIml;

import io.caoxx123.o3BehavioralModel.o17IteratorPattern.service.Container;
import io.caoxx123.o3BehavioralModel.o17IteratorPattern.service.Iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    public class NameIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index<names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}

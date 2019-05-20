package io.caoxx123.o3BehavioralModel.o22NullObjectPattern.demo;

import javax.naming.Name;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}

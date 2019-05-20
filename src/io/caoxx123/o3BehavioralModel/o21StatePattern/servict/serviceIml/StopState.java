package io.caoxx123.o3BehavioralModel.o21StatePattern.servict.serviceIml;

import io.caoxx123.o3BehavioralModel.o21StatePattern.demo.Context;
import io.caoxx123.o3BehavioralModel.o21StatePattern.servict.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("state is stop");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop";
    }
}

package io.caoxx123.o3BehavioralModel.o21StatePattern.demo;

import io.caoxx123.o3BehavioralModel.o21StatePattern.servict.State;
import io.caoxx123.o3BehavioralModel.o21StatePattern.servict.serviceIml.StartState;
import io.caoxx123.o3BehavioralModel.o21StatePattern.servict.serviceIml.StopState;

public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

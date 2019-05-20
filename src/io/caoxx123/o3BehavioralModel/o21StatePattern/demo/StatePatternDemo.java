package io.caoxx123.o3BehavioralModel.o21StatePattern.demo;

import io.caoxx123.o3BehavioralModel.o21StatePattern.servict.serviceIml.StartState;
import io.caoxx123.o3BehavioralModel.o21StatePattern.servict.serviceIml.StopState;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context=new Context();
        StartState startState=new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        System.out.println(startState.toString());
        StopState stopState=new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}

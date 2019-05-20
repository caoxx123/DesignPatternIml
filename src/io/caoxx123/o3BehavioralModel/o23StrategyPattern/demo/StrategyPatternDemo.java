package io.caoxx123.o3BehavioralModel.o23StrategyPattern.demo;

import io.caoxx123.o3BehavioralModel.o23StrategyPattern.service.serviceIml.OperationAdd;
import io.caoxx123.o3BehavioralModel.o23StrategyPattern.service.serviceIml.OperationMultiply;
import io.caoxx123.o3BehavioralModel.o23StrategyPattern.service.serviceIml.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context=new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1,2));
        Context context1=new Context(new OperationMultiply());
        System.out.println(context1.executeStrategy(2,3));
        Context context2=new Context(new OperationSubstract());
        System.out.println(context2.executeStrategy(2,4));
    }
}

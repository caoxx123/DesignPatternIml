package io.caoxx123.o3BehavioralModel.o23StrategyPattern.demo;

import io.caoxx123.o3BehavioralModel.o23StrategyPattern.service.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return  strategy.Operation(num1,num2);
    }
}

package io.caoxx123.o3BehavioralModel.o23StrategyPattern.service.serviceIml;

import io.caoxx123.o3BehavioralModel.o23StrategyPattern.service.Strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int Operation(int num1, int num2) {
        return num1-num2;
    }
}

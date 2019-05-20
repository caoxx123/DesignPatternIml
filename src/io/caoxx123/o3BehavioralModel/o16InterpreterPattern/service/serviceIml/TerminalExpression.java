package io.caoxx123.o3BehavioralModel.o16InterpreterPattern.service.serviceIml;

import io.caoxx123.o3BehavioralModel.o16InterpreterPattern.service.Expression;

public class TerminalExpression implements Expression {
    private  String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}

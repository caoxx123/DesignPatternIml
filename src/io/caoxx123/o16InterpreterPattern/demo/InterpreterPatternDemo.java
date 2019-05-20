package io.caoxx123.o16InterpreterPattern.demo;

import io.caoxx123.o16InterpreterPattern.service.Expression;
import io.caoxx123.o16InterpreterPattern.service.serviceIml.AndExpression;
import io.caoxx123.o16InterpreterPattern.service.serviceIml.OrExpression;
import io.caoxx123.o16InterpreterPattern.service.serviceIml.TerminalExpression;

public class InterpreterPatternDemo {
    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale=getMaleExpression();
        Expression isMarriedWoman=getMarriedWomanExpression();
        System.out.println("jhon is male?"+isMale.interpret("John"));
        System.out.println("julie is a married woman?"+isMarriedWoman.interpret("Julie Married"));
    }
}

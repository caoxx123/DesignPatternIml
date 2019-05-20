package io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml;

import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.ComputerPart;
import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.ComputerPartVisitor;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

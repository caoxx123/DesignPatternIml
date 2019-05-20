package io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml;

import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("display computer");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display mouitor");
    }
}

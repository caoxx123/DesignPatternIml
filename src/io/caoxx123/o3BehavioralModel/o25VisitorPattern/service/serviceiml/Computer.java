package io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml;

import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.ComputerPart;
import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.ComputerPartVisitor;

public class Computer implements ComputerPart{
    ComputerPart[] Parts;

    public Computer() {
        Parts=new ComputerPart[]{new Mouse(),new Monitor(),new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i=0;i<Parts.length;i++){
            Parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

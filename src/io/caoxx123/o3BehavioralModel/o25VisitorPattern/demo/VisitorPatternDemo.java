package io.caoxx123.o3BehavioralModel.o25VisitorPattern.demo;

import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml.Computer;
import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}

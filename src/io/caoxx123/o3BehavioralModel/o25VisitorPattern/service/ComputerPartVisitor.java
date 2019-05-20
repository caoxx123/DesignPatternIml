package io.caoxx123.o3BehavioralModel.o25VisitorPattern.service;

import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml.Computer;
import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml.Keyboard;
import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml.Monitor;
import io.caoxx123.o3BehavioralModel.o25VisitorPattern.service.serviceiml.Mouse;

public interface ComputerPartVisitor {
    public void visit(Mouse mouse);
    public void visit(Computer computer);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);

}

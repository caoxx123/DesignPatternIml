package io.caoxx123.o4J2EEModel.o26MVCPattern.controller;

import io.caoxx123.o4J2EEModel.o26MVCPattern.model.Student;
import io.caoxx123.o4J2EEModel.o26MVCPattern.view.StudentView;

public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView) {
        this.student = student;
        this.studentView = studentView;
    }
    public void setStudentName(String name){
        student.setName(name);
    }
    public String getStudentName(){
       return student.getName();
    }
    public void setStudentRollNo(String rollNo){
        student.setName(rollNo);
    }
    public String getStudentRollNo(){
        return  student.getRol1eNo();
    }
    public void update(){
        studentView.printStudentDetails(student.getName(),student.getRol1eNo());
    }
}

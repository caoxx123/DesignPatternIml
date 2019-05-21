package io.caoxx123.o4J2EEModel.o26MVCPattern.demo;

import io.caoxx123.o3BehavioralModel.o20ObserverPattern.demo.Subject;
import io.caoxx123.o4J2EEModel.o26MVCPattern.controller.StudentController;
import io.caoxx123.o4J2EEModel.o26MVCPattern.model.Student;
import io.caoxx123.o4J2EEModel.o26MVCPattern.view.StudentView;

public class MCVPatternDemo {
    public static void main(String[] args) {
        Student student=retriveStudentFromDatabase();
        StudentView view=new StudentView();
        StudentController studentController=new StudentController(student,view);
        studentController.setStudentName("大哥牛皮");
        studentController.update();

    }
    private static Student retriveStudentFromDatabase(){
        Student student=new Student();
        student.setName("狗蛋");
        student.setRol1eNo("10");
        return  student;
    }
}

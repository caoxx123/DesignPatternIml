package io.caoxx123.o4J2EEModel.o29DataAccessObjectPattern.dao.daoIml;

import io.caoxx123.o4J2EEModel.o29DataAccessObjectPattern.dao.StudentDao;
import io.caoxx123.o4J2EEModel.o29DataAccessObjectPattern.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student(1,"狗蛋");
        Student student2 = new Student(2,"牛蛋");
        students.add(student1);
        students.add(student2);
        this.students = students;
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.set(student.getRollNo(),student);
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
    }


}

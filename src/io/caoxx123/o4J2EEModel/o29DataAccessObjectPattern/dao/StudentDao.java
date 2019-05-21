package io.caoxx123.o4J2EEModel.o29DataAccessObjectPattern.dao;

import io.caoxx123.o4J2EEModel.o29DataAccessObjectPattern.model.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}

package com.edjayCodes.studentSystem.service;

import com.edjayCodes.studentSystem.model.Student;

import java.util.List;


public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getStudent();
    public void updateStudent(int id, Student student);

    public void deleteStudent(int id);

    public void deleteAll();
}
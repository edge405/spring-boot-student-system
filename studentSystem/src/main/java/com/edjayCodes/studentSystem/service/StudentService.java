package com.edjayCodes.studentSystem.service;

import com.edjayCodes.studentSystem.DTOmapper.DTOmapper;
import com.edjayCodes.studentSystem.dto.StudentDTO;
import com.edjayCodes.studentSystem.model.Student;

import java.util.List;


public interface StudentService {

    public Student saveStudent(Student student);
    public StudentDTO getStudentByID(int id);
    public List<StudentDTO> getStudents();
    public void updateStudent(int id, Student student);

    public void deleteStudent(int id);

    public void deleteAll();
}
package com.edjayCodes.studentSystem.service;

import com.edjayCodes.studentSystem.model.Student;
import com.edjayCodes.studentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student saveStudent(Student student) {
            repository.save(student);
        return student;
    }

    @Override
    public List<Student> getStudent() {
        return repository.findAll();
    }

    @Override
    public void updateStudent(int id, Student student) {
        student.setId(id);
        repository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }


}

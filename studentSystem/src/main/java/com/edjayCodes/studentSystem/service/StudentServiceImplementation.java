package com.edjayCodes.studentSystem.service;

import com.edjayCodes.studentSystem.DTOmapper.DTOmapper;
import com.edjayCodes.studentSystem.dto.StudentDTO;
import com.edjayCodes.studentSystem.model.Student;
import com.edjayCodes.studentSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public StudentDTO getStudentByID(int id) {
        Student student = repository.getById(id);
        return DTOmapper.convertToDTO(student);
    }

    @Override
    public List<StudentDTO> getStudents() {
        List<Student> students = repository.findAll();

        List<StudentDTO> studentsMapper = students.stream()
                .map(DTOmapper::convertToDTO)
                .collect(Collectors.toList());

        return studentsMapper;
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

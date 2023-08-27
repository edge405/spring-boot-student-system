package com.edjayCodes.studentSystem.controller;

import com.edjayCodes.studentSystem.model.Student;
import com.edjayCodes.studentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student add(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/getAllStudents")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") int id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudentByID(@PathVariable("studentId") int studentId){
        studentService.deleteStudent(studentId);
    }
    @DeleteMapping()
    public void deleteAllStudent(){
        studentService.deleteAll();
    }
}
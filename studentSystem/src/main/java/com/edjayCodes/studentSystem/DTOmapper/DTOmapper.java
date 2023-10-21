package com.edjayCodes.studentSystem.DTOmapper;

import com.edjayCodes.studentSystem.dto.StudentDTO;
import com.edjayCodes.studentSystem.model.Student;

public class DTOmapper {

    public static StudentDTO convertToDTO(Student student){
        return new StudentDTO(student.getName(), student.getAddress());
    }
}
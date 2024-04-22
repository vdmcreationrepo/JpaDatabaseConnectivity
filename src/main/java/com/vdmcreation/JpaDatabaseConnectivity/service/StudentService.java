package com.vdmcreation.JpaDatabaseConnectivity.service;

import com.vdmcreation.JpaDatabaseConnectivity.dto.StudentRequestDTO;
import com.vdmcreation.JpaDatabaseConnectivity.dto.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    StudentResponseDTO saveOrUpdateStudent(StudentRequestDTO requestDTO);

    void deleteStudent(Long studentId);

    List<StudentResponseDTO> findAllStudent();

}

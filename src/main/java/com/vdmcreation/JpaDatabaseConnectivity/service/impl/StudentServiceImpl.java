package com.vdmcreation.JpaDatabaseConnectivity.service.impl;

import com.vdmcreation.JpaDatabaseConnectivity.dto.StudentRequestDTO;
import com.vdmcreation.JpaDatabaseConnectivity.dto.StudentResponseDTO;
import com.vdmcreation.JpaDatabaseConnectivity.entity.Student;
import com.vdmcreation.JpaDatabaseConnectivity.enums.Status;
import com.vdmcreation.JpaDatabaseConnectivity.repository.StudentRepository;
import com.vdmcreation.JpaDatabaseConnectivity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentResponseDTO saveOrUpdateStudent(StudentRequestDTO requestDTO) {
        Student student = requestDTO.toEntity(requestDTO);
        student = studentRepository.save(student);
        return requestDTO.toResponse(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        Optional<Student> studentOpt = studentRepository.findById(studentId);
        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            student.setStatus(Status.DELETE);
            studentRepository.save(student);
        }
    }

    @Override
    public List<StudentResponseDTO> findAllStudent() {
        List<Student> list = studentRepository.findAll();
        List<StudentResponseDTO> newList = new ArrayList<>();
        list.forEach(student -> newList.add(new StudentResponseDTO(student)));
        return newList;
    }
}

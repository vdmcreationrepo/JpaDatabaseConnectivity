package com.vdmcreation.JpaDatabaseConnectivity.controller;

import com.vdmcreation.JpaDatabaseConnectivity.dto.ResponseDTO;
import com.vdmcreation.JpaDatabaseConnectivity.dto.StudentRequestDTO;
import com.vdmcreation.JpaDatabaseConnectivity.dto.StudentResponseDTO;
import com.vdmcreation.JpaDatabaseConnectivity.enums.ResponseType;
import com.vdmcreation.JpaDatabaseConnectivity.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.vdmcreation.JpaDatabaseConnectivity.enums.Status.SUCCESS;

@RestController
@RequestMapping("rest/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PutMapping
    public ResponseDTO saveOrUpdateStudent(@RequestBody StudentRequestDTO requestDTO) {
        StudentResponseDTO studentResponse = studentService.saveOrUpdateStudent(requestDTO);
        return new ResponseDTO(SUCCESS.toString(), ResponseType.OBJECT.toString(), studentResponse);
    }

    @DeleteMapping("/{studentId}")
    public ResponseDTO deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseDTO(SUCCESS.toString());
    }

    @GetMapping
    public ResponseDTO findAllStudent() {
        List<StudentResponseDTO> list = studentService.findAllStudent();
        return new ResponseDTO(SUCCESS.toString(), ResponseType.LIST.toString(), list);
    }
}

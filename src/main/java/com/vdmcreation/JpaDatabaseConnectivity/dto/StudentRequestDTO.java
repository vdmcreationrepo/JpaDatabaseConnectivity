package com.vdmcreation.JpaDatabaseConnectivity.dto;

import com.vdmcreation.JpaDatabaseConnectivity.entity.Student;
import com.vdmcreation.JpaDatabaseConnectivity.enums.Status;

public class StudentRequestDTO {
    private Long id;
    private String firstName;
    private String lastName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public StudentRequestDTO() {

    }

    public Student toEntity(StudentRequestDTO requestDTO) {
        Student student = new Student();
        student.setId(requestDTO.getId());
        student.setFirstName(requestDTO.getFirstName());
        student.setLastName(requestDTO.getLastName());
        student.setStatus(Status.CREATE);
        return student;
    }
    public StudentResponseDTO toResponse(Student student) {
        StudentResponseDTO responseDTO = new StudentResponseDTO();
        responseDTO.setId(student.getId());
        responseDTO.setFirstName(student.getFirstName());
        responseDTO.setLastName(student.getLastName());
        return responseDTO;
    }
}

package com.vdmcreation.JpaDatabaseConnectivity.dto;

import com.vdmcreation.JpaDatabaseConnectivity.entity.Student;

public class StudentResponseDTO {
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    public StudentResponseDTO(){

    }
    public StudentResponseDTO(Student student){
        this.id = student.getId();
        this.firstName = student.getFirstName();
        this.lastName = student.getLastName();
    }
}

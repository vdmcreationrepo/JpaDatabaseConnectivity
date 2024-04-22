package com.vdmcreation.JpaDatabaseConnectivity.dto;

public class ResponseDTO {
    private String status;
    private String type;
    private Object data;

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseDTO() {

    }

    public ResponseDTO(String status) {
        this.status = status;
    }

    public ResponseDTO(String status, String type, Object data) {
        this.status = status;
        this.type = type;
        this.data = data;
    }
}

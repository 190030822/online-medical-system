package com.medical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
    private int pid;
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getDoctor() {
        return doctor;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    private String doctor;
    private String role;
    private  String message;
    @Override
    public String toString() {
        return "Message [doctor=" + doctor + ", message=" + message + ", pid=" + pid + ", role=" + role + "]";
    }
}

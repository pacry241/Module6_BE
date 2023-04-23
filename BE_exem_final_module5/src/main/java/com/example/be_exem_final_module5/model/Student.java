package com.example.be_exem_final_module5.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameStudent;
    private String nameTopic;
    private String email;
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name = "id_teacher")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "id_group")
    private GroupStudent groupStudent;

    public Student() {
    }

    public Student(int id, String nameStudent, String nameTopic, String email, String phoneNumber, Teacher teacher, GroupStudent groupStudent) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.nameTopic = nameTopic;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.teacher = teacher;
        this.groupStudent = groupStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getNameTopic() {
        return nameTopic;
    }

    public void setNameTopic(String nameTopic) {
        this.nameTopic = nameTopic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public GroupStudent getGroup() {
        return groupStudent;
    }

    public void setGroup(GroupStudent groupStudent) {
        this.groupStudent = groupStudent;
    }
}

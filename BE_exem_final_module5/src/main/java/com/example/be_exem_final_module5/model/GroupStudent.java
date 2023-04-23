package com.example.be_exem_final_module5.model;

import javax.persistence.*;

@Entity
public class GroupStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameGroup;

    public GroupStudent() {
    }

    public GroupStudent(int id, String nameGroup) {
        this.id = id;
        this.nameGroup = nameGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
}

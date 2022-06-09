package com.example.demo.Orphan;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Orphan {
    @Id
    @SequenceGenerator(
            name = "orphan_sequence",
            sequenceName = "orphan_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orphan_sequence"
    )
    private Integer ID;
    private String name;
    private String FatherName;
    private String MotherName;
    private LocalDate dob;
    private LocalDate fdod;
    @Override
    public String toString() {
        return "Orphan{" +
                "name=" + name +
                ", FatherName=" + FatherName +
                ", MotherName=" + MotherName +
                ", dob=" + dob +
                ", fdod=" + fdod +
                '}';
    }

    public Orphan() {
    }

    public Orphan(String name, String fatherName, String motherName, LocalDate dob, LocalDate fdod) {
        this.name = name;
        FatherName = fatherName;
        MotherName = motherName;
        this.dob = dob;
        this.fdod = fdod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getMotherName() {
        return MotherName;
    }

    public void setMotherName(String motherName) {
        MotherName = motherName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getFdod() {
        return fdod;
    }

    public void setFdod(LocalDate fdod) {
        this.fdod = fdod;
    }
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

}

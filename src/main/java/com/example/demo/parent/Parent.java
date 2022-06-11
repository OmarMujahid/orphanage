package com.example.demo.parent;

import com.example.demo.Orphan.Orphan;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Entity
    @Table
    public class Parent {
    @Id
    @SequenceGenerator(
            name = "parent_sequence",
            sequenceName = "parent_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "parent_sequence"
    )
    private Integer ID;

    @JsonIgnore
    @OneToMany(mappedBy = "parent")
    private Set<Orphan> parentOrphans = new HashSet<>();


    private String Parentname;
    private String FatherName;
    private String MotherName;
    private LocalDate dob;
    @Override
    public String toString() {
        return "Orphan{" +
                "name=" + Parentname +
                ", FatherName=" + FatherName +
                ", MotherName=" + MotherName +
                ", dob=" + dob +
                '}';
    }

    public Parent() {
    }

    public Parent(String name, String fatherName, String motherName, LocalDate dob) {
        this.Parentname = name;
        FatherName = fatherName;
        MotherName = motherName;
        this.dob = dob;
    }

    public String getName() {
        return Parentname;
    }

    public void setName(String name) {
        this.Parentname = name;
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }


    public Set<Orphan> getParentOrphans() {
        return parentOrphans;
    }

}

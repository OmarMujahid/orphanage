package com.example.demo.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Business Logic
@Service
public class ParentServices {

    private final ParentRepo parentRepo;
    @Autowired
    public ParentServices(ParentRepo parentRepo) {
        this.parentRepo = parentRepo;
    }

    public List<Parent> create() {
        return parentRepo.findAll();
    }

    public void addNewOrphan(Parent parent) {
        parentRepo.save(parent);
    }

    public Parent getParentbyID(Integer id) {
            return parentRepo.findById(id).get();

    }
}

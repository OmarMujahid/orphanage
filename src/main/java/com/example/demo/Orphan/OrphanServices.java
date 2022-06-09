package com.example.demo.Orphan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Business Logic
@Service
public class OrphanServices {

    private final OrphanRepo orphanRepo;
    @Autowired
    public OrphanServices(OrphanRepo orphanRepo) {
        this.orphanRepo = orphanRepo;
    }

    public List<Orphan> create() {
        return orphanRepo.findAll();
    }

    public void addNewOrphan(Orphan orphan) {
        orphanRepo.save(orphan);
    }
}

package com.example.demo.Orphan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public List<Orphan> getOrphans() {
        return orphanRepo.findAll();
    }

    public void addNewOrphan(Orphan orphan) {
        orphanRepo.save(orphan);
    }

    public void deleteOrp(Integer id) {
        boolean exists = orphanRepo.existsById(id);
        if(!exists){
            throw new IllegalStateException("does not exist");
        }
        orphanRepo.deleteById(id);
    }
    @Transactional
    public void updateOrphan(Integer id, String name) {
        Orphan orphan = orphanRepo.findById(id).orElseThrow(()-> new IllegalStateException("Wrong ID"));
        if(name != null && name.length() > 0){
            orphan.setName(name);
        }
    }

    public Orphan getOrphansbyID(Integer id) {
           return orphanRepo.findById(id).get();

    }

    public Orphan saveParent(Orphan orphan) {
        return orphanRepo.save(orphan);
    }
}

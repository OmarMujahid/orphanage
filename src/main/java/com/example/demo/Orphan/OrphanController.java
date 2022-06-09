package com.example.demo.Orphan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/orphan")


public class OrphanController {

    private final OrphanServices orphanServices;
    @Autowired
    public OrphanController(OrphanServices orphanServices) {
        this.orphanServices = orphanServices;
    }

    @GetMapping
    public List<Orphan> getOrphan(){
        return orphanServices.create();
    }
    @PostMapping
    public void registerneworphan(@RequestBody Orphan orphan){
        orphanServices.addNewOrphan(orphan);
    }

}

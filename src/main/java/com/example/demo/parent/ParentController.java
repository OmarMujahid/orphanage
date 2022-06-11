package com.example.demo.parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/parent")


public class ParentController {

    private final ParentServices parentServices;
    @Autowired
    public ParentController(ParentServices parentServices) {
        this.parentServices = parentServices;
    }

    @GetMapping
    public List<Parent> getParent(){
        return parentServices.create();
    }
    @PostMapping
    public void registernewparent(@RequestBody Parent parent){
        parentServices.addNewOrphan(parent);
    }

}

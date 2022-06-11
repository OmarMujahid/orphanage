package com.example.demo.Orphan;
import com.example.demo.parent.Parent;
import com.example.demo.parent.ParentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/orphan")


public class OrphanController {

    private final OrphanServices orphanServices;
    private final ParentServices parentServices;
    @Autowired
    public OrphanController(OrphanServices orphanServices, ParentServices parentServices) {
        this.orphanServices = orphanServices;
        this.parentServices = parentServices;
    }

    @GetMapping
    public List<Orphan> getOrphan(){
        return orphanServices.getOrphans();
    }
    @PostMapping
    public void registerneworphan(@RequestBody Orphan orphan){
        orphanServices.addNewOrphan(orphan);
    }
    @DeleteMapping(path = "{orphanID}")
    public void deleteOrphan(@PathVariable("orphanID") Integer id){orphanServices.deleteOrp(id);}
    @PutMapping(path = "{orphanID}")
    public void updateOrphan(@PathVariable("orphanID") Integer id,
                             @RequestParam(required = false) String name){
        orphanServices.updateOrphan(id,name);
    }

    @PutMapping("/{orphanID}/{parentID}")
    Orphan assignOrphanToParent(
            @PathVariable Integer orphanID,
            @PathVariable Integer parentID
    ){
        Orphan orphan = orphanServices.getOrphansbyID(orphanID);
        Parent parent = parentServices.getParentbyID(parentID);
        orphan.assignToParent(parent);
        return orphanServices.saveParent(orphan);
    }

}

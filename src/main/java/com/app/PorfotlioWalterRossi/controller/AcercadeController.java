
package com.app.PorfotlioWalterRossi.controller;



import com.app.PorfotlioWalterRossi.models.Acercade;
import com.app.PorfotlioWalterRossi.services.AcercadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static org.hibernate.criterion.Projections.id;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/acercade")
public class AcercadeController {
    @Autowired
    private final AcercadeService acercadeService;

    public AcercadeController(AcercadeService acercadeService) {
        this.acercadeService = acercadeService;
    }

    @GetMapping ("/leer")
    public ResponseEntity<List<Acercade>> getAllAcercade(){
        List<Acercade> acercade=acercadeService.findAllAcercade();
        return new ResponseEntity<>(acercade, HttpStatus.OK);
    }
    
 

    @PostMapping("/add/")
    public ResponseEntity<Acercade> addAcercade(@RequestBody Acercade project){
        Acercade newAcercade=acercadeService.addAcercade(project);
        return new ResponseEntity<>(newAcercade,HttpStatus.CREATED);
    }
    @PutMapping ("/update")
    public ResponseEntity<Acercade> updateAcercade(@RequestBody Acercade  acercade){
        Acercade updateAcercade=acercadeService.updateAcercade(acercade);
        return new ResponseEntity<>(updateAcercade,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAcercade(@PathVariable("id") Long id){
        acercadeService.deleteAcercade(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
  



}

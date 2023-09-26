package com.example.ms_candidate.controller;

import com.example.ms_candidate.entites.Candidat;
import com.example.ms_candidate.services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/api/candidat")
public class CandidatController {

    @Autowired()
    private CandidatService _candidatService;

    @PostMapping()
    public ResponseEntity<Candidat> add(@RequestBody() Candidat candidat){
        return new ResponseEntity<>(_candidatService.addCandidat(candidat),HttpStatus.OK);
    }

    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Candidat> update(@RequestBody() Candidat candidat ,@PathVariable("id") int id){
        return new ResponseEntity<>(_candidatService.updateCandidat(candidat,id),HttpStatus.OK);
    }

    @DeleteMapping (value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        return new ResponseEntity<>(_candidatService.delete(id),HttpStatus.OK);
    }


}

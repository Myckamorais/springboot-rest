package com.springboot.rest.controllers;

import com.springboot.rest.data.dto.v1.PersonDTO;
// STAND BY (v2): import com.springboot.rest.data.dto.v2.PersonDTOV2;
import com.springboot.rest.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {

    @Autowired
    private PersonServices services;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonDTO> findAll(){
        return services.findAll();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDTO findById(@PathVariable("id") Long id) {
        var person = services.findById(id);
        person.setPhoneNumber("+55 (11) 98765-4321");
        person.setSensitiveData("Foo Bar");
        return person;
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonDTO create (@RequestBody PersonDTO person){
        return services.create(person);
    }

    // STAND BY (v2): reativar junto com createV2 no PersonServices
    // @PostMapping(value = "/v2",
    // consumes = MediaType.APPLICATION_JSON_VALUE,
    // produces = MediaType.APPLICATION_JSON_VALUE
    // )
    // public PersonDTOV2 createV2 (@RequestBody PersonDTOV2 person){
    //     return services.createV2(person);
    // }

    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonDTO update (@RequestBody PersonDTO person){
        return services.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") Long id) {
        services.delete(id);
        return ResponseEntity.noContent().build();
    }





}

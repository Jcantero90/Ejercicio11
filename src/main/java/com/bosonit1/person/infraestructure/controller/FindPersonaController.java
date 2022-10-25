package com.bosonit1.person.infraestructure.controller;

import com.bosonit1.person.application.service.PersonaServiceImpl;
import com.bosonit1.person.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FindPersonaController {

    @Autowired
    PersonaServiceImpl servicePersona;
    //Con las anotaciones de Baeldung no me funciona.
//    @CrossOrigin("http://localhost:8080/getall")
//    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin
    @GetMapping("/getall")
    public List<Persona> findList (){
        return servicePersona.getList();
    }
}

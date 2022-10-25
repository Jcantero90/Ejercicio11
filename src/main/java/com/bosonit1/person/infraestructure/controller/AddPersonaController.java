package com.bosonit1.person.infraestructure.controller;

import com.bosonit1.person.application.service.PersonaServiceImpl;
import com.bosonit1.person.infraestructure.inputPersonaDto.InputPersonaDto;
import com.bosonit1.person.infraestructure.outputPersonaDto.OutputPersonaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddPersonaController {

    @Autowired
    PersonaServiceImpl servicePersona;

    //Con las anotaciones de Baeldung no me funciona.
//    @CrossOrigin("http://localhost:8080/addperson")
//    @RequestMapping(method = RequestMethod.POST)
    @CrossOrigin
    @PostMapping("/addperson")
    public OutputPersonaDto addPersona (@RequestBody InputPersonaDto inputPersonaDto){
        return servicePersona.addPersona(inputPersonaDto);
    }
}

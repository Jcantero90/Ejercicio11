package com.bosonit1.person.application.service;

import com.bosonit1.person.domain.Persona;
import com.bosonit1.person.infraestructure.inputPersonaDto.InputPersonaDto;
import com.bosonit1.person.infraestructure.outputPersonaDto.OutputPersonaDto;
import com.bosonit1.person.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public OutputPersonaDto addPersona(InputPersonaDto inputPersonaDto){
        Persona persona = new Persona(inputPersonaDto);
        personaRepository.save(persona);
        return new OutputPersonaDto (persona);
    }

    public List<Persona> getList (){
        return personaRepository.findAll();
    }
}

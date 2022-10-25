package com.bosonit1.person.application.service;

import com.bosonit1.person.domain.Persona;
import com.bosonit1.person.infraestructure.inputPersonaDto.InputPersonaDto;
import com.bosonit1.person.infraestructure.outputPersonaDto.OutputPersonaDto;

import java.util.List;

public interface PersonaService {

    public OutputPersonaDto addPersona(InputPersonaDto inputPersonaDto);

    public List<Persona> getList ();
}

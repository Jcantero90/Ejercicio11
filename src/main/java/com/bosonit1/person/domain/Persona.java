package com.bosonit1.person.domain;

import com.bosonit1.person.infraestructure.inputPersonaDto.InputPersonaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_persona;

    private String usuario;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private boolean active;
    private Date created_date;
    private String imagen_url;
    private Date termination_date;

    public boolean getActive() {
        return true;
    }

    //Parte de prueba. Ambas dan el mismo resultado.
//    public Persona (InputPersonaDto inputPersonaDto){
//        setUsuario(inputPersonaDto.getUsuario());
//        setPassword(inputPersonaDto.getPassword());
//        setName(inputPersonaDto.getName());
//        setSurname(inputPersonaDto.getSurname());
//        setCompany_email(inputPersonaDto.getCompany_email());
//        setPersonal_email(inputPersonaDto.getPersonal_email());
//        setCity(inputPersonaDto.getCity());
//        setActive(inputPersonaDto.getActive());
//        setCreated_date(inputPersonaDto.getCreated_date());
//        setImagen_url(inputPersonaDto.getImagen_url());
//        setTermination_date(inputPersonaDto.getTermination_date());
//
//    }

    public Persona(InputPersonaDto inputPersonaDto){
        this.usuario=inputPersonaDto.getUsuario();
        this.password=inputPersonaDto.getPassword();
        this.name=inputPersonaDto.getName();
        this.surname=inputPersonaDto.getSurname();
        this.company_email=inputPersonaDto.getCompany_email();
        this.personal_email=inputPersonaDto.getPersonal_email();
        this.city=inputPersonaDto.getCity();
        this.active=inputPersonaDto.getActive();
        this.created_date=inputPersonaDto.getCreated_date();
        this.imagen_url=inputPersonaDto.getImagen_url();
        this.termination_date=inputPersonaDto.getTermination_date();
    }

}

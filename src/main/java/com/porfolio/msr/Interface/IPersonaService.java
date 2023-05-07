package com.porfolio.msr.Interface;

import com.porfolio.msr.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto del tipo persona
    public void deletePersona(Long id);
    
    //Buscar una persona por Id
    public Persona findPersona(Long id);

   
}

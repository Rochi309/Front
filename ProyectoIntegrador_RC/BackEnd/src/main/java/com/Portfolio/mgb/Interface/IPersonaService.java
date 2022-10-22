package com.Portfolio.mgb.Interface;

import com.Portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas//

    public List<Persona>getPersona(); 
    
    //Guardar un objeto de tipo persona//
    public void savePersona(Persona persona);
    
    //Elimina un objeto pero lo buscamos po ID//
    public void deletePersona(Long id);
    
    //Buscar una persona por ID//
    public Persona findPersona (Long id);
}


package com.sathish.struts.crud.service;

import com.sathish.struts.crud.model.Country;
import com.sathish.struts.crud.model.Person;


public interface PersonService {

    Person getPerson(Integer id);
    
    Person[] getAllPersons();

    void updatePerson(Person personBean);
    
    void insertPerson(Person personBean);
    
    void deletePerson(Integer id);
    
    Country[] getCountries();
    
    String[] getCarModels();
    
    String[] getSports();
    
    String[] getGenders();
}
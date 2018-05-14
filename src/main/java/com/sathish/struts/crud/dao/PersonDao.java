package com.sathish.struts.crud.dao;

import com.sathish.struts.crud.model.Person;


public interface PersonDao {
    
    Person getPerson(Integer id);
    
    Person[] getAllPersons();

    void updatePerson(Person personBean);
    
    void insertPerson(Person personBean);
    
    void deletePerson(Integer id);
}

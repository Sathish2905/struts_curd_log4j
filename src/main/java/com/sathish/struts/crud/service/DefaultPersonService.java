package com.sathish.struts.crud.service;

import com.sathish.struts.crud.dao.MemoryPersonDao;
import com.sathish.struts.crud.dao.MemoryPersonSupportDao;
import com.sathish.struts.crud.dao.PersonDao;
import com.sathish.struts.crud.dao.PersonSupportDao;
import com.sathish.struts.crud.model.Country;
import com.sathish.struts.crud.model.Person;



public class DefaultPersonService implements PersonService {
    PersonDao personDao; 
    PersonSupportDao personSupportDao; 
    
    public DefaultPersonService() {
        personDao = new MemoryPersonDao();
        personSupportDao = new MemoryPersonSupportDao();
    }

    @Override
    public Person getPerson(Integer id) {
        return personDao.getPerson(id);
    }

    @Override
    public Person[] getAllPersons() {
        return personDao.getAllPersons();
    }

    @Override
    public void updatePerson(Person personBean) {
        personDao.updatePerson(personBean);
    }

    @Override
    public void insertPerson(Person personBean) {
        personDao.insertPerson(personBean);
    }

    @Override
    public void deletePerson(Integer id) {
        personDao.deletePerson(id);
    }

    @Override
    public Country[] getCountries() {
        return personSupportDao.getCountries();
    }

    @Override
    public String[] getCarModels() {
        return personSupportDao.getCarModels();
    }

    @Override
    public String[] getSports() {
        return personSupportDao.getSports();
    }

    @Override
    public String[] getGenders() {
        return personSupportDao.getGenders();
    }
}

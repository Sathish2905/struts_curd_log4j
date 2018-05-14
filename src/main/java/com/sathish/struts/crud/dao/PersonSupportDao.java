package com.sathish.struts.crud.dao;

//import java.util.Map;
import com.sathish.struts.crud.model.Country;

public interface PersonSupportDao {

    Country[] getCountries();
    
    String[] getCarModels();
    
    String[] getSports();
    
    String[] getGenders();
    
}

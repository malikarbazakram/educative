//package io.datajek.databaserelationships.service;
//
//import io.datajek.databaserelationships.onetomany.unidirectional.Registration;
//import io.datajek.databaserelationships.repository.RegistrationRepositorys;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class RegistrationServices {
//    @Autowired
//    RegistrationRepositorys repo;
//
//    public List<Registration> allRegistrations() {
//        return repo.findAll();
//    }
//
//    public Registration getRegistration(int id){
//        return repo.findById(id).get();
//    }
//
//    public Registration addRegistration(Registration registration) {
//        registration.setId(0);
//        return repo.save(registration);
//    }
//
//    public void deleteRegistration(int id) {
//        repo.deleteById(id);
//    }
//
//}

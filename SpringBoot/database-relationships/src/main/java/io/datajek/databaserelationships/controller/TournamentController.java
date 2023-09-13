//package io.datajek.databaserelationships.controller;
//
//import io.datajek.databaserelationships.onetomany.unidirectional.Registration;
//import io.datajek.databaserelationships.onetomany.unidirectional.Tournament;
//import io.datajek.databaserelationships.service.RegistrationServices;
//import io.datajek.databaserelationships.service.TournamentServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/tournaments")
//public class TournamentController {
//
//
//    @Autowired
//    TournamentServices service;
//
//    @Autowired
//    RegistrationServices registrationService;
//
//    @GetMapping
//    public List<Tournament> allTournaments() {
//        return service.allTournaments();
//    }
//
//    @GetMapping("/{id}")
//    public Tournament getTournament(@PathVariable int id){
//        return service.getTournament(id);
//    }
//
//    @PostMapping
//    public Tournament addTournament(@RequestBody Tournament tournament) {
//        return service.addTournament(tournament);
//    }
//
//    @PutMapping("/{id}/registrations/{registration_id}")
//    public Tournament addRegistration(@PathVariable int id, @PathVariable int registration_id) {
//        Registration registration = registrationService.getRegistration(registration_id);
//        System.out.println(registration);
//        return service.addRegistration(id, registration);
//    }
//
//    @PutMapping("/{id}/remove_registrations/{registration_id}")
//    public Tournament removeRegistration(@PathVariable int id, @PathVariable int registration_id) {
//        Registration registration = registrationService.getRegistration(registration_id);
//        System.out.println(registration);
//        return service.removeRegistration(id, registration);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteTournament(@PathVariable int id) {
//        service.deleteTournament(id);
//    }
//
//}

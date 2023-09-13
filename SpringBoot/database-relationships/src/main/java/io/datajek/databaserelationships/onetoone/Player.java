//package io.datajek.databaserelationships.onetoone;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import jakarta.persistence.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//public class Player {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int Id;
//    private String name;
//    //...
//    //The absence of the cascade property,
//    // results in the TransientPropertyValueException
//    // exception when Hibernate tries to save a
//    // Player object containing a nested PlayerProfile
//    // object.
//    @OneToOne(cascade= CascadeType.ALL, optional = false)
//    @JoinColumn(name="profile_id", referencedColumnName="Id")
//    @JsonManagedReference
//    private PlayerProfile playerProfile;
//
//
////    @OneToMany(mappedBy="player", cascade= CascadeType.ALL)
////    private List<Registration> registrations = new ArrayList<>();
//    public Player() {
//    }
//
//    public Player(int id, String name) {
//        Id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public PlayerProfile getPlayerProfile() {
//        return playerProfile;
//    }
//
//    public void setPlayerProfile(PlayerProfile playerProfile) {
//        this.playerProfile = playerProfile;
//    }
//
////    public List<Registration> getRegistrations() {
////        return registrations;
////    }
////
////    public void setRegistrations(List<Registration> registrations) {
////        this.registrations = registrations;
////    }
//
////    @Override
////    public String
////    toString() {
////        return "Player{" +
////                "Id=" + Id +
////                ", name='" + name + '\'' +
////                ", playerProfile=" + playerProfile +
////                ", registrations=" + registrations +
////                '}';
////    }
////
////    //set up bidirectional relationship with Registration class
////    public void registerPlayer(Registration reg) {
////        //add registration to the list
////        registrations.add(reg);
////        //set the player field in the registration
////        reg.setPlayer(this);
////    }
//
//
//}

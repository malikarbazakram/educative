//package io.datajek.databaserelationships.onetoone;
//
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import jakarta.persistence.*;
//
//
//@Entity
//public class PlayerProfile {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int Id;
//    private String twitter;
//
//    @OneToOne(mappedBy="playerProfile", cascade = CascadeType.ALL)
//    @JsonBackReference
//    private Player player;
//
//    public PlayerProfile() {
//    }
//
//    public PlayerProfile(int id, String twitter) {
//        Id = id;
//        this.twitter = twitter;
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
//    public String getTwitter() {
//        return twitter;
//    }
//
//    public void setTwitter(String twitter) {
//        this.twitter = twitter;
//    }
//
//    public Player getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(Player player) {
//        this.player = player;
//    }
//
//    @Override
//    public String toString() {
//        return "PlayerDetail [id=" + Id + ", twitter=" + twitter + ", player=" + player + "]";
//    }
//
//
//}
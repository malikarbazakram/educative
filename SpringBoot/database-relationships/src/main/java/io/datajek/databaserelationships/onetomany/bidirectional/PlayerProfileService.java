package io.datajek.databaserelationships.onetomany.bidirectional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {

    @Autowired
    PlayerProfileRepository repo;

    public List<PlayerProfile> allPlayerProfiles() {
        return repo.findAll();
    }

    public PlayerProfile getPlayerProfile(int id){
        return repo.findById(id).get();
    }

    public PlayerProfile addPlayerProfile(PlayerProfile profile) {
        profile.setId(0);
        //check if profile contains nested player
        if(profile.getPlayer()!=null) {
            profile.getPlayer().setPlayerProfile(profile);
        }
        return repo.save(profile);
    }

    public void deletePlayerProfile(int id) {
        PlayerProfile tempPlayerProfile = repo.findById(id).get();
        tempPlayerProfile.getPlayer().setPlayerProfile(null);
        tempPlayerProfile.setPlayer(null);
        repo.save(tempPlayerProfile);
        repo.delete(tempPlayerProfile);
    }
}


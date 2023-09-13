package io.datajek.tennisplayerrest.player;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    //method to return all the players
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    //method to find a player by id
//    public Player getPlayerByID(int id) {
//        Optional<Player> tempPlayer = playerRepository.findById(id);
//        Player player = null;
//
//        if (tempPlayer.isPresent()) {
//            player = tempPlayer.get();
//        } else
//            throw new RuntimeException
//                    ("Player with id " + id + " not found.");
//        return player;
//    }

    //method to add player
    public Player addPlayer(Player p) {
        return playerRepository.save(p);
    }


//    public Player updatePlayer(int id, Player p){
//        Player player = playerRepository.getOne(id);
//        player.setName(p.getName());
//        player.setNationality(p.getNationality());
//        player.setBirthDate(p.getBirthDate());
//        player.setTitles(p.getTitles());
//
//
//        return playerRepository.save(player);
//    }

//    public Player partialUpdate (int id,
//                               Map<String, Object> playerPatch)
//    {
//        Optional<Player> player =
//                playerRepository.findById(id);
//        playerPatch.forEach( (key, value) ->
//        {
//            if (player.isPresent())
//            {
//                Field field = ReflectionUtils.findField(Player.class, key);
//                ReflectionUtils.makeAccessible(field);
//                ReflectionUtils.setField(field, player.get(), value);
//
//            }
//        });
//        return playerRepository.save(player.get());
//    }

    //The @Transactional annotation ensures that
    // the database is left in a consistent state.
//    @Transactional
//    public void updateTitles(int id, int titles)
//    {
//        playerRepository.updateTitles(id,titles);
//    }

//    //delete
//    public String deletePlayer (int id) {
////        try{ playerRepository.deleteById(id);}
////        catch (Exception e)
////        {
////            return "Player with id " + id + "NOT found";
////        }
////
////        return "Deleted player with id: " + id;
//
//
//        Optional<Player> playerToDelete= playerRepository.findById(id);
//        if(playerToDelete.isPresent()){
//            playerRepository.deleteById(id);
//            return "Deleted player with id: " + id;
//        }
//        else{
//            return "Player with id " + id + " NOT found";
//        }
//    }


    public Player getPlayerByID (int id) {
        Optional<Player> tempPlayer = playerRepository.findById(id);

        if(tempPlayer.isEmpty())
            throw new PlayerNotFoundException
                    ("Player with id {"+ id +"} not found");

        return tempPlayer.get();
    }

    public Player updatePlayer(int id, Player p) {
        Optional<Player> tempPlayer = playerRepository.findById(id);
//        player.setName(p.getName());
//        player.setNationality(p.getNationality());
//        player.setBirthDate(p.getBirthDate());
//        player.setTitles(p.getTitles());
//        return playerRepository.save(player);
        if(tempPlayer.isEmpty())
            throw new PlayerNotFoundException
                    ("Player with id {"+ id +"} not found");

        p.setId(id);
        return playerRepository.save(p);
    }

    @Transactional
    public void updateTitles(int id, int titles) {
        Optional<Player> tempPlayer = playerRepository.findById(id);

        if(tempPlayer.isEmpty())
            throw new PlayerNotFoundException
                    ("Player with id {"+ id +"} not found");

        playerRepository.updateTitles(id, titles);
    }

    public void deletePlayer(int id) {
        Optional<Player> tempPlayer = playerRepository.findById(id);

        if(tempPlayer.isEmpty())
            throw new PlayerNotFoundException
                    ("Player with id {"+ id +"} not found");

        playerRepository.delete(tempPlayer.get());
    }

    public Player partialUpdate( int id, Map<String, Object> partialPlayer) {
        Optional<Player> player = playerRepository.findById(id);

        if(player.isPresent()) {
            partialPlayer.forEach( (key, value) -> {
                System.out.println("Key: " + key + " Value: " + value);
                Field field = ReflectionUtils.findField(Player.class, key);
                ReflectionUtils.makeAccessible(field);
                ReflectionUtils.setField(field, player.get(), value);
            });
        }
        else
            throw new PlayerNotFoundException
                    ("Player with id {"+ id +"} not found");

        return playerRepository.save(player.get());
    }
}

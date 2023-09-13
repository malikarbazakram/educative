package io.datajek.tennisplayerrest.player;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Tennis Player REST API";
    }

    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable("id") int playerId)
    {
        return playerService.getPlayerByID(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player)
    {
        player.setId(0);

        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{id}")
    public Player updatePlayer
            (@PathVariable ("id") int playerId ,
             @RequestBody Player player)
    {
        return playerService.updatePlayer(playerId, player);
    }

    @PatchMapping("/players/{id}")
    public Player partialUpdate(@PathVariable ("id") int playerId,
                    @RequestBody Map<String, Object> playerPatch)
    {
        return playerService.partialUpdate(playerId, playerPatch);
    }

    @PatchMapping("/players/{id}/titles")
    public void updateTitles(@PathVariable("id") int playerId, @RequestBody int titles)
    {
        playerService.updateTitles(playerId,titles);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer (@PathVariable ("id") int playerId)
    {
        playerService.deletePlayer(playerId);
    }

}
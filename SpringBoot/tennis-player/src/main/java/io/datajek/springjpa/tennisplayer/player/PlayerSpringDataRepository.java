package io.datajek.springjpa.tennisplayer.player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSpringDataRepository
         extends JpaRepository <Player, Integer>{
    //no implementation required!

}
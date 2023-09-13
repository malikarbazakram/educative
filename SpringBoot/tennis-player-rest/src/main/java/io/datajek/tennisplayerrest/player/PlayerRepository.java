package io.datajek.tennisplayerrest.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="athletes")
public interface  PlayerRepository extends
        JpaRepository <Player, Integer> {

    @Modifying
    @Query ("update Player p set p.titles = :titles where p.id = :id")
    void updateTitles(@Param("id") int id,
                      @Param("titles") int titles);

}

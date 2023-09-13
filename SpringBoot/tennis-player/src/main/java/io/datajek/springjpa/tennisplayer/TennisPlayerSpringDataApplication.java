package io.datajek.springjpa.tennisplayer;


import io.datajek.springjpa.tennisplayer.player.Player;
import io.datajek.springjpa.tennisplayer.player.PlayerSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class TennisPlayerSpringDataApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerSpringDataRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerSpringDataApplication.class, args);
	}

	//Insert
//	@Override
//	public void run(String... args) throws Exception {
//
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
//
//		logger.info("\n\n>> Player with id 2: {}\n", repo.getPlayerById(2));
//	}

	//Update
//	@Override
//	public void run(String... args) throws Exception {
//		//insert players
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
//				new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
//				new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
//				new Player("Thiem", "Austria",
//						new Date(System.currentTimeMillis()), 17)));
//		//update player
//		logger.info("\n\n>> Updating Player with Id 3: {}\n", repo.updatePlayer(
//				new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
//		//get player
//		logger.info("\n\n>> Player with id 3: {}\n", repo.getPlayerById(3));
//	}

	//Delete
//	@Override
//	public void run(String... args) throws Exception {
//		//insert players
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
//				new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
//				new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
//		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
//				new Player("Thiem", "Austria",
//						new Date(System.currentTimeMillis()), 17)));
//		//update player
//		logger.info("\n\n>> Updating Player with Id 3: {}\n", repo.updatePlayer(
//				new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
//		//get player
//		logger.info("\n\n>> Player with id 3: {}\n", repo.getPlayerById(3));
//		//delete player
//		repo.deleteById(2);
//	}

	//Get ALL
	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting Player: {}", repo.insertPlayer(new Player(
				"Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
		logger.info("Inserting Player: {}", repo.insertPlayer(new Player(
				"Monfils", "France", Date.valueOf("1986-09-01"), 10)));
		logger.info("Inserting Player: {}", repo.insertPlayer(new Player(
				"Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
		logger.info("All Players Data: {}", repo.getAllPlayers());
	}
}
package io.datajek.springdata.tennisplayer;

import io.datajek.springdata.tennisplayer.player.PlayerDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class TennisPlayerApplication2 {
//
//	public static void main(String[] args) {
//		SpringApplication.run(TennisPlayerApplication2.class, args);
//	}
//
//}


@SpringBootApplication
public class TennisPlayerApplication1 implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerDao dao;

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication1.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		logger.info("All Players Data: {}", dao.getAllPlayers());
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		//logger.info("All Players Data: {}", dao.getAllPlayers());
//		logger.info("Player with Id 3: {}", dao.getPlayerById(3));
//	}

//	@Override
//	public void run(String... args) throws Exception
//	{
//		logger.info("Inserting Player 4: {}", dao.insertPlayer(
//				new Player(4, "Thiem", "Austria",
//						new Date(System.currentTimeMillis()),
//						17 )));
//		logger.info("All Players Data: {}", dao.getAllPlayers());
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		//Inserting a player
//		logger.info("Inserting Player 4: {}", dao.insertPlayer(
//				new Player(4, "Thiem", "Austria",
//						new Date(System.currentTimeMillis()), 17)));
//
//		//Updating a player
//		logger.info("Updating Player with Id 4: {}",  dao.updatePlayer(
//				new Player(4, "Thiem", "Austria",
//						new Date(System.currentTimeMillis()), 17)));
//
//		//View player by Id
//		logger.info("Players with Id 4: {}", dao.getPlayerById(4));
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		logger.info("Deleting Player with Id 2: {}", dao.deletePlayerById(2));
//		logger.info("All Players Data: {}", dao.getAllPlayers());
//	}

//	@Override
//	public void run(String... args) throws Exception {
//		dao.createTournamentTable();
//}

//	@Override
//	public void run(String... args) throws Exception {
//		logger.info("French Players: {}", dao.getPlayerByNationality("France"));
//	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("French Players: {}", dao.getPlayerByNationality("France"));
	}
}

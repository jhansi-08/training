package com.ey.test;

 

import static org.junit.jupiter.api.Assertions.assertEquals;

 

import java.util.List;

 

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

 

import com.ey.dao.TeamPlayerDao;
import com.ey.entity.Player;
import com.ey.entity.Team;

 

public class TestTeamPlayerDao {

 

	private static TeamPlayerDao dao;

 

	@BeforeAll
	public static void init() {
		dao = new TeamPlayerDao();
	}

 

	@Test
	public void testSaveTeam() {
		Team team = new Team();
		team.setTeamName("Chicago Bulls");
		team.setTeamId(230);
		dao.addTeam(team);
	}

	@Test
	public void testSavePlayer() {
		Player p = new Player();
		p.setPlayerName("Astro");
		p.setExpertise("Attacker");
		p.setJerseyNo(45);
		dao.addPlayer(p, 230);
	}

 

	@Test
	public void testFindDept() {
		Team team = dao.findTeam(230);
		System.out.println(team);
		team.getPlayers().forEach(System.out::println);
	}

 

	@Test
	public void testRemove() {
		dao.removeTeam(230);
	}

	@Test
	public void testRemovePla() {
		dao.removePlayer(0);
	}

	@Test
	public void testList() {
		List<Player> players = dao.list();
		assertEquals(1, players.size());
	}
	
	
}
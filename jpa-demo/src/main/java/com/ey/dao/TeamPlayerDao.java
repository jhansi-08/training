package com.ey.dao;

 

import java.util.List;

 

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

 

import com.ey.entity.Player;
import com.ey.entity.Team;

 

public class TeamPlayerDao {

	private EntityManagerFactory factory;

	public TeamPlayerDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public int addTeam(Team t) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(t);
		txn.commit();
		em.close();
		return t.getTeamId();
	}

	public int addPlayer(Player e, int teamId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Team t = em.find(Team.class, teamId);
		e.setTeam(t);
		em.persist(e);
		txn.commit();
		em.close();
		return e.getJerseyNo();
	}

	public void removeTeam(int teamId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Team t = em.find(Team.class, teamId);
		em.remove(t);
		txn.commit();
		em.close();
	}

	public void removePlayer(int jerseyNo) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		Player t = em.find(Player.class, jerseyNo);
		em.remove(t);
		txn.commit();
		em.close();
	}


	public Team findTeam(int teamId) {
		EntityManager em = factory.createEntityManager();
		Team t = em.find(Team.class, teamId);
		return t;

	}

	public Player findEmp(int jerseyNo) {
		EntityManager em = factory.createEntityManager();
		return em.find(Player.class, jerseyNo);
	}

	public List<Player> list(){
		EntityManager em = factory.createEntityManager();
		Query que = em.createQuery("from Player");
		return que.getResultList();
	}
}
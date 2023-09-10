package com.ey.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

@Entity

public class Player {

	@Id

	@Column(name = "jersey")

	private int jerseyNo;

	@Column(name = "Player_name", length = 20)

	private String playerName;

	@Column(length = 20)

	private String expertise;

	@ManyToOne

	@JoinColumn(name = "team_id")

	private Team team;

	public Player() {

		super();

		// TODO Auto-generated constructor stub

	}

	public Player(int jerseyNo, String playerName, String expertise, Team team) {

		super();

		this.jerseyNo = jerseyNo;

		this.playerName = playerName;

		this.expertise = expertise;

		this.team = team;

	}

	@Override

	public String toString() {

		return "Players [jerseyNo=" + jerseyNo + ", playerName=" + playerName + ", expertise=" + expertise + ", team="

				+ team + "]";

	}

	public int getJerseyNo() {

		return jerseyNo;

	}

	public void setJerseyNo(int jerseyNo) {

		this.jerseyNo = jerseyNo;

	}

	public String getPlayerName() {

		return playerName;

	}

	public void setPlayerName(String playerName) {

		this.playerName = playerName;

	}

	public String getExpertise() {

		return expertise;

	}

	public void setExpertise(String expertise) {

		this.expertise = expertise;

	}

	public Team getTeam() {

		return team;

	}

	public void setTeam(Team team) {

		this.team = team;

	}

}

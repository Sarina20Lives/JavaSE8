/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarina20lives.soccerapp;

/**
 *
 * @author sarina
 */
public class Goal {
  public Team theTeam;
  public Player thePlayer;
  public double theTime;
  
  public Goal(){}
  
  public Goal(Team team, Player player, double time){
      this.theTeam = team;
      this.thePlayer = player;
      this.theTime = time;
  }
}

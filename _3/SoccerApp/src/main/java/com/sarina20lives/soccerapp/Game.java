/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarina20lives.soccerapp;

import com.sarina20lives.soccerapp.utilities.GameUtils;

/**
 *
 * @author sarina
 */
public class Game {
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame(int maxGoals){
        int numberOfGoals = (int)(Math.random()*(maxGoals+1));
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
        GameUtils.addGameGoals(this);
    }
    
    public String getDescription(){
        int homeTeamGoals = 0;
        int awayTeamGoals = 0;     
        
        StringBuilder returnString = new StringBuilder();
        returnString.append(homeTeam.getTeamName()).append(" vs. ").append(awayTeam.getTeamName()).append("\n");
        for(Goal currGoal: this.goals){
            if(currGoal.theTeam == homeTeam){
                homeTeamGoals++;
                homeTeam.incGoalsTotal(1);
            }else{
                awayTeamGoals++;
                awayTeam.incGoalsTotal(1);
            }
            returnString.append("Goal scored after ")
                    .append(currGoal.theTime)
                    .append(" mins by ")
                    .append(currGoal.thePlayer.playerName)
                    .append(" of ")
                    .append(currGoal.theTeam.getTeamName())
                    .append("\n");
        }
        if(homeTeamGoals == awayTeamGoals){
            returnString.append("It's a draw!");
            homeTeam.incPointsTotal(1);
            awayTeam.incPointsTotal(1);
        }else if(homeTeamGoals > awayTeamGoals){
            returnString.append(homeTeam.getTeamName()).append(" win");
            homeTeam.incPointsTotal(2);
        }else{
            returnString.append(awayTeam.getTeamName()).append(" win");
            awayTeam.incPointsTotal(2);
        }
        
        returnString.append(" (").append(homeTeamGoals).append(" - ").append(awayTeamGoals).append(") \n");
        
        return returnString.toString();
    }
}

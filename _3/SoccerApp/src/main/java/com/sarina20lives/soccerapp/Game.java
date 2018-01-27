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
    
    public void playGame(){
        GameUtils.addGameGoals(this);
    }
    
    public String getDescription(){
        StringBuilder returnString = new StringBuilder();
        for(Goal currGoal: this.goals){
            returnString.append("Goal scored after ")
                    .append(currGoal.theTime)
                    .append(" mins by ")
                    .append(currGoal.thePlayer.playerName)
                    .append(" of ")
                    .append(currGoal.theTeam.teamName);
        }
        return returnString.toString();
    }
}

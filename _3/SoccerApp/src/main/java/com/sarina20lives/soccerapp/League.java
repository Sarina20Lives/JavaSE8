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
public class League {
    public static void main(String[] args){
        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];
        
//        Goal goal01 = new Goal();
//        goal01.thePlayer = currGame.homeTeam.playerArray[2];
//        goal01.theTeam = currGame.homeTeam;
//        goal01.theTime = 55;
        
//        Goal[] theGoals = {goal01};
//        currGame.goals = theGoals;
        
        int numberOfGoals = (int)(Math.random()*7);
//        System.out.println(numberOfGoals);

        Goal[] theGoals = new Goal[numberOfGoals];
        currGame.goals = theGoals;
        currGame.playGame();
        System.out.println(currGame.getDescription());
        
        
//        System.out.println("Goal scored after " +
//                currGame.goals[0].theTime + " mins by " +
//                currGame.goals[0].thePlayer.playerName + " of " +
//                currGame.goals[0].theTeam.teamName);
    }
    
    public static Team[] createTeams(){
        Player player01 = new Player();
        player01.playerName = "George Eliot";
        Player player02 = new Player();
        player02.playerName = "Graham Greene";
        Player player03 = new Player();
        player03.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = {player01, player02, player03};
        Team team01 = new Team();
        team01.teamName = "The Greens";
        team01.playerArray = thePlayers;
      
        Team team02 = new Team();
        team02.teamName = "The Reds";
        team02.playerArray = new Player[3];
        team02.playerArray[0] = new Player();
        team02.playerArray[0].playerName="Robert Service";
        team02.playerArray[1] = new Player();
        team02.playerArray[1].playerName="Robbie Burns";
        team02.playerArray[2] = new Player();
        team02.playerArray[2].playerName="Rafael Sabatini";

        Team[] theTeams = {team01, team02};
        return theTeams;
    }

    public static Game[] createGames(Team[] theTeams){
        Game theGame = new Game();
        theGame.homeTeam=theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }
}

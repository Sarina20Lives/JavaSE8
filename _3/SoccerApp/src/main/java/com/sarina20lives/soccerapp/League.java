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
        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);
        Game currGame = theGames[0];
        currGame.playGame(6);
        System.out.println(currGame.getDescription());
    }
    
    public Team[] createTeams(){
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

    public Game[] createGames(Team[] theTeams){
        Game theGame = new Game();
        theGame.homeTeam=theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game[] theGames = {theGame};
        return theGames;
    }
}

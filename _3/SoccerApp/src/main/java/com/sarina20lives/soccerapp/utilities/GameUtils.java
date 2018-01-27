/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarina20lives.soccerapp.utilities;

import com.sarina20lives.soccerapp.Game;
import com.sarina20lives.soccerapp.Goal;
import com.sarina20lives.soccerapp.Player;
import com.sarina20lives.soccerapp.Team;

/**
 *
 * @author sarina
 */
public class GameUtils {
    
    public static void addGameGoals(Game currGame){
        Team elegido;
        Player jugador;
        int team, player;
        
        for(int i=0; i<currGame.goals.length ; i++){
            team = (int)(Math.random()*1);
            if(team==0)
                elegido = currGame.homeTeam;
            else
            elegido = currGame.awayTeam;
            player = (int)(Math.random()*(elegido.playerArray.length-1));
            jugador = elegido.playerArray[player];
            currGame.goals[i] = new Goal(elegido, jugador, Math.random()*91);
        }
    }
    
}

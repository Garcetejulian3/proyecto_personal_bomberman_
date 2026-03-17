package com.desarrollo_game.juego_boberman_proyect.controller;

import com.desarrollo_game.juego_boberman_proyect.model.Player;
import com.desarrollo_game.juego_boberman_proyect.view.PlayerView;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class InputController {

    public InputController(Scene scene, Player player, PlayerView view){

        scene.setOnKeyPressed(event ->{
            if(event.getCode() == KeyCode.W){
                player.moveUp();
            }

            if(event.getCode() == KeyCode.S){
                player.moveDown();
            }

            if(event.getCode() == KeyCode.A){
                player.moveLeft();
            }

            if(event.getCode() == KeyCode.D){
                player.moveRight();
            }

            view.updatePosition();
        });
    }

}

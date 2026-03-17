package com.desarrollo_game.juego_boberman_proyect.game;

import com.desarrollo_game.juego_boberman_proyect.controller.InputController;
import com.desarrollo_game.juego_boberman_proyect.model.GameMap;
import com.desarrollo_game.juego_boberman_proyect.model.Player;
import com.desarrollo_game.juego_boberman_proyect.view.MapView;
import com.desarrollo_game.juego_boberman_proyect.view.PlayerView;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

// Clase para representar el juego en si mismo
public class Game {

    // Variable root tipo Pane = sera el contenedor principal donde se dibujara el juego
    private Pane root;

    // El constructor
    // Se ejecuta cuando haces: Game game = new Game();
    // Lo que hace es Crear el Pane principal del juego.
    public Game(Scene scene){
        root = new Pane();

        // MAPA
        GameMap gameMap = new GameMap();
        MapView mapView = new MapView(gameMap);

        Rectangle[][] tiles = mapView.createMap();

        for (Rectangle[] row : tiles){
            for (Rectangle tile : row){
                root.getChildren().add(tile);
            }
        }

        // JUGADOR
        Player player = new Player(1,1);
        PlayerView playerView = new PlayerView(player);

        root.getChildren().add(playerView.getNode());

        // INPUT
        new InputController(scene,player,playerView);
    }

    // Metodo para devolver para devolver el Pane del juego
    /*
    * Por qué?
    * Porque desde otra clase vas a necesitar agregarlo a la Scene de JavaFX.
    * */
    public Pane getRoot(){
        return root;
    }
}
/*
En palabras simples
Esta clase hace solo una cosa por ahora:
Crear el contenedor donde se dibujará todo el juego
Es básicamente la base del mundo del juego.

Ventana = edificio del teatro
Scene = escenario
Pane (root) = el suelo del escenario
*/
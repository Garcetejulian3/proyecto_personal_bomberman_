package com.desarrollo_game.juego_boberman_proyect;

import com.desarrollo_game.juego_boberman_proyect.game.Game;
import com.desarrollo_game.juego_boberman_proyect.util.Constants;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
* Stage = ventana
* Scene = contenido
* Pane = contenedor
* */
public class main extends Application {
    @Override
    public void start(Stage stage) throws Exception {



        // Creando contenido/escena y agregando las caracteristicas de este contenido
        Scene scene = new Scene(new Pane(),
                Constants.WINDOW_WIDTH,
                Constants.WINDOW_HEIGHT);

        // Logica principal del juego
        Game game = new Game(scene);

        scene.setRoot(game.getRoot());

        // Agregando el titulo a la ventana
        stage.setTitle("Mini Bomberman");
        // Agregando el contenido/escena a la ventana
        stage.setScene(scene);
        // mostrando la ventana
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }

}

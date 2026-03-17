package com.desarrollo_game.juego_boberman_proyect.view;

import com.desarrollo_game.juego_boberman_proyect.model.Player;
import com.desarrollo_game.juego_boberman_proyect.util.Constants;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PlayerView {
    // objeto logico
    private Player player;
    // objeto visual
    private Circle node;

    // Constructor de ambos
    public PlayerView(Player player) {
        this.player = player;

        double radius = Constants.TITLE_SIZE / 2.0; // radio = mitad del tile = 20px
        node = new Circle(radius, Color.WHITE); // Circle solo necesita radio y color

        updatePosition();
    }

    public void updatePosition(){
        // Circle se posiciona por su CENTRO, no por esquina superior izquierda
        node.setCenterX(player.getX() * Constants.TITLE_SIZE + Constants.TITLE_SIZE / 2.0);
        node.setCenterY(player.getY() * Constants.TITLE_SIZE + Constants.TITLE_SIZE / 2.0);
    }

    public Player getPlayer() {
        return player;
    }

    public Circle getNode() {
        return node;
    }
}

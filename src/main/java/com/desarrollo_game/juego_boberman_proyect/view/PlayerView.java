package com.desarrollo_game.juego_boberman_proyect.view;

import com.desarrollo_game.juego_boberman_proyect.model.Player;
import com.desarrollo_game.juego_boberman_proyect.util.Constants;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PlayerView {
    // objeto logico
    private Player player;
    // objeto visual
    private Rectangle node;

    // Constructor de ambos
    public PlayerView(Player player) {
        this.player = player;

        node = new Rectangle(
                Constants.TITLE_SIZE,
                Constants.TITLE_SIZE,
                Color.WHITE
        );

        updatePosition();
    }

    public void updatePosition(){
        node.setX(player.getX() * Constants.TITLE_SIZE);
        node.setY(player.getY() * Constants.TITLE_SIZE);
    }

    public Player getPlayer() {
        return player;
    }

    public Rectangle getNode() {
        return node;
    }
}

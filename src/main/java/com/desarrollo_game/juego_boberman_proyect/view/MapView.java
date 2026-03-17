package com.desarrollo_game.juego_boberman_proyect.view;

import com.desarrollo_game.juego_boberman_proyect.model.GameMap;
import com.desarrollo_game.juego_boberman_proyect.util.Constants;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MapView {
    private GameMap gameMap;

    public MapView(GameMap gameMap){
        this.gameMap = gameMap;
    }

    public Rectangle[][] createMap(){
        int[][] map = gameMap.getMap(); // creo matriz con el valor del mapa(matriz/mapa)
        Rectangle[][] tiles = new Rectangle[map.length][map[0].length]; // creo Rectangle matriz
        // filas = map cantidad de elementos obtenidos
        // columnas = map [0=primera columna] length cantidad de elementos obtenidos

        /*
        Este código recorre todo el mapa
        for filas
        for columnas
        Y crea un rectángulo para cada tile.
        */
        for (int row = 0;row < map.length;row++){
        // recorro las filas
            for (int col = 0;col < map[row].length;col++){
            // recorro las columnas
                Rectangle tile = new Rectangle(
                        col * Constants.TITLE_SIZE, //X = columna * TILE_SIZE
                        row * Constants.TITLE_SIZE, //Y = fila * TILE_SIZE
                        Constants.TITLE_SIZE,
                        Constants.TITLE_SIZE
                );
                /*
                Ejemplo:
                tile 0,0 -> 0px
                tile 1,0 -> 40px
                tile 2,0 -> 80px
                 */

                if(map[row][col]==1){
                    // si map[fila donde este ][columna donde este ] es igual a 1 setea el tile de color verde
                    tile.setFill(Color.DARKGREY);
                }else {
                    // si map[fila donde este ][columna donde este ] es lo contrario osea 0 setea el tile de color gris
                    tile.setFill(Color.DARKGREEN);
                }
                // tiles[row][col] = en la matriz tiles lugar [row][col] osea [fila donde este en el for] [columna donde este en el for]
                // asignate ese Rectangle llamado tile
                tiles[row][col] = tile;
            }
        }
        return tiles;
    }

}

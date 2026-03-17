package com.desarrollo_game.juego_boberman_proyect.model;
/*
🧱 🧱 🧱 🧱 🧱
🧱 ⬜ ⬜ ⬜ 🧱
🧱 ⬜ 🧱 ⬜ 🧱
🧱 ⬜ ⬜ ⬜ 🧱
🧱 🧱 🧱 🧱 🧱

Cada celda se llama:
TILE

Los juegos normalmente guardan el mapa así:
int[][] mapa

1 1 1 1 1
1 0 0 0 1
1 0 1 0 1
1 0 0 0 1
1 1 1 1 1

Donde:
0 = piso
1 = muro

*/
public class GameMap {

    // int [][] map significa mapa bidimensional
    // visualmente map[filas][columnas]

    /* ejemplo
    map[0][0] = esquina superior izquierda
    map[1][2] = fila 2 columna 3
     */

    private int [][] map={
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
    };

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }
}

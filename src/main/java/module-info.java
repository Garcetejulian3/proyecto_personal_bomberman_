module com.desarrollo_game.juego_boberman_proyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.desarrollo_game.juego_boberman_proyect to javafx.fxml;
    exports com.desarrollo_game.juego_boberman_proyect;
}
module ru.polkovnikova.polkovnikova_task21 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task21 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task21;
}
module ru.polkovnikova.polkovnikova_task23 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task23 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task23;
}
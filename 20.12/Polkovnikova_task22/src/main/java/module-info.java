module ru.polkovnikova.polkovnikova_task22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.polkovnikova.polkovnikova_task22 to javafx.fxml;
    exports ru.polkovnikova.polkovnikova_task22;
}
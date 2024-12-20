package ru.polkovnikova.polkovnikova_task26;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button BTN;

    @FXML
    private Label lbl;

    @FXML
    private TextField txtN;

    @FXML
    void BTNOnAction(ActionEvent event) {
        int N = Integer.parseInt(txtN. getText(). toString());
        if (N <= 0) {
            lbl.setText("N должно быть больше 0");
        }
            boolean Seven = false;
            while (N > 0) {
                if (N % 10 == 7) {
                    Seven = true;
                    break;
                }
                N /= 10;
            }
        lbl.setText(String.valueOf(Seven));
    }

}

package ru.polkovnikova.polkovnikova_task24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button Btn;

    @FXML
    private TextField Ntxt;

    @FXML
    private Label lbl;

    @FXML
    void BtnOnAction(ActionEvent event) {
        int N = Integer.parseInt(Ntxt.getText().toString());
        int k = 0;
        while ((k + 1) * (k + 1) <= N) {
            k++;
        }
            lbl.setText("наибольшее число K=" + k);
        }

    }

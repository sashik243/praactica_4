package ru.polkovnikova.polkovnikova_task25;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button BTN;
    private final double INITIAL_DEPOSIT = 1000;
    private final double TARGET_DEPOSIT = 1100;

    @FXML
    private Label lblM;

    @FXML
    private Label lblN;

    @FXML
    private Label lblR;

    @FXML
    private TextField txtP;

    @FXML
    void BTNOnAction(ActionEvent event) {
        double P = Double.parseDouble(txtP.getText().toString());
        if (P <= 0 || P >= 25) {
            lblR.setText("Процентная ставка должна быть в диапазоне (0 - 25)");
        }
            double CD = INITIAL_DEPOSIT;
            int k = 0;
            while(CD <=TARGET_DEPOSIT) {
                CD = CD + (CD * P / 100);
                k++;
            }
                lblM.setText ("Месяцев: "+k);
                lblN.setText("Итоговая сумма"+CD);
    }}



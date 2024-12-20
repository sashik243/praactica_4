package ru.polkovnikova.polkovnikova_task21;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button calculatButton;

    @FXML
    private Label lblD;

    @FXML
    private Label lblM;

    @FXML
    private TextField txtd;

    @FXML
    private TextField txtm;

    @FXML
    void calculatButtonOnAction(ActionEvent event) {
        System.out.print("Введите день: ");
        int day = Integer.parseInt(txtd.getText().toString());
        System.out.print("Введите месяц: ");
        int month = Integer.parseInt(txtm.getText().toString());

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day == 1) {
                    month--;
                    day = 31;
                } else {
                    day--;
                    month--;
                }

            lblD.setText(""+day);
            lblM.setText(""+month);
            break;
            case 4: case 6: case 9: case 11:
                if (day == 1) {
                    month--;
                    day = 30;
                } else {
                    day--;
                    month--;
                }
                lblD.setText(""+day);
                lblM.setText(""+month);
                break;
            case 2:
                if (day == 1) {
                    month--;
                    day = 28;
                } else {
                    day--;
                    month--;
                }
                lblD.setText(""+day);
                lblM.setText(""+month);
                break;
        }

        System.out.println("Предыдущая дата: " + day + "." + month);
    }
}
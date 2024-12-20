package ru.polkovnikova.polkovnikova_task23;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SumController {

    @FXML
    private Button ButtonCalculate;

    @FXML
    private Label lblD;

    @FXML
    private Label lblL;

    @FXML
    private Label lblR;

    @FXML
    private Label lblS;

    @FXML
    private TextField txtE;

    @FXML
    private TextField txtN;

    @FXML
    private Label txtZ;

    @FXML
    void ButtonCalculateOnAction(ActionEvent event) {

        int Num = Integer.parseInt(txtN .getText().toString());
        int Value = Integer .parseInt(txtE.getText(). toString());
        if (Num<1 || Num>4) {
        }

        double Radius =1, Diametr = 1,   Length = 1,Area = 1;
        switch (Num) {
            case 1:
                Radius = Value;
                Diametr = 2 * Radius;
                Length = 2 * 3.14 * Radius;
                Area = 3.14 * pow(Radius, 2);
                break;
            case 2:
                Diametr = Value;
                Radius = Diametr / 2;
                Length = 2 * 3.14 * Radius;
                Area = 3.14 * pow(Radius, 2);
                break;
            case 3:
                Length = Value;
                Radius = Length / (2 * 3.14);
                Diametr = 2 * Radius;
                Area = 3.14 *pow(Radius, 2);
                break;
            case 4:
                Area = Value;
                Radius = sqrt(Area / 3.14);
                Diametr = 2 * Radius;
                Length = 2 * 3.14 * Radius;
                break;
        }
                lblR.setText("радиус=" + Radius);
                lblD.setText ("Диаметр=" + Diametr);
                lblL.setText("длина=" + Length);
                lblS.setText("площадь=" + Area);
        }}







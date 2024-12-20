package ru.polkovnikova.polkovnikova_task22;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class SumController {

    @FXML
    private Button ResultButton;

    @FXML
    private TextField txtA;

    @FXML
    private Label txtB;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        int age = Integer.parseInt(txtA.getText());
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст (от 20 до 69): ");

        if (age < 20 || age > 69) {
            System.out.println("Введите корректный возраст от 20 до 69");
        } else {
            String description;
            int units = age % 10;
            int tens = age / 10;

            switch (tens) {
                case 2:
                    description = "двадцать";
                    txtB.setText(""+description);
                    break;
                case 3:
                    description = "тридцать";
                    txtB.setText(""+description);
                    break;
                case 4:
                    description = "сорок";
                    txtB.setText(""+description);
                    break;
                case 5:
                    description = "пятьдесят";
                    txtB.setText(""+description);
                    break;
                case 6:
                    description = "шестьдесят";
                    txtB.setText(""+description);
                    break;
                default:
                    description = "";
                    txtB.setText(""+description);
                    break;
            }

            switch (units) {
                case 1:
                    description += " один год";
                    txtB.setText(""+description);
                    break;
                case 2:
                    description += " два года";
                    txtB.setText(""+description);
                    break;
                case 3:
                    description += " три года";
                    txtB.setText(""+description);
                    break;
                case 4:
                    description += " четыре года";
                    txtB.setText(""+description);
                    break;
                case 5:
                    description += " пять лет";
                    txtB.setText(""+description);
                    break;
                case 6:
                    description += " шесть лет";
                    txtB.setText(""+description);
                    break;
                case 7:
                    description += " семь лет";
                    txtB.setText(""+description);
                    break;
                case 8:
                    description += " восемь лет";
                    txtB.setText(""+description);
                    break;
                case 9:
                    description += " девять лет";
                    txtB.setText(""+description);
                    break;
                default:
                    description += " лет";
                    txtB.setText(""+description);
                    break;
            }

            System.out.println(age + " - \"" + description + "\"");
        }
    }
}


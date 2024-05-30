package com.example.softwarejavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField operando1;
    @FXML
    private TextField operando2;
    @FXML
    private Label ris;

    @FXML
    protected void piu() {
        int risultato = Integer.parseInt(operando1.getText()) + Integer.parseInt(operando2.getText());
        ris.setText("" + risultato);
    }
    @FXML
    protected void meno() {
        int risultato = Integer.parseInt(operando1.getText()) - Integer.parseInt(operando2.getText());
        ris.setText("" + risultato);
    }
    @FXML
    protected void per() {
        int risultato = Integer.parseInt(operando1.getText()) * Integer.parseInt(operando2.getText());
        ris.setText("" + risultato);
    }
    @FXML
    protected void div() {
        float op1 = Integer.parseInt(operando1.getText());
        float op2 = Integer.parseInt(operando2.getText());
        if (op2 == 0) {
            ris.setText("Non puoi dividere per 0");
        } else {
            float risultato = op1/op2;
            ris.setText("" + risultato);
        }
    }
}
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
        String operatore1 = operando1.getText();
        String operatore2 = operando2.getText();
        int risultato = Integer.parseInt(operatore1 + operatore2);
        ris.setText("" + risultato);
    }
}
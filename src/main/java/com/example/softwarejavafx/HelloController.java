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
        Integer op1 = Integer.getInteger(operando1.getText());
        Integer op2 = Integer.getInteger(operando2.getText());
        int risultato = op1 + op2;
        ris.setText("" + risultato);
    }
}
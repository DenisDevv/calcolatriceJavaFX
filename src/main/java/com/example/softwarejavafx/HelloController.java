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
}
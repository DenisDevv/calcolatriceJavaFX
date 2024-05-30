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
        if(controllo(operando1.getText(), operando2.getText())){
            int risultato = Integer.parseInt(operando1.getText()) + Integer.parseInt(operando2.getText());
            ris.setText("" + risultato);
        }
    }
    @FXML
    protected void meno() {
        if(controllo(operando1.getText(), operando2.getText())) {
            int risultato = Integer.parseInt(operando1.getText()) - Integer.parseInt(operando2.getText());
            ris.setText("" + risultato);
        }
    }
    @FXML
    protected void per() {
        if(controllo(operando1.getText(), operando2.getText())) {
            int risultato = Integer.parseInt(operando1.getText()) * Integer.parseInt(operando2.getText());
            ris.setText("" + risultato);
        }
    }
    @FXML
    protected void div() {
        if(controllo(operando1.getText(), operando2.getText())) {
            float op1 = Integer.parseInt(operando1.getText());
            float op2 = Integer.parseInt(operando2.getText());
            if (op2 == 0) {
                ris.setText("Non puoi dividere per 0");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Errore");
                alert.setHeaderText("Errore Divisione");
                alert.setContentText("Non puoi dividere per 0");
                alert.showAndWait();
            } else {
                float risultato = op1 / op2;
                ris.setText("" + risultato);
            }
        }
    }
    public boolean controllo(String op1, String op2) {
        if (op1.isEmpty() || op2.isEmpty()) {
            ris.setText("Inserisci entrambi gli operandi");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore");
            alert.setHeaderText("Errore Operazione");
            alert.setContentText("Inserisci entrambi gli operandi");
            alert.showAndWait();
            return false;
        }
        return true;
    }
}
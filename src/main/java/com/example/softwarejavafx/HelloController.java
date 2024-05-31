package com.example.softwarejavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class HelloController {
    ArrayList operazioni = new ArrayList();
    int passaggi = 0;
    @FXML
    private Label operazione;
    @FXML
    private Label ris;

    // Operazioni Utente
    public void testo() {
        operazione.setText(String.join("", operazioni));
    }
    public void sePrimo() {
        if (passaggi == 0) {
            operazioni.clear();
            testo();
        }
    }

    // Numeri
    @FXML
    protected void uno() {
        passaggi++;
        sePrimo();
        operazioni.add("1");
        testo();
    }
    @FXML
    protected void due() {
        passaggi++;
        sePrimo();
        operazioni.add("2");
        testo();
    }
    @FXML
    protected void tre() {
        passaggi++;
sePrimo();
        operazioni.add("3");
        testo();
    }
    @FXML
    protected void quattro() {
        passaggi++;
sePrimo();
        operazioni.add("4");
        testo();
    }
    @FXML
    protected void cinque() {
        passaggi++;
sePrimo();
        operazioni.add("5");
        testo();
    }
    @FXML
    protected void sei() {
        passaggi++;
sePrimo();
        operazioni.add("6");
        testo();
    }
    @FXML
    protected void sette() {
        passaggi++;
sePrimo();
        operazioni.add("7");
        testo();
    }
    @FXML
    protected void otto() {
        passaggi++;
sePrimo();
        operazioni.add("8");
        testo();
    }
    @FXML
    protected void nove() {
        passaggi++;
sePrimo();
        operazioni.add("9");
        testo();
    }
    @FXML
    protected void zero() {
        passaggi++;
sePrimo();
        operazioni.add("0");
        testo();
    }

    // Operazioni
    @FXML
    protected void somma() {
        passaggi++;
        operazioni.add("+");
        testo();
    }
    @FXML
    protected void sottrazione() {
        passaggi++;
        operazioni.add("-");
        testo();
    }
    @FXML
    protected void moltiplicazione() {
        passaggi++;
        operazioni.add("*");
        testo();
    }
    @FXML
    protected void divisione() {
        passaggi++;
        operazioni.add("/");
        testo();
    }
    @FXML
    protected void virgola() {
        passaggi++;
        operazioni.add(".");
        testo();
    }
    @FXML
    protected void cancella() {
        passaggi = 0;
        operazioni.clear();
        testo();
    }
    @FXML
    protected void cancellaUltimo() {
        if (operazioni.size() > 0) {
            operazioni.removeLast();
            passaggi--;
            testo();
        }
    }
    @FXML
    protected void radice() {
        String operazione = String.join("", operazioni);
        double num = Double.parseDouble(operazione);
        double risultato = Math.sqrt(num);
        ris.setText(String.valueOf(risultato));
        passaggi = 0;
    }
    @FXML
    protected void quadrato() {
        String operazione = String.join("", operazioni);
        double num = Double.parseDouble(operazione);
        double risultato = Math.pow(num, 2);
        ris.setText(String.valueOf(risultato));
        passaggi = 0;
    }
    @FXML
    protected void uguale() {
        String operazioni2 = String.join("", operazioni);
        String[] operazioniArray = operazioni2.split("[+\\-*/]");
        String[] operatori = operazioni2.split("[0-9]+[.]*[0-9]*");

        double risultato = Double.parseDouble(operazioniArray[0]);
        for (int i = 1; i < operazioniArray.length; i++) {
            if (operatori[i].equals("+")) {
                risultato += Double.parseDouble(operazioniArray[i]);
            } else if (operatori[i].equals("-")) {
                risultato -= Double.parseDouble(operazioniArray[i]);
            } else if (operatori[i].equals("*")) {
                risultato *= Double.parseDouble(operazioniArray[i]);
            } else if (operatori[i].equals("/")) {
                risultato /= Double.parseDouble(operazioniArray[i]);
            }
        }
        ris.setText(String.valueOf(risultato));
        operazioni.clear();
        operazioni.add(String.valueOf(risultato));
        passaggi = 0;
    }
}
package me.loule.decimaltoromannumerals.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import me.loule.decimaltoromannumerals.model.DecimalToRoman;
import me.loule.decimaltoromannumerals.model.RomanToDecimal;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField textFieldDecimal;

    @FXML
    private TextField textFieldRomainNumerals;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textFieldDecimal.setOnKeyReleased(event -> {
            if (!Objects.equals(textFieldDecimal.getText(), "") && Integer.parseInt(textFieldDecimal.getText()) <= 3999) {
                DecimalToRoman decimalToRoman = new DecimalToRoman(Integer.parseInt(textFieldDecimal.getText()));

                textFieldRomainNumerals.setText(decimalToRoman.result());
            } else {
                textFieldRomainNumerals.setText("");
            }
        });

        textFieldRomainNumerals.setOnKeyReleased(event -> {
            if (!Objects.equals(textFieldRomainNumerals.getText(), "") && textFieldRomainNumerals.getText().length() <= 3999) {
                RomanToDecimal romanToDecimal = new RomanToDecimal(textFieldRomainNumerals.getText());

                textFieldDecimal.setText(String.valueOf(romanToDecimal.result()));
            } else {
                textFieldDecimal.setText("");
            }
        });
    }
}
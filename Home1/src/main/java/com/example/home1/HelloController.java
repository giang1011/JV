package com.example.home1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField inputField;

    @FXML
    private Label displayLabel;

    @FXML
    protected void onDisplayButtonClick() {
        String inputText = inputField.getText();
        if (inputText.isEmpty()) {
            displayLabel.setText("Please enter some text!");
        } else {
            displayLabel.setText("You entered: " + inputText);
        }
    }
}

package com.example.prog5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {

    @FXML
    private RadioButton blueColor;

    @FXML
    private RadioButton blueColor1;

    @FXML
    private RadioButton blueColor11;

    @FXML
    private RadioButton greenColor;

    @FXML
    private RadioButton greenColor1;

    @FXML
    private RadioButton greenColor11;

    @FXML
    private Button paintButton;

    @FXML
    private RadioButton redColor;

    @FXML
    private RadioButton redColor1;

    @FXML
    private RadioButton redColor11;

    @FXML
    private Label result1;

    @FXML
    private Label result2;

    @FXML
    private Label result3;

    @FXML
    private RadioButton whiteColor;

    @FXML
    private RadioButton whiteColor1;

    @FXML
    private RadioButton whiteColor11;

    @FXML
    void ChooseBlue(ActionEvent event) {
        result1.setText(blueColor.getText());
    }

    @FXML
    void ChooseBlue1(ActionEvent event) {
        result2.setText(blueColor.getText());
    }

    @FXML
    void ChooseBlue2(ActionEvent event) {
        result3.setText(blueColor.getText());
    }

    @FXML
    void ChooseRed(ActionEvent event) {
        result1.setText(redColor.getText());
    }

    @FXML
    void ChooseRed1(ActionEvent event) {
        result2.setText(redColor.getText());
    }

    @FXML
    void ChooseRed2(ActionEvent event) {
        result3.setText(redColor.getText());
    }

    @FXML
    void ChooseWhite(ActionEvent event) {
        result1.setText(whiteColor.getText());
    }

    @FXML
    void ChooseWhite1(ActionEvent event) {
        result2.setText(whiteColor.getText());
    }

    @FXML
    void ChooseWhite2(ActionEvent event) {
        result3.setText(whiteColor.getText());
    }

    @FXML
    void ChoseGreen(ActionEvent event) {
        result1.setText(greenColor.getText());
    }

    @FXML
    void ChoseGreen1(ActionEvent event) {
        result2.setText(greenColor.getText());
    }

    @FXML
    void ChoseGreen2(ActionEvent event) {
        result3.setText(greenColor.getText());
    }

    @FXML
    void Paint(ActionEvent event) {
        if (!result1.isVisible()) result1.setVisible(true); else result1.setVisible(false);
        if (!result2.isVisible()) result2.setVisible(true); else result2.setVisible(false);
        if (!result3.isVisible()) result3.setVisible(true); else result3.setVisible(false);
    }

}

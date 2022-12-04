package com.example.prog2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button Button;

    @FXML
    private CheckBox CheckBox1;

    @FXML
    private CheckBox CheckBox2;

    @FXML
    private CheckBox CheckBox3;

    @FXML
    private Slider Slider;

    @FXML
    private TextField TextField;

    @FXML
    void CheckBox1Action(ActionEvent event) {
        if (CheckBox1.isSelected()) Slider.setVisible(false); else Slider.setVisible(true);
    }

    @FXML
    void CheckBox2Action(ActionEvent event) {
        if (CheckBox2.isSelected()) TextField.setVisible(false); else TextField.setVisible(true);
    }

    @FXML
    void CheckBox3Action(ActionEvent event) {
        if (CheckBox3.isSelected()) Button.setVisible(false); else Button.setVisible(true);
    }

}

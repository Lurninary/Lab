package com.example.prog3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField CountText1;
    @FXML
    private TextField CountText11;
    @FXML
    private TextField CountText2;
    @FXML
    private TextField CountText21;
    @FXML
    private TextField CountText3;
    @FXML
    private TextField CountText31;
    @FXML
    private TextField FinalPrice;
    @FXML
    private TextField FinalPrice1;
    @FXML
    private Button MinusButton1;

    @FXML
    private Button MinusButton2;

    @FXML
    private Button MinusButton3;

    @FXML
    private Button PlusButton1;

    @FXML
    private Button PlusButton2;

    @FXML
    private Button PlusButton3;

    @FXML
    private TextField Price1;
    @FXML
    private TextField Price11;
    @FXML
    private TextField Price2;
    @FXML
    private TextField Price21;
    @FXML
    private TextField Price3;
    @FXML
    private TextField Price31;
    int LPrice;
    int FPrice;
    int counter;

    @FXML
    void MinusButton1Clicked(ActionEvent event) {
        counter = Integer.parseInt(CountText1.getText());
        LPrice = Integer.parseInt(Price1.getText());
        FPrice = Integer.parseInt(FinalPrice.getText());
        LPrice-=200;
        FPrice-=200;
        counter-=1;
        if (counter>=0) {
            CountText1.setText(String.valueOf(counter));
            Price1.setText(String.valueOf(LPrice));
            FinalPrice.setText(String.valueOf(FPrice));
        }
    }

    @FXML
    void MinusButton2Clicked(ActionEvent event) {
        counter = Integer.parseInt(CountText2.getText());
        LPrice = Integer.parseInt(Price2.getText());
        FPrice = Integer.parseInt(FinalPrice.getText());
        LPrice-=100;
        FPrice-=100;
        counter-=1;
        if (counter>=0) {
            CountText2.setText(String.valueOf(counter));
            Price2.setText(String.valueOf(LPrice));
            FinalPrice.setText(String.valueOf(FPrice));
        }
    }

    @FXML
    void MinusButton3Clicked(ActionEvent event) {
        counter = Integer.parseInt(CountText3.getText());
        LPrice = Integer.parseInt(Price3.getText());
        FPrice = Integer.parseInt(FinalPrice.getText());
        LPrice-=150;
        FPrice-=150;
        counter-=1;
        if (counter>=0) {
            CountText3.setText(String.valueOf(counter));
            Price3.setText(String.valueOf(LPrice));
            FinalPrice.setText(String.valueOf(FPrice));
        }
    }

    @FXML
    void PlusButton1Clicked(ActionEvent event) {
        counter = Integer.parseInt(CountText1.getText());
        LPrice = Integer.parseInt(Price1.getText());
        FPrice = Integer.parseInt(FinalPrice.getText());
        LPrice+=200;
        FPrice+=200;
        counter+=1;
        CountText1.setText(String.valueOf(counter));
        Price1.setText(String.valueOf(LPrice));
        FinalPrice.setText(String.valueOf(FPrice));
    }

    @FXML
    void PlusButton2Clicked(ActionEvent event) {
        counter = Integer.parseInt(CountText2.getText());
        LPrice = Integer.parseInt(Price2.getText());
        FPrice = Integer.parseInt(FinalPrice.getText());
        LPrice+=100;
        FPrice+=100;
        counter+=1;
        CountText2.setText(String.valueOf(counter));
        Price2.setText(String.valueOf(LPrice));
        FinalPrice.setText(String.valueOf(FPrice));
    }

    @FXML
    void PlusButton3Clicked(ActionEvent event) {
        counter = Integer.parseInt(CountText3.getText());
        LPrice = Integer.parseInt(Price3.getText());
        FPrice = Integer.parseInt(FinalPrice.getText());
        LPrice+=150;
        FPrice+=150;
        counter+=1;
        CountText3.setText(String.valueOf(counter));
        Price3.setText(String.valueOf(LPrice));
        FinalPrice.setText(String.valueOf(FPrice));
    }

    @FXML
    void OnCheckButtonClicked(ActionEvent event) {
        CountText11.setText(CountText1.getText());
        CountText21.setText(CountText2.getText());
        CountText31.setText(CountText3.getText());
        Price11.setText(Price1.getText());
        Price21.setText(Price2.getText());
        Price31.setText(Price3.getText());
        FinalPrice1.setText(FinalPrice.getText());
    }
}

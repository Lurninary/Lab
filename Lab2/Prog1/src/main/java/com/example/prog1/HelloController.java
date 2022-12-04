package com.example.prog1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloController {

    @FXML
    private Button ArrowBotton;

    @FXML
    private TextArea Text1;

    @FXML
    private TextArea Text2;

    private String Container;

    int count=0;

    @FXML
    void OnArrowBottonClicked(ActionEvent event) {
        Container = Text2.getText();
        Text2.setText(Text1.getText());
        Text1.setText(Container);
        if (count % 2==0) ArrowBotton.setText("<-----");
        else ArrowBotton.setText("----->");
        count++;
    }

}
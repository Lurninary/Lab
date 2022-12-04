package com.example.prog4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button clearButton;

    @FXML
    private Button eighthButton;

    @FXML
    private Button equalButton;

    @FXML
    private Button fifthButton;

    @FXML
    private Button firstButton;

    @FXML
    private Button fourthButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button multiplyButton;

    @FXML
    private Button ninthButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button plusMinusButton;

    @FXML
    private Button pointButton;

    @FXML
    private Button secondButton;

    @FXML
    private Button seventhButton;

    @FXML
    private Button sixthButton;

    @FXML
    private Label textLabel;

    @FXML
    private Button thirdButton;

    @FXML
    private Button zeroButton;

    @FXML
    void initialize() {
    }

    @FXML
    public void AddZero() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(zeroButton.getText());
        } else textLabel.setText(textLabel.getText() + zeroButton.getText());
        isResult=false;
    }

    @FXML
    public void AddOne() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(firstButton.getText());
        } else textLabel.setText(textLabel.getText() + firstButton.getText());
        isResult=false;
    }

    @FXML
    public void AddTwo() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(secondButton.getText());
        } else textLabel.setText(textLabel.getText() + secondButton.getText());
        isResult=false;
    }

    @FXML
    public void AddThree() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(thirdButton.getText());
        } else textLabel.setText(textLabel.getText() + thirdButton.getText());
        isResult=false;
    }

    @FXML
    public void AddFour() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(fourthButton.getText());
        } else textLabel.setText(textLabel.getText() + fourthButton.getText());
        isResult=false;
    }

    @FXML
    public void AddFive() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(fifthButton.getText());
        } else textLabel.setText(textLabel.getText() + fifthButton.getText());
        isResult=false;
    }

    @FXML
    public void AddSix() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(sixthButton.getText());
        } else textLabel.setText(textLabel.getText() + sixthButton.getText());
        isResult=false;
    }

    @FXML
    public void AddSeven() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(seventhButton.getText());
        } else textLabel.setText(textLabel.getText() + seventhButton.getText());
        isResult=false;
    }

    @FXML
    public void AddEight() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(eighthButton.getText());
        } else textLabel.setText(textLabel.getText() + eighthButton.getText());
        isResult=false;
    }

    @FXML
    public void AddNine() {
        if (isResult) textLabel.setText("0");
        if(textLabel.getText().equals("0"))
        {
            textLabel.setText(ninthButton.getText());
        } else textLabel.setText(textLabel.getText() + ninthButton.getText());
        isResult=false;
    }

    @FXML
    public void PlusMinus() {
        double n = Double.parseDouble(textLabel.getText()) * -1;
        textLabel.setText(Double.toString(n));
    }

    @FXML
    public void Point() {
        textLabel.setText(textLabel.getText() + ".");
    }

    boolean isPlusClick = false;
    boolean isMinusClick = false;
    boolean isMultiplyClick = false;
    boolean isDivClick = false;
    boolean isResult=false;
    double result;

    @FXML
    public void Equal() {
        double secondNumber = Double.parseDouble(textLabel.getText());
        if(isPlusClick)
        {
            result = firstNumber + secondNumber;
            textLabel.setText(Double.toString(result));

        }
        else if(isMinusClick)
        {
            result = firstNumber - secondNumber;
            textLabel.setText(Double.toString(result));

        }
        else if(isMultiplyClick)
        {
            result = firstNumber * secondNumber;
            textLabel.setText(Double.toString(result));

        }
        else if(isDivClick)
        {
            if(secondNumber == 0)
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ошибка");
                alert.setHeaderText("На ноль делить нельзя");
                alert.showAndWait();
            }
            else
            {
                result = firstNumber / secondNumber;
                textLabel.setText(Double.toString(result));
            }
        }
        isResult=true;
    }

    double firstNumber = 0;

    @FXML
    public void Plus() {
        isMinusClick = false;
        isMultiplyClick = false;
        isDivClick = false;

        if(!textLabel.getText().equals("0"))
        {
            firstNumber = Double.parseDouble(textLabel.getText());
            textLabel.setText("");
            isPlusClick = true;
        }
    }

    @FXML
    public void Minus() {
        isPlusClick = false;
        isMultiplyClick = false;
        isDivClick = false;

        if(!textLabel.getText().equals("0"))
        {
            firstNumber = Double.parseDouble(textLabel.getText());
            textLabel.setText("");
            isMinusClick = true;
        }
    }

    @FXML
    public void Multiple() {
        isPlusClick = false;
        isMinusClick = false;
        isDivClick = false;

        if(!textLabel.getText().equals("0"))
        {
            firstNumber = Double.parseDouble(textLabel.getText());
            textLabel.setText("");
            isMultiplyClick = true;
        }
    }

    @FXML
    public void Div() {
        isPlusClick = false;
        isMinusClick = false;
        isMultiplyClick = false;

        if(!textLabel.getText().equals("0"))
        {
            firstNumber = Double.parseDouble(textLabel.getText());
            textLabel.setText("");
            isDivClick = true;
        }
    }

    @FXML
    public void Clear() {
        firstNumber=0;
        textLabel.setText("0");
    }
}

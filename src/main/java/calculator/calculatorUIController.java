package calculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class calculatorUIController{
    private double firstNumber = 0;
    private double secondNumber = 0;
    private String operator = "";

    @FXML
    private Button addBtn;

    @FXML
    private Button answerBtn;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button clearBtn;

    @FXML
    private Button divideBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button multiplyBtn;

    @FXML
    private Button neg_posBtn;

    @FXML
    private Button percentBtn;

    @FXML
    private Button periodBtn;

    @FXML
    private TextField txtField;


    @FXML
    void addBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            firstNumber = Double.valueOf(txtField.getText());
            operator = "+";
            txtField.clear();
        
        }

    }

    @FXML
    void answerBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            secondNumber = Double.valueOf(txtField.getText());
             txtField.setText(String.valueOf(getAnswer(operator, firstNumber, secondNumber)));
        }

    }

    @FXML
    void btn0Pressed(ActionEvent event) {
        txtField.appendText("0");

    }

    @FXML
    void btn1Pressed(ActionEvent event) {
        txtField.appendText("1");

    }

    @FXML
    void btn2Pressed(ActionEvent event) {
        txtField.appendText("2");

    }

    @FXML
    void btn3Pressed(ActionEvent event) {
        txtField.appendText("3");

    }

    @FXML
    void btn4Pressed(ActionEvent event) {
        txtField.appendText("4");

    }

    @FXML
    void btn5Pressed(ActionEvent event) {
        txtField.appendText("5");

    }

    @FXML
    void btn6Pressed(ActionEvent event) {
        txtField.appendText("6");

    }

    @FXML
    void btn7Pressed(ActionEvent event) {
        txtField.appendText("7");

    }

    @FXML
    void btn8Pressed(ActionEvent event) {
        txtField.appendText("8");

    }

    @FXML
    void btn9Pressed(ActionEvent event) {
        txtField.appendText("9");

    }

    @FXML
    void clearBtnPressed(ActionEvent event) {
        txtField.clear();
        firstNumber = 0;
        secondNumber = 0;

    }

    @FXML
    void divideBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            firstNumber = Double.valueOf(txtField.getText());
            operator = "/";
            txtField.clear();
        
        }

    }

    @FXML
    void minusBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            firstNumber = Double.valueOf(txtField.getText());
            operator = "-";
            txtField.clear();
        
        }

    }

    @FXML
    void multiplyBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            firstNumber = Double.valueOf(txtField.getText());
            operator = "*";
            txtField.clear();
        
        }

    }

    @FXML
    void neg_posBtnPressed(ActionEvent event) {
        String temp_val = txtField.getText();
        if ( temp_val != ""){
            if (temp_val.charAt(0) != '-'){
                txtField.setText("-" + temp_val);}
            else if (temp_val.charAt(0) == '-') {
                txtField.setText(temp_val.substring(1));

            }

        }
      

    }

    @FXML
    void percentBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            firstNumber = Double.valueOf(txtField.getText());
            operator = "%";
            txtField.clear();
        
        }

    }

    @FXML
    void periodBtnPressed(ActionEvent event) {
        if (txtField.getText() != ""){
            txtField.appendText(".");
        
        }
        else {
            txtField.appendText("0.");
        }

    }

    @FXML
    void txtFieldInput(KeyEvent event) {
    }


    private double getAnswer(String op,double firstN, double secondN) {
        double answer = 0;
        switch (op) {
            case "+":
                answer = firstN + secondN; break;
            case "-":
                answer = firstN - secondN; break;
            case "/":
                answer = firstN / secondN; break;
            case "*":
                answer = firstN * secondN; break;
            case "%":
                answer = firstN % secondN; break;

        }
        return answer;

    }

}

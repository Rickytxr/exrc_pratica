package com.example.tpc_9_plutoplanetnine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Button cancelButton;
    @FXML
    private  Label loginMessageLabel;

    @FXML
    private TextField UsernameTextField;

    @FXML
    private PasswordField passowrdPassowrdField;

    public void  loginButtonAction(ActionEvent e) {
        if (UsernameTextField.getText().isBlank()==false && passowrdPassowrdField.getText().isBlank()==false){
            //loginMessageLabel.setText("you try to login!");
            validateLogin();

        }else {
            loginMessageLabel.setText("please enter username and password");

        }
    }


    public void cancelButtonOnAction(ActionEvent e){
        Stage stage=(Stage)  cancelButton.getScene().getWindow();
        stage.close();
    }
    public void validateLogin(){

        DatabaseConnection connectNow= new DatabaseConnection();
        Connection connectD8 = connectNow.getConnection();

        String verifyLogin= "SELECT count(1) from UserAccounts WHERE username ='"+ UsernameTextField.getText() +"'AND password= '"+passowrdPassowrdField.getText() +"'";

        try {

            Statement statement =connectD8.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if (queryResult.getInt(1) == 1){
                    loginMessageLabel.setText("welcome");
                }else {
                        loginMessageLabel.setText("invalid login. please try again");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
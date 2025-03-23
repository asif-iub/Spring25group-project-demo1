package com.iub.cse.oop.spring25groupprojectdemo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("asif/user3-dashboard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(scene);
    }
}
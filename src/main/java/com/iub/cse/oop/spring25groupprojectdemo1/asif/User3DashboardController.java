package com.iub.cse.oop.spring25groupprojectdemo1.asif;

import com.iub.cse.oop.spring25groupprojectdemo1.HelloApplication;
import com.iub.cse.oop.spring25groupprojectdemo1.HelloController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class User3DashboardController {
    @FXML
    public void switchScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(HelloController.class.getResource("mahmood/user7-dashboard.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
}

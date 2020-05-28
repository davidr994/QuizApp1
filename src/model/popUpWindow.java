package model;

import javafx.event.EventHandler;
import javafx.stage.Stage;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;

public class popUpWindow {

    public static void display(String message) {
        Stage stage = new Stage();
        stage.setTitle("Information");

        Label label = new Label(message);
        Button button = new Button("OK");

        button.setOnAction();
    }
}

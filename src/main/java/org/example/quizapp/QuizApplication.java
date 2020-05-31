package org.example.quizapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Paths;

public class QuizApplication extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {
            Parent root = FXMLLoader.load(new File("src/main/java/org/example/quizapp/menu/start/menu.fxml").toURI().toURL());

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }

}
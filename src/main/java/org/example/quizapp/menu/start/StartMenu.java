package org.example.quizapp.menu.start;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class StartMenu {

    @FXML
    void startButton(ActionEvent event) {
      Button button = (Button) event.getSource();
      Stage primaryStage = (Stage) button.getScene().getWindow();
      primaryStage.close();

       try{
           goToCategoryOverview();
       } catch (Exception e) {
           e.printStackTrace();

       }
    }

    @FXML
    void quitButton(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void scoreButton(ActionEvent event) {
        System.out.println("score");
    }

    private void goToCategoryOverview() throws IOException {

        Stage stage2 = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader();

        Pane root = (Pane) fxmlLoader.load(new File("src/main/java/org/example/quizapp/menu/category/category-menu.fxml").toURI().toURL());

        Scene scene2 = new Scene(root);

        stage2.setScene(scene2);
        stage2.setTitle("Choose Category");
        stage2.setResizable(false);
        stage2.show();

    }
}



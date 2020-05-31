package menu;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class Controller {

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

        Pane root = (Pane) fxmlLoader.load(getClass().getResource("/menu2/menu2.fxml").openStream());

        Scene scene2 = new Scene(root);

        stage2.setScene(scene2);
        stage2.setTitle("Choose Category");
        stage2.setResizable(false);
        stage2.show();

    }
}



package org.example.quizapp.menu.category;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.example.quizapp.controller.ControllerQuiz;
import org.example.quizapp.dbUtil.Database;
import org.example.quizapp.menu.questions.Question;
import org.example.quizapp.menu.questions.QuestionBank;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class CategoryMenu implements Initializable {

        @FXML
        private Button Computer;

        @FXML
        private Button Science;

        @FXML
        private Button Java;

        @FXML
        private Button Animal;

        @FXML
        private Button City;

        @FXML
        private Button Country;

        @FXML
        private Label Lable;

        @FXML
        private HBox statusHBox;

        @FXML
        private Circle dbstatuslight;

        @FXML
        private Button OK;

        @FXML
        private Button abort;

        // --------- Arraylist --------
        ArrayList<String> categoryList = new ArrayList<String>();

        ArrayList<Question> quizQuestionList = new ArrayList<>();

        Database database = new Database();
        QuestionBank questionBank = new QuestionBank();

        @FXML
        void ComputerButton(ActionEvent event) {
                Button button = (Button) event.getSource();
                getCategory(button.getText(),button);
        }

        @FXML
        void ScienceButton(ActionEvent event) {
                Button button = (Button) event.getSource();
                getCategory(button.getText(),button);
        }

        @FXML
        void JavaButton(ActionEvent event) {
                Button button = (Button) event.getSource();
                getCategory(button.getText(),button);
        }

        @FXML
        void AnimalButton(ActionEvent event) {
                Button button = (Button) event.getSource();
                getCategory(button.getText(),button);
        }

        @FXML
        void CityButton(ActionEvent event) {
                Button button = (Button) event.getSource();
                getCategory(button.getText(), button);
        }

        @FXML
        void CountryButton(ActionEvent event) {
                Button button = (Button) event.getSource();
                getCategory(button.getText(), button);
        }

        //------- HBox --------

        @FXML
        void OKButton(ActionEvent event) {

                for (String category: categoryList) {
                        questionBank.loadCategoryQuestions(database.getStatement(), category);
                }

                quizQuestionList = (ArrayList<Question>) questionBank.getQuestionList();

                for (Question question: quizQuestionList) {
                        System.out.println("ID: " + question.getQuestion_id());
                }

                Button okButton = (Button) event.getSource();
                Stage stage = (Stage) okButton.getScene().getWindow();
                stage.close();

                try {
                        startQuiz();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }

        @FXML
        void abortButton(ActionEvent event) {
                Computer.setDisable(false);
                Java.setDisable(false);
                Science.setDisable(false);
                City.setDisable(false);
                Country.setDisable(false);
                Animal.setDisable(false);
                statusHBox.setDisable(true);
                Lable.setText(" ");
        }

        @Override
        public void initialize(URL location, ResourceBundle resources) {
                statusHBox.setDisable(true);

                //Database connection
                boolean dbConnection = database.open();

                if(dbConnection) {
                        dbstatuslight.setFill(Color.GREEN);
                } else {
                        dbstatuslight.setFill(Color.RED);
                }
        }

        //---------- methods ----------
        private void getCategory(String category, Button button) {
                categoryList.add(category);
                Lable.setText(Lable.getText() + " " + category);

                button.setDisable(true);
                statusHBox.setDisable(false);
        }

        private void startQuiz() throws IOException {
                Stage stage3 = new Stage();
                stage3.setTitle("Quiz");

                FXMLLoader fxmlLoader = new FXMLLoader();

                 AnchorPane root = (AnchorPane) fxmlLoader.load(new File("src/main/java/org/example/quizapp/controller/quiz.fxml").toURI().toURL());
                //AnchorPane root = (AnchorPane)  fxmlLoader.load(getClass().getClassLoader().getResource("controller/quiz.fxml").openStream());
                //AnchorPane root = (AnchorPane)  fxmlLoader.load();

                ControllerQuiz controllerQuiz = fxmlLoader.getController();
                controllerQuiz.setQuestions((ArrayList<Question>) quizQuestionList);


                Scene scene3 = new Scene(root);

                stage3.setScene(scene3);
                stage3.setResizable(false);
                stage3.show();

        }
}



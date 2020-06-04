package org.example.quizapp.controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.example.quizapp.menu.questions.Question;
import org.example.quizapp.menu.questions.QuestionBank;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerQuiz {

    @FXML
    private Label Question;

    @FXML
    private Button YES;

    @FXML
    private Button NO;

    @FXML
    private Label questionCounter;

    @FXML
    private Label score;

    @FXML
    private Label Highscore;

    @FXML
    private HBox progressHBox;

    @FXML
    private Label COMPLEMENT;

    private ArrayList<Question> questionList = new ArrayList<>();


    //questions related
    private boolean pickedAnswer = false;
    private int currentQuestionNumber = 0;
    private int currentScore = 0;
    private int questionCount = 0;


    @FXML
    void answerButton(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        if(clickedButton.getId().equals("YES")) {
            pickedAnswer = true;
        } else if(clickedButton.getId().equals("NO")) {
            pickedAnswer = false;
        }

        //check answer
        checkAnswer();

        //next question
        currentQuestionNumber = currentQuestionNumber + 1;

        //show next question
        nextQuestion();
    }

    private void checkAnswer() {
        org.example.quizapp.menu.questions.Question question = questionList.get(currentQuestionNumber);
        boolean answer = question.isQuestion_answer();
        String complement = question.getQuestion_complement();

        if(answer == pickedAnswer) {
            if(complement != null) {
                COMPLEMENT.setText("Correct: " + complement);
            } else {
                COMPLEMENT.setText("Correct!");
            }
        } else {
            if (complement != null ) {
                COMPLEMENT.setText("False: " + complement);
            } else {
                COMPLEMENT.setText("False!");
            }
        }
    }

    private void nextQuestion() {
        if(currentQuestionNumber <= questionCount -1) {
            Question.setText(questionList.get(currentQuestionNumber).getQuestion_text());
            updateUi();
        } else {
            restart();
        }
    }

    private void updateUi () {
        score.setText("Score: " + currentScore);
        questionCounter.setText(" " + (currentQuestionNumber + 1) + " / " + questionCount);

        double progressHBoxWidth = (progressHBox.getWidth() / questionCount);
        progressHBox.getChildren().add(new Rectangle(progressHBoxWidth, 20, Color.YELLOW));
    }

    private void restart () {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Congratulations");
        alert.setHeaderText("You finished the quiz");
        alert.setContentText("New Game?");
        alert.showAndWait();

        currentQuestionNumber = 0;
        currentScore = 0;
        progressHBox.getChildren().clear();
        COMPLEMENT.setText(" ");
    }

    //methods
    public void setQuestions(ArrayList<Question> qList) {
        questionList = qList;
        questionCount = questionList.size();


        if(questionList != null) {
            String firstQuestion = questionList.get(0).getQuestion_text();
            Question.setText(firstQuestion);
        }
        updateUi();
    }

}



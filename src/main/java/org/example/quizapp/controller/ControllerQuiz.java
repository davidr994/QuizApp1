package org.example.quizapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.quizapp.menu.questions.Question;
import org.example.quizapp.menu.questions.QuestionBank;

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

    private ArrayList<Question> questionList = new ArrayList<>();

    @FXML
    void answerButton(ActionEvent event) {

    }

    //methods
    public void setQuestions(ArrayList<Question> qList) {
        questionList = qList;

        for (Question question: questionList) {
            System.out.println(question.getQuestion_id());
        }
    }

}



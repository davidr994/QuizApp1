module quizapp {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;

    opens org.example.quizapp;
    opens org.example.quizapp.controller;
    opens org.example.quizapp.menu.category;
    opens org.example.quizapp.menu.start;

}

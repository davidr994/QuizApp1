module Quizapp {

    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;

    opens menu;
    opens menu2;
    opens Application;
    opens model;

}

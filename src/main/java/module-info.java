module com.mycompany.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.quizapp to javafx.fxml;
    exports com.mycompany.quizapp;
}

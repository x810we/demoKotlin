module com.example.demokotlin {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.demokotlin to javafx.fxml;
    exports com.example.demokotlin;
}
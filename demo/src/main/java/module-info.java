module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.PT02_2072009 to javafx.fxml;
    exports com.example.PT02_2072009;

    opens com.example.PT02_2072009.model to javafx.fxml;
    exports com.example.PT02_2072009.model;
}
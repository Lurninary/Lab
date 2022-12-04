module com.example.prog4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prog4 to javafx.fxml;
    exports com.example.prog4;
}
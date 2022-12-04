module com.example.prog5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prog5 to javafx.fxml;
    exports com.example.prog5;
}
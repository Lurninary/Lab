module com.example.prog1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prog1 to javafx.fxml;
    exports com.example.prog1;
}
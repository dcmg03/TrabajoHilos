module com.example.trabajohilos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.trabajohilos to javafx.fxml;
    exports com.example.trabajohilos;
}
module com.example.taksimetre {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taksimetre to javafx.fxml;
    exports com.example.taksimetre;
}
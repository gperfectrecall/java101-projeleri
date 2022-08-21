module com.example.kdvtutari {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kdvtutari to javafx.fxml;
    exports com.example.kdvtutari;
}
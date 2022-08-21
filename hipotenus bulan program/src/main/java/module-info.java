module com.example.hipotenusprogrami {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hipotenusprogrami to javafx.fxml;
    exports com.example.hipotenusprogrami;
}
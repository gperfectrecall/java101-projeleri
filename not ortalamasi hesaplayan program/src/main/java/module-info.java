module com.example.not_ortalamasi_programi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.not_ortalamasi_programi to javafx.fxml;
    exports com.example.not_ortalamasi_programi;
}
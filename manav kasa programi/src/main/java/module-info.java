module com.example.manavkasa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manavkasa to javafx.fxml;
    exports com.example.manavkasa;
}
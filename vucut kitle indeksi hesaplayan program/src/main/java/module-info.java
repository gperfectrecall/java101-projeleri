module com.example.vkihesaplama {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vkihesaplama to javafx.fxml;
    exports com.example.vkihesaplama;
}
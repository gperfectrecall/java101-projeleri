module com.example.dairealanivecevresi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dairealanivecevresi to javafx.fxml;
    exports com.example.dairealanivecevresi;
}
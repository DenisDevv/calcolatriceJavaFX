module com.example.softwarejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softwarejavafx to javafx.fxml;
    exports com.example.softwarejavafx;
}
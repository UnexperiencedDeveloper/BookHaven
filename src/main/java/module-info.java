module com.timprogrammiert.bookhaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.timprogrammiert.bookhaven to javafx.fxml;
    exports com.timprogrammiert.bookhaven;
}
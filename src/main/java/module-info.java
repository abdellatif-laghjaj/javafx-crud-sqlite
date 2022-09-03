module com.abdellatif.javafxcrudsqlite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.abdellatif.javafxcrudsqlite.LoginApp to javafx.fxml;
    exports com.abdellatif.javafxcrudsqlite.LoginApp;
}
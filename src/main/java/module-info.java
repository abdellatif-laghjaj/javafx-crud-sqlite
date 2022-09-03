module com.abdellatif.javafxcrudsqlite {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.abdellatif.LoginApp to javafx.fxml;
    exports com.abdellatif.LoginApp;
}
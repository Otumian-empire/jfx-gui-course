module com.otumian.javafxguicourse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.otumian.javafxguicourse to javafx.fxml;
    exports com.otumian.javafxguicourse;
}
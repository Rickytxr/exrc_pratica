module com.example.tpc_9_plutoplanetnine {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.example.tpc_9_plutoplanetnine to javafx.fxml;
    exports com.example.tpc_9_plutoplanetnine;
}
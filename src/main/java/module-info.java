module com.gpr.project_gpr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gpr.project_gpr to javafx.fxml;
    exports com.gpr.project_gpr;
}
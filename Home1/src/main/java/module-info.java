module com.example.home1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.home1 to javafx.fxml;
    exports com.example.home1;
}
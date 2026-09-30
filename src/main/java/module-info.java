module com.example.librobd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.librobd.model to javafx.base;

    opens com.example.librobd to javafx.fxml;
    exports com.example.librobd.controller to javafx.fxml;
    opens com.example.librobd.controller to javafx.fxml;
    exports com.example.librobd;
}
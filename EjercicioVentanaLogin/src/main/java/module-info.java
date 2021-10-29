module com.example.ejercicioventanalogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.ejercicioventanalogin to javafx.fxml;
    exports com.example.ejercicioventanalogin;
    exports com.example.ejercicioventanalogin.Login;
    opens com.example.ejercicioventanalogin.Login to javafx.fxml;
    exports com.example.ejercicioventanalogin.InicioSesion;
    opens com.example.ejercicioventanalogin.InicioSesion to javafx.fxml;
    exports com.example.ejercicioventanalogin.pantalla;
    opens com.example.ejercicioventanalogin.pantalla to javafx.fxml;
}
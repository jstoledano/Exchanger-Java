module org.toledano.exhangerone {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.toledano.exhangerone to javafx.fxml;
    exports org.toledano.exhangerone;
}
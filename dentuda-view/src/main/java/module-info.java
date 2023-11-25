module com.br.dentuda.dentudaview {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.br.dentuda.dentudaview to javafx.fxml;
    exports com.br.dentuda.dentudaview;
}
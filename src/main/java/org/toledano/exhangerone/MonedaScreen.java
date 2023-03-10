package org.toledano.exhangerone;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MonedaScreen extends Parent {
    @FXML private Button btnEjecutar;
    @FXML private TextField txtCantidad;
    @FXML private ChoiceBox<String> cbMonedaOrigen;
    @FXML private TextField txtResultado;

    // Opciones de monedas para cbMonedaOrigen
    ObservableList<String> opcionesMoneda = FXCollections.observableArrayList(
            "MXN a Dólar",
            "MXN a Euro",
            "MXN a Libras Esterlinas",
            "MXN a Yen Japonés",
            "MXN a Won Surcoreano",
            "Dólar a MXN",
            "Euro a MXN",
            "Libras Esterlinas a MXN",
            "Yen Japonés a MXN",
            "Won Surcoreano a MXN"
    );

    // Inicialización de la ventana
    @FXML private void initialize() {
        // Se llenan las opciones de cbMonedaOrigen
        cbMonedaOrigen.setItems(opcionesMoneda);
        // Se elige la primera opción como valor por defecto
        cbMonedaOrigen.getSelectionModel().selectFirst();
    }


    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}

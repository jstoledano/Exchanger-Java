package org.toledano.exhangerone;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;


public class controllerOne {
    @FXML private ChoiceBox<String> cb;
    @FXML private Button btn;

    ObservableList<String> cbOptions = FXCollections
            .observableArrayList(
                    "Convertidor de moneda",
                    "Convertidor de temperatura"
            );

    @FXML private void initialize() {
        cb.setItems(cbOptions);
        cb.setValue("Convertidor de moneda");
    }

    @FXML private void selection() {
        System.out.println(cb.getValue());
    }
}

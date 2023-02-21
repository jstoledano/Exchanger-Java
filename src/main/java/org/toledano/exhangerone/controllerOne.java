package org.toledano.exhangerone;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class controllerOne {
    @FXML private ChoiceBox<String> cb;

    ObservableList<String> cbOptions = FXCollections
            .observableArrayList(
                    "Conversor de moneda",
                    "Conversor de temperatura"
            );

    @FXML private void initialize() {
        cb.setItems(cbOptions);
        cb.setValue("Conversor de moneda");
    }
}

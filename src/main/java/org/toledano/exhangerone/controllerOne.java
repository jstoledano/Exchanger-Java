package org.toledano.exhangerone;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;


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

        // Selecciona el primer elemento de la lista como
        // el valor por defecto
        cb.getSelectionModel().selectFirst();
    }

    @FXML private void selection() {
        if (cb.getValue().equals("Convertidor de moneda")) {
            // TODO: Abrir ventana de convertidor de moneda "monedaScreen.fxml"
            System.out.println("Convertidor de moneda");
        } else if (cb.getValue().equals("Convertidor de temperatura")) {
            System.out.println("Convertidor de temperatura");
        }
    }

    @FXML private void btnClick() {
        if (cb.getValue().equals("Convertidor de moneda")) {
            // TODO: Abrir ventana de convertidor de moneda "monedaScreen.fxml"
            System.out.println("Convertidor de moneda");
            // Se crea la escena para el convertidor de moneda
            Scene scene = new Scene(new MonedaScreen());
            // Se crea el stage para el convertidor de moneda
            Stage stage = new Stage();
            stage.setTitle("Convertidor de moneda");
            stage.setScene(scene);
            stage.show();
        } else if (cb.getValue().equals("Convertidor de temperatura")) {
            System.out.println("Convertidor de temperatura");
        }
    }
}

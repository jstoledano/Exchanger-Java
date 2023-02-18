package org.toledano.exhangerone;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FirstSelectionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenido a la aplicación ExchangerONE!");
    }
}
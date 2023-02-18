package org.toledano.exhangerone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ExchangerApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExchangerApp.class.getResource("first-one.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        primaryStage.setTitle("Exchanger ONE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
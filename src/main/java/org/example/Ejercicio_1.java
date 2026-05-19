package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio_1 extends Application {

    @Override
    public void start(Stage stage) {

        Button btn = new Button("Haz clic aquí");

        VBox layout = new VBox(btn);

        Scene scene = new Scene(layout, 250, 100);
        stage.setTitle("Ejercicio 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
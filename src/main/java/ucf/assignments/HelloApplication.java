/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Brandon Lopez
 */
package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    /*
    private static Controller HelloController;

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    scene = new Scene(loadFXML("hello-view"), 980, 128);
    stage.setScene(scene);
    stage.show();
    }

    static void setRoot (String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML (String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ". fxml"));
        return fxmlLoader.load();
    }
    //Run | Debug
    public static void main(String[] args) {
        launch();
    }
    */

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 980, 120);
        stage.setTitle("To-Do");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


}
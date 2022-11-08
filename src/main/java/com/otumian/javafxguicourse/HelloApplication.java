package com.otumian.javafxguicourse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        // Create a button
        Button button = new Button("I am a button Clicked me");

        // Create a layout and add the button to the layout
        HBox  hBox = new HBox();
        hBox.getChildren().add(button);

        // Create  a scene and add the layout and bg
        Scene scene = new Scene(hBox, Color.TOMATO);

        // set the stage by adding a scene
        stage.setScene(scene);

        // set title
        stage.setTitle("This is a Title");

        // set the icon of the window and add it to the stage
        /*Image icon = new Image("icon.jpg");
        System.out.println(icon.getUrl());

        stage.getIcons().add(icon);*/

        // display/show the scene
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
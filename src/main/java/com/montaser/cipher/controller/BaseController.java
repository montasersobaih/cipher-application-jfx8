package com.montaser.cipher.controller;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class BaseController implements Initializable {

    private final Logger LOG = Logger.getLogger(getClass().getName());

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    void showLayout(final String FXML_RESOURCE, final Event EVENT) {
        URL interfaceUrl = getClass().getResource(FXML_RESOURCE);
        FXMLLoader loader = new FXMLLoader(interfaceUrl);
        Scene parentScene = ((Node) EVENT.getSource()).getScene();
        Stage primaryStage = (Stage) parentScene.getWindow();

        try {
            LOG.info("Initializing layout");

            Scene newScene = new Scene(
                    loader.<Parent>load(),
                    parentScene.getWidth(),
                    parentScene.getHeight()
            );

            primaryStage.setScene(newScene);
        } catch (IOException | NullPointerException ex) {
            LOG.log(Level.WARNING, ex.getMessage());
        }

        primaryStage.show();
    }
}
package com.montaser.cipher;

import com.montaser.cipher.constant.UInterface;
import com.montaser.cipher.constant.enumeration.AppTitle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public final class BootstrapApplication extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL interfaceUrl = getClass().getResource(UInterface.MAIN_INTERFACE);
        FXMLLoader loader = new FXMLLoader(interfaceUrl);
        Scene scene = new Scene(loader.<Parent>load());

        primaryStage.setScene(scene);
        primaryStage.setTitle(AppTitle.MAIN_TITLE.getTitle());
        primaryStage.show();
    }
}

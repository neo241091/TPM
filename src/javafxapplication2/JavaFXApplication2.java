/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.util.Optional;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author saravanakumar
 */
public class JavaFXApplication2 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Singleton.getInstance().setStage(stage);
        stage.setOnCloseRequest(Singleton.getInstance().confirmCloseEventHandler);
        Button closeButton = new Button("Close Application");
        closeButton.setOnAction(event ->
                stage.fireEvent(
                        new WindowEvent(
                                stage,
                                WindowEvent.WINDOW_CLOSE_REQUEST
                        )
                )
        );
        StackPane layout = new StackPane(closeButton);
        layout.setPadding(new Insets(10));
        Parent root = FXMLLoader.load(getClass().getResource("Facility.fxml"));
        
        Scene scene = new Scene(root);
        stage.getIcons().add(new Image(JavaFXApplication2.class.getResourceAsStream("UTAIcon.jpg")));
        stage.setTitle("Managed Lane Modeler Copyright (c) UTA 2016");
        stage.setScene(scene);
        stage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

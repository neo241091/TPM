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
    private Stage mainStage;
    @Override
    public void start(Stage stage) throws Exception {
        this.mainStage = stage;
        stage.setOnCloseRequest(confirmCloseEventHandler);
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
    
    private EventHandler<WindowEvent> confirmCloseEventHandler = event -> {
        Alert closeConfirmation = new Alert(
                Alert.AlertType.CONFIRMATION,
                "Are you sure you want to exit?"
        );
        Button exitButton = (Button) closeConfirmation.getDialogPane().lookupButton(
                ButtonType.OK
        );
        exitButton.setText("Exit");
        closeConfirmation.setHeaderText("Confirm Exit");
        closeConfirmation.initModality(Modality.APPLICATION_MODAL);
        closeConfirmation.initOwner(mainStage);

        // normally, you would just use the default alert positioning,
        // but for this simple sample the main stage is small,
        // so explicitly position the alert so that the main window can still be seen.
        Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
        
        closeConfirmation.setX((primScreenBounds.getWidth() - mainStage.getWidth()) / 2);
        closeConfirmation.setY((primScreenBounds.getHeight() - mainStage.getHeight()) / 2);

        Optional<ButtonType> closeResponse = closeConfirmation.showAndWait();
        if (!ButtonType.OK.equals(closeResponse.get())) {
            event.consume();
        }
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

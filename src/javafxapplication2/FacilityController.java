/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.awt.image.BufferedImage;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author saravanakumar
 */
public class FacilityController implements Initializable {
    /**
     * Initializes the controller class.
     */
    @FXML
    private ComboBox ModelDropDown;
    
    @FXML
    private TextField MLNoLanes,GPNoLanes,GpSpeed,GPLength,MLSpeed,GPCapacity,MLCapacity,MLLength,MLDensity,GPDensity;
    @FXML
    private Label GPDensitylabel,MLDensitylabel,GPDensitylabel1,MLDensitylabel2;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
        Singleton.getInstance().setModelDropDown(ModelDropDown);
        Singleton.getInstance().setMLNoLanes(MLNoLanes);
        Singleton.getInstance().setGPNoLanes(GPNoLanes);
        Singleton.getInstance().setGpSpeed(GpSpeed);
        Singleton.getInstance().setGPLength(GPLength);
        Singleton.getInstance().setMLSpeed(MLSpeed);
        Singleton.getInstance().setGPCapacity(GPCapacity);
        Singleton.getInstance().setMLCapacity(MLCapacity);
        Singleton.getInstance().setMLLength(MLLength);
        Singleton.getInstance().setMLDensity(MLDensity);
        Singleton.getInstance().setGPDensity(GPDensity);
        if(ModelDropDown.getValue().equals("Drake"))
        {
            GPDensity.setVisible(false);
            MLDensity.setVisible(false);
            GPDensitylabel.setVisible(false);
            MLDensitylabel.setVisible(false);
            GPDensitylabel1.setVisible(false);             
            MLDensitylabel2.setVisible(false);
        }
        else
        {
            GPDensity.setVisible(true);
            MLDensity.setVisible(true);
            GPDensitylabel.setVisible(true);
            MLDensitylabel.setVisible(true);
            GPDensitylabel1.setVisible(true);             
            MLDensitylabel2.setVisible(true);
        }
    }    

    @FXML
    private void handleFacilityNextButtonAction(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        Button nextButton =(Button) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("User.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleFacilityclose(ActionEvent event) throws IOException{
        Button closeButton =(Button) event.getSource();
         Stage stage = (Stage) closeButton.getScene().getWindow();
         stage.close();
    }
    
    @FXML
    private void handleDropDownAction(ActionEvent event)
    {
        if(ModelDropDown.getValue().equals("Drake"))
        {
            GPDensity.setVisible(false);
            MLDensity.setVisible(false);
            GPDensitylabel.setVisible(false);
            MLDensitylabel.setVisible(false);
            GPDensitylabel1.setVisible(false);             
            MLDensitylabel2.setVisible(false);
        }
        else
        {
            GPDensity.setVisible(true);
            MLDensity.setVisible(true);
            GPDensitylabel.setVisible(true);
            MLDensitylabel.setVisible(true);
            GPDensitylabel1.setVisible(true);             
            MLDensitylabel2.setVisible(true);
        }
    }
    
    @FXML
    private void handleFacilitylink(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        Hyperlink nextButton =(Hyperlink) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Facility.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleUserlink(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        Hyperlink nextButton =(Hyperlink) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("User.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleTimeValuelink(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        Hyperlink nextButton =(Hyperlink) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("TimeValue.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleResultslink(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        Hyperlink nextButton =(Hyperlink) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Result.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handleObjectiveslink(ActionEvent event) throws IOException{
        Stage stage; 
        Parent root;
        Hyperlink nextButton =(Hyperlink) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Objective.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void handlePrintButton(ActionEvent event)
    {
        PrinterJob printJob = PrinterJob.getPrinterJob();
        Stage stage; 
        Button nextButton =(Button) event.getSource();
        stage =(Stage) nextButton.getScene().getWindow();
        Scene scene = stage.getScene();
        WritableImage snapshot = scene.snapshot(null);
        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(snapshot, null);
        printJob.setPrintable(new ImagePrintable(printJob, bufferedImage));
        if (printJob.printDialog()) {
            try {
                printJob.print();
            } catch (PrinterException prt) {
                prt.printStackTrace();
            }
        }
        
    }
   
}

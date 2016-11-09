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
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author saravanakumar
 */
public class UserController implements Initializable {

    @FXML
    private TextField corridordemand,deadsetter,sovvhmix,hovvhmix,sovtvhmix,sutvhmix,sttvhmix,stdvhmix,sphvhmix;
    
    @FXML 
    private TextField sovpce,hovpce,sovtpce,sutpce,sttpce,stdpce,sphpce;
    
    @FXML
    private TextField sovmlshare,hovmlshare,sovtmlshare,sutmlshare,sttmlshare,stdmlshare,spvmlshare;
    @FXML
    private TextField sovtoll,hovtoll,sovttoll,suttoll,stttoll,stdtoll,spvtoll;
    
    @FXML
    private CheckBox issovallowed,ishovallowed,issovtallowed,issutallowed,issttallowed,isstdallowed,isspvallowed;    
    @FXML
    private CheckBox issovml,ishovml,issovtml,issutml,issttml,isstdml,isspvml,usersaveinput;
    
    @FXML
    private ComboBox timeofday;
    
    @FXML
    private Button closebutton;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Stage stage = Singleton.getInstance().getStage();
         closebutton.setOnAction(event ->
                stage.fireEvent(
                        new WindowEvent(
                                stage,
                                WindowEvent.WINDOW_CLOSE_REQUEST
                        )
                )
        );
         
        Singleton.getInstance().getTextFields(corridordemand);
        Singleton.getInstance().getTextFields(deadsetter);
        Singleton.getInstance().getTextFields(sovvhmix);
        Singleton.getInstance().getTextFields(hovvhmix);
        Singleton.getInstance().getTextFields(sovtvhmix);
        Singleton.getInstance().getTextFields(sutvhmix);
        Singleton.getInstance().getTextFields(sttvhmix);
        Singleton.getInstance().getTextFields(stdvhmix);
        Singleton.getInstance().getTextFields(sphvhmix);
        Singleton.getInstance().getTextFields(sovpce);
        Singleton.getInstance().getTextFields(hovpce);
        Singleton.getInstance().getTextFields(sovtpce);
        Singleton.getInstance().getTextFields(sutpce);
        Singleton.getInstance().getTextFields(sttpce);
        Singleton.getInstance().getTextFields(stdpce);
        Singleton.getInstance().getTextFields(sphpce);
        Singleton.getInstance().getTextFields(sovtoll);
        Singleton.getInstance().getTextFields(hovtoll);
        Singleton.getInstance().getTextFields(sovttoll);
        Singleton.getInstance().getTextFields(suttoll);
        Singleton.getInstance().getTextFields(stttoll);
        Singleton.getInstance().getTextFields(stdtoll);
        Singleton.getInstance().getTextFields(spvtoll);
        
        Singleton.getInstance().getTextFields(sovmlshare);
        Singleton.getInstance().getTextFields(hovmlshare);
        Singleton.getInstance().getTextFields(sovtmlshare);
        Singleton.getInstance().getTextFields(sutmlshare);
        Singleton.getInstance().getTextFields(sttmlshare);
        Singleton.getInstance().getTextFields(stdmlshare);
        Singleton.getInstance().getTextFields(spvmlshare);
         
        Singleton.getInstance().setcorridordemand(corridordemand);
        Singleton.getInstance().setdeadsetter(deadsetter);
        Singleton.getInstance().setsovvhmix(sovvhmix);
        Singleton.getInstance().sethovvhmix(hovvhmix);
        Singleton.getInstance().setsovtvhmix(sovtvhmix);
        Singleton.getInstance().setsutvhmix(sutvhmix);
        Singleton.getInstance().setsttvhmix(sttvhmix);
        Singleton.getInstance().setstdvhmix(stdvhmix);
        Singleton.getInstance().setsphvhmix(sphvhmix);
        Singleton.getInstance().setsovpce(sovpce);
        Singleton.getInstance().sethovpce(hovpce);
        Singleton.getInstance().setsovtpce(sovtpce);
        Singleton.getInstance().setsutpce(sutpce);
        Singleton.getInstance().setsttpce(sttpce);
        Singleton.getInstance().setstdpce(stdpce);
        Singleton.getInstance().setsphpce(sphpce);
        Singleton.getInstance().setsovtoll(sovtoll);
        Singleton.getInstance().sethovtoll(hovtoll);
        Singleton.getInstance().setsovttoll(sovttoll);
        Singleton.getInstance().setsuttoll(suttoll);
        Singleton.getInstance().setstttoll(stttoll);
        Singleton.getInstance().setstdtoll(stdtoll);
        Singleton.getInstance().setspvtoll(spvtoll);
        Singleton.getInstance().setissovallowed(issovallowed);
        Singleton.getInstance().setishovallowed(ishovallowed);
        Singleton.getInstance().setissovtallowed(issovtallowed);
        Singleton.getInstance().setissutallowed(issutallowed);
        Singleton.getInstance().setissttallowed(issttallowed);
        Singleton.getInstance().setisstdallowed(isstdallowed);
        Singleton.getInstance().setisspvallowed(isspvallowed);
        //issovml,ishovml,issovtml,issutml,issttml,isstdml,isspvml
        Singleton.getInstance().setissovml(issovml);
        Singleton.getInstance().setishovml(ishovml);
        Singleton.getInstance().setissovtml(issovtml);
        Singleton.getInstance().setissutml(issutml);
        Singleton.getInstance().setissttml(issttml);
        Singleton.getInstance().setisstdml(isstdml);
        Singleton.getInstance().setisspvml(isspvml);
        //sovmlshare,hovmlshare,sovtmlshare,sutmlshare,sttmlshare,stdmlshare,spvmlshare
        Singleton.getInstance().setsovmlshare(sovmlshare);
        Singleton.getInstance().sethovmlshare(hovmlshare);
        Singleton.getInstance().setsovtmlshare(sovtmlshare);
        Singleton.getInstance().setsutmlshare(sutmlshare);
        Singleton.getInstance().setsttmlshare(sttmlshare);
        Singleton.getInstance().setstdmlshare(stdmlshare);
        Singleton.getInstance().setspvmlshare(spvmlshare);
        Singleton.getInstance().settimeofday(timeofday);
        handlesovallowed(new ActionEvent());
        handlehovallowed(new ActionEvent());
        handlesovtallowed(new ActionEvent());
        handlesutallowed(new ActionEvent());
        handlestdallowed(new ActionEvent());
        handlespvallowed(new ActionEvent());
        handlesttallowed(new ActionEvent());
        
        Singleton.getInstance().getCheckboxes(issovml);
        Singleton.getInstance().getCheckboxes(ishovml);
        Singleton.getInstance().getCheckboxes(issovtml);
        Singleton.getInstance().getCheckboxes(issutml);
        Singleton.getInstance().getCheckboxes(issovml);
        Singleton.getInstance().getCheckboxes(issttml);
        Singleton.getInstance().getCheckboxes(isstdml);
        Singleton.getInstance().getCheckboxes(isspvml);
        
        Singleton.getInstance().getCheckboxes(issovallowed);
        Singleton.getInstance().getCheckboxes(ishovallowed);
        Singleton.getInstance().getCheckboxes(issovtallowed);
        Singleton.getInstance().getCheckboxes(issutallowed);
        Singleton.getInstance().getCheckboxes(issttallowed);
        Singleton.getInstance().getCheckboxes(isstdallowed);
        Singleton.getInstance().getCheckboxes(isspvallowed);
        
        Singleton.getInstance().getComboBoxes(timeofday);
        usersaveinput.setSelected(Singleton.getInstance().getsaveInput());
    }    
    
    @FXML
    private void handleuserclose(ActionEvent event) throws IOException{
        Button closeButton =(Button) event.getSource();
         Stage stage = (Stage) closeButton.getScene().getWindow();
         stage.close();
    }

    @FXML
    private void handleuserBackbutton(ActionEvent event) throws IOException {
         Stage stage; 
        Parent root;
        Button nextButton =(Button) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Facility.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleuserNextbutton(ActionEvent event) throws IOException {
         Stage stage; 
        Parent root;
        Button nextButton =(Button) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("TimeValue.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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
    private void handlesovfixed(ActionEvent event){
        if(issovml.isSelected())
        {
            sovmlshare.setDisable(false);
        }
        else 
        {            
            sovmlshare.setDisable(true);
        }
    }
    
    @FXML
    private void handlehovfixed(ActionEvent event){
        if(ishovml.isSelected())
        {
            hovmlshare.setDisable(false);
        }
        else 
        {            
            hovmlshare.setDisable(true);            
        }
    }
    
    @FXML
    private void handlesovtfixed(ActionEvent event){
        if(issovtml.isSelected())
        {
            sovtmlshare.setDisable(false);
        }
        else 
        {
            sovtmlshare.setDisable(true);
        }
    }
    
    @FXML
    private void handlesutfixed(ActionEvent event){
        if(issutml.isSelected())
        {
            sutmlshare.setDisable(false);
        }
        else
        {
            sutmlshare.setDisable(true);
        }
    }
    
    @FXML
    private void handlesttfixed(ActionEvent event){
        if(issttml.isSelected())
        {
            sttmlshare.setDisable(false);
        }
        else 
        {
            sttmlshare.setDisable(true);
        }
    }
    
    @FXML
    private void handlespvfixed(ActionEvent event){
        if(isspvml.isSelected())
        {
            spvmlshare.setDisable(false);
        }
        else 
        {
            spvmlshare.setDisable(true);
        }
    }
    
    @FXML
    private void handlestdfixed(ActionEvent event){
        if(isstdml.isSelected())
        {
            stdmlshare.setDisable(false);
        }
        else 
        {
            stdmlshare.setDisable(true);
        }
    }
    
    @FXML 
    private void handlesovallowed(ActionEvent event){
        if(issovallowed.isSelected())
        {
            issovml.setSelected(false);
            issovml.setDisable(true);
            sovtoll.setDisable(true);
        }
        else
        {
            sovtoll.setDisable(false);
            issovml.setDisable(false);
        }
    }
    
    @FXML 
    private void handlehovallowed(ActionEvent event){
        if(ishovallowed.isSelected())
        {
            ishovml.setSelected(false);
            ishovml.setDisable(true);
            hovtoll.setDisable(true);
        }
        else 
        {
            hovtoll.setDisable(false);            
            ishovml.setDisable(false);
        }
    }
    
    @FXML 
    private void handlesovtallowed(ActionEvent event){
        if(issovtallowed.isSelected())
        {
            issovtml.setSelected(false);
            issovtml.setDisable(true);
            sovttoll.setDisable(true);
        }
        else 
        {            
            issovtml.setDisable(false);
            sovttoll.setDisable(false);
        }
    }
    
    @FXML 
    private void handlesutallowed(ActionEvent event){
        if(issutallowed.isSelected())
        {
            issutml.setSelected(false);
            issutml.setDisable(true);
            suttoll.setDisable(true);
        }
        else 
        {
            issutml.setDisable(false);
            suttoll.setDisable(false);
        }
    }
    
    @FXML 
    private void handlesttallowed(ActionEvent event){
        if(issttallowed.isSelected())
        {
            issttml.setSelected(false);
            issttml.setDisable(true);
            stttoll.setDisable(true);
        }
        else 
        {
            issttml.setDisable(false);
            stttoll.setDisable(false);
        }
    }
    
    @FXML 
    private void handlestdallowed(ActionEvent event){
        if(isstdallowed.isSelected())
        {
            isstdml.setSelected(false);
            isstdml.setDisable(true);
            stdtoll.setDisable(true);
        }
        else 
        {
            isstdml.setDisable(false);
            stdtoll.setDisable(false);
        }
    }
    
    @FXML 
    private void handlespvallowed(ActionEvent event){
        if(isspvallowed.isSelected())
        {
            isspvml.setSelected(false);
            isspvml.setDisable(true);
            spvtoll.setDisable(true);
        }
        else 
        {
            isspvml.setDisable(false);
            spvtoll.setDisable(false);
        }
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
    
     @FXML
    private void handlesaveinput(ActionEvent event)
    {
        Singleton.getInstance().setsaveInput(usersaveinput);
    }
}

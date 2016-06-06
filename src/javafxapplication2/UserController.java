/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private CheckBox issovml,ishovml,issovtml,issutml,issttml,isstdml,isspvml;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        else sovmlshare.setDisable(true);
    }
    
    @FXML
    private void handlehovfixed(ActionEvent event){
        if(ishovml.isSelected())
        {
            hovmlshare.setDisable(false);
        }
        else hovmlshare.setDisable(true);
    }
    
    @FXML
    private void handlesovtfixed(ActionEvent event){
        if(issovtml.isSelected())
        {
            sovtmlshare.setDisable(false);
        }
        else sovtmlshare.setDisable(true);
    }
    
    @FXML
    private void handlesutfixed(ActionEvent event){
        if(issutml.isSelected())
        {
            sutmlshare.setDisable(false);
        }
        else sutmlshare.setDisable(true);
    }
    
    @FXML
    private void handlesttfixed(ActionEvent event){
        if(issttml.isSelected())
        {
            sttmlshare.setDisable(false);
        }
        else sttmlshare.setDisable(true);
    }
    
    @FXML
    private void handlespvfixed(ActionEvent event){
        if(isspvml.isSelected())
        {
            spvmlshare.setDisable(false);
        }
        else spvmlshare.setDisable(true);
    }
    
    @FXML
    private void handlestdfixed(ActionEvent event){
        if(isstdml.isSelected())
        {
            stdmlshare.setDisable(false);
        }
        else stdmlshare.setDisable(true);
    }
    
    @FXML 
    private void handlesovallowed(ActionEvent event){
        if(issovallowed.isSelected())
        {
            sovtoll.setDisable(true);
        }
        else sovtoll.setDisable(false);
    }
    
    @FXML 
    private void handlehovallowed(ActionEvent event){
        if(ishovallowed.isSelected())
        {
            hovtoll.setDisable(true);
        }
        else hovtoll.setDisable(false);
    }
    
    @FXML 
    private void handlesovtallowed(ActionEvent event){
        if(issovtallowed.isSelected())
        {
            sovttoll.setDisable(true);
        }
        else sovttoll.setDisable(false);
    }
    
    @FXML 
    private void handlesutallowed(ActionEvent event){
        if(issutallowed.isSelected())
        {
            suttoll.setDisable(true);
        }
        else suttoll.setDisable(false);
    }
    
    @FXML 
    private void handlesttallowed(ActionEvent event){
        if(issttallowed.isSelected())
        {
            stttoll.setDisable(true);
        }
        else stttoll.setDisable(false);
    }
    
    @FXML 
    private void handlestdallowed(ActionEvent event){
        if(isstdallowed.isSelected())
        {
            stdtoll.setDisable(true);
        }
        else stdtoll.setDisable(false);
    }
    
    @FXML 
    private void handlespvallowed(ActionEvent event){
        if(isspvallowed.isSelected())
        {
            spvtoll.setDisable(true);
        }
        else spvtoll.setDisable(false);
    }
}

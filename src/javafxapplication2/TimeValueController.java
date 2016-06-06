/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author saravanakumar
 */
public class TimeValueController implements Initializable {
    DecimalFormat twoDForm = new DecimalFormat("#.##");
    @FXML
    private TextField Maxtoll8,Maxtoll1,Maxtoll2,Maxtoll3,Maxtoll4,Maxtoll5,Maxtoll6,Maxtoll7;
    @FXML
    private TextField Maxtoll9;
    @FXML
    private TextField Maxtoll10;
    @FXML
    private TextField sovtime1,sovtime2,sovtime3,sovtime4,sovtime5,sovtime6,sovtime7,sovtime8,sovtime9,sovtime10;
    @FXML
    private TextField hovtime1,hovtime2,hovtime3,hovtime4,hovtime5,hovtime6,hovtime7,hovtime8,hovtime9,hovtime10;
    
    @FXML
    private TextField sovttime1,sovttime2,sovttime3,sovttime4,sovttime5,sovttime6,sovttime7,sovttime8,sovttime9,sovttime10;
    @FXML
    private TextField suttime1,suttime2,suttime3,suttime4,suttime5,suttime6,suttime7,suttime8,suttime9,suttime10;
     @FXML
    private TextField stttime1,stttime2,stttime3,stttime4,stttime5,stttime6,stttime7,stttime8,stttime9,stttime10;
      @FXML
    private TextField stdtime1,stdtime2,stdtime3,stdtime4,stdtime5,stdtime6,stdtime7,stdtime8,stdtime9,stdtime10;
      
      @FXML
    private TextField spvtime1,spvtime2,spvtime3,spvtime4,spvtime5,spvtime6,spvtime7,spvtime8,spvtime9,spvtime10;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Maxtoll9.textProperty().addListener((observable, oldValue, newValue) -> tollListener(newValue));
        Maxtoll8.textProperty().addListener((observable, oldValue, newValue) -> tollListener(newValue));
        sovtime1.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime2.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime3.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime4.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime5.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime6.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime7.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime8.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        sovtime9.textProperty().addListener((observable, oldValue, newValue) -> sovtimeListener(newValue));
        hovtime1.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime2.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime3.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime4.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime5.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime6.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime7.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime8.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        hovtime9.textProperty().addListener((observable, oldValue, newValue) -> hovtimeListener(newValue));
        sovttime1.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime2.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime3.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime4.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime5.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime6.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime7.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime8.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        sovttime9.textProperty().addListener((observable, oldValue, newValue) -> sovttimeListener(newValue));
        suttime1.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime2.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime3.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime4.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime5.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime6.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime7.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime8.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        suttime9.textProperty().addListener((observable, oldValue, newValue) -> suttimeListener(newValue));
        stttime1.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime2.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime3.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime4.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime5.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime6.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime7.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime8.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stttime9.textProperty().addListener((observable, oldValue, newValue) -> stttimeListener(newValue));
        stdtime1.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime2.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime3.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime4.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime5.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime6.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime7.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime8.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        stdtime9.textProperty().addListener((observable, oldValue, newValue) -> stdtimeListener(newValue));
        spvtime1.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime2.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime3.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime4.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime5.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime6.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime7.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime8.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        spvtime9.textProperty().addListener((observable, oldValue, newValue) -> spvtimeListener(newValue));
        Singleton.getInstance().setMaxtoll1(Maxtoll1);
        Singleton.getInstance().setMaxtoll2(Maxtoll2);
        Singleton.getInstance().setMaxtoll3(Maxtoll3);
        Singleton.getInstance().setMaxtoll4(Maxtoll4);
        Singleton.getInstance().setMaxtoll5(Maxtoll5);
        Singleton.getInstance().setMaxtoll6(Maxtoll6);
        Singleton.getInstance().setMaxtoll7(Maxtoll7);
        Singleton.getInstance().setMaxtoll8(Maxtoll8);
        Singleton.getInstance().setMaxtoll9(Maxtoll9);
        Singleton.getInstance().setMaxtoll10(Maxtoll10);
    }    
    
    private void tollListener(String searchText) {
    float num1 = Float.parseFloat(Maxtoll9.getText());
               float num2 = Float.parseFloat(Maxtoll8.getText());
               Maxtoll10.setText(String.valueOf(num1 + (num1 - num2))); 
}
    
    private void sovtimeListener(String searchText) {
               float num1 = Float.parseFloat(sovtime1.getText());
               float num2 = Float.parseFloat(sovtime2.getText());
               float num3 = Float.parseFloat(sovtime3.getText());
               float num4 = Float.parseFloat(sovtime4.getText());
               float num5 = Float.parseFloat(sovtime5.getText());
               float num6 = Float.parseFloat(sovtime6.getText());
               float num7 = Float.parseFloat(sovtime7.getText());
               float num8 = Float.parseFloat(sovtime8.getText());
               float num9 = Float.parseFloat(sovtime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               sovtime10.setText(String.valueOf(twoDForm.format(num10))); 
}
    
    private void hovtimeListener(String searchText) {
               float num1 = Float.parseFloat(hovtime1.getText());
               float num2 = Float.parseFloat(hovtime2.getText());
               float num3 = Float.parseFloat(hovtime3.getText());
               float num4 = Float.parseFloat(hovtime4.getText());
               float num5 = Float.parseFloat(hovtime5.getText());
               float num6 = Float.parseFloat(hovtime6.getText());
               float num7 = Float.parseFloat(hovtime7.getText());
               float num8 = Float.parseFloat(hovtime8.getText());
               float num9 = Float.parseFloat(hovtime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               hovtime10.setText(String.valueOf(twoDForm.format(num10))); 
}
    
     private void sovttimeListener(String searchText) {
               float num1 = Float.parseFloat(sovttime1.getText());
               float num2 = Float.parseFloat(sovttime2.getText());
               float num3 = Float.parseFloat(sovttime3.getText());
               float num4 = Float.parseFloat(sovttime4.getText());
               float num5 = Float.parseFloat(sovttime5.getText());
               float num6 = Float.parseFloat(sovttime6.getText());
               float num7 = Float.parseFloat(sovttime7.getText());
               float num8 = Float.parseFloat(sovttime8.getText());
               float num9 = Float.parseFloat(sovttime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               sovttime10.setText(String.valueOf(twoDForm.format(num10))); 
}
     
      private void suttimeListener(String searchText) {
                float num1 = Float.parseFloat(suttime1.getText());
               float num2 = Float.parseFloat(suttime2.getText());
               float num3 = Float.parseFloat(suttime3.getText());
               float num4 = Float.parseFloat(suttime4.getText());
               float num5 = Float.parseFloat(suttime5.getText());
               float num6 = Float.parseFloat(suttime6.getText());
               float num7 = Float.parseFloat(suttime7.getText());
               float num8 = Float.parseFloat(suttime8.getText());
               float num9 = Float.parseFloat(suttime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               suttime10.setText(String.valueOf(twoDForm.format(num10)));  
}
      
        private void stttimeListener(String searchText) {
               float num1 = Float.parseFloat(stttime1.getText());
               float num2 = Float.parseFloat(stttime2.getText());
               float num3 = Float.parseFloat(stttime3.getText());
               float num4 = Float.parseFloat(stttime4.getText());
               float num5 = Float.parseFloat(stttime5.getText());
               float num6 = Float.parseFloat(stttime6.getText());
               float num7 = Float.parseFloat(stttime7.getText());
               float num8 = Float.parseFloat(stttime8.getText());
               float num9 = Float.parseFloat(stttime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               stttime10.setText(String.valueOf(twoDForm.format(num10)));  
}
        
        private void stdtimeListener(String searchText) {
               float num1 = Float.parseFloat(stdtime1.getText());
               float num2 = Float.parseFloat(stdtime2.getText());
               float num3 = Float.parseFloat(stdtime3.getText());
               float num4 = Float.parseFloat(stdtime4.getText());
               float num5 = Float.parseFloat(stdtime5.getText());
               float num6 = Float.parseFloat(stdtime6.getText());
               float num7 = Float.parseFloat(stdtime7.getText());
               float num8 = Float.parseFloat(stdtime8.getText());
               float num9 = Float.parseFloat(stdtime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               stdtime10.setText(String.valueOf(twoDForm.format(num10)));  
}
        
        private void spvtimeListener(String searchText) {
               float num1 = Float.parseFloat(spvtime1.getText());
               float num2 = Float.parseFloat(spvtime2.getText());
               float num3 = Float.parseFloat(spvtime3.getText());
               float num4 = Float.parseFloat(spvtime4.getText());
               float num5 = Float.parseFloat(spvtime5.getText());
               float num6 = Float.parseFloat(spvtime6.getText());
               float num7 = Float.parseFloat(spvtime7.getText());
               float num8 = Float.parseFloat(spvtime8.getText());
               float num9 = Float.parseFloat(spvtime9.getText());
               float num10 = 100 - (num1+num2+num3+num4+num5+num6+num7+num8+num9);
               
               spvtime10.setText(String.valueOf(twoDForm.format(num10)));  
}

    @FXML
    private void handletimeBackButton(ActionEvent event) throws IOException {
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
    private void handletimeNextButton(ActionEvent event) throws IOException {
         Stage stage; 
        Parent root;
        Button nextButton =(Button) event.getSource();
        stage=(Stage) nextButton.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Objective.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handletimeHelpButton(ActionEvent event) {
        Button closeButton =(Button) event.getSource();
         Stage stage = (Stage) closeButton.getScene().getWindow();
         stage.close();
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
    
}

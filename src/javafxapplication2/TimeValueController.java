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
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
        ComboBox timeday = Singleton.getInstance().gettimeofday();
        if(!timeday.getValue().equals(" "))
        {
            double[] zeros = new double[10];
            double[] tens = {10,10,10,10,10,10,10,10,10,10};
            setTimeValues(tens, zeros, zeros, zeros, zeros, zeros, zeros);
        }
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
        //sovttime1,sovttime2,sovttime3,sovttime4,sovttime5,sovttime6,sovttime7,sovttime8,sovttime9,sovttime10
        Singleton.getInstance().setsovtime1(sovtime1);
        Singleton.getInstance().setsovtime2(sovtime2);
        Singleton.getInstance().setsovtime3(sovtime3);
        Singleton.getInstance().setsovtime4(sovtime4);
        Singleton.getInstance().setsovtime5(sovtime5);
        Singleton.getInstance().setsovtime6(sovtime6);
        Singleton.getInstance().setsovtime7(sovtime7);
        Singleton.getInstance().setsovtime8(sovtime8);
        Singleton.getInstance().setsovtime9(sovtime9);
        Singleton.getInstance().setsovtime10(sovtime10);
        //
        Singleton.getInstance().setsovttime1(sovttime1);
        Singleton.getInstance().setsovttime2(sovttime2);
        Singleton.getInstance().setsovttime3(sovttime3);
        Singleton.getInstance().setsovttime4(sovttime4);
        Singleton.getInstance().setsovttime5(sovttime5);
        Singleton.getInstance().setsovttime6(sovttime6);
        Singleton.getInstance().setsovttime7(sovttime7);
        Singleton.getInstance().setsovttime8(sovttime8);
        Singleton.getInstance().setsovttime9(sovttime9);
        Singleton.getInstance().setsovttime10(sovttime10);
        //
        Singleton.getInstance().sethovtime1(hovtime1);
        Singleton.getInstance().sethovtime2(hovtime2);
        Singleton.getInstance().sethovtime3(hovtime3);
        Singleton.getInstance().sethovtime4(hovtime4);
        Singleton.getInstance().sethovtime5(hovtime5);
        Singleton.getInstance().sethovtime6(hovtime6);
        Singleton.getInstance().sethovtime7(hovtime7);
        Singleton.getInstance().sethovtime8(hovtime8);
        Singleton.getInstance().sethovtime9(hovtime9);
        Singleton.getInstance().sethovtime10(hovtime10);
        
        Singleton.getInstance().setsuttime1(suttime1);
        Singleton.getInstance().setsuttime2(suttime2);
        Singleton.getInstance().setsuttime3(suttime3);
        Singleton.getInstance().setsuttime4(suttime4);
        Singleton.getInstance().setsuttime5(suttime5);
        Singleton.getInstance().setsuttime6(suttime6);
        Singleton.getInstance().setsuttime7(suttime7);
        Singleton.getInstance().setsuttime8(suttime8);
        Singleton.getInstance().setsuttime9(suttime9);
        Singleton.getInstance().setsuttime10(suttime10);
        //
         Singleton.getInstance().setstttime1(stttime1);
        Singleton.getInstance().setstttime2(stttime2);
        Singleton.getInstance().setstttime3(stttime3);
        Singleton.getInstance().setstttime4(stttime4);
        Singleton.getInstance().setstttime5(stttime5);
        Singleton.getInstance().setstttime6(stttime6);
        Singleton.getInstance().setstttime7(stttime7);
        Singleton.getInstance().setstttime8(stttime8);
        Singleton.getInstance().setstttime9(stttime9);
        Singleton.getInstance().setstttime10(stttime10);
        //
        Singleton.getInstance().setstdtime1(stdtime1);
        Singleton.getInstance().setstdtime2(stdtime2);
        Singleton.getInstance().setstdtime3(stdtime3);
        Singleton.getInstance().setstdtime4(stdtime4);
        Singleton.getInstance().setstdtime5(stdtime5);
        Singleton.getInstance().setstdtime6(stdtime6);
        Singleton.getInstance().setstdtime7(stdtime7);
        Singleton.getInstance().setstdtime8(stdtime8);
        Singleton.getInstance().setstdtime9(stdtime9);
        Singleton.getInstance().setstdtime10(stdtime10);
        
        
        Singleton.getInstance().setspvtime1(spvtime1);
        Singleton.getInstance().setspvtime2(spvtime2);
        Singleton.getInstance().setspvtime3(spvtime3);
        Singleton.getInstance().setspvtime4(spvtime4);
        Singleton.getInstance().setspvtime5(spvtime5);
        Singleton.getInstance().setspvtime6(spvtime6);
        Singleton.getInstance().setspvtime7(spvtime7);
        Singleton.getInstance().setspvtime8(spvtime8);
        Singleton.getInstance().setspvtime9(spvtime9);
        Singleton.getInstance().setspvtime10(spvtime10);
        
        
        
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
    
    private void setTimeValues(double[] sovval,double[] hovval,double[] sovtval,double[] sutval,double[] sttval,double[] stdval,double[] spvhval)
    {
        sovtime1.setText(twoDForm.format(sovval[0]));
        sovtime2.setText(twoDForm.format(sovval[1]));
        sovtime3.setText(twoDForm.format(sovval[2]));
        sovtime4.setText(twoDForm.format(sovval[3]));
        sovtime5.setText(twoDForm.format(sovval[4]));
        sovtime6.setText(twoDForm.format(sovval[5]));
        sovtime7.setText(twoDForm.format(sovval[6]));
        sovtime8.setText(twoDForm.format(sovval[7]));
        sovtime9.setText(twoDForm.format(sovval[8]));
        hovtime1.setText(twoDForm.format(hovval[0]));
        hovtime2.setText(twoDForm.format(hovval[1]));
        hovtime3.setText(twoDForm.format(hovval[2]));
        hovtime4.setText(twoDForm.format(hovval[3]));
        hovtime5.setText(twoDForm.format(hovval[4]));
        hovtime6.setText(twoDForm.format(hovval[5]));
        hovtime7.setText(twoDForm.format(hovval[6]));
        hovtime8.setText(twoDForm.format(hovval[7]));
        hovtime9.setText(twoDForm.format(hovval[8]));
        sovttime1.setText(twoDForm.format(sovtval[0]));
        sovttime2.setText(twoDForm.format(sovtval[1]));
        sovttime3.setText(twoDForm.format(sovtval[2]));
        sovttime4.setText(twoDForm.format(sovtval[3]));
        sovttime5.setText(twoDForm.format(sovtval[4]));
        sovttime6.setText(twoDForm.format(sovtval[5]));
        sovttime7.setText(twoDForm.format(sovtval[6]));
        sovttime8.setText(twoDForm.format(sovtval[7]));
        sovttime9.setText(twoDForm.format(sovtval[8]));
        suttime1.setText(twoDForm.format(sutval[0]));
        suttime2.setText(twoDForm.format(sutval[1]));
        suttime3.setText(twoDForm.format(sutval[2]));
        suttime4.setText(twoDForm.format(sutval[3]));
        suttime5.setText(twoDForm.format(sutval[4]));
        suttime6.setText(twoDForm.format(sutval[5]));
        suttime7.setText(twoDForm.format(sutval[6]));
        suttime8.setText(twoDForm.format(sutval[7]));
        suttime9.setText(twoDForm.format(sutval[8]));
        stttime1.setText(twoDForm.format(sttval[0]));
        stttime2.setText(twoDForm.format(sttval[1]));
        stttime3.setText(twoDForm.format(sttval[2]));
        stttime4.setText(twoDForm.format(sttval[3]));
        stttime5.setText(twoDForm.format(sttval[4]));
        stttime6.setText(twoDForm.format(sttval[5]));
        stttime7.setText(twoDForm.format(sttval[6]));
        stttime8.setText(twoDForm.format(sttval[7]));
        stttime9.setText(twoDForm.format(sttval[8]));
        stdtime1.setText(twoDForm.format(stdval[0]));
        stdtime2.setText(twoDForm.format(stdval[1]));
        stdtime3.setText(twoDForm.format(stdval[2]));
        stdtime4.setText(twoDForm.format(stdval[3]));
        stdtime5.setText(twoDForm.format(stdval[4]));
        stdtime6.setText(twoDForm.format(stdval[5]));
        stdtime7.setText(twoDForm.format(stdval[6]));
        stdtime8.setText(twoDForm.format(stdval[7]));
        stdtime9.setText(twoDForm.format(stdval[8]));
        spvtime1.setText(twoDForm.format(spvhval[0]));
        spvtime2.setText(twoDForm.format(spvhval[1]));
        spvtime3.setText(twoDForm.format(spvhval[2]));
        spvtime4.setText(twoDForm.format(spvhval[3]));
        spvtime5.setText(twoDForm.format(spvhval[4]));
        spvtime6.setText(twoDForm.format(spvhval[5]));
        spvtime7.setText(twoDForm.format(spvhval[6]));
        spvtime8.setText(twoDForm.format(spvhval[7]));
        spvtime9.setText(twoDForm.format(spvhval[8]));
    }
    
}

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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author saravanakumar
 */
public class ResultController implements Initializable {

    /**
     * Initializes the controller class.
     */
    DecimalFormat f = new DecimalFormat("##.00");
    @FXML 
    private WebView webengine;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        RegenerateData();
    }    

    @FXML
    private void handleresulthelp(ActionEvent event) {
    }

    @FXML
    private void handleresultclose(ActionEvent event) {
         Button closeButton =(Button) event.getSource();
         Stage stage = (Stage) closeButton.getScene().getWindow();
         stage.close();
    }

    @FXML
    private void handleresultback(ActionEvent event) throws IOException {
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
    
    private void RegenerateData()
    {
        final WebEngine content =  webengine.getEngine();
        double speedobj = Double.parseDouble(Singleton.getInstance().getspeedtextsing().getText());
        double Toll = Double.parseDouble(Singleton.getInstance().gettolltextsing().getText());        
        RadioButton speedradio = Singleton.getInstance().getspeedradio();
        RadioButton tollradio = Singleton.getInstance().gettollradio();
        ComboBox ModelDropDown = Singleton.getInstance().getModelDropDown();
        long corridordemand = Long.parseLong(Singleton.getInstance().getcorridordemand().getText());
        StringBuilder html = new StringBuilder();
        int NoML = Integer.parseInt(Singleton.getInstance().getMLNoLanes().getText());
        int NoGP = Integer.parseInt(Singleton.getInstance().getGPNoLanes().getText());
        double Length_GP = Double.parseDouble(Singleton.getInstance().getGPLength().getText());
        double Length_ML = Double.parseDouble(Singleton.getInstance().getMLLength().getText());
        double Uf_GP = Double.parseDouble(Singleton.getInstance().getGpSpeed().getText());
        double Uf_ML = Double.parseDouble(Singleton.getInstance().getMLSpeed().getText());
        double CapGP = Double.parseDouble(Singleton.getInstance().getGPCapacity().getText());
        double CapML = Double.parseDouble(Singleton.getInstance().getMLCapacity().getText());
        double DeadSetter = Double.parseDouble(Singleton.getInstance().getdeadsetter().getText());
        html.append("<style>" +
                ".l {text-align: left}" +
                ".c {text-align: center}" +
                ".r {text-align: right}" +
                "table {width: 450px;}" +
                "caption {font-weight: bold; text-align: left; font-size: 15px; font-family: verdana;}" +
                "tfoot   {background-color: #efefff; font-weight: bold}" +
                "tbody.f  {text-align: left}" +
                "tfoot.f  {text-align: right}" +
                "div caption {font-size: 13px;}" +
                "div table thead th {background-color: #1365D1; color: #FFF; font-weight: bold;}" +
                "div table {border: 1px solid #06C; border-bottom: 0px;}" +
                "div table td, div table th {border-bottom: 1px solid #06C; text-align: center}" +
                "th, td {padding-left: 15px; padding-right: 10px; white-space: nowrap; font-family: verdana; font-size: 12px;}" +
                ".alternating {background-color: #93DEF0}" +
                "</style>");
        html.append("<table><caption>Volume Split between ML and GPL, Toll Scenario ");
        
        
        if (tollradio.isSelected())
        {
            html.append("1</caption><tr><td>Objective: SOV toll value per mile: $"+ f.format(Toll) + "</td></tr>");
        }
        else if (speedradio.isSelected())
        {
            html.append("2</caption><tr><td>Objective: Min desired speed on ML: "+f.format(speedobj)+" mph</td></tr>");
        }
        if(ModelDropDown.getValue().equals("Drake"))
        {
            html.append("<tr><td>Speed-flow model: Drake" + "</td></tr>");
        }
        else if(ModelDropDown.getValue().equals("Greenshield"))
        {
            html.append("<tr><td>Speed-flow model: Greenshield" + "</td></tr>");
        }
        else if(ModelDropDown.getValue().equals("Underwood"))
        {
            html.append("<tr><td>Speed-flow model: Underwood" + "</td></tr>");
        }
        html.append("<tr><td>Corridor Demand: ").append(corridordemand).append(" vph</td></tr>");
        html.append("<tr><td>Number of Managed Lanes: ").append(NoML).append(" lanes</td></tr>");
        html.append("<tr><td>Length of Managed Lane corridor: ").append(NoGP).append(" miles</td></tr>");
        html.append("<tr><td>Length of General Purpose Lane corridor: ").append(Length_GP).append(" miles</td></tr>");
        html.append("<tr><td>Free Flow Speed on General Purpose Lane: ").append(Uf_GP).append(" mph</td></tr>");
        html.append("<tr><td>Free Flow Speed on Managed Lane: " + Uf_ML + " mph</td></tr>");
        html.append("</table><br>");
        
        html.append("<div align='left'><table cellspacing='0'>" +
            "<caption>VOLUME AND TOLL SUMMARY:</caption><thead><tr>" +
            "<th class='l'>Vehicle Class</th>" +
            "<th class='c'>VolumeML (vph)</th>" +
            "<th class='c'>VolumeGP (vph)</th>" +
            "<th class='c'>ML Share (%)</th>" +
            "<th class='c'>Toll Value ($/mile)</th>" +
            "<th class='c'>Total Revenue ($/hr)</th>" +
            "</tr></thead><tbody>");
        
        //Code for regenerate data from c#
        double VML_SOV,
            VML_RHOV_M,
            VML_SOV_T,
            VML_LTr,
            VML_ELTr,
            VML_ELTr_T2,
            VML_SpVeh,
                MLFixedSov = 0,
        MLFixedSOVT = 0,
        MLFixedRHOV = 0,
        MLFixedLTr = 0,
        MLFixedELTr = 0,
        MLFixedELTr1 = 0,
        MLFixedELTr2 = 0,
        MLFixedSpVeh = 0;
        
        double Kc_GP = CapGP / (Uf_GP * Math.exp(-0.5));
        double Kc_ML = CapML / (Uf_ML * Math.exp(-0.5));
        double QcGP = CapGP * NoGP;
        double QcML = CapML * NoML;
        
        
        
        
        
        
        content.loadContent(html.toString());
        
    }    
    
}

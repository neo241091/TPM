/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author saravanakumar
 */
public class Singleton {
    private static Singleton instance = new Singleton();
     public static Singleton getInstance(){
            return instance;
        }
     private TextField speedtextsing,tolltextsing,corridordemand,MLNoLanes,GPNoLanes,GPLength,GpSpeed,
             MLSpeed,GPCapacity,MLCapacity,MLLength,deadsetter;
     private RadioButton TollRadio,speedRadio;
     private ComboBox ModelDropDown;
     
     public TextField getspeedtextsing() {
            return speedtextsing;
        }

        public void setspeedtextsing(TextField txtField2) {
           this.speedtextsing = txtField2;
        }
        
         public TextField gettolltextsing() {
            return tolltextsing;
        }

        public void settolltextsing(TextField txtField2) {
           this.tolltextsing = txtField2;
        }
        
         public RadioButton gettollradio() {
            return TollRadio;
        }

        public void settollradio(RadioButton txtField2) {
           this.TollRadio = txtField2;
        }
        
         public RadioButton getspeedradio() {
            return speedRadio;
        }

        public void setspeedradio(RadioButton txtField2) {
           this.speedRadio = txtField2;
        }
        
        public ComboBox getModelDropDown() {
            return ModelDropDown;
        }

        public void setModelDropDown(ComboBox txtField2) {
           this.ModelDropDown = txtField2;
        }
        
        public TextField getcorridordemand() {
            return corridordemand;
        }

        public void setcorridordemand(TextField txtField2) {
           this.corridordemand = txtField2;
        }
        
        public TextField getMLNoLanes() {
            return MLNoLanes;
        }

        public void setMLNoLanes(TextField txtField2) {
           this.MLNoLanes = txtField2;
        }
        
        public TextField getGPNoLanes() {
            return GPNoLanes;
        }

        public void setGPNoLanes(TextField txtField2) {
           this.GPNoLanes = txtField2;
        }
        
        public TextField getGPLength() {
            return GPLength;
        }

        public void setGPLength(TextField txtField2) {
           this.GPLength = txtField2;
        }
             
                
        public TextField getGpSpeed() {
            return GpSpeed;
        }

        public void setGpSpeed(TextField txtField2) {
           this.GpSpeed = txtField2;
        }
                
        public TextField getMLSpeed() {
            return MLSpeed;
        }

        public void setMLSpeed(TextField txtField2) {
           this.MLSpeed = txtField2;
        }
        
        public TextField getGPCapacity() {
            return GPCapacity;
        }

        public void setGPCapacity(TextField txtField2) {
           this.GPCapacity = txtField2;
        }
        
        public TextField getMLCapacity() {
            return MLCapacity;
        }

        public void setMLCapacity(TextField txtField2) {
           this.MLCapacity = txtField2;
        }
        
        public TextField getMLLength() {
            return MLLength;
        }

        public void setMLLength(TextField txtField2) {
           this.MLLength = txtField2;
        }
        
        public TextField getdeadsetter() {
            return deadsetter;
        }

        public void setdeadsetter(TextField txtField2) {
           this.deadsetter = txtField2;
        }
}

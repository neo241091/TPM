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
             MLSpeed,GPCapacity,MLCapacity,MLLength,deadsetter,sovvhmix,hovvhmix,sovtvhmix,sutvhmix,
             sttvhmix,stdvhmix,sphvhmix,sovpce,hovpce,sovtpce,sutpce,sttpce,stdpce,sphpce,
             sovtoll,hovtoll,sovttoll,suttoll,stttoll,stdtoll,spvtoll,GPDensity;
     
     private TextField Maxtoll1,Maxtoll2,Maxtoll3,Maxtoll4,Maxtoll5,Maxtoll6,Maxtoll7,Maxtoll8,Maxtoll9,Maxtoll10;
     private TextField MLDensity;
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
        
        public TextField getsovvhmix() {
            return sovvhmix;
        }

        public void setsovvhmix(TextField txtField2) {
           this.sovvhmix = txtField2;
        }
        
        public TextField gethovvhmix() {
            return hovvhmix;
        }

        public void sethovvhmix(TextField txtField2) {
           this.hovvhmix = txtField2;
        }
        
        public TextField getsovtvhmix() {
            return sovtvhmix;
        }

        public void setsovtvhmix(TextField txtField2) {
           this.sovtvhmix = txtField2;
        }
        
        public TextField getsutvhmix() {
            return sutvhmix;
        }

        public void setsutvhmix(TextField txtField2) {
           this.sutvhmix = txtField2;
        }
        
        public TextField getsttvhmix() {
            return sttvhmix;
        }

        public void setsttvhmix(TextField txtField2) {
           this.sttvhmix = txtField2;
        }
        
        public TextField getstdvhmix() {
            return stdvhmix;
        }

        public void setstdvhmix(TextField txtField2) {
           this.stdvhmix = txtField2;
        }
        
        public TextField getsphvhmix() {
            return sphvhmix;
        }

        public void setsphvhmix(TextField txtField2) {
           this.sphvhmix = txtField2;
        }
        
        public TextField getsovpce() {
            return sovpce;
        }

        public void setsovpce(TextField txtField2) {
           this.sovpce = txtField2;
        }
        
        public TextField gethovpce() {
            return hovpce;
        }

        public void sethovpce(TextField txtField2) {
           this.hovpce = txtField2;
        }
        
        public TextField getsovtpce() {
            return sovtpce;
        }

        public void setsovtpce(TextField txtField2) {
           this.sovtpce = txtField2;
        }
        
        public TextField getsutpce() {
            return sutpce;
        }

        public void setsutpce(TextField txtField2) {
           this.sutpce = txtField2;
        }
        
        public TextField getsttpce() {
            return sttpce;
        }

        public void setsttpce(TextField txtField2) {
           this.sttpce = txtField2;
        }
        
        public TextField getstdpce() {
            return stdpce;
        }

        public void setstdpce(TextField txtField2) {
           this.stdpce = txtField2;
        }
        
        public TextField getsphpce() {
            return sphpce;
        }

        public void setsphpce(TextField txtField2) {
           this.sphpce = txtField2;
        }
        
        public TextField getsovtoll() {
            return sovtoll;
        }

        public void setsovtoll(TextField txtField2) {
           this.sovtoll = txtField2;
        }
        
        public TextField gethovtoll() {
            return hovtoll;
        }

        public void sethovtoll(TextField txtField2) {
           this.hovtoll = txtField2;
        }
        
        public TextField getsovttoll() {
            return sovttoll;
        }

        public void setsovttoll(TextField txtField2) {
           this.sovttoll = txtField2;
        }
        
        public TextField getsuttoll() {
            return suttoll;
        }

        public void setsuttoll(TextField txtField2) {
           this.suttoll = txtField2;
        }
        
        public TextField getstttoll() {
            return stttoll;
        }

        public void setstttoll(TextField txtField2) {
           this.stttoll = txtField2;
        }
        
        public TextField getstdtoll() {
            return stdtoll;
        }

        public void setstdtoll(TextField txtField2) {
           this.stdtoll = txtField2;
        }
        
        public TextField getspvtoll() {
            return spvtoll;
        }

        public void setspvtoll(TextField txtField2) {
           this.spvtoll = txtField2;
        }        
        
        public TextField getMaxtoll1() {
            return Maxtoll1;
        }

        public void setMaxtoll1(TextField txtField2) {
           this.Maxtoll1 = txtField2;
        }
        public TextField getMaxtoll2() {
            return Maxtoll2;
        }

        public void setMaxtoll2(TextField txtField2) {
           this.Maxtoll2 = txtField2;
        }
        public TextField getMaxtoll3() {
            return Maxtoll3;
        }

        public void setMaxtoll3(TextField txtField2) {
           this.Maxtoll3 = txtField2;
        }
        public TextField getMaxtoll4() {
            return Maxtoll4;
        }

        public void setMaxtoll4(TextField txtField2) {
           this.Maxtoll4 = txtField2;
        }
        public TextField getMaxtoll5() {
            return Maxtoll5;
        }

        public void setMaxtoll5(TextField txtField2) {
           this.Maxtoll5 = txtField2;
        }
        public TextField getMaxtoll6() {
            return Maxtoll6;
        }

        public void setMaxtoll6(TextField txtField2) {
           this.Maxtoll6 = txtField2;
        }
        public TextField getMaxtoll7() {
            return Maxtoll7;
        }

        public void setMaxtoll7(TextField txtField2) {
           this.Maxtoll7 = txtField2;
        }
        public TextField getMaxtoll8() {
            return Maxtoll8;
        }

        public void setMaxtoll8(TextField txtField2) {
           this.Maxtoll8 = txtField2;
        }
        
        public TextField getMaxtoll9() {
            return Maxtoll9;
        }

        public void setMaxtoll9(TextField txtField2) {
           this.Maxtoll9 = txtField2;
        }
        
        public TextField getMaxtoll10() {
            return Maxtoll10;
        }

        public void setMaxtoll10(TextField txtField2) {
           this.Maxtoll10 = txtField2;
        }
        
        public TextField getMLDensity() {
            return MLDensity;
        }

        public void setMLDensity(TextField txtField2) {
           this.MLDensity = txtField2;
        }
        
        public TextField getGPDensity() {
            return GPDensity;
        }

        public void setGPDensity(TextField txtField2) {
           this.GPDensity = txtField2;
        }
}

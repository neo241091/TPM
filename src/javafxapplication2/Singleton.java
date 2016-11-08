/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.util.prefs.*;

/**
 *
 * @author saravanakumar
 */
public class Singleton {
    private static Singleton instance = new Singleton();
     public static Singleton getInstance(){
            return instance;
        }
     private Preferences prefs;
     private TextField speedtextsing,tolltextsing,corridordemand,MLNoLanes,GPNoLanes,GPLength,GpSpeed,
             MLSpeed,GPCapacity,MLCapacity,MLLength,deadsetter,sovvhmix,hovvhmix,sovtvhmix,sutvhmix,
             sttvhmix,stdvhmix,sphvhmix,sovpce,hovpce,sovtpce,sutpce,sttpce,stdpce,sphpce,
             sovtoll,hovtoll,sovttoll,suttoll,stttoll,stdtoll,spvtoll,GPDensity;
     
     private TextField Maxtoll1,Maxtoll2,Maxtoll3,Maxtoll4,Maxtoll5,Maxtoll6,Maxtoll7,Maxtoll8,Maxtoll9,Maxtoll10;
     private TextField MLDensity;
     private RadioButton TollRadio,speedRadio;
     private ComboBox ModelDropDown,timeofday;
     private CheckBox issovallowed,ishovallowed,issovtallowed,issutallowed,issttallowed,isstdallowed,isspvallowed;
     private CheckBox issovml,ishovml,issovtml,issutml,issttml,isstdml,isspvml;
     private TextField sovmlshare,hovmlshare,sovtmlshare,sutmlshare,sttmlshare,stdmlshare,spvmlshare;
     private TextField sovttime1,sovttime2,sovttime3,sovttime4,sovttime5,sovttime6,sovttime7,sovttime8,sovttime9,sovttime10;
     private TextField sovtime1,sovtime2,sovtime3,sovtime4,sovtime5,sovtime6,sovtime7,sovtime8,sovtime9,sovtime10;
    private TextField hovtime1,hovtime2,hovtime3,hovtime4,hovtime5,hovtime6,hovtime7,hovtime8,hovtime9,hovtime10;
    private TextField suttime1,suttime2,suttime3,suttime4,suttime5,suttime6,suttime7,suttime8,suttime9,suttime10;
    private TextField stttime1,stttime2,stttime3,stttime4,stttime5,stttime6,stttime7,stttime8,stttime9,stttime10;
    private TextField stdtime1,stdtime2,stdtime3,stdtime4,stdtime5,stdtime6,stdtime7,stdtime8,stdtime9,stdtime10;
    private TextField spvtime1,spvtime2,spvtime3,spvtime4,spvtime5,spvtime6,spvtime7,spvtime8,spvtime9,spvtime10;
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
        
        //private CheckBox issovallowed,ishovallowed,issovtallowed,issutallowed,issttallowed,isstdallowed,isspvallowed;
        public CheckBox getissovallowed() {
            return issovallowed;
        }

        public void setissovallowed(CheckBox txtField2) {
           this.issovallowed = txtField2;
        }
        public CheckBox getishovallowed() {
            return ishovallowed;
        }

        public void setishovallowed(CheckBox txtField2) {
           this.ishovallowed = txtField2;
        }
         public CheckBox getissovtallowed() {
            return issovtallowed;
        }

        public void setissovtallowed(CheckBox txtField2) {
           this.issovtallowed = txtField2;
        }
         public CheckBox getissutallowed() {
            return issutallowed;
        }

        public void setissutallowed(CheckBox txtField2) {
           this.issutallowed = txtField2;
        }
         public CheckBox getissttallowed() {
            return issttallowed;
        }

        public void setissttallowed(CheckBox txtField2) {
           this.issttallowed = txtField2;
        }
         public CheckBox getisstdallowed() {
            return isstdallowed;
        }

        public void setisstdallowed(CheckBox txtField2) {
           this.isstdallowed = txtField2;
        }
         public CheckBox getisspvallowed() {
            return isspvallowed;
        }

        public void setisspvallowed(CheckBox txtField2) {
           this.isspvallowed = txtField2;
        }
        //issovml,ishovml,issovtml,issutml,issttml,isstdml,isspvml
        
         public CheckBox getissovml() {
            return issovml;
        }

        public void setissovml(CheckBox txtField2) {
           this.issovml = txtField2;
        }
         public CheckBox getishovml() {
            return ishovml;
        }

        public void setishovml(CheckBox txtField2) {
           this.ishovml = txtField2;
        }
         public CheckBox getissovtml() {
            return issovtml;
        }

        public void setissovtml(CheckBox txtField2) {
           this.issovtml = txtField2;
        }
         public CheckBox getissutml() {
            return issutml;
        }

        public void setissutml(CheckBox txtField2) {
           this.issutml = txtField2;
        }
         public CheckBox getissttml() {
            return issttml;
        }

        public void setissttml(CheckBox txtField2) {
           this.issttml = txtField2;
        }
         public CheckBox getisstdml() {
            return isstdml;
        }

        public void setisstdml(CheckBox txtField2) {
           this.isstdml = txtField2;
        }
         public CheckBox getisspvml() {
            return isspvml;
        }

        public void setisspvml(CheckBox txtField2) {
           this.isspvml = txtField2;
        }
        //private TextField ,,,,,,;
        
        public TextField getsovmlshare() {
            return sovmlshare;
        }

        public void setsovmlshare(TextField txtField2) {
           this.sovmlshare = txtField2;
        }
        public TextField gethovmlshare() {
            return hovmlshare;
        }

        public void sethovmlshare(TextField txtField2) {
           this.hovmlshare = txtField2;
        }
        public TextField getsovtmlshare() {
            return sovtmlshare;
        }

        public void setsovtmlshare(TextField txtField2) {
           this.sovtmlshare = txtField2;
        }
        public TextField getsutmlshare() {
            return sutmlshare;
        }

        public void setsutmlshare(TextField txtField2) {
           this.sutmlshare = txtField2;
        }
        public TextField getsttmlshare() {
            return sttmlshare;
        }

        public void setsttmlshare(TextField txtField2) {
           this.sttmlshare = txtField2;
        }
        public TextField getstdmlshare() {
            return stdmlshare;
        }

        public void setstdmlshare(TextField txtField2) {
           this.stdmlshare = txtField2;
        }
        public TextField getspvmlshare() {
            return spvmlshare;
        }

        public void setspvmlshare(TextField txtField2) {
           this.spvmlshare = txtField2;
        }
        //private TextField sovttime1,sovttime2,sovttime3,sovttime4,sovttime5,sovttime6,sovttime7,sovttime8,sovttime9,sovttime10;
        public TextField getsovttime1() {
            return sovttime1;
        }

        public void setsovttime1(TextField txtField2) {
           this.sovttime1 = txtField2;
        }
        public TextField getsovttime2() {
            return sovttime2;
        }

        public void setsovttime2(TextField txtField2) {
           this.sovttime2 = txtField2;
        }
        public TextField getsovttime3() {
            return sovttime3;
        }

        public void setsovttime3(TextField txtField2) {
           this.sovttime3 = txtField2;
        }
        public TextField getsovttime4() {
            return sovttime4;
        }

        public void setsovttime4(TextField txtField2) {
           this.sovttime4 = txtField2;
        }
        public TextField getsovttime5() {
            return sovttime5;
        }

        public void setsovttime5(TextField txtField2) {
           this.sovttime5 = txtField2;
        }
        public TextField getsovttime6() {
            return sovttime6;
        }

        public void setsovttime6(TextField txtField2) {
           this.sovttime6 = txtField2;
        }
        public TextField getsovttime7() {
            return sovttime7;
        }

        public void setsovttime7(TextField txtField2) {
           this.sovttime7 = txtField2;
        }
        public TextField getsovttime8() {
            return sovttime8;
        }

        public void setsovttime8(TextField txtField2) {
           this.sovttime8 = txtField2;
        }
        public TextField getsovttime9() {
            return sovttime9;
        }

        public void setsovttime9(TextField txtField2) {
           this.sovttime9 = txtField2;
        }
        public TextField getsovttime10() {
            return sovttime10;
        }

        public void setsovttime10(TextField txtField2) {
           this.sovttime10 = txtField2;
        }
        
        public TextField getsovtime1() {
            return sovtime1;
        }
        
         public void setsovtime1(TextField txtField2) {
           this.sovtime1 = txtField2;
        }
        public TextField getsovtime2() {
            return sovtime2;
        }

        public void setsovtime2(TextField txtField2) {
           this.sovtime2 = txtField2;
        }
        public TextField getsovtime3() {
            return sovtime3;
        }

        public void setsovtime3(TextField txtField2) {
           this.sovtime3 = txtField2;
        }
        public TextField getsovtime4() {
            return sovtime4;
        }

        public void setsovtime4(TextField txtField2) {
           this.sovtime4 = txtField2;
        }
        public TextField getsovtime5() {
            return sovtime5;
        }

        public void setsovtime5(TextField txtField2) {
           this.sovtime5 = txtField2;
        }
        public TextField getsovtime6() {
            return sovtime6;
        }

        public void setsovtime6(TextField txtField2) {
           this.sovtime6 = txtField2;
        }
        public TextField getsovtime7() {
            return sovtime7;
        }

        public void setsovtime7(TextField txtField2) {
           this.sovtime7 = txtField2;
        }
        public TextField getsovtime8() {
            return sovtime8;
        }

        public void setsovtime8(TextField txtField2) {
           this.sovtime8 = txtField2;
        }
        public TextField getsovtime9() {
            return sovtime9;
        }

        public void setsovtime9(TextField txtField2) {
           this.sovtime9 = txtField2;
        }
        public TextField getsovtime10() {
            return sovtime10;
        }

        public void setsovtime10(TextField txtField2) {
           this.sovtime10 = txtField2;
        }
         public TextField gethovtime1() {
            return hovtime1;
        }
        
         public void sethovtime1(TextField txtField2) {
           this.hovtime1 = txtField2;
        }
        public TextField gethovtime2() {
            return hovtime2;
        }

        public void sethovtime2(TextField txtField2) {
           this.hovtime2 = txtField2;
        }
        public TextField gethovtime3() {
            return hovtime3;
        }

        public void sethovtime3(TextField txtField2) {
           this.hovtime3 = txtField2;
        }
        public TextField gethovtime4() {
            return hovtime4;
        }

        public void sethovtime4(TextField txtField2) {
           this.hovtime4 = txtField2;
        }
        public TextField gethovtime5() {
            return hovtime5;
        }

        public void sethovtime5(TextField txtField2) {
           this.hovtime5 = txtField2;
        }
        public TextField gethovtime6() {
            return hovtime6;
        }

        public void sethovtime6(TextField txtField2) {
           this.hovtime6 = txtField2;
        }
        public TextField gethovtime7() {
            return hovtime7;
        }

        public void sethovtime7(TextField txtField2) {
           this.hovtime7 = txtField2;
        }
        public TextField gethovtime8() {
            return hovtime8;
        }

        public void sethovtime8(TextField txtField2) {
           this.hovtime8 = txtField2;
        }
        public TextField gethovtime9() {
            return hovtime9;
        }

        public void sethovtime9(TextField txtField2) {
           this.hovtime9 = txtField2;
        }
        public TextField gethovtime10() {
            return hovtime10;
        }

        public void sethovtime10(TextField txtField2) {
           this.hovtime10 = txtField2;
        }
         public TextField getsuttime1() {
            return suttime1;
        }

        
          public void setsuttime1(TextField txtField2) {
           this.suttime1 = txtField2;
        }
        public TextField getsuttime2() {
            return suttime2;
        }

        public void setsuttime2(TextField txtField2) {
           this.suttime2 = txtField2;
        }
        public TextField getsuttime3() {
            return suttime3;
        }

        public void setsuttime3(TextField txtField2) {
           this.suttime3 = txtField2;
        }
        public TextField getsuttime4() {
            return suttime4;
        }

        public void setsuttime4(TextField txtField2) {
           this.suttime4 = txtField2;
        }
        public TextField getsuttime5() {
            return suttime5;
        }

        public void setsuttime5(TextField txtField2) {
           this.suttime5 = txtField2;
        }
        public TextField getsuttime6() {
            return suttime6;
        }

        public void setsuttime6(TextField txtField2) {
           this.suttime6 = txtField2;
        }
        public TextField getsuttime7() {
            return suttime7;
        }

        public void setsuttime7(TextField txtField2) {
           this.suttime7 = txtField2;
        }
        public TextField getsuttime8() {
            return suttime8;
        }

        public void setsuttime8(TextField txtField2) {
           this.suttime8 = txtField2;
        }
        public TextField getsuttime9() {
            return suttime9;
        }

        public void setsuttime9(TextField txtField2) {
           this.suttime9 = txtField2;
        }
        public TextField getsuttime10() {
            return suttime10;
        }

        public void setsuttime10(TextField txtField2) {
           this.suttime10 = txtField2;
        }
        public TextField getstttime1() {
            return stttime1;
        }
          public void setstttime1(TextField txtField2) {
           this.stttime1 = txtField2;
        }
        public TextField getstttime2() {
            return stttime2;
        }

        public void setstttime2(TextField txtField2) {
           this.stttime2 = txtField2;
        }
        public TextField getstttime3() {
            return stttime3;
        }

        public void setstttime3(TextField txtField2) {
           this.stttime3 = txtField2;
        }
        public TextField getstttime4() {
            return stttime4;
        }

        public void setstttime4(TextField txtField2) {
           this.stttime4 = txtField2;
        }
        public TextField getstttime5() {
            return stttime5;
        }

        public void setstttime5(TextField txtField2) {
           this.stttime5 = txtField2;
        }
        public TextField getstttime6() {
            return stttime6;
        }

        public void setstttime6(TextField txtField2) {
           this.stttime6 = txtField2;
        }
        public TextField getstttime7() {
            return stttime7;
        }

        public void setstttime7(TextField txtField2) {
           this.stttime7 = txtField2;
        }
        public TextField getstttime8() {
            return stttime8;
        }

        public void setstttime8(TextField txtField2) {
           this.stttime8 = txtField2;
        }
        public TextField getstttime9() {
            return stttime9;
        }

        public void setstttime9(TextField txtField2) {
           this.stttime9 = txtField2;
        }
        public TextField getstttime10() {
            return stttime10;
        }

        public void setstttime10(TextField txtField2) {
           this.stttime10 = txtField2;
        }
        public TextField getstdtime1() {
            return stdtime1;
        }
          public void setstdtime1(TextField txtField2) {
           this.stdtime1 = txtField2;
        }
        public TextField getstdtime2() {
            return stdtime2;
        }

        public void setstdtime2(TextField txtField2) {
           this.stdtime2 = txtField2;
        }
        public TextField getstdtime3() {
            return stdtime3;
        }

        public void setstdtime3(TextField txtField2) {
           this.stdtime3 = txtField2;
        }
        public TextField getstdtime4() {
            return stdtime4;
        }

        public void setstdtime4(TextField txtField2) {
           this.stdtime4 = txtField2;
        }
        public TextField getstdtime5() {
            return stdtime5;
        }

        public void setstdtime5(TextField txtField2) {
           this.stdtime5 = txtField2;
        }
        public TextField getstdtime6() {
            return stdtime6;
        }

        public void setstdtime6(TextField txtField2) {
           this.stdtime6 = txtField2;
        }
        public TextField getstdtime7() {
            return stdtime7;
        }

        public void setstdtime7(TextField txtField2) {
           this.stdtime7 = txtField2;
        }
        public TextField getstdtime8() {
            return stdtime8;
        }

        public void setstdtime8(TextField txtField2) {
           this.stdtime8 = txtField2;
        }
        public TextField getstdtime9() {
            return stdtime9;
        }

        public void setstdtime9(TextField txtField2) {
           this.stdtime9 = txtField2;
        }
        public TextField getstdtime10() {
            return stdtime10;
        }

        public void setstdtime10(TextField txtField2) {
           this.stdtime10 = txtField2;
        }
        public TextField getspvtime1() {
            return spvtime1;
        }
          public void setspvtime1(TextField txtField2) {
           this.spvtime1 = txtField2;
        }
        public TextField getspvtime2() {
            return spvtime2;
        }

        public void setspvtime2(TextField txtField2) {
           this.spvtime2 = txtField2;
        }
        public TextField getspvtime3() {
            return spvtime3;
        }

        public void setspvtime3(TextField txtField2) {
           this.spvtime3 = txtField2;
        }
        public TextField getspvtime4() {
            return spvtime4;
        }

        public void setspvtime4(TextField txtField2) {
           this.spvtime4 = txtField2;
        }
        public TextField getspvtime5() {
            return spvtime5;
        }

        public void setspvtime5(TextField txtField2) {
           this.spvtime5 = txtField2;
        }
        public TextField getspvtime6() {
            return spvtime6;
        }

        public void setspvtime6(TextField txtField2) {
           this.spvtime6 = txtField2;
        }
        public TextField getspvtime7() {
            return spvtime7;
        }

        public void setspvtime7(TextField txtField2) {
           this.spvtime7 = txtField2;
        }
        public TextField getspvtime8() {
            return spvtime8;
        }

        public void setspvtime8(TextField txtField2) {
           this.spvtime8 = txtField2;
        }
        public TextField getspvtime9() {
            return spvtime9;
        }

        public void setspvtime9(TextField txtField2) {
           this.spvtime9 = txtField2;
        }
        public TextField getspvtime10() {
            return spvtime10;
        }

        public void setspvtime10(TextField txtField2) {
           this.spvtime10 = txtField2;
        }
        
        public void settimeofday(ComboBox field)
        {
            this.timeofday = field;
        }
        
        public ComboBox gettimeofday()
        {
            return timeofday;
        }
        
        public void Save()
        {
            prefs = Preferences.userNodeForPackage(this.getClass());
            prefs.put("speedtextsing", speedtextsing.getText());
            prefs.put("tolltextsing", tolltextsing.getText());
            prefs.put("corridordemand", corridordemand.getText());
            prefs.put("MLNoLanes", MLNoLanes.getText());
            prefs.put("GPNoLanes", GPNoLanes.getText());
            prefs.put("GPLength", GPLength.getText());
            prefs.put("GpSpeed", GpSpeed.getText());
            prefs.put("MLSpeed", MLSpeed.getText());
            prefs.put("GPCapacity", GPCapacity.getText());
            prefs.put("MLCapacity", MLCapacity.getText());
            prefs.put("MLLength", MLLength.getText());
            prefs.put("deadsetter", deadsetter.getText());
            prefs.put("sovvhmix", sovvhmix.getText());
            prefs.put("hovvhmix", hovvhmix.getText());
            prefs.put("sovtvhmix", sovtvhmix.getText());
            prefs.put("sutvhmix", sutvhmix.getText());
            prefs.put("sttvhmix", sttvhmix.getText());
            prefs.put("stdvhmix", stdvhmix.getText());
            prefs.put("sphvhmix", sphvhmix.getText());
            prefs.put("sovpce", sovpce.getText());
            prefs.put("hovpce", hovpce.getText());
            prefs.put("sovtpce", sovtpce.getText());
            prefs.put("sutpce", sutpce.getText());
            prefs.put("sttpce", sttpce.getText());
            prefs.put("stdpce", stdpce.getText());
            prefs.put("sphpce", sphpce.getText());
            prefs.put("sovtoll", sovtoll.getText());
            prefs.put("hovtoll", hovtoll.getText());
            prefs.put("sovttoll", sovttoll.getText());
            prefs.put("suttoll", suttoll.getText());
            prefs.put("stttoll", stttoll.getText());
            prefs.put("stdtoll", stdtoll.getText());
            prefs.put("spvtoll", spvtoll.getText());
            prefs.put("GPDensity", GPDensity.getText());
            
            prefs.put("Maxtoll1", Maxtoll1.getText());
            prefs.put("Maxtoll2", Maxtoll2.getText());
            prefs.put("Maxtoll3", Maxtoll3.getText());
            prefs.put("Maxtoll4", Maxtoll4.getText());
            prefs.put("Maxtoll5", Maxtoll5.getText());
            prefs.put("Maxtoll6", Maxtoll6.getText());
            prefs.put("Maxtoll7", Maxtoll7.getText());
            prefs.put("Maxtoll8", Maxtoll8.getText());
            prefs.put("Maxtoll9", Maxtoll9.getText());
            prefs.put("Maxtoll10", Maxtoll10.getText());
            prefs.put("MLDensity", MLDensity.getText());
            
            prefs.put("sovmlshare", sovmlshare.getText());
            prefs.put("hovmlshare", hovmlshare.getText());
            prefs.put("sovtmlshare", sovtmlshare.getText());
            prefs.put("sutmlshare", sutmlshare.getText());
            prefs.put("sttmlshare", sttmlshare.getText());
            prefs.put("stdmlshare", stdmlshare.getText());
            prefs.put("spvmlshare", spvmlshare.getText());
            
            
            prefs.put("sovttime1", sovttime1.getText());
            prefs.put("sovttime2", sovttime2.getText());
            prefs.put("sovttime3", sovttime3.getText());
            prefs.put("sovttime4", sovttime4.getText());
            prefs.put("sovttime5", sovttime5.getText());
            prefs.put("sovttime6", sovttime6.getText());
            prefs.put("sovttime7", sovttime7.getText());
            prefs.put("sovttime8", sovttime8.getText());
            prefs.put("sovttime9", sovttime9.getText());
            prefs.put("sovttime10", sovttime10.getText());
            
            prefs.put("sovtime1", sovtime1.getText());
            prefs.put("sovtime2", sovtime2.getText());
            prefs.put("sovtime3", sovtime3.getText());
            prefs.put("sovtime4", sovtime4.getText());
            prefs.put("sovtime5", sovtime5.getText());
            prefs.put("sovtime6", sovtime6.getText());
            prefs.put("sovtime7", sovtime7.getText());
            prefs.put("sovtime8", sovtime8.getText());
            prefs.put("sovtime9", sovtime9.getText());
            prefs.put("sovtime10", sovtime10.getText());
            
            prefs.put("hovtime1", hovtime1.getText());
            prefs.put("hovtime2", hovtime2.getText());
            prefs.put("hovtime3", hovtime3.getText());
            prefs.put("hovtime4", hovtime4.getText());
            prefs.put("hovtime5", hovtime5.getText());
            prefs.put("hovtime6", hovtime6.getText());
            prefs.put("hovtime7", hovtime7.getText());
            prefs.put("hovtime8", hovtime8.getText());
            prefs.put("hovtime9", hovtime9.getText());
            prefs.put("hovtime10", hovtime10.getText());
            
            prefs.put("suttime1", suttime1.getText());
            prefs.put("suttime2", suttime2.getText());
            prefs.put("suttime3", suttime3.getText());
            prefs.put("suttime4", suttime4.getText());
            prefs.put("suttime5", suttime5.getText());
            prefs.put("suttime6", suttime6.getText());
            prefs.put("suttime7", suttime7.getText());
            prefs.put("suttime8", suttime8.getText());
            prefs.put("suttime9", suttime9.getText());
            prefs.put("suttime10", suttime10.getText());
            
            prefs.put("stttime1", stttime1.getText());
            prefs.put("stttime2", stttime2.getText());
            prefs.put("stttime3", stttime3.getText());
            prefs.put("stttime4", stttime4.getText());
            prefs.put("stttime5", stttime5.getText());
            prefs.put("stttime6", stttime6.getText());
            prefs.put("stttime7", stttime7.getText());
            prefs.put("stttime8", stttime8.getText());
            prefs.put("stttime9", stttime9.getText());
            prefs.put("stttime10", stttime10.getText());
            
            prefs.put("stdtime1", stdtime1.getText());
            prefs.put("stdtime2", stdtime2.getText());
            prefs.put("stdtime3", stdtime3.getText());
            prefs.put("stdtime4", stdtime4.getText());
            prefs.put("stdtime5", stdtime5.getText());
            prefs.put("stdtime6", stdtime6.getText());
            prefs.put("stdtime7", stdtime7.getText());
            prefs.put("stdtime8", stdtime8.getText());
            prefs.put("stdtime9", stdtime9.getText());
            prefs.put("stdtime10", stdtime10.getText());
            
            prefs.put("spvtime1", spvtime1.getText());
            prefs.put("spvtime2", spvtime2.getText());
            prefs.put("spvtime3", spvtime3.getText());
            prefs.put("spvtime4", spvtime4.getText());
            prefs.put("spvtime5", spvtime5.getText());
            prefs.put("spvtime6", spvtime6.getText());
            prefs.put("spvtime7", spvtime7.getText());
            prefs.put("spvtime8", spvtime8.getText());
            prefs.put("spvtime9", spvtime9.getText());
            prefs.put("spvtime10", spvtime10.getText());
            
            prefs.put("ModelDropDown", ModelDropDown.getValue().toString());
            prefs.put("timeofday", timeofday.getValue().toString());
            
            prefs.put("issovallowed", issovallowed.isSelected() ? "true" : "false");
            prefs.put("ishovallowed", ishovallowed.isSelected() ? "true" : "false");
            prefs.put("issovtallowed", issovtallowed.isSelected() ? "true" : "false");
            prefs.put("issutallowed", issutallowed.isSelected() ? "true" : "false");
            prefs.put("issttallowed", issttallowed.isSelected() ? "true" : "false");
            prefs.put("isstdallowed", isstdallowed.isSelected() ? "true" : "false");
            prefs.put("isspvallowed", isspvallowed.isSelected() ? "true" : "false");
            
            prefs.put("issovml", issovml.isSelected() ? "true" : "false");
            prefs.put("ishovml", ishovml.isSelected() ? "true" : "false");
            prefs.put("issovtml", issovtml.isSelected() ? "true" : "false");
            prefs.put("issutml", issutml.isSelected() ? "true" : "false");
            prefs.put("issovml", issovml.isSelected() ? "true" : "false");
            prefs.put("issttml", issttml.isSelected() ? "true" : "false");
            prefs.put("isstdml", isstdml.isSelected() ? "true" : "false");
            prefs.put("isspvml", isspvml.isSelected() ? "true" : "false");
            
        }
        /*private TextField speedtextsing,tolltextsing,corridordemand,MLNoLanes,GPNoLanes,GPLength,GpSpeed,
             MLSpeed,GPCapacity,MLCapacity,MLLength,deadsetter,sovvhmix,hovvhmix,sovtvhmix,sutvhmix,
             sttvhmix,stdvhmix,sphvhmix,sovpce,hovpce,sovtpce,sutpce,sttpce,stdpce,sphpce,
             sovtoll,hovtoll,sovttoll,suttoll,stttoll,stdtoll,spvtoll,GPDensity;
     
     private TextField Maxtoll1,Maxtoll2,Maxtoll3,Maxtoll4,Maxtoll5,Maxtoll6,Maxtoll7,Maxtoll8,Maxtoll9,Maxtoll10;
     private TextField MLDensity;
     private RadioButton TollRadio,speedRadio;
     private ComboBox ModelDropDown,timeofday;
     private CheckBox issovallowed,ishovallowed,issovtallowed,issutallowed,issttallowed,isstdallowed,isspvallowed;
     private CheckBox issovml,ishovml,issovtml,issutml,issttml,isstdml,isspvml;
     private TextField sovmlshare,hovmlshare,sovtmlshare,sutmlshare,sttmlshare,stdmlshare,spvmlshare;
     private TextField sovttime1,sovttime2,sovttime3,sovttime4,sovttime5,sovttime6,sovttime7,sovttime8,sovttime9,sovttime10;
     private TextField sovtime1,sovtime2,sovtime3,sovtime4,sovtime5,sovtime6,sovtime7,sovtime8,sovtime9,sovtime10;
    private TextField hovtime1,hovtime2,hovtime3,hovtime4,hovtime5,hovtime6,hovtime7,hovtime8,hovtime9,hovtime10;
    private TextField suttime1,suttime2,suttime3,suttime4,suttime5,suttime6,suttime7,suttime8,suttime9,suttime10;
    private TextField stttime1,stttime2,stttime3,stttime4,stttime5,stttime6,stttime7,stttime8,stttime9,stttime10;
    private TextField stdtime1,stdtime2,stdtime3,stdtime4,stdtime5,stdtime6,stdtime7,stdtime8,stdtime9,stdtime10;
    private TextField spvtime1,spvtime2,spvtime3,spvtime4,spvtime5,spvtime6,spvtime7,spvtime8,spvtime9,spvtime10;*/
}

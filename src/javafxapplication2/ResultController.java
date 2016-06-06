/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.awt.Insets;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
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
    
    private void MessageBox(String msg) throws IOException
    {
        Alert alert = new Alert(AlertType.ERROR, msg, ButtonType.OK);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.OK) 
        {
            Stage stage = new Stage();
            Pane myPane = null;
            myPane = FXMLLoader.load(getClass().getResource("createCategory.fxml"));
            Scene scene = new Scene(myPane);
            stage.setScene(scene);
            stage.show();
        }
    }
    
    
       
        double Length_GP,
        Length_ML,
        Uf_GP,
        Uf_ML,
        Uc_GP,
        Uc_ML,
        Kc_GP,
        Kc_ML,
        PMxVeh_SOV,
        PMxVeh_RHOV_M,
        PMxVeh_SOV_T,
        PMxVeh_LTr,
        PMxVeh_ELTr,
        PMxVeh_ELTr_T2,
        PMxVeh_SpVeh,
        PCE_SOV,
        PCE_RHOV_M,
        PCE_SOV_T,
        PCE_LTr,
        PCE_ELTr,
        PCE_ELTr_T2,
        PCE_SpVeh,
        Tolled,
        Tolled_SOV,
        Tolled_RHOV_M,
        Tolled_SOV_T,
        Tolled_LTr,
        Tolled_ELTr,
        Tolled_ELTr_T2,
        Tolled_SpVeh,
        UB_SOV,
        UB_RHOV_M,
        UB_SOV_T,
        UB_LTr,
        UB_ParaTrans,
        UB_ELTr_T2,
        UB_SpVeh,
        VT_RHOV_M_1,
        VT_RHOV_M_2,
        VT_RHOV_M_3,
        VT_RHOV_M_4,
        VT_RHOV_M_5,
        VT_RHOV_M_6,
        VT_RHOV_M_7,
        VT_RHOV_M_8,
        VT_RHOV_M_9,
        VT_RHOV_M_10,
        VT_SOV_T_1,
        VT_SOV_T_2,
        VT_SOV_T_3,
        VT_SOV_T_4,
        VT_SOV_T_5,
        VT_SOV_T_6,
        VT_SOV_T_7,
        VT_SOV_T_8,
        VT_SOV_T_9,
        VT_SOV_T_10,
        UBVT_RHOV_M_1,
        UBVT_RHOV_M_2,
        UBVT_RHOV_M_4,
        UBVT_RHOV_M_5,
        UBVT_RHOV_M_6,
        UBVT_RHOV_M_7,
        UBVT_RHOV_M_8,
        UBVT_RHOV_M_9,
        UBVT_RHOV_M_10,
        UBVT_SOV_T_1,
        UBVT_SOV_T_2,
        UBVT_SOV_T_3,
        UBVT_SOV_T_4,
        UBVT_SOV_T_5,
        UBVT_SOV_T_6,
        UBVT_SOV_T_7,
        UBVT_SOV_T_8,
        UBVT_SOV_T_9,
        UBVT_SOV_T_10,
        PVOT,
        PVOT_SOV_1,
        PVOT_SOV_2,
        PVOT_SOV_3,
        PVOT_SOV_4,
        PVOT_SOV_5,
        PVOT_SOV_6,
        PVOT_SOV_7,
        PVOT_SOV_8,
        PVOT_SOV_9,
        PVOT_SOV_10,
        PVOT_SOV_11,
        PVOT_SOV_12,
        PVOT_SOV_13,
        PVOT_SOV_14,
        PVOT_SOV_15,
        PVOT_SOV_16,
        PVOT_SOV_17,
        PVOT_SOV_18,
        PVOT_SOV_19,
        PVOT_SOV_20,
        VOT_SOV_1,
        VOT_SOV_2,
        VOT_SOV_3,
        VOT_SOV_4,
        VOT_SOV_5,
        VOT_SOV_6,
        VOT_SOV_7,
        VOT_SOV_8,
        VOT_SOV_9,
        VOT_SOV_10,
        VOT_RHOV_M_1,
        VOT_RHOV_M_2,
        VOT_RHOV_M_3,
        VOT_RHOV_M_4,
        VOT_RHOV_M_5,
        VOT_RHOV_M_6,
        VOT_RHOV_M_7,
        VOT_RHOV_M_8,
        VOT_RHOV_M_9,
        VOT_RHOV_M_10,
        VOT_SOV_T_1,
        VOT_SOV_T_2,
        VOT_SOV_T_3,
        VOT_SOV_T_4,
        VOT_SOV_T_5,
        VOT_SOV_T_6,
        VOT_SOV_T_7,
        VOT_SOV_T_8,
        VOT_SOV_T_9,
        VOT_SOV_T_10,
        VOT_LTr_1,
        VOT_LTr_2,
        VOT_LTr_3,
        VOT_LTr_4,
        VOT_LTr_5,
        VOT_LTr_6,
        VOT_LTr_7,
        VOT_LTr_8,
        VOT_LTr_9,
        VOT_LTr_10,
        VOT_ELTr_1,
        VOT_ELTr_2,
        VOT_ELTr_3,
        VOT_ELTr_4,
        VOT_ELTr_5,
        VOT_ELTr_6,
        VOT_ELTr_7,
        VOT_ELTr_8,
        VOT_ELTr_9,
        VOT_ELTr_10,
        VOT_ELTr_T2_1,
        VOT_ELTr_T2_2,
        VOT_ELTr_T2_3,
        VOT_ELTr_T2_4,
        VOT_ELTr_T2_5,
        VOT_ELTr_T2_6,
        VOT_ELTr_T2_7,
        VOT_ELTr_T2_8,
        VOT_ELTr_T2_9,
        VOT_ELTr_T2_10,
        VOT_SpVeh_1,
        VOT_SpVeh_2,
        VOT_SpVeh_3,
        VOT_SpVeh_4,
        VOT_SpVeh_5,
        VOT_SpVeh_6,
        VOT_SpVeh_7,
        VOT_SpVeh_8,
        VOT_SpVeh_9,
        VOT_SpVeh_10,
        PVOT_RHOV_M_1,
        PVOT_RHOV_M_2,
        PVOT_RHOV_M_3,
        PVOT_RHOV_M_4,
        PVOT_RHOV_M_5,
        PVOT_RHOV_M_6,
        PVOT_RHOV_M_7,
        PVOT_RHOV_M_8,
        PVOT_RHOV_M_9,
        PVOT_RHOV_M_10,
        PVOT_SOV_T_1,
        PVOT_SOV_T_2,
        PVOT_SOV_T_3,
        PVOT_SOV_T_4,
        PVOT_SOV_T_5,
        PVOT_SOV_T_6,
        PVOT_SOV_T_7,
        PVOT_SOV_T_8,
        PVOT_SOV_T_9,
        PVOT_SOV_T_10,
        PVOT_LTr_1,
        PVOT_LTr_2,
        PVOT_LTr_3,
        PVOT_LTr_4,
        PVOT_LTr_5,
        PVOT_LTr_6,
        PVOT_LTr_7,
        PVOT_LTr_8,
        PVOT_LTr_9,
        PVOT_LTr_10,
        PVOT_ELTr_1,
        PVOT_ELTr_2,
        PVOT_ELTr_3,
        PVOT_ELTr_4,
        PVOT_ELTr_5,
        PVOT_ELTr_6,
        PVOT_ELTr_7,
        PVOT_ELTr_8,
        PVOT_ELTr_9,
        PVOT_ELTr_10,
        PVOT_ELTr_T2_1,
        PVOT_ELTr_T2_2,
        PVOT_ELTr_T2_3,
        PVOT_ELTr_T2_4,
        PVOT_ELTr_T2_5,
        PVOT_ELTr_T2_6,
        PVOT_ELTr_T2_7,
        PVOT_ELTr_T2_8,
        PVOT_ELTr_T2_9,
        PVOT_ELTr_T2_10,
        PVOT_SpVeh_1,
        PVOT_SpVeh_2,
        PVOT_SpVeh_3,
        PVOT_SpVeh_4,
        PVOT_SpVeh_5,
        PVOT_SpVeh_6,
        PVOT_SpVeh_7,
        PVOT_SpVeh_8,
        PVOT_SpVeh_9,
        PVOT_SpVeh_10,
        LBVOT,
        LBVOT_SOV_1,
        LBVOT_SOV_2,
        LBVOT_SOV_3,
        LBVOT_SOV_4,
        LBVOT_SOV_5,
        LBVOT_SOV_6,
        LBVOT_SOV_7,
        LBVOT_SOV_8,
        LBVOT_SOV_9,
        LBVOT_SOV_10,
        LBVOT_RHOV_M_1,
        LBVOT_RHOV_M_2,
        LBVOT_RHOV_M_3,
        LBVOT_RHOV_M_4,
        LBVOT_RHOV_M_5,
        LBVOT_RHOV_M_6,
        LBVOT_RHOV_M_7,
        LBVOT_RHOV_M_8,
        LBVOT_RHOV_M_9,
        LBVOT_RHOV_M_10,
        LBVOT_SOV_T_1,
        LBVOT_SOV_T_2,
        LBVOT_SOV_T_3,
        LBVOT_SOV_T_4,
        LBVOT_SOV_T_5,
        LBVOT_SOV_T_6,
        LBVOT_SOV_T_7,
        LBVOT_SOV_T_8,
        LBVOT_SOV_T_9,
        LBVOT_SOV_T_10,
        LBVOT_LTr_1,
        LBVOT_LTr_2,
        LBVOT_LTr_3,
        LBVOT_LTr_4,
        LBVOT_LTr_5,
        LBVOT_LTr_6,
        LBVOT_LTr_7,
        LBVOT_LTr_8,
        LBVOT_LTr_9,
        LBVOT_LTr_10,
        LBVOT_ParaTran_1,
        LBVOT_ParaTran_2,
        LBVOT_ParaTran_3,
        LBVOT_ParaTran_4,
        LBVOT_ParaTran_5,
        LBVOT_ParaTran_6,
        LBVOT_ParaTran_7,
        LBVOT_ParaTran_8,
        LBVOT_ParaTran_9,
        LBVOT_ParaTran_10,
        LBVOT_ELTr_T2_1,
        LBVOT_ELTr_T2_2,
        LBVOT_ELTr_T2_3,
        LBVOT_ELTr_T2_4,
        LBVOT_ELTr_T2_5,
        LBVOT_ELTr_T2_6,
        LBVOT_ELTr_T2_7,
        LBVOT_ELTr_T2_8,
        LBVOT_ELTr_T2_9,
        LBVOT_ELTr_T2_10,
        LBVOT_SpVeh_1,
        LBVOT_SpVeh_2,
        LBVOT_SpVeh_3,
        LBVOT_SpVeh_4,
        LBVOT_SpVeh_5,
        LBVOT_SpVeh_6,
        LBVOT_SpVeh_7,
        LBVOT_SpVeh_8,
        LBVOT_SpVeh_9,
        LBVOT_SpVeh_10,
        UBVOT,
        UBVOT_SOV_1,
        UBVOT_SOV_2,
        UBVOT_SOV_3,
        UBVOT_SOV_4,
        UBVOT_SOV_5,
        UBVOT_SOV_6,
        UBVOT_SOV_7,
        UBVOT_SOV_8,
        UBVOT_SOV_9,
        UBVOT_SOV_10,
        UBVOT_RHOV_M_1,
        UBVOT_RHOV_M_2,
        UBVOT_RHOV_M_3,
        UBVOT_RHOV_M_4,
        UBVOT_RHOV_M_5,
        UBVOT_RHOV_M_6,
        UBVOT_RHOV_M_7,
        UBVOT_RHOV_M_8,
        UBVOT_RHOV_M_9,
        UBVOT_RHOV_M_10,
        UBVOT_SOV_T_1,
        UBVOT_SOV_T_2,
        UBVOT_SOV_T_3,
        UBVOT_SOV_T_4,
        UBVOT_SOV_T_5,
        UBVOT_SOV_T_6,
        UBVOT_SOV_T_7,
        UBVOT_SOV_T_8,
        UBVOT_SOV_T_9,
        UBVOT_SOV_T_10,
        UBVOT_LTr_1,
        UBVOT_LTr_2,
        UBVOT_LTr_3,
        UBVOT_LTr_4,
        UBVOT_LTr_5,
        UBVOT_LTr_6,
        UBVOT_LTr_7,
        UBVOT_LTr_8,
        UBVOT_LTr_9,
        UBVOT_LTr_10,
        UBVOT_ParaTran_1,
        UBVOT_ParaTran_2,
        UBVOT_ParaTran_3,
        UBVOT_ParaTran_4,
        UBVOT_ParaTran_5,
        UBVOT_ParaTran_6,
        UBVOT_ParaTran_7,
        UBVOT_ParaTran_8,
        UBVOT_ParaTran_9,
        UBVOT_ParaTran_10,
        UBVOT_ELTr_T2_1,
        UBVOT_ELTr_T2_2,
        UBVOT_ELTr_T2_3,
        UBVOT_ELTr_T2_4,
        UBVOT_ELTr_T2_5,
        UBVOT_ELTr_T2_6,
        UBVOT_ELTr_T2_7,
        UBVOT_ELTr_T2_8,
        UBVOT_ELTr_T2_9,
        UBVOT_ELTr_T2_10,
        UBVOT_SpVeh_1,
        UBVOT_SpVeh_2,
        UBVOT_SpVeh_3,
        UBVOT_SpVeh_4,
        UBVOT_SpVeh_5,
        UBVOT_SpVeh_6,
        UBVOT_SpVeh_7,
        UBVOT_SpVeh_8,
        UBVOT_SpVeh_9,
        UBVOT_SpVeh_10,
        VOT_Prev,
        VOT_Next,
        VOT,
        VOT1,
        VOT2,
        VOT3,
        VOT4,
        VOT5,
        VOT6,
        VOT7,
        VOT8,
        VOT9,
        VOT10,
        VOT11,
        VOT12,
        VOT13,
        VOT14,
        VOT15,
        VOT16,
        VOT17,
        VOT18,
        VOT19,
        VOT20,
        VOT21,
        VOT22,
        VOT23,
        VOT24,
        VOT25,
        VOT26,
        VOT27,
        VOT28,
        VOT29,
        VOT30,
        CTS_Base_1,
        CTS_Base_2,
        CTS_Base_3,
        CTS,
        CTS1,
        CTS2,
        CTS3,
        CTS4,
        CTS5,
        CTS6,
        CTS7,
        CTS8,
        CTS9,
        CTS10,
        CTS11,
        CTS12,
        CTS13,
        CTS14,
        CTS15,
        CTS16,
        CTS17,
        CTS18,
        CTS19,
        CTS20,
        CTS21,
        CTS22,
        CTS23,
        CTS24,
        CTS25,
        CTS26,
        CTS27,
        CTS28,
        CTS29,
        CTS30,
        TML,
        TGP,
        DiffT,
        Toll,
        Toll_Copy,
        Toll_Adj,
        TollPolicy_SOV,
        TollPolicy_RHOV_M,
        TollPolicy_SOV_T,
        TollPolicy_LTr,
        TollPolicy_ELTr,
        TollPolicy_ELTr_T2,
        TollPolicy_SpVeh,
        DeadSetter,
        MLFixedSov,
        MLFixedSOVT,
        MLFixedRHOV,
        MLFixedLTr,
        MLFixedELTr,
        MLFixedELTr1,
        MLFixedELTr2,
        MLFixedSpVeh,
        GPFixedSov,
        GPFixedSOVT,
        GPFixedRHOV,
        GPFixedLTr,
        GPFixedELTr,
        GPFixedELTr1,
        GPFixedELTr2,
        GPFixedSpVeh;
        double i, j, k, l, r, m, n, o, p, a, b, c, d, uGP, uML, NoGP, NoML, VML, VML25, VML20, VML15, VML10, VML05;
        double Q,
        QQ,
        QGP,
        QML,
        QcGP,
        QcML,
        CapGP,
        CapML,
        TCapGP,
        TCapML,
        IntVolGP,
        IntVolML,
        Demand,
        Demand_Adj,
        TVol_SOV,
        TVol_RHOV_M,
        TVol_SOV_T,
        TVol_LTr,
        TVol_ELTr,
        TVol_ELTr_T2,
        TVol_SpVeh,
        TotDemand,
        TotVol_SOV,
        TotVol_RHOV_M,
        TotVol_SOV_T,
        TotVol_LTr,
        TotVol_ELTr,
        TotVol_ELTr_T2,
        TotVol_SpVeh,
        Vol_SOV_Add,
        Vol_SOV_D,
        Vol_SOV_1,
        Vol_SOV_2,
        Vol_SOV_3,
        Vol_SOV_4,
        Vol_SOV_5,
        Vol_SOV_6,
        Vol_SOV_7,
        Vol_SOV_8,
        Vol_SOV_9,
        Vol_SOV_10,
        Vol_SOV_11,
        TVol_SOV_Prev,
        TVol_SOV_1,
        TVol_SOV_2,
        TVol_SOV_3,
        TVol_SOV_4,
        TVol_SOV_5,
        TVol_SOV_6,
        TVol_SOV_7,
        TVol_SOV_8,
        TVol_SOV_9,
        TVol_SOV_10,
        TVol_SOV_11,
        Vol_RHOV_M_Add,
        Vol_RHOV_M_D,
        Vol_RHOV_M_1,
        Vol_RHOV_M_2,
        Vol_RHOV_M_3,
        Vol_RHOV_M_4,
        Vol_RHOV_M_5,
        Vol_RHOV_M_6,
        Vol_RHOV_M_7,
        Vol_RHOV_M_8,
        Vol_RHOV_M_9,
        Vol_RHOV_M_10,
        TVol_RHOV_M_Prev,
        TVol_RHOV_M_1,
        TVol_RHOV_M_2,
        TVol_RHOV_M_3,
        TVol_RHOV_M_4,
        TVol_RHOV_M_5,
        TVol_RHOV_M_6,
        TVol_RHOV_M_7,
        TVol_RHOV_M_8,
        TVol_RHOV_M_9,
        TVol_RHOV_M_10,
        Vol_SOV_T_Add,
        Vol_SOV_T_D,
        Vol_SOV_T_1,
        Vol_SOV_T_2,
        Vol_SOV_T_3,
        Vol_SOV_T_4,
        Vol_SOV_T_5,
        Vol_SOV_T_6,
        Vol_SOV_T_7,
        Vol_SOV_T_8,
        Vol_SOV_T_9,
        Vol_SOV_T_10,
        TVol_SOV_T_Prev,
        TVol_SOV_T_1,
        TVol_SOV_T_2,
        TVol_SOV_T_3,
        TVol_SOV_T_4,
        TVol_SOV_T_5,
        TVol_SOV_T_6,
        TVol_SOV_T_7,
        TVol_SOV_T_8,
        TVol_SOV_T_9,
        TVol_SOV_T_10,
        Vol_LTr_Add,
        Vol_LTr_D,
        Vol_LTr_1,
        Vol_LTr_2,
        Vol_LTr_3,
        Vol_LTr_4,
        Vol_LTr_5,
        Vol_LTr_6,
        Vol_LTr_7,
        Vol_LTr_8,
        Vol_LTr_9,
        Vol_LTr_10,
        TVol_LTr_Prev,
        TVol_LTr_1,
        TVol_LTr_2,
        TVol_LTr_3,
        TVol_LTr_4,
        TVol_LTr_5,
        TVol_LTr_6,
        TVol_LTr_7,
        TVol_LTr_8,
        TVol_LTr_9,
        TVol_LTr_10,
        Vol_ELTr_Add,
        Vol_ELTr_D,
        Vol_ParaTran_1,
        Vol_ParaTran_2,
        Vol_ParaTran_3,
        Vol_ParaTran_4,
        Vol_ParaTran_5,
        Vol_ParaTran_6,
        Vol_ParaTran_7,
        Vol_ParaTran_8,
        Vol_ParaTran_9,
        Vol_ParaTran_10,
        Vol_ELTr_T2_Add,
        Vol_ELTr_T2_D,
        Vol_ELTr_T2_1,
        Vol_ELTr_T2_2,
        Vol_ELTr_T2_3,
        Vol_ELTr_T2_4,
        Vol_ELTr_T2_5,
        Vol_ELTr_T2_6,
        Vol_ELTr_T2_7,
        Vol_ELTr_T2_8,
        Vol_ELTr_T2_9,
        Vol_ELTr_T2_10,
        Vol_SpVeh_Add,
        Vol_SpVeh_D,
        Vol_SpVeh_1,
        Vol_SpVeh_2,
        Vol_SpVeh_3,
        Vol_SpVeh_4,
        Vol_SpVeh_5,
        Vol_SpVeh_6,
        Vol_SpVeh_7,
        Vol_SpVeh_8,
        Vol_SpVeh_9,
        Vol_SpVeh_10,
        TVol_ELTr_Prev,
        TVol_ELTr_1,
        TVol_ELTr_2,
        TVol_ELTr_3,
        TVol_ELTr_4,
        TVol_ELTr_5,
        TVol_ELTr_6,
        TVol_ELTr_7,
        TVol_ELTr_8,
        TVol_ELTr_9,
        TVol_ELTr_10,
        TVol_ELTr_T2_Prev,
        TVol_ELTr_T2_1,
        TVol_ELTr_T2_2,
        TVol_ELTr_T2_3,
        TVol_ELTr_T2_4,
        TVol_ELTr_T2_5,
        TVol_ELTr_T2_6,
        TVol_ELTr_T2_7,
        TVol_ELTr_T2_8,
        TVol_ELTr_T2_9,
        TVol_ELTr_T2_10,
        TVol_SpVeh_Prev,
        TVol_SpVeh_1,
        TVol_SpVeh_2,
        TVol_SpVeh_3,
        TVol_SpVeh_4,
        TVol_SpVeh_5,
        TVol_SpVeh_6,
        TVol_SpVeh_7,
        TVol_SpVeh_8,
        TVol_SpVeh_9,
        TVol_SpVeh_10,
        VolGP,
        VolGP_perlane,
        VolGP_Prev,
        VolGP_Base_1,
        VolGP_Base_2,
        VolGP_Base_3,
        VolGP_1,
        VolGP_2,
        VolGP_3,
        VolGP_4,
        VolGP_5,
        VolGP_6,
        VolGP_7,
        VolGP_8,
        VolGP_9,
        VolGP_10,
        VolML,
        VolML_perlane,
        VolML_Base_1,
        VolML_Base_2,
        VolML_Base_3,
        VolML_1,
        VolML_2,
        VolML_3,
        VolML_4,
        VolML_5,
        VolML_6,
        VolML_7,
        VolML_8,
        VolML_9,
        VolML_10,
        VolML_11,
        VolML_12,
        VolML_13,
        VolML_14,
        VolML_15,
        VolML_16,
        VolML_17,
        VolML_18,
        VolML_19,
        VolML_20,
        VolML_21,
        VolML_22,
        VolML_23,
        VolML_24,
        VolML_25,
        VolML_26,
        VolML_27,
        VolML_28,
        VolML_29,
        VolML_30;

    String C1, C2, C3, C4, C5;

    double VolGPBase,
        VolBase_SOV,
        VolBase_RHOV_M,
        VolBase_SOV_T,
        VolBase_LTr,
        VolBase_ELTr,
        VolBase_ELTr_T2,
        VolBase_SpVeh ;
    
    double UBcalvot;
    double PercentVOTdist, TollPolicyIteration;

    double UBpercent1,
        UBpercent2,
        UBpercent3,
        UBpercent4,
        UBpercent5,
        UBpercent6,
        UBpercent7,
        UBpercent8,
        UBpercent9,
        UBpercent10 ;
    double speedobj = Double.parseDouble(Singleton.getInstance().getspeedtextsing().getText());
    RadioButton speedradio = Singleton.getInstance().getspeedradio();
    RadioButton tollradio = Singleton.getInstance().gettollradio();
    ComboBox ModelDropDown = Singleton.getInstance().getModelDropDown();
    long corridordemand = Long.parseLong(Singleton.getInstance().getcorridordemand().getText());

    
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
        
        Toll = Double.parseDouble(Singleton.getInstance().gettolltextsing().getText());        
        
        StringBuilder html = new StringBuilder();
        NoML = Integer.parseInt(Singleton.getInstance().getMLNoLanes().getText());
        NoGP = Integer.parseInt(Singleton.getInstance().getGPNoLanes().getText());
        Length_GP = Double.parseDouble(Singleton.getInstance().getGPLength().getText());
        Length_ML = Double.parseDouble(Singleton.getInstance().getMLLength().getText());
        Uf_GP = Double.parseDouble(Singleton.getInstance().getGpSpeed().getText());
        Uf_ML = Double.parseDouble(Singleton.getInstance().getMLSpeed().getText());
        CapGP = Double.parseDouble(Singleton.getInstance().getGPCapacity().getText());
        CapML = Double.parseDouble(Singleton.getInstance().getMLCapacity().getText());
        DeadSetter = Double.parseDouble(Singleton.getInstance().getdeadsetter().getText());
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
            html.append("1</caption><tr><td>Objective: SOV toll value per mile: $").append(f.format(Toll)).append("</td></tr>");
        }
        else if (speedradio.isSelected())
        {
            html.append("2</caption><tr><td>Objective: Min desired speed on ML: ").append(f.format(speedobj)).append(" mph</td></tr>");
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
        html.append("<tr><td>Free Flow Speed on Managed Lane: ").append(Uf_ML).append(" mph</td></tr>");
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
        MLFixedSov = 0;
        MLFixedSOVT = 0;
        MLFixedRHOV = 0;
        MLFixedLTr = 0;
        MLFixedELTr = 0;
        MLFixedELTr1 = 0;
        MLFixedELTr2 = 0;
        MLFixedSpVeh = 0;
        
        Kc_GP = CapGP / (Uf_GP * Math.exp(-0.5));
        Kc_ML = CapML / (Uf_ML * Math.exp(-0.5));
        QcGP = CapGP * NoGP;
        QcML = CapML * NoML;
        Uc_GP = CapGP/Kc_GP;
        Uc_ML = CapML / Kc_ML;
        PMxVeh_SOV = Double.parseDouble(Singleton.getInstance().getsovvhmix().getText());
        PMxVeh_RHOV_M = Double.parseDouble(Singleton.getInstance().gethovvhmix().getText());
        PMxVeh_SOV_T = Double.parseDouble(Singleton.getInstance().getsovtvhmix().getText());
        PMxVeh_LTr = Double.parseDouble(Singleton.getInstance().getsutvhmix().getText());
        PMxVeh_ELTr = Double.parseDouble(Singleton.getInstance().getsttvhmix().getText());
        PMxVeh_ELTr_T2 = Double.parseDouble(Singleton.getInstance().getstdvhmix().getText());
        PMxVeh_SpVeh = Double.parseDouble(Singleton.getInstance().getsphvhmix().getText());
        PCE_SOV  = Double.parseDouble(Singleton.getInstance().getsovpce().getText());
        PCE_RHOV_M = Double.parseDouble(Singleton.getInstance().gethovpce().getText());
        PCE_SOV_T = Double.parseDouble(Singleton.getInstance().getsovtpce().getText());
        PCE_LTr = Double.parseDouble(Singleton.getInstance().getsutpce().getText());
        PCE_ELTr = Double.parseDouble(Singleton.getInstance().getsttpce().getText());
        PCE_ELTr_T2 = Double.parseDouble(Singleton.getInstance().getstdpce().getText());
        PCE_SpVeh = Double.parseDouble(Singleton.getInstance().getsphpce().getText());
        
        TollPolicy_SOV = Double.parseDouble(Singleton.getInstance().getsovtoll().getText())/100.0;
        TollPolicy_RHOV_M = Double.parseDouble(Singleton.getInstance().gethovtoll().getText())/100.0;
        TollPolicy_SOV_T = Double.parseDouble(Singleton.getInstance().getsovttoll().getText())/100.0;
        TollPolicy_LTr = Double.parseDouble(Singleton.getInstance().getsuttoll().getText())/100.0;
        TollPolicy_ELTr = Double.parseDouble(Singleton.getInstance().getstttoll().getText())/100.0;
        TollPolicy_ELTr_T2 = Double.parseDouble(Singleton.getInstance().getstdtoll().getText())/100.0;
        TollPolicy_SpVeh = Double.parseDouble(Singleton.getInstance().getspvtoll().getText())/100.0;
        
        Tolled_SOV = Toll * TollPolicy_SOV;
        Tolled_RHOV_M = Toll * TollPolicy_RHOV_M;
        Tolled_SOV_T = Toll * TollPolicy_SOV_T;
        Tolled_LTr = Toll * TollPolicy_LTr;
        Tolled_ELTr = Toll * TollPolicy_ELTr;
        Tolled_ELTr_T2 = Toll * TollPolicy_ELTr_T2;
        Tolled_SpVeh = Toll * TollPolicy_SpVeh;
        
        TVol_SOV = Demand * (PMxVeh_SOV / 100) * PCE_SOV;
        TVol_RHOV_M = Demand * (PMxVeh_RHOV_M / 100) * PCE_RHOV_M;
        TVol_SOV_T = Demand * (PMxVeh_SOV_T / 100) * PCE_SOV_T;
        TVol_LTr = Demand * (PMxVeh_LTr / 100) * PCE_LTr;
        TVol_ELTr = Demand * (PMxVeh_ELTr / 100) * PCE_ELTr;
        TVol_ELTr_T2 = Demand * (PMxVeh_ELTr_T2 / 100) * PCE_ELTr_T2;
        TVol_SpVeh = Demand * (PMxVeh_SpVeh / 100) * PCE_SpVeh;
        
        TotVol_SOV = Math.round(Demand * (PMxVeh_SOV / 100) * PCE_SOV);
        TotVol_RHOV_M = Math.round(Demand * (PMxVeh_RHOV_M / 100) * PCE_RHOV_M);
        TotVol_SOV_T = Math.round(Demand * (PMxVeh_SOV_T / 100) * PCE_SOV_T);
        TotVol_LTr = Math.round(Demand * (PMxVeh_LTr / 100) * PCE_LTr);
        TotVol_ELTr = Math.round(Demand * (PMxVeh_ELTr / 100) * PCE_ELTr);
        TotVol_ELTr_T2 = Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * PCE_ELTr_T2);
        TotVol_SpVeh = Math.round(Demand * (PMxVeh_SpVeh / 100) * PCE_SpVeh);
        
        TotDemand = TotVol_SOV + TotVol_RHOV_M + TotVol_SOV_T + TotVol_LTr + TotVol_ELTr +
                    TotVol_ELTr_T2 + TotVol_SpVeh;

        Demand_Adj = TVol_SOV + TVol_RHOV_M + TVol_SOV_T + TVol_LTr + TVol_ELTr + TVol_ELTr_T2 +
                     TVol_SpVeh;
        
        TCapGP = QcGP;
        TCapML = QcML;
        IntVolGP = Demand_Adj * TCapGP / (TCapGP + TCapML);
        IntVolML = Demand_Adj - IntVolGP;
        
        VOT1 = Double.parseDouble(Singleton.getInstance().getMaxtoll1().getText());
        VOT2 = Double.parseDouble(Singleton.getInstance().getMaxtoll2().getText());
        VOT3 = Double.parseDouble(Singleton.getInstance().getMaxtoll3().getText());
        VOT4 = Double.parseDouble(Singleton.getInstance().getMaxtoll4().getText());
        VOT5 = Double.parseDouble(Singleton.getInstance().getMaxtoll5().getText());
        VOT6 = Double.parseDouble(Singleton.getInstance().getMaxtoll6().getText());
        VOT7 = Double.parseDouble(Singleton.getInstance().getMaxtoll7().getText());
        VOT8 = Double.parseDouble(Singleton.getInstance().getMaxtoll8().getText());
        VOT9 = Double.parseDouble(Singleton.getInstance().getMaxtoll9().getText());
        VOT10 = Double.parseDouble(Singleton.getInstance().getMaxtoll10().getText());
        if(tollradio.isSelected() && QcGP == 0)
        {
            VolGP = 0;
            VolML = Demand_Adj;
            ChooseModelOptionForML();
            Toll_Copy = Toll;            
        }
        content.loadContent(html.toString());
        
    }    

    private void ChooseModelOptionForML() {
        double U = 0;
        double No = NoML;
        double Uf = Uf_ML;
        double Qc = CapML;
        double Kj = Double.parseDouble(Singleton.getInstance().getMLDensity().getText());
        if (tollradio.isSelected())
        {
            double Volperlane = VolML / No;
            if(Volperlane <= Qc)
            {
                U = Uf + 1;
                double Q = 0;
                double QQ = Volperlane;
                while(QQ <= Q)
                {
                    U -= 1;
                    Q = GetFlowBySelectedModel(U, Uf, Qc, Kj);
                }
            }
            else if(Volperlane > Qc)
            {
                U = 0;
                double Q = 0;
                double QQ = (2 * Qc) - Volperlane;
                if((int)Math.signum(QQ) == -1)
                {
                    try {
                        MessageBox(
                                "Demand exceeded twice the given capacity of the managed lane(s). Please reduce demand in the User page Calculation error");
                    } catch (IOException ex) {
                        Logger.getLogger(ResultController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                while(QQ <= Q)
                {
                    U += 1;
                    Q = GetFlowBySelectedModel(U, Uf, Qc, Kj);
                }
            }
            uML = U;            
        }
        else if (speedradio.isSelected())
                    {
                    U = Double.parseDouble(Singleton.getInstance().getspeedtextsing().getText());
                    Q = GetFlowBySelectedModel(U, Uf, Qc, Kj);
                    uML = U;
                    VolML = Q * No;
                    }
        
    }

    private double GetFlowBySelectedModel(double U, double Uf, double Qc, double Kj) {
        if(ModelDropDown.getValue().equals("Drake"))
        {
           double Uc = Uf * Math.exp(-0.5);
           double Kc = Qc / Uc;
           return (U * Kc * Math.sqrt(-2 * Math.log(U / Uf)));
        }
        else if(ModelDropDown.getValue().equals("Greenshield"))
        {
            return (U * Kj * (1 - (U / Uf)));
        }
        else if(ModelDropDown.getValue().equals("Underwood"))
        {
            double Uc = Uf * Math.exp(-1);
            double Kc = Qc / Uc;
            return (-U * Kc * Math.log(U / Uf));
        }
        return 0;
    }
    
}

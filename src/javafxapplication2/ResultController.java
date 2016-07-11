/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;
import java.util.*;

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
    
    Lane FinalVolume = new Lane();
    Lane FinalSpeed = new Lane();
    Lane FinalSpeed_Output = new Lane();
    HashMap<vehType, DataPoint> data = new HashMap<vehType,DataPoint>();
    private double[] TollPolicyHighest;
    private vehType[] VehClassHighest;
    
	private double PercentVOT1;
	private double PercentVOT2;
	private double PercentVOT3;
	private double PercentVOT4;
	private double PercentVOT5;
	private double PercentVOT6;
	private double PercentVOT7;
	private double PercentVOT8;
	private double PercentVOT9;
	private double PercentVOT10;
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
    double VML_SOV = 0;
    double VML_RHOV_M = 0;
    double VML_SOV_T = 0;
    double VML_LTr = 0;
    double VML_ELTr = 0;
    double VML_ELTr_T2 = 0;
    double VML_SpVeh = 0;
    
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
        
        String html = new String();
        NoML = Integer.parseInt(Singleton.getInstance().getMLNoLanes().getText());
        NoGP = Integer.parseInt(Singleton.getInstance().getGPNoLanes().getText());
        Length_GP = Double.parseDouble(Singleton.getInstance().getGPLength().getText());
        Length_ML = Double.parseDouble(Singleton.getInstance().getMLLength().getText());
        Uf_GP = Double.parseDouble(Singleton.getInstance().getGpSpeed().getText());
        Uf_ML = Double.parseDouble(Singleton.getInstance().getMLSpeed().getText());
        CapGP = Double.parseDouble(Singleton.getInstance().getGPCapacity().getText());
        CapML = Double.parseDouble(Singleton.getInstance().getMLCapacity().getText());
        DeadSetter = Double.parseDouble(Singleton.getInstance().getdeadsetter().getText())/100.0;
        html += ("<style>" +
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
        html+=("<table><caption>Volume Split between ML and GPL, Toll Scenario ");
        
        
        if (tollradio.isSelected())
        {
            html+=("1</caption><tr><td>Objective: SOV toll value per mile: $");
            html+=(f.format(Toll));
            html+=("</td></tr>");
        }
        else if (speedradio.isSelected())
        {
            html+=("2</caption><tr><td>Objective: Min desired speed on ML: ");
            html+=(f.format(speedobj));
            html+=(" mph</td></tr>");
        }
        if(ModelDropDown.getValue().equals("Drake"))
        {
            html+=("<tr><td>Speed-flow model: Drake" + "</td></tr>");
        }
        else if(ModelDropDown.getValue().equals("Greenshield"))
        {
            html+=("<tr><td>Speed-flow model: Greenshield" + "</td></tr>");
        }
        else if(ModelDropDown.getValue().equals("Underwood"))
        {
            html+=("<tr><td>Speed-flow model: Underwood" + "</td></tr>");
        }
        html+=("<tr><td>Corridor Demand: ");
        html+=(corridordemand);
        Demand = corridordemand;
        html+=(" vph</td></tr>");
        html+=("<tr><td>Number of Managed Lanes: ");
        html+=(NoML);
        html+=(" lanes</td></tr>");
        html+=("<tr><td>Length of Managed Lane corridor: ");
        html+=(NoGP);
        html+=(" miles</td></tr>");
        html+=("<tr><td>Length of General Purpose Lane corridor: ");
        html+=(Length_GP);
        html+=(" miles</td></tr>");
        html+=("<tr><td>Free Flow Speed on General Purpose Lane: ");
        html+=(Uf_GP);
        html+=(" mph</td></tr>");
        html+=("<tr><td>Free Flow Speed on Managed Lane: ");
        html+=(Uf_ML);
        html+=(" mph</td></tr>");
        html+=("</table><br>");
        
        html+=("<div align='left'><table cellspacing='0'>" +
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
        data = CreateBlankDatabase();
        if(tollradio.isSelected() && QcGP == 0)
        {
            VolGP = 0;
            VolML = Demand_Adj;
            ChooseModelOptionForML();
            Toll_Copy = Toll;            
            FinalVolume.setGP(VolGP);
            FinalVolume.setML(VolML);
            FinalSpeed.setGP(1);
            FinalSpeed.setML(uML);
            FinalSpeed_Output.setGP(0);
            FinalSpeed_Output.setML(uML);

           data.get(vehType.SOV).getVolume().setGP(Math.round(Demand * (PMxVeh_SOV / 100) * (TCapGP / (TCapGP + TCapML)) + VolBase_SOV));
           data.get(vehType.RHOV_M).getVolume().setGP(Math.round(Demand * (PMxVeh_RHOV_M / 100) * (TCapGP / (TCapGP + TCapML)) + VolBase_RHOV_M));
           data.get(vehType.SOV_T).getVolume().setGP(Math.round(Demand * (PMxVeh_SOV_T / 100) * (TCapGP / (TCapGP + TCapML))));
           data.get(vehType.LTr).getVolume().setGP(Math.round(Demand * (PMxVeh_LTr / 100) * (TCapGP / (TCapGP + TCapML))));
           data.get(vehType.ELTr).getVolume().setGP(Math.round(Demand * (PMxVeh_ELTr / 100) * (TCapGP / (TCapGP + TCapML))));
           data.get(vehType.ELTr_T2).getVolume().setGP(Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * (TCapGP / (TCapGP + TCapML))));
           data.get(vehType.SpVeh).getVolume().setGP(Math.round(Demand * (PMxVeh_SpVeh / 100) * (TCapGP / (TCapGP + TCapML))));
           data.get(vehType.Total).getVolume().setGP(Math.round(Demand * (TCapGP / (TCapGP + TCapML))));

           data.get(vehType.SOV).getVolume().setML(Math.round(Demand * (PMxVeh_SOV / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.RHOV_M).getVolume().setML(Math.round(Demand * (PMxVeh_RHOV_M / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.SOV_T).getVolume().setML(Math.round(Demand * (PMxVeh_SOV_T / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.LTr).getVolume().setML(Math.round(Demand * (PMxVeh_LTr / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.ELTr).getVolume().setML(Math.round(Demand * (PMxVeh_ELTr / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.ELTr_T2).getVolume().setML(Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.SpVeh).getVolume().setML(Math.round(Demand * (PMxVeh_SpVeh / 100) * (TCapML / (TCapGP + TCapML))));
           data.get(vehType.Total).getVolume().setML(Math.round(Demand * (TCapML / (TCapGP + TCapML))));
        }
        else if(tollradio.isSelected() && QcML == 0)
        {
            //Toll objective
                VolGP = Demand_Adj;
                VolML = 0;
                //Choose the Q-K-U model to calculate speed
                ChooseModelOptionForGP();

                //for fixing the overwriting problem
                Toll_Copy = Toll;
                Toll = Toll_Copy;

                // prepare the outputs
                FinalVolume.setGP(VolGP);
                FinalVolume.setML(VolML);
                FinalSpeed.setGP(uGP);
                FinalSpeed.setML(1);

                //for answer in HTML only - overwrite FinalSpeed.ML
                FinalSpeed_Output.setGP(uGP);
                FinalSpeed_Output.setML(0);

                data.get(vehType.SOV).getVolume().setGP(Math.round(Demand * (PMxVeh_SOV / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.RHOV_M).getVolume().setGP(Math.round(Demand * (PMxVeh_RHOV_M / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.SOV_T).getVolume().setGP(Math.round(Demand * (PMxVeh_SOV_T / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.LTr).getVolume().setGP(Math.round(Demand * (PMxVeh_LTr / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.ELTr).getVolume().setGP(Math.round(Demand * (PMxVeh_ELTr / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.ELTr_T2).getVolume().setGP(Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.SpVeh).getVolume().setGP(Math.round(Demand * (PMxVeh_SpVeh / 100) * (TCapGP / (TCapGP + TCapML))));
                data.get(vehType.Total).getVolume().setGP(Math.round(Demand * (TCapGP / (TCapGP + TCapML))));

                data.get(vehType.SOV).getVolume().setML(Math.round(Demand * (PMxVeh_SOV / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.RHOV_M).getVolume().setML(Math.round(Demand * (PMxVeh_RHOV_M / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.SOV_T).getVolume().setML(Math.round(Demand * (PMxVeh_SOV_T / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.LTr).getVolume().setML(Math.round(Demand * (PMxVeh_LTr / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.ELTr).getVolume().setML(Math.round(Demand * (PMxVeh_ELTr / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.ELTr_T2).getVolume().setML(Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.SpVeh).getVolume().setML(Math.round(Demand * (PMxVeh_SpVeh / 100) * (TCapML / (TCapGP + TCapML))));
                data.get(vehType.Total).getVolume().setML(Math.round(Demand * (TCapML / (TCapGP + TCapML))));
        }
        else if (tollradio.isSelected() && Toll == 0.0)
        {
            VolGP = IntVolGP;
            VolML = IntVolML;
            //Choose the Q-K-U model to calculate speed
            ChooseModelOptionForGP();
            ChooseModelOptionForML();

            //for fixing the overwriting problem
            Toll_Copy = Toll;

            // prepare the outputs
            FinalVolume.setGP(VolGP);
            FinalVolume.setML(VolML);
            FinalSpeed.setGP(uGP);
            FinalSpeed.setML(uML);

            //for answer in HTML only - overwrite FinalSpeed.ML
            FinalSpeed_Output.setGP(uGP);
            FinalSpeed_Output.setML(uML);

            data.get(vehType.SOV).getVolume().setGP(Math.round(Demand * (PMxVeh_SOV / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.RHOV_M).getVolume().setGP(Math.round(Demand * (PMxVeh_RHOV_M / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.SOV_T).getVolume().setGP(Math.round(Demand * (PMxVeh_SOV_T / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.LTr).getVolume().setGP(Math.round(Demand * (PMxVeh_LTr / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.ELTr).getVolume().setGP(Math.round(Demand * (PMxVeh_ELTr / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.ELTr_T2).getVolume().setGP(Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.SpVeh).getVolume().setGP(Math.round(Demand * (PMxVeh_SpVeh / 100) * (TCapGP / (TCapGP + TCapML))));
            data.get(vehType.Total).getVolume().setGP(Math.round(Demand * (TCapGP / (TCapGP + TCapML))));

            data.get(vehType.SOV).getVolume().setML(Math.round(Demand * (PMxVeh_SOV / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.RHOV_M).getVolume().setML(Math.round(Demand * (PMxVeh_RHOV_M / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.SOV_T).getVolume().setML(Math.round(Demand * (PMxVeh_SOV_T / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.LTr).getVolume().setML(Math.round(Demand * (PMxVeh_LTr / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.ELTr).getVolume().setML(Math.round(Demand * (PMxVeh_ELTr / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.ELTr_T2).getVolume().setML(Math.round(Demand * (PMxVeh_ELTr_T2 / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.SpVeh).getVolume().setML(Math.round(Demand * (PMxVeh_SpVeh / 100) * (TCapML / (TCapGP + TCapML))));
            data.get(vehType.Total).getVolume().setML(Math.round(Demand * (TCapML / (TCapGP + TCapML))));
        }
        else if (tollradio.isSelected() && Toll > 0.0)
        {
            CalculateTrueNumberOfVehicles(1);
            //Seach for final VOT interval. When succeeded, Call TollObjective Function.
            //Call SearchFinalVOTIntervalByCTS_VOT()
            //Generate random number to calculate SOV,HOV,LTr
            GenerateRandomAdditionalVehicle();
            //Choose the Q-K-U model to calculate speed
            ChooseModelOptionForGP();
            ChooseModelOptionForML();

            //for fixing the overwriting problem
            Toll_Copy = Toll;
            if (CTS10 > VOT10 && TollPolicy_RHOV_M == 0)
            {
                    //outputs are coded in section comparing CTS and VOT

            }
            else if (CTS20 > VOT10 && Tolled_SOV_T == 0)
            {
                    //outputs are coded in section comparing CTS and VOT

            }
            else if (CTS30 > VOT10)
            {
                    //outputs are coded in section comparing CTS and VOT

            }
            else
			{
				//prepare the outputs
				FinalVolume.setGP(VolGP);
				FinalVolume.setML(VolML);
				FinalSpeed.setGP(uGP);
				FinalSpeed.setML(uML);

				//for answer in HTML only - overwrite FinalSpeed.ML
				FinalSpeed_Output.setGP(uGP);
				FinalSpeed_Output.setML(uML);

				if (Singleton.getInstance().getissovml().isSelected() == false)
				{
					data.get(vehType.SOV).getVolume().setGP(Math.round((TVol_SOV_Prev + m) / PCE_SOV));
				}
				else
				{
					 data.get(vehType.SOV).getVolume().setGP(Math.round(GPFixedSov / PCE_SOV));
				}
				if (Singleton.getInstance().getishovml().isSelected() == false)
				{
					data.get(vehType.RHOV_M).getVolume().setGP(Math.round((TVol_RHOV_M_Prev + n) / PCE_RHOV_M));
				}
				else
				{
					 data.get(vehType.RHOV_M).getVolume().setGP(Math.round(GPFixedRHOV / PCE_RHOV_M));
				}
				if (Singleton.getInstance().getissovtml().isSelected() == false)
				{
					data.get(vehType.SOV_T).getVolume().setGP(Math.round((TVol_SOV_T_Prev + o) / PCE_SOV_T));
				}
				else
				{
					 data.get(vehType.SOV_T).getVolume().setGP(Math.round(GPFixedSOVT / PCE_SOV_T));
				}
				if (Singleton.getInstance().getissutml().isSelected() == false)
				{
					data.get(vehType.LTr).getVolume().setGP(Math.round((TVol_LTr_Prev + p) / PCE_LTr));
				}
				else
				{
					 data.get(vehType.LTr).getVolume().setGP(Math.round(GPFixedLTr / PCE_LTr));
				}
				if (Singleton.getInstance().getissttml().isSelected() == false)
				{
					data.get(vehType.ELTr).getVolume().setGP(Math.round((TVol_ELTr_Prev + a) / PCE_ELTr));
				}
				else
				{
					 data.get(vehType.ELTr).getVolume().setGP(Math.round(GPFixedELTr / PCE_ELTr));
				}
				if (Singleton.getInstance().getisstdml().isSelected() == false)
				{
					data.get(vehType.ELTr_T2).getVolume().setGP(Math.round((TVol_ELTr_T2_Prev + c) / PCE_ELTr_T2));
				}
				else
				{
					 data.get(vehType.ELTr_T2).getVolume().setGP(Math.round(GPFixedELTr2 / PCE_ELTr_T2));
				}
				if (Singleton.getInstance().getisspvml().isSelected() == false)
				{
					data.get(vehType.SpVeh).getVolume().setGP(Math.round((TVol_SpVeh_Prev + d) / PCE_SpVeh));
				}
				else
				{
					 data.get(vehType.SpVeh).getVolume().setGP(Math.round(GPFixedSpVeh / PCE_SpVeh));
				}
				data.get(vehType.Total).getVolume().setGP(data.get(vehType.SOV).getVolume().getGP() + data.get(vehType.RHOV_M).getVolume().getGP() + data.get(vehType.SOV_T).getVolume().getGP() + data.get(vehType.LTr).getVolume().getGP() + data.get(vehType.ELTr).getVolume().getGP() + data.get(vehType.ELTr_T2).getVolume().getGP() + data.get(vehType.SpVeh).getVolume().getGP());

				if (Singleton.getInstance().getissovml().isSelected() == false)
				{
					VML_SOV = Math.round((TotVol_SOV - (TVol_SOV_Prev + m)) / PCE_SOV);
				}
				else
				{
					 VML_SOV = Math.round(MLFixedSov / PCE_SOV);
				}
				if (Singleton.getInstance().getishovml().isSelected() == false)
				{
					VML_RHOV_M = Math.round((TotVol_RHOV_M - (TVol_RHOV_M_Prev + m)) / PCE_RHOV_M);
				}
				else
				{
					 VML_RHOV_M = Math.round(MLFixedRHOV / PCE_RHOV_M);
				}
				if (Singleton.getInstance().getissovtml().isSelected() == false)
				{
					VML_SOV_T = Math.round((TotVol_SOV_T - (TVol_SOV_T_Prev + o)) / PCE_SOV_T);
				}
				else
				{
					 VML_SOV_T = Math.round(MLFixedSOVT / PCE_SOV_T);
				}
				if (Singleton.getInstance().getissutml().isSelected() == false)
				{
					VML_LTr = Math.round((TotVol_LTr - (TVol_LTr_Prev + p)) / PCE_LTr);
				}
				else
				{
					 VML_LTr = Math.round(MLFixedLTr / PCE_LTr);
				}
				if (Singleton.getInstance().getissttml().isSelected() == false)
				{
					VML_ELTr = Math.round((TotVol_ELTr - (TVol_ELTr_Prev + a)) / PCE_ELTr);
				}
				else
				{
					 VML_ELTr = Math.round(MLFixedELTr / PCE_ELTr);
				}
				if (Singleton.getInstance().getisstdml().isSelected() == false)
				{
					VML_ELTr_T2 = Math.round((TotVol_ELTr_T2 - (TVol_ELTr_T2_Prev + c)) / PCE_ELTr_T2);
				}
				else
				{
					 VML_ELTr_T2 = Math.round(MLFixedELTr2 / PCE_ELTr_T2);
				}
				if (Singleton.getInstance().getisspvml().isSelected() == false)
				{
					VML_SpVeh = Math.round((TotVol_SpVeh - (TVol_SpVeh_Prev + d)) / PCE_SpVeh);
				}
				else
				{
					 VML_SpVeh = Math.round(MLFixedSpVeh / PCE_SpVeh);
				}


				if (VML_SOV < 0)
				{
					data.get(vehType.SOV).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.SOV).getVolume().setML(VML_SOV);
				}

				if (VML_RHOV_M < 0)
				{
					data.get(vehType.RHOV_M).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.RHOV_M).getVolume().setML(VML_RHOV_M);
				}

				if (VML_SOV_T < 0)
				{
					data.get(vehType.SOV_T).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.SOV_T).getVolume().setML(VML_SOV_T);
				}

				if (VML_LTr < 0)
				{
					data.get(vehType.LTr).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.LTr).getVolume().setML(VML_LTr);
				}

				if (VML_ELTr < 0)
				{
					data.get(vehType.ELTr).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.ELTr).getVolume().setML(VML_ELTr);
				}

				if (VML_ELTr_T2 < 0)
				{
					data.get(vehType.ELTr_T2).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.ELTr_T2).getVolume().setML(VML_ELTr_T2);
				}
				if (VML_SpVeh < 0)
				{
					data.get(vehType.SpVeh).getVolume().setML(0);
				}
				else
				{
					data.get(vehType.SpVeh).getVolume().setML(VML_SpVeh);
				}

				data.get(vehType.Total).getVolume().setML(data.get(vehType.SOV).getVolume().getML() + data.get(vehType.RHOV_M).getVolume().getML() + data.get(vehType.SOV_T).getVolume().getML() + data.get(vehType.LTr).getVolume().getML() + data.get(vehType.ELTr).getVolume().getML() + data.get(vehType.ELTr_T2).getVolume().getML() + data.get(vehType.SpVeh).getVolume().getML());
			}
        }
        else if (speedradio.isSelected())
		{
			//Speed objective
			//Get the speed
			uML = speedobj;

			//Find the volume on ML from given speed
			ChooseModelOptionForML();

			//Find the volume on GP and per lane
			VolGP = Demand_Adj - VolML;
			//VolGP_perlane = VolGP / NoGP

			//Calculate the GP Speed
			ChooseModelOptionForGP();

			CalculateTrueNumberOfVehicles(1);
			//for ML, speed is provided in objective so it does not need to calculate by condition. 
			//It uses the speed to calculate the volume directly.
			//Then it will use the same algorithm as tollobjective to calculate the GP speed.

			i = (int)java.lang.Math.round(VolGP - VolGP_Prev);

			GenerateRandomAdditionalVehicle();

			SpeedObjective();

			Toll_Copy = Toll;

			//prepare the outputs
			FinalVolume.setGP(VolGP);
			FinalVolume.setML(VolML);
			FinalSpeed.setGP(uGP);
			FinalSpeed.setML(uML);

			//for answer in HTML only - overwrite FinalSpeed.ML
			FinalSpeed_Output.setGP(uGP);
			FinalSpeed_Output.setML(uML);

			data.get(vehType.SOV).getVolume().setGP(Math.round((TVol_SOV_Prev + m) / PCE_SOV));
			data.get(vehType.RHOV_M).getVolume().setGP(Math.round((TVol_RHOV_M_Prev + n) / PCE_RHOV_M));
			data.get(vehType.SOV_T).getVolume().setGP(Math.round((TVol_SOV_T_Prev + o) / PCE_SOV_T));
			data.get(vehType.LTr).getVolume().setGP(Math.round((TVol_LTr_Prev + p) / PCE_LTr));
			data.get(vehType.ELTr).getVolume().setGP(Math.round((TVol_ELTr_Prev + a) / PCE_ELTr));
			data.get(vehType.ELTr_T2).getVolume().setGP(Math.round((TVol_ELTr_T2_Prev + c) / PCE_ELTr_T2));
			data.get(vehType.SpVeh).getVolume().setGP(Math.round((TVol_SpVeh_Prev + d) / PCE_SpVeh));

			data.get(vehType.Total).getVolume().setGP(Math.round((TVol_SOV_Prev + m) / PCE_SOV) + Math.round((TVol_RHOV_M_Prev + n) / PCE_RHOV_M) + Math.round((TVol_SOV_T_Prev + o) / PCE_SOV_T) + Math.round((TVol_LTr_Prev + p) / PCE_LTr) + Math.round((TVol_ELTr_Prev + a) / PCE_ELTr) + Math.round((TVol_ELTr_T2_Prev + c) / PCE_ELTr_T2) + Math.round((TVol_SpVeh_Prev + d) / PCE_SpVeh));

			data.get(vehType.SOV).getVolume().setML(Math.round((TotVol_SOV - (TVol_SOV_Prev + m)) / PCE_SOV));
			data.get(vehType.RHOV_M).getVolume().setML(Math.round((TotVol_RHOV_M - (TVol_RHOV_M_Prev + n)) / PCE_RHOV_M));
			data.get(vehType.SOV_T).getVolume().setML(Math.round((TotVol_SOV_T - (TVol_SOV_T_Prev + o)) / PCE_SOV_T));
			data.get(vehType.LTr).getVolume().setML(Math.round((TotVol_LTr - (TVol_LTr_Prev + p)) / PCE_LTr));
			data.get(vehType.ELTr).getVolume().setML(Math.round((TotVol_ELTr - (TVol_ELTr_Prev + a)) / PCE_ELTr));
			data.get(vehType.ELTr_T2).getVolume().setML(Math.round((TotVol_ELTr_T2 - (TVol_ELTr_T2_Prev + c)) / PCE_ELTr_T2));
			data.get(vehType.SpVeh).getVolume().setML(Math.round((TotVol_SpVeh - (TVol_SpVeh_Prev + d)) / PCE_SpVeh));

			data.get(vehType.Total).getVolume().setML(data.get(vehType.SOV).getVolume().getML() + data.get(vehType.RHOV_M).getVolume().getML() + data.get(vehType.SOV_T).getVolume().getML() + data.get(vehType.LTr).getVolume().getML() + data.get(vehType.ELTr).getVolume().getML() + data.get(vehType.ELTr_T2).getVolume().getML() + data.get(vehType.SpVeh).getVolume().getML());
		}
        
        if (Math.round(data.get(vehType.Total).getVolume().getML() + data.get(vehType.Total).getVolume().getGP()) != Math.round(Demand))
		{
			short diff = (short)java.lang.Math.round((data.get(vehType.Total).getVolume().getML() + data.get(vehType.Total).getVolume().getGP()) - Demand);
			int toSubtract = 1;
			if (diff > 0)
			{
				while (diff != 0 && data.get(vehType.Total).getVolume().getGP() > 0 && toSubtract > 0)
				{
					toSubtract = 0;
					if (data.get(vehType.SOV).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getissovml().isSelected() == false)
					{
						data.get(vehType.SOV).getVolume().setGP(data.get(vehType.SOV).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					if (data.get(vehType.RHOV_M).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getishovml().isSelected() == false)
					{
						data.get(vehType.RHOV_M).getVolume().setGP(data.get(vehType.RHOV_M).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					if (data.get(vehType.SOV_T).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getissovtml().isSelected() == false)
					{
						data.get(vehType.SOV_T).getVolume().setGP(data.get(vehType.SOV_T).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					if (data.get(vehType.LTr).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getissutml().isSelected() == false)
					{
						data.get(vehType.LTr).getVolume().setGP(data.get(vehType.LTr).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					if (data.get(vehType.ELTr).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getissttml().isSelected() == false)
					{
						data.get(vehType.ELTr).getVolume().setGP(data.get(vehType.ELTr).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					if (data.get(vehType.ELTr_T2).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getisstdml().isSelected() == false)
					{
						data.get(vehType.ELTr_T2).getVolume().setGP(data.get(vehType.ELTr_T2).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					if (data.get(vehType.SpVeh).getVolume().getGP() > 0 && diff > 0 && Singleton.getInstance().getisspvml().isSelected() == false)
					{
						data.get(vehType.SpVeh).getVolume().setGP(data.get(vehType.SpVeh).getVolume().getGP() - 1);
						diff -= 1;
						toSubtract += 1;
					}
					data.get(vehType.Total).getVolume().setGP(data.get(vehType.Total).getVolume().getGP() - toSubtract);
				}
				if (diff > 0)
				{
					toSubtract = 1;
					while (diff != 0 && data.get(vehType.Total).getVolume().getML() > 0 && toSubtract > 0)
					{
						toSubtract = 0;
						if (data.get(vehType.SOV).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getissovml().isSelected() == false)
						{
							data.get(vehType.SOV).getVolume().setML(data.get(vehType.SOV).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						if (data.get(vehType.RHOV_M).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getishovml().isSelected() == false)
						{
							data.get(vehType.RHOV_M).getVolume().setML(data.get(vehType.RHOV_M).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						if (data.get(vehType.SOV_T).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getissovtml().isSelected() == false)
						{
							data.get(vehType.SOV_T).getVolume().setML(data.get(vehType.SOV_T).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						if (data.get(vehType.LTr).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getissutml().isSelected() == false)
						{
							data.get(vehType.LTr).getVolume().setML(data.get(vehType.LTr).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						if (data.get(vehType.ELTr).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getissttml().isSelected() == false)
						{
							data.get(vehType.ELTr).getVolume().setML(data.get(vehType.ELTr).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						if (data.get(vehType.ELTr_T2).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getisstdml().isSelected() == false)
						{
							data.get(vehType.ELTr_T2).getVolume().setML(data.get(vehType.ELTr_T2).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						if (data.get(vehType.SpVeh).getVolume().getML() > 0 && diff > 0 && Singleton.getInstance().getisspvml().isSelected() == false)
						{
							data.get(vehType.SpVeh).getVolume().setML(data.get(vehType.SpVeh).getVolume().getML() - 1);
							diff -= 1;
							toSubtract += 1;
						}
						data.get(vehType.Total).getVolume().setML(data.get(vehType.Total).getVolume().getML() - toSubtract);
					}
				}

			}
			else if (diff < 0)
			{
				int toAdd = 1;
				while (diff != 0 && toAdd > 0)
				{
					toAdd = 0;
					if (data.get(vehType.SOV).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getissovml().isSelected() == false)
					{
						data.get(vehType.SOV).getVolume().setGP(data.get(vehType.SOV).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					if (data.get(vehType.RHOV_M).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getishovml().isSelected() == false)
					{
						data.get(vehType.RHOV_M).getVolume().setGP(data.get(vehType.RHOV_M).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					if (data.get(vehType.SOV_T).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getissovtml().isSelected() == false)
					{
						data.get(vehType.SOV_T).getVolume().setGP(data.get(vehType.SOV_T).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					if (data.get(vehType.LTr).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getissutml().isSelected() == false)
					{
						data.get(vehType.LTr).getVolume().setGP(data.get(vehType.LTr).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					if (data.get(vehType.ELTr).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getissttml().isSelected() == false)
					{
						data.get(vehType.ELTr).getVolume().setGP(data.get(vehType.ELTr).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					if (data.get(vehType.ELTr_T2).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getisstdml().isSelected() == false)
					{
						data.get(vehType.ELTr_T2).getVolume().setGP(data.get(vehType.ELTr_T2).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					if (data.get(vehType.SpVeh).getVolume().getGP() > 0 && diff < 0 && Singleton.getInstance().getisspvml().isSelected() == false)
					{
						data.get(vehType.SpVeh).getVolume().setGP(data.get(vehType.SpVeh).getVolume().getGP() + 1);
						diff += 1;
						toAdd += 1;
					}
					data.get(vehType.Total).getVolume().setGP(data.get(vehType.Total).getVolume().getGP() + toAdd);
				}
			}
		}


        FinalVolume.setGP(data.get(vehType.SpVeh).getVolume().getGP() * PCE_SpVeh + data.get(vehType.ELTr_T2).getVolume().getGP() * PCE_ELTr_T2 + data.get(vehType.ELTr).getVolume().getGP() * PCE_ELTr + data.get(vehType.LTr).getVolume().getGP() * PCE_LTr + data.get(vehType.SOV_T).getVolume().getGP() * PCE_SOV_T + data.get(vehType.RHOV_M).getVolume().getGP() * PCE_RHOV_M + data.get(vehType.SOV).getVolume().getGP() * PCE_SOV);
        FinalVolume.setML(data.get(vehType.SpVeh).getVolume().getML() * PCE_SpVeh + data.get(vehType.ELTr_T2).getVolume().getML() * PCE_ELTr_T2 + data.get(vehType.ELTr).getVolume().getML() * PCE_ELTr + data.get(vehType.LTr).getVolume().getML() * PCE_LTr + data.get(vehType.SOV_T).getVolume().getML() * PCE_SOV_T + data.get(vehType.RHOV_M).getVolume().getML() * PCE_RHOV_M + data.get(vehType.SOV).getVolume().getML() * PCE_SOV);

        //Prepare the data
        for (int i = 0; i <= 6; i++)
        {
                vehType typebyint = GetVehType(i);
                //Get current vehicle class
                DataPoint veh = data.get(typebyint);

                //Set speed data
                veh.setSpeed(FinalSpeed);

                //Tally up total revenue
                data.get(vehType.Total).AddRevenue(veh.getTotalRevenue());

        }
        boolean blue = true;
        for (int i = 0; i <= 7; i++)
        {
                vehType typebyint = GetVehType(i);
                //Get current vehicle class
                DataPoint veh = data.get(typebyint);
                String z = "class='l'";
                if (veh.getType().equals("Total"))
                {
                        html+=("</tbody><tfoot>");
                        z += " style='font-weight: bold;'";
                }
                String alt = "";
                if (blue)
                {
                        alt = " class='alternating'";
                }
                blue = ! blue;
                html += String.format("<tr%1$s>", alt) + "<td " + z + ">" + veh.getType() + "</td>" + "<td class='c'>" + veh.getVolume().getML() + "</td>" + "<td class='c'>" + veh.getVolume().getGP() + "</td>" + "<td class='c'>" + veh.getMLShare() + "</td>" + "<td class='c'>" + veh.getTollValue() + "</td>" + "<td class='c'>" + veh.getTotalRevenue() + "</td>" + "</tr>";
                if (veh.getType().equals("Total"))
                {
                        html += "<tr>" + "<td class='f'>Avg. Speed (mph)</td>" + "<td class='c'>" + String.valueOf(FinalSpeed_Output.getML()) + "</td>" + "<td class='c'>" + FinalSpeed_Output.getGP() + "</td>" + "<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr></tfoot></table><br>";
                }
        }
        //continue here
        content.loadContent(html);
        
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

    private void ChooseModelOptionForGP() {
         double U = 0;
        double No = NoGP;
        double Uf = Uf_GP;
        double Qc = CapGP;
        double Kj = Double.parseDouble(Singleton.getInstance().getGPDensity().getText());
        double Volperlane = VolGP / No;
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
                            "Demand exceeded twice the given capacity of the general purpose lane(s). Please reduce demand in the User page. Calculation error");
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
        uGP = U;  
    }

    private HashMap<vehType, DataPoint> CreateBlankDatabase() {
        java.util.HashMap<vehType, DataPoint> test = new java.util.HashMap<>(11);
        test.put(vehType.SOV, new DataPoint(vehType.forValue(0)));
        test.put(vehType.RHOV_M, new DataPoint(vehType.forValue(1)));
        test.put(vehType.SOV_T, new DataPoint(vehType.forValue(2)));
        test.put(vehType.LTr, new DataPoint(vehType.forValue(3)));
        test.put(vehType.ELTr, new DataPoint(vehType.forValue(4)));
        test.put(vehType.ELTr_T2, new DataPoint(vehType.forValue(5)));
        test.put(vehType.SpVeh, new DataPoint(vehType.forValue(6)));
        test.put(vehType.Total, new DataPoint(vehType.forValue(7)));
        return test;
    }

    private vehType GetVehType(int i) {
        switch (i) {
            case 0:
                return vehType.SOV;
            case 1:
                return vehType.RHOV_M;
            case 2:
                return vehType.SOV_T;
            case 3:
                return vehType.LTr;
            case 4:
                return vehType.ELTr;
            case 5:
                return vehType.ELTr_T2;
            case 6:
                return vehType.SpVeh;
            default:
                return vehType.Total;
        }
    }

    public final boolean CalculateTrueNumberOfVehicles(int index)
	{
		//Sort to populate current toll order
		this.SortTollPolicy();

		//Get the current highest toll policy for this run
		TollPolicyIteration = TollPolicyHighest[index];
		System.out.println("Calculating true num veh: highest toll = " + TollPolicyIteration + " for veh '" + VehClassHighest[index].toString() + "'");

		//recalculate to overwirte the previous loop
		TVol_SOV = Demand * (PMxVeh_SOV / 100) * PCE_SOV;
		TVol_RHOV_M = Demand * (PMxVeh_RHOV_M / 100) * PCE_RHOV_M;
		TVol_SOV_T = Demand * (PMxVeh_SOV_T / 100) * PCE_SOV_T;
		TVol_LTr = Demand * (PMxVeh_LTr / 100) * PCE_LTr;
		TVol_ELTr = Demand * (PMxVeh_ELTr / 100) * PCE_ELTr;
		TVol_ELTr_T2 = Demand * (PMxVeh_ELTr_T2 / 100) * PCE_ELTr_T2;
		TVol_SpVeh = Demand * (PMxVeh_SpVeh / 100) * PCE_SpVeh;

		if (index == 1 || TollPolicyIteration > 0)
		{
			//SOV
			if (TollPolicy_SOV > TollPolicyIteration)
			{
				VolBase_SOV = TVol_SOV;
				TVol_SOV = 0;
			}
			else
			{
				if (Singleton.getInstance().getissovallowed().isSelected())
				{
					VolBase_SOV = TVol_SOV;
					TVol_SOV = 0;
				}
				else
				{
					if (Singleton.getInstance().getissovml().isSelected())
					{
						MLFixedSov = Math.round(TVol_SOV * (Double.parseDouble(Singleton.getInstance().getsovmlshare().getText()) / 100));
						TVol_SOV -= MLFixedSov;
						GPFixedSov = TVol_SOV;
					}
					else
					{
						VolBase_SOV = TVol_SOV * DeadSetter;
						TVol_SOV -= VolBase_SOV;
					}
					PrepareVOTdistributionTable_SOV();
				}
			}

			//RHOV_M
			if (TollPolicy_RHOV_M > TollPolicyIteration)
			{
				VolBase_RHOV_M = TVol_RHOV_M;
				TVol_RHOV_M = 0;
			}
			else
			{
				if (Singleton.getInstance().getishovallowed().isSelected())
				{
					VolBase_RHOV_M = TVol_RHOV_M;
					TVol_RHOV_M = 0;
				}
				else
				{
					if (Singleton.getInstance().getishovml().isSelected())
					{
						MLFixedRHOV = Math.round(TVol_RHOV_M * (Double.parseDouble(Singleton.getInstance().gethovmlshare().getText()) / 100));
						TVol_RHOV_M -= MLFixedRHOV;
						GPFixedRHOV = TVol_RHOV_M;
					}
					else
					{
						VolBase_RHOV_M = TVol_RHOV_M * DeadSetter;
						TVol_RHOV_M -= VolBase_RHOV_M;
					}
					PrepareVOTdistributionTable_RHOV_M();
				}
			}

			//SOV_T
			if (TollPolicy_SOV_T > TollPolicyIteration)
			{
				VolBase_SOV_T = TVol_SOV_T;
				TVol_SOV_T = 0;
			}
			else
			{
				if (Singleton.getInstance().getissovtallowed().isSelected())
				{
					VolBase_SOV_T = TVol_SOV_T;
					TVol_SOV_T = 0;
				}
				else
				{
					if (Singleton.getInstance().getissovtml().isSelected())
					{
						MLFixedSOVT = Math.round(TVol_SOV_T * (Double.parseDouble(Singleton.getInstance().getsovtmlshare().getText()) / 100));
						TVol_SOV_T -= MLFixedSOVT;
						GPFixedSOVT = TVol_SOV_T;
					}
					else
					{
						VolBase_SOV_T = TVol_SOV_T * DeadSetter;
						TVol_SOV_T -= VolBase_SOV_T;
					}
					PrepareVOTdistributionTable_SOV_T();
				}
			}

			//LTr
			if (TollPolicy_LTr > TollPolicyIteration)
			{
				VolBase_LTr = TVol_LTr;
				TVol_LTr = 0;
			}
			else
			{
				if (Singleton.getInstance().getissutallowed().isSelected())
				{
					VolBase_LTr = TVol_LTr;
					TVol_LTr = 0;
				}
				else
				{
					if (Singleton.getInstance().getissutml().isSelected())
					{
						MLFixedLTr = Math.round(TVol_LTr * (Double.parseDouble(Singleton.getInstance().getsutmlshare().getText()) / 100));
						TVol_LTr -= MLFixedLTr;
						GPFixedLTr = TVol_LTr;
					}
					else
					{
						VolBase_LTr = TVol_LTr * DeadSetter;
						TVol_LTr -= VolBase_LTr;
					}
					PrepareVOTdistributionTable_LTr();
				}
			}

			//ELTr
			if (TollPolicy_ELTr > TollPolicyIteration)
			{
				VolBase_ELTr = TVol_ELTr;
				TVol_ELTr = 0;
			}
			else
			{
				if (Singleton.getInstance().getissttallowed().isSelected())
				{
					VolBase_ELTr = TVol_ELTr;
					TVol_ELTr = 0;
				}
				else
				{
					if (Singleton.getInstance().getissttml().isSelected())
					{
						MLFixedELTr = Math.round(TVol_ELTr * (Double.parseDouble(Singleton.getInstance().getsttmlshare().getText()) / 100));
						TVol_ELTr -= MLFixedELTr;
						GPFixedELTr = TVol_ELTr;
					}
					else
					{
						VolBase_ELTr = TVol_ELTr * DeadSetter;
						TVol_ELTr -= VolBase_ELTr;
					}
					PrepareVOTdistributionTable_ELTr();
				}
			}


			//ELTr_T2
			if (TollPolicy_ELTr_T2 > TollPolicyIteration)
			{
				VolBase_ELTr_T2 = TVol_ELTr_T2;
				TVol_ELTr_T2 = 0;
			}
			else
			{
				if (Singleton.getInstance().getisstdallowed().isSelected())
				{
					VolBase_ELTr_T2 = TVol_ELTr_T2;
					TVol_ELTr_T2 = 0;
				}
				else
				{
					if (Singleton.getInstance().getisstdml().isSelected())
					{
						MLFixedELTr2 = Math.round(TVol_ELTr_T2 * (Double.parseDouble(Singleton.getInstance().getstdmlshare().getText()) / 100));
						TVol_ELTr_T2 -= MLFixedELTr2;
						GPFixedELTr2 = TVol_ELTr_T2;
					}
					else
					{
						VolBase_ELTr_T2 = TVol_ELTr_T2 * DeadSetter;
						TVol_ELTr_T2 -= VolBase_ELTr_T2;
					}
					PrepareVOTdistributionTable_ELTr_T2();
				}
			}

			//SpVeh
			if (TollPolicy_SpVeh > TollPolicyIteration)
			{
				VolBase_SpVeh = TVol_SpVeh;
				TVol_SpVeh = 0;
			}
			else
			{
				if (Singleton.getInstance().getisspvallowed().isSelected())
				{
					VolBase_SpVeh = TVol_SpVeh;
					TVol_SpVeh = 0;
				}
				else
				{
					if (Singleton.getInstance().getisspvml().isSelected())
					{
						MLFixedSpVeh = Math.round(TVol_SpVeh * (Double.parseDouble(Singleton.getInstance().getspvmlshare().getText()) / 100));
						TVol_SpVeh -= MLFixedSpVeh;
						GPFixedSpVeh = TVol_SpVeh;
					}
					else
					{
						VolBase_SpVeh = TVol_SpVeh * DeadSetter;
						TVol_SpVeh -= VolBase_SpVeh;
					}
					PrepareVOTdistributionTable_LightFreight();
				}
			}


			//Volume calculations for SOV
			Vol_SOV_D = VolBase_SOV;
			Vol_SOV_1 = TVol_SOV * PVOT_SOV_1;
			Vol_SOV_2 = TVol_SOV * PVOT_SOV_2;
			Vol_SOV_3 = TVol_SOV * PVOT_SOV_3;
			Vol_SOV_4 = TVol_SOV * PVOT_SOV_4;
			Vol_SOV_5 = TVol_SOV * PVOT_SOV_5;
			Vol_SOV_6 = TVol_SOV * PVOT_SOV_6;
			Vol_SOV_7 = TVol_SOV * PVOT_SOV_7;
			Vol_SOV_8 = TVol_SOV * PVOT_SOV_8;
			Vol_SOV_9 = TVol_SOV * PVOT_SOV_9;
			Vol_SOV_10 = TVol_SOV * PVOT_SOV_10;
			TVol_SOV_1 = Vol_SOV_1 + VolBase_SOV;
			TVol_SOV_2 = TVol_SOV_1 + Vol_SOV_2;
			TVol_SOV_3 = TVol_SOV_2 + Vol_SOV_3;
			TVol_SOV_4 = TVol_SOV_3 + Vol_SOV_4;
			TVol_SOV_5 = TVol_SOV_4 + Vol_SOV_5;
			TVol_SOV_6 = TVol_SOV_5 + Vol_SOV_6;
			TVol_SOV_7 = TVol_SOV_6 + Vol_SOV_7;
			TVol_SOV_8 = TVol_SOV_7 + Vol_SOV_8;
			TVol_SOV_9 = TVol_SOV_8 + Vol_SOV_9;
			TVol_SOV_10 = TVol_SOV_9 + Vol_SOV_10;

			//Volume calcualtion for RHOV_M
			Vol_RHOV_M_D = TVol_RHOV_M * DeadSetter;
			Vol_RHOV_M_1 = TVol_RHOV_M * PVOT_RHOV_M_1;
			Vol_RHOV_M_2 = TVol_RHOV_M * PVOT_RHOV_M_2;
			Vol_RHOV_M_3 = TVol_RHOV_M * PVOT_RHOV_M_3;
			Vol_RHOV_M_4 = TVol_RHOV_M * PVOT_RHOV_M_4;
			Vol_RHOV_M_5 = TVol_RHOV_M * PVOT_RHOV_M_5;
			Vol_RHOV_M_6 = TVol_RHOV_M * PVOT_RHOV_M_6;
			Vol_RHOV_M_7 = TVol_RHOV_M * PVOT_RHOV_M_7;
			Vol_RHOV_M_8 = TVol_RHOV_M * PVOT_RHOV_M_8;
			Vol_RHOV_M_9 = TVol_RHOV_M * PVOT_RHOV_M_9;
			Vol_RHOV_M_10 = TVol_RHOV_M * PVOT_RHOV_M_10;
			TVol_RHOV_M_1 = Vol_RHOV_M_1 + VolBase_RHOV_M;
			TVol_RHOV_M_2 = TVol_RHOV_M_1 + Vol_RHOV_M_2;
			TVol_RHOV_M_3 = TVol_RHOV_M_2 + Vol_RHOV_M_3;
			TVol_RHOV_M_4 = TVol_RHOV_M_3 + Vol_RHOV_M_4;
			TVol_RHOV_M_5 = TVol_RHOV_M_4 + Vol_RHOV_M_5;
			TVol_RHOV_M_6 = TVol_RHOV_M_5 + Vol_RHOV_M_6;
			TVol_RHOV_M_7 = TVol_RHOV_M_6 + Vol_RHOV_M_7;
			TVol_RHOV_M_8 = TVol_RHOV_M_7 + Vol_RHOV_M_8;
			TVol_RHOV_M_9 = TVol_RHOV_M_8 + Vol_RHOV_M_9;
			TVol_RHOV_M_10 = TVol_RHOV_M_9 + Vol_RHOV_M_10;

			//Volume calculation for SOV_T
			Vol_SOV_T_D = TVol_SOV_T * DeadSetter;
			Vol_SOV_T_1 = TVol_SOV_T * PVOT_SOV_T_1;
			Vol_SOV_T_2 = TVol_SOV_T * PVOT_SOV_T_2;
			Vol_SOV_T_3 = TVol_SOV_T * PVOT_SOV_T_3;
			Vol_SOV_T_4 = TVol_SOV_T * PVOT_SOV_T_4;
			Vol_SOV_T_5 = TVol_SOV_T * PVOT_SOV_T_5;
			Vol_SOV_T_6 = TVol_SOV_T * PVOT_SOV_T_6;
			Vol_SOV_T_7 = TVol_SOV_T * PVOT_SOV_T_7;
			Vol_SOV_T_8 = TVol_SOV_T * PVOT_SOV_T_8;
			Vol_SOV_T_9 = TVol_SOV_T * PVOT_SOV_T_9;
			Vol_SOV_T_10 = TVol_SOV_T * PVOT_SOV_T_10;
			TVol_SOV_T_1 = Vol_SOV_T_1 + VolBase_SOV_T;
			TVol_SOV_T_2 = TVol_SOV_T_1 + Vol_SOV_T_2;
			TVol_SOV_T_3 = TVol_SOV_T_2 + Vol_SOV_T_3;
			TVol_SOV_T_4 = TVol_SOV_T_3 + Vol_SOV_T_4;
			TVol_SOV_T_5 = TVol_SOV_T_4 + Vol_SOV_T_5;
			TVol_SOV_T_6 = TVol_SOV_T_5 + Vol_SOV_T_6;
			TVol_SOV_T_7 = TVol_SOV_T_6 + Vol_SOV_T_7;
			TVol_SOV_T_8 = TVol_SOV_T_7 + Vol_SOV_T_8;
			TVol_SOV_T_9 = TVol_SOV_T_8 + Vol_SOV_T_9;
			TVol_SOV_T_10 = TVol_SOV_T_9 + Vol_SOV_T_10;

			//vol for LTr
			Vol_LTr_D = TVol_LTr * DeadSetter;
			Vol_LTr_1 = TVol_LTr * PVOT_LTr_1;
			Vol_LTr_2 = TVol_LTr * PVOT_LTr_2;
			Vol_LTr_3 = TVol_LTr * PVOT_LTr_3;
			Vol_LTr_4 = TVol_LTr * PVOT_LTr_4;
			Vol_LTr_5 = TVol_LTr * PVOT_LTr_5;
			Vol_LTr_6 = TVol_LTr * PVOT_LTr_6;
			Vol_LTr_7 = TVol_LTr * PVOT_LTr_7;
			Vol_LTr_8 = TVol_LTr * PVOT_LTr_8;
			Vol_LTr_9 = TVol_LTr * PVOT_LTr_9;
			Vol_LTr_10 = TVol_LTr * PVOT_LTr_10;
			TVol_LTr_1 = Vol_LTr_1 + VolBase_LTr;
			TVol_LTr_2 = TVol_LTr_1 + Vol_LTr_2;
			TVol_LTr_3 = TVol_LTr_2 + Vol_LTr_3;
			TVol_LTr_4 = TVol_LTr_3 + Vol_LTr_4;
			TVol_LTr_5 = TVol_LTr_4 + Vol_LTr_5;
			TVol_LTr_6 = TVol_LTr_5 + Vol_LTr_6;
			TVol_LTr_7 = TVol_LTr_6 + Vol_LTr_7;
			TVol_LTr_8 = TVol_LTr_7 + Vol_LTr_8;
			TVol_LTr_9 = TVol_LTr_8 + Vol_LTr_9;
			TVol_LTr_10 = TVol_LTr_9 + Vol_LTr_10;

			//Volume calculations for ELTr
			Vol_ELTr_D = TVol_ELTr * DeadSetter;
			Vol_ParaTran_1 = TVol_ELTr * PVOT_ELTr_1;
			Vol_ParaTran_2 = TVol_ELTr * PVOT_ELTr_2;
			Vol_ParaTran_3 = TVol_ELTr * PVOT_ELTr_3;
			Vol_ParaTran_4 = TVol_ELTr * PVOT_ELTr_4;
			Vol_ParaTran_5 = TVol_ELTr * PVOT_ELTr_5;
			Vol_ParaTran_6 = TVol_ELTr * PVOT_ELTr_6;
			Vol_ParaTran_7 = TVol_ELTr * PVOT_ELTr_7;
			Vol_ParaTran_8 = TVol_ELTr * PVOT_ELTr_8;
			Vol_ParaTran_9 = TVol_ELTr * PVOT_ELTr_9;
			Vol_ParaTran_10 = TVol_ELTr * PVOT_ELTr_10;
			TVol_ELTr_1 = VolBase_ELTr + Vol_ParaTran_1;
			TVol_ELTr_2 = TVol_ELTr_1 + Vol_ParaTran_2;
			TVol_ELTr_3 = TVol_ELTr_2 + Vol_ParaTran_3;
			TVol_ELTr_4 = TVol_ELTr_3 + Vol_ParaTran_4;
			TVol_ELTr_5 = TVol_ELTr_4 + Vol_ParaTran_5;
			TVol_ELTr_6 = TVol_ELTr_5 + Vol_ParaTran_6;
			TVol_ELTr_7 = TVol_ELTr_6 + Vol_ParaTran_7;
			TVol_ELTr_8 = TVol_ELTr_7 + Vol_ParaTran_8;
			TVol_ELTr_9 = TVol_ELTr_8 + Vol_ParaTran_9;
			TVol_ELTr_10 = TVol_ELTr_9 + Vol_ParaTran_10;


			//Volume calculations for Motocycle
			Vol_ELTr_T2_D = TVol_ELTr_T2 * DeadSetter;
			Vol_ELTr_T2_1 = TVol_ELTr_T2 * PVOT_ELTr_T2_1;
			Vol_ELTr_T2_2 = TVol_ELTr_T2 * PVOT_ELTr_T2_2;
			Vol_ELTr_T2_3 = TVol_ELTr_T2 * PVOT_ELTr_T2_3;
			Vol_ELTr_T2_4 = TVol_ELTr_T2 * PVOT_ELTr_T2_4;
			Vol_ELTr_T2_5 = TVol_ELTr_T2 * PVOT_ELTr_T2_5;
			Vol_ELTr_T2_6 = TVol_ELTr_T2 * PVOT_ELTr_T2_6;
			Vol_ELTr_T2_7 = TVol_ELTr_T2 * PVOT_ELTr_T2_7;
			Vol_ELTr_T2_8 = TVol_ELTr_T2 * PVOT_ELTr_T2_8;
			Vol_ELTr_T2_9 = TVol_ELTr_T2 * PVOT_ELTr_T2_9;
			Vol_ELTr_T2_10 = TVol_ELTr_T2 * PVOT_ELTr_T2_10;
			TVol_ELTr_T2_1 = VolBase_ELTr_T2 + Vol_ELTr_T2_1;
			TVol_ELTr_T2_2 = TVol_ELTr_T2_1 + Vol_ELTr_T2_2;
			TVol_ELTr_T2_3 = TVol_ELTr_T2_2 + Vol_ELTr_T2_3;
			TVol_ELTr_T2_4 = TVol_ELTr_T2_3 + Vol_ELTr_T2_4;
			TVol_ELTr_T2_5 = TVol_ELTr_T2_4 + Vol_ELTr_T2_5;
			TVol_ELTr_T2_6 = TVol_ELTr_T2_5 + Vol_ELTr_T2_6;
			TVol_ELTr_T2_7 = TVol_ELTr_T2_6 + Vol_ELTr_T2_7;
			TVol_ELTr_T2_8 = TVol_ELTr_T2_7 + Vol_ELTr_T2_8;
			TVol_ELTr_T2_9 = TVol_ELTr_T2_8 + Vol_ELTr_T2_9;
			TVol_ELTr_T2_10 = TVol_ELTr_T2_9 + Vol_ELTr_T2_10;

			//Volume calculations for SpVeh
			Vol_SpVeh_D = TVol_SpVeh * DeadSetter;
			Vol_SpVeh_1 = TVol_SpVeh * PVOT_SpVeh_1;
			Vol_SpVeh_2 = TVol_SpVeh * PVOT_SpVeh_2;
			Vol_SpVeh_3 = TVol_SpVeh * PVOT_SpVeh_3;
			Vol_SpVeh_4 = TVol_SpVeh * PVOT_SpVeh_4;
			Vol_SpVeh_5 = TVol_SpVeh * PVOT_SpVeh_5;
			Vol_SpVeh_6 = TVol_SpVeh * PVOT_SpVeh_6;
			Vol_SpVeh_7 = TVol_SpVeh * PVOT_SpVeh_7;
			Vol_SpVeh_8 = TVol_SpVeh * PVOT_SpVeh_8;
			Vol_SpVeh_9 = TVol_SpVeh * PVOT_SpVeh_9;
			Vol_SpVeh_10 = TVol_SpVeh * PVOT_SpVeh_10;
			TVol_SpVeh_1 = VolBase_SpVeh + Vol_SpVeh_1;
			TVol_SpVeh_2 = TVol_SpVeh_1 + Vol_SpVeh_2;
			TVol_SpVeh_3 = TVol_SpVeh_2 + Vol_SpVeh_3;
			TVol_SpVeh_4 = TVol_SpVeh_3 + Vol_SpVeh_4;
			TVol_SpVeh_5 = TVol_SpVeh_4 + Vol_SpVeh_5;
			TVol_SpVeh_6 = TVol_SpVeh_5 + Vol_SpVeh_6;
			TVol_SpVeh_7 = TVol_SpVeh_6 + Vol_SpVeh_7;
			TVol_SpVeh_8 = TVol_SpVeh_7 + Vol_SpVeh_8;
			TVol_SpVeh_9 = TVol_SpVeh_8 + Vol_SpVeh_9;
			TVol_SpVeh_10 = TVol_SpVeh_9 + Vol_SpVeh_10;


			//Prepare Volume for Calculation
			VolGP_Base_1 = VolBase_SOV + VolBase_RHOV_M + VolBase_SOV_T + VolBase_LTr + VolBase_ELTr + VolBase_ELTr_T2 + VolBase_SpVeh - 1;
			VolGP_1 = VolGP_Base_1 + Vol_SOV_1 + Vol_RHOV_M_1 + Vol_SOV_T_1 + Vol_LTr_1 + Vol_ParaTran_1 + Vol_ELTr_T2_1 + Vol_SpVeh_1;
			VolGP_2 = VolGP_1 + Vol_SOV_2 + Vol_RHOV_M_2 + Vol_SOV_T_2 + Vol_LTr_2 + Vol_ParaTran_2 + Vol_ELTr_T2_2 + Vol_SpVeh_2;
			VolGP_3 = VolGP_2 + Vol_SOV_3 + Vol_RHOV_M_3 + Vol_SOV_T_3 + Vol_LTr_3 + Vol_ParaTran_3 + Vol_ELTr_T2_3 + Vol_SpVeh_3;
			VolGP_4 = VolGP_3 + Vol_SOV_4 + Vol_RHOV_M_4 + Vol_SOV_T_4 + Vol_LTr_4 + Vol_ParaTran_4 + Vol_ELTr_T2_4 + Vol_SpVeh_4;
			VolGP_5 = VolGP_4 + Vol_SOV_5 + Vol_RHOV_M_5 + Vol_SOV_T_5 + Vol_LTr_5 + Vol_ParaTran_5 + Vol_ELTr_T2_5 + Vol_SpVeh_5;
			VolGP_6 = VolGP_5 + Vol_SOV_6 + Vol_RHOV_M_6 + Vol_SOV_T_6 + Vol_LTr_6 + Vol_ParaTran_6 + Vol_ELTr_T2_6 + Vol_SpVeh_6;
			VolGP_7 = VolGP_6 + Vol_SOV_7 + Vol_RHOV_M_7 + Vol_SOV_T_7 + Vol_LTr_7 + Vol_ParaTran_7 + Vol_ELTr_T2_7 + Vol_SpVeh_7;
			VolGP_8 = VolGP_7 + Vol_SOV_8 + Vol_RHOV_M_8 + Vol_SOV_T_8 + Vol_LTr_8 + Vol_ParaTran_8 + Vol_ELTr_T2_8 + Vol_SpVeh_8;
			VolGP_9 = VolGP_8 + Vol_SOV_9 + Vol_RHOV_M_9 + Vol_SOV_T_9 + Vol_LTr_9 + Vol_ParaTran_9 + Vol_ELTr_T2_9 + Vol_SpVeh_9;
			VolGP_10 = VolGP_9 + Vol_SOV_10 + Vol_RHOV_M_10 + Vol_SOV_T_10 + Vol_LTr_10 + Vol_ParaTran_10 + Vol_ELTr_T2_10 + Vol_SpVeh_10;

			VolML_Base_1 = Demand_Adj - VolGP_Base_1;
			VolML_1 = Demand_Adj - VolGP_1;
			VolML_2 = Demand_Adj - VolGP_2;
			VolML_3 = Demand_Adj - VolGP_3;
			VolML_4 = Demand_Adj - VolGP_4;
			VolML_5 = Demand_Adj - VolGP_5;
			VolML_6 = Demand_Adj - VolGP_6;
			VolML_7 = Demand_Adj - VolGP_7;
			VolML_8 = Demand_Adj - VolGP_8;
			VolML_9 = Demand_Adj - VolGP_9;
			VolML_10 = Demand_Adj - VolGP_10;


			//if it's chosen, next iteration it will be put in Base volume
			//Dim succeeded As Boolean = True
			//chosen(index) = True
		}

		if (TollPolicyIteration > 0)
		{
			if (tollradio.isSelected())
			{
				//Seach for final VOT interval. When succeeded, Call TollObjective Function.
				SearchFinalVOTIntervalByCTS_VOT(index);
			}
			else if (speedradio.isSelected())
			{
				SearchFinalVOTIntervalByVolML_VolGP(index);
			}
		}
		else
		{
			//feed the info to calculate speeds
			Toll_Adj = Tolled;
			//CTS = CTS9
			//VOT = VOT9
			//VOT_Prev = VOT9
			//VOT_Next = VOT10
			VolGP = VolGP_10;
			VolML = VolML_10;
			TVol_SOV_Prev = TVol_SOV_10;
			TVol_RHOV_M_Prev = TVol_RHOV_M_10;
			TVol_SOV_T_Prev = TVol_SOV_T_10;
			TVol_LTr_Prev = TVol_LTr_10;
			TVol_ELTr_Prev = TVol_ELTr_10;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_10;
			TVol_SpVeh_Prev = TVol_SpVeh_10;

			//below is for search final interval by VOL
			VolGP_Prev = VolGP_10;
			Vol_SOV_Add = TVol_SOV - TVol_SOV_Prev;
			Vol_RHOV_M_Add = TVol_RHOV_M - TVol_RHOV_M_Prev;
			Vol_SOV_T_Add = TVol_SOV_T - TVol_SOV_T_Prev;
			Vol_LTr_Add = TVol_LTr - TVol_LTr_Prev;
			Vol_ELTr_Add = TVol_ELTr - TVol_ELTr_Prev;
			Vol_ELTr_T2_Add = TVol_ELTr_T2 - TVol_ELTr_T2_Prev;
			Vol_SpVeh_Add = TVol_SpVeh - TVol_SpVeh_Prev;

		}
		return true;
	}

    private void SortTollPolicy()
	{
		//Declarations
		double[] policies = new double[] {TollPolicy_SOV, TollPolicy_RHOV_M, TollPolicy_SOV_T, TollPolicy_LTr, TollPolicy_ELTr, TollPolicy_ELTr_T2, TollPolicy_SpVeh};
		int total = policies.length - 1;
		boolean[] chosen = new boolean[total + 1];

		//Setup toll policy array
		TollPolicyHighest = new double[total + 2];
		VehClassHighest = new vehType[total + 2];

		//Loop through every policy
		for (int count = 1; count <= total + 1; count++)
		{
			//Reset current max to lowest value
			double tmpMax = -1.0;
			vehType tmpVeh = null;

			//Loop through entire array to get the current unsaved max
			for (int x = 0; x <= total; x++)
			{
				if (! (chosen[x]) && tmpMax < policies[x])
				{
					tmpMax = policies[x];
					tmpVeh = vehType.forValue(x);
				}
			}

			//Save the results of this rounds highest
			TollPolicyHighest[count] = tmpMax;
			VehClassHighest[count] = tmpVeh;
			chosen[tmpVeh.getValue()] = true;
		}
	}

    public final void SearchFinalVOTIntervalByCTS_VOT(int VOT_Num)
	{
		//calculate iteration 1
		VolML = VolML_Base_1;
		VolGP = VolGP_Base_1;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS_Base_1 = CTS;

		VolML = VolML_1;
		VolGP = VolGP_1;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS1 = CTS;

		VolML = VolML_2;
		VolGP = VolGP_2;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS2 = CTS;

		VolML = VolML_3;
		VolGP = VolGP_3;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS3 = CTS;

		VolML = VolML_4;
		VolGP = VolGP_4;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS4 = CTS;

		VolML = VolML_5;
		VolGP = VolGP_5;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS5 = CTS;

		VolML = VolML_6;
		VolGP = VolGP_6;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS6 = CTS;

		VolML = VolML_7;
		VolGP = VolGP_7;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS7 = CTS;

		VolML = VolML_8;
		VolGP = VolGP_8;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS8 = CTS;

		VolML = VolML_9;
		VolGP = VolGP_9;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS9 = CTS;

		VolML = VolML_10;
		VolGP = VolGP_10;
		Tolled = Toll * TollPolicyIteration;
		CalculationCTS();
		CTS10 = CTS;

		if (CTS1 > 0 && CTS1 <= VOT1)
		{
			Toll_Adj = Tolled;
			CTS = CTS_Base_1;
			VOT = 0;
			VOT_Prev = 0;
			VOT_Next = VOT1;
			VolGP_Prev = VolGP_Base_1;
			TVol_SOV_Prev = VolBase_SOV;
			TVol_RHOV_M_Prev = VolBase_RHOV_M;
			TVol_SOV_T_Prev = VolBase_SOV_T;
			TVol_LTr_Prev = VolBase_LTr;
			TVol_ELTr_Prev = VolBase_ELTr;
			TVol_ELTr_T2_Prev = VolBase_ELTr_T2;
			TVol_SpVeh_Prev = VolBase_SpVeh;

			Vol_SOV_Add = Vol_SOV_1;
			Vol_RHOV_M_Add = Vol_RHOV_M_1;
			Vol_SOV_T_Add = Vol_SOV_T_1;
			Vol_LTr_Add = Vol_LTr_1;
			Vol_ELTr_Add = Vol_ParaTran_1;

			Vol_ELTr_T2_Add = Vol_ELTr_T2_1;
			Vol_SpVeh_Add = Vol_SpVeh_1;

			TollObjective();

		}
		else if (CTS2 > 0 && CTS2 <= VOT2)
		{
			Toll_Adj = Tolled;
			CTS = CTS1;
			VOT = VOT1;
			VOT_Prev = VOT1;
			VOT_Next = VOT2;
			VolGP_Prev = VolGP_1;
			TVol_SOV_Prev = TVol_SOV_1;
			TVol_RHOV_M_Prev = TVol_RHOV_M_1;
			TVol_SOV_T_Prev = TVol_SOV_T_1;
			TVol_LTr_Prev = TVol_LTr_1;
			TVol_ELTr_Prev = TVol_ELTr_1;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_1;
			TVol_SpVeh_Prev = TVol_SpVeh_1;

			Vol_SOV_Add = Vol_SOV_2;
			Vol_RHOV_M_Add = Vol_RHOV_M_2;
			Vol_SOV_T_Add = Vol_SOV_T_2;
			Vol_LTr_Add = Vol_LTr_2;
			Vol_ELTr_Add = Vol_ParaTran_2;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_2;
			Vol_SpVeh_Add = Vol_SpVeh_2;
			TollObjective();

		}
		else if (CTS3 > 0 && CTS3 <= VOT3)
		{
			Toll_Adj = Tolled;
			CTS = CTS2;
			VOT = VOT2;
			VOT_Prev = VOT2;
			VOT_Next = VOT3;
			VolGP_Prev = VolGP_2;
			TVol_SOV_Prev = TVol_SOV_2;
			TVol_RHOV_M_Prev = TVol_RHOV_M_2;
			TVol_SOV_T_Prev = TVol_SOV_T_2;
			TVol_LTr_Prev = TVol_LTr_2;
			TVol_ELTr_Prev = TVol_ELTr_2;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_2;
			TVol_SpVeh_Prev = TVol_SpVeh_2;

			Vol_SOV_Add = Vol_SOV_3;
			Vol_RHOV_M_Add = Vol_RHOV_M_3;
			Vol_SOV_T_Add = Vol_SOV_T_3;
			Vol_LTr_Add = Vol_LTr_3;
			Vol_ELTr_Add = Vol_ParaTran_3;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_3;
			Vol_SpVeh_Add = Vol_SpVeh_3;

			TollObjective();

		}
		else if (CTS4 > 0 && CTS4 <= VOT4)
		{
			Toll_Adj = Tolled;
			CTS = CTS3;
			VOT = VOT3;
			VOT_Prev = VOT3;
			VOT_Next = VOT4;
			VolGP_Prev = VolGP_3;
			TVol_SOV_Prev = TVol_SOV_3;
			TVol_RHOV_M_Prev = TVol_RHOV_M_3;
			TVol_SOV_T_Prev = TVol_SOV_T_3;
			TVol_LTr_Prev = TVol_LTr_3;
			TVol_ELTr_Prev = TVol_ELTr_3;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_3;
			TVol_SpVeh_Prev = TVol_SpVeh_3;

			Vol_SOV_Add = Vol_SOV_4;
			Vol_RHOV_M_Add = Vol_RHOV_M_4;
			Vol_SOV_T_Add = Vol_SOV_T_4;
			Vol_LTr_Add = Vol_LTr_4;
			Vol_ELTr_Add = Vol_ParaTran_4;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_4;
			Vol_SpVeh_Add = Vol_SpVeh_4;

			TollObjective();

		}
		else if (CTS5 > 0 && CTS5 <= VOT5)
		{
			Toll_Adj = Tolled;
			CTS = CTS4;
			VOT = VOT4;
			VOT_Prev = VOT4;
			VOT_Next = VOT5;
			VolGP_Prev = VolGP_4;
			TVol_SOV_Prev = TVol_SOV_4;
			TVol_RHOV_M_Prev = TVol_RHOV_M_4;
			TVol_SOV_T_Prev = TVol_SOV_T_4;
			TVol_LTr_Prev = TVol_LTr_4;
			TVol_ELTr_Prev = TVol_ELTr_4;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_4;
			TVol_SpVeh_Prev = TVol_SpVeh_4;

			Vol_SOV_Add = Vol_SOV_5;
			Vol_RHOV_M_Add = Vol_RHOV_M_5;
			Vol_SOV_T_Add = Vol_SOV_T_5;
			Vol_LTr_Add = Vol_LTr_5;
			Vol_ELTr_Add = Vol_ParaTran_5;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_5;
			Vol_SpVeh_Add = Vol_SpVeh_5;

			TollObjective();

		}
		else if (CTS6 > 0 && CTS6 <= VOT6)
		{
			Toll_Adj = Tolled;
			CTS = CTS5;
			VOT = VOT5;
			VOT_Prev = VOT5;
			VOT_Next = VOT6;
			VolGP_Prev = VolGP_5;
			TVol_SOV_Prev = TVol_SOV_5;
			TVol_RHOV_M_Prev = TVol_RHOV_M_5;
			TVol_SOV_T_Prev = TVol_SOV_T_5;
			TVol_LTr_Prev = TVol_LTr_5;
			TVol_ELTr_Prev = TVol_ELTr_5;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_5;
			TVol_SpVeh_Prev = TVol_SpVeh_5;

			Vol_SOV_Add = Vol_SOV_6;
			Vol_RHOV_M_Add = Vol_RHOV_M_6;
			Vol_SOV_T_Add = Vol_SOV_T_6;
			Vol_LTr_Add = Vol_LTr_6;
			Vol_ELTr_Add = Vol_ParaTran_6;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_6;
			Vol_SpVeh_Add = Vol_SpVeh_6;

			TollObjective();

		}
		else if (CTS7 > 0 && CTS7 <= VOT7)
		{
			Toll_Adj = Tolled;
			CTS = CTS6;
			VOT = VOT6;
			VOT_Prev = VOT6;
			VOT_Next = VOT7;
			VolGP_Prev = VolGP_6;
			TVol_SOV_Prev = TVol_SOV_6;
			TVol_RHOV_M_Prev = TVol_RHOV_M_6;
			TVol_SOV_T_Prev = TVol_SOV_T_6;
			TVol_LTr_Prev = TVol_LTr_6;
			TVol_ELTr_Prev = TVol_ELTr_6;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_6;
			TVol_SpVeh_Prev = TVol_SpVeh_6;

			Vol_SOV_Add = Vol_SOV_7;
			Vol_RHOV_M_Add = Vol_RHOV_M_7;
			Vol_SOV_T_Add = Vol_SOV_T_7;
			Vol_LTr_Add = Vol_LTr_7;
			Vol_ELTr_Add = Vol_ParaTran_7;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_7;
			Vol_SpVeh_Add = Vol_SpVeh_7;

			TollObjective();

		}
		else if (CTS8 > 0 && CTS8 <= VOT8)
		{
			Toll_Adj = Tolled;
			CTS = CTS7;
			VOT = VOT7;
			VOT_Prev = VOT7;
			VOT_Next = VOT8;
			VolGP_Prev = VolGP_7;
			TVol_SOV_Prev = TVol_SOV_7;
			TVol_RHOV_M_Prev = TVol_RHOV_M_7;
			TVol_SOV_T_Prev = TVol_SOV_T_7;
			TVol_LTr_Prev = TVol_LTr_7;
			TVol_ELTr_Prev = TVol_ELTr_7;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_7;
			TVol_SpVeh_Prev = TVol_SpVeh_7;

			Vol_SOV_Add = Vol_SOV_8;
			Vol_RHOV_M_Add = Vol_RHOV_M_8;
			Vol_SOV_T_Add = Vol_SOV_T_8;
			Vol_LTr_Add = Vol_LTr_8;
			Vol_ELTr_Add = Vol_ParaTran_8;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_8;
			Vol_SpVeh_Add = Vol_SpVeh_8;

			TollObjective();

		}
		else if (CTS9 > 0 && CTS9 <= VOT9)
		{
			Toll_Adj = Tolled;
			CTS = CTS8;
			VOT = VOT8;
			VOT_Prev = VOT8;
			VOT_Next = VOT9;
			VolGP_Prev = VolGP_8;
			TVol_SOV_Prev = TVol_SOV_8;
			TVol_RHOV_M_Prev = TVol_RHOV_M_8;
			TVol_SOV_T_Prev = TVol_SOV_T_8;
			TVol_LTr_Prev = TVol_LTr_8;
			TVol_ELTr_Prev = TVol_ELTr_8;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_8;
			TVol_SpVeh_Prev = TVol_SpVeh_8;

			Vol_SOV_Add = Vol_SOV_9;
			Vol_RHOV_M_Add = Vol_RHOV_M_9;
			Vol_SOV_T_Add = Vol_SOV_T_9;
			Vol_LTr_Add = Vol_LTr_9;
			Vol_ELTr_Add = Vol_ParaTran_9;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_9;
			Vol_SpVeh_Add = Vol_SpVeh_9;

			TollObjective();

		}
		else if (CTS10 > 0 && CTS10 <= VOT10)
		{
			Toll_Adj = Tolled;
			CTS = CTS9;
			VOT = VOT9;
			VOT_Prev = VOT9;
			VOT_Next = VOT10;
			VolGP_Prev = VolGP_9;
			TVol_SOV_Prev = TVol_SOV_9;
			TVol_RHOV_M_Prev = TVol_RHOV_M_9;
			TVol_SOV_T_Prev = TVol_SOV_T_9;
			TVol_LTr_Prev = TVol_LTr_9;
			TVol_ELTr_Prev = TVol_ELTr_9;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_9;
			TVol_SpVeh_Prev = TVol_SpVeh_9;

			Vol_SOV_Add = Vol_SOV_10;
			Vol_RHOV_M_Add = Vol_RHOV_M_10;
			Vol_SOV_T_Add = Vol_SOV_T_10;
			Vol_LTr_Add = Vol_LTr_10;
			Vol_ELTr_Add = Vol_ParaTran_10;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_10;
			Vol_SpVeh_Add = Vol_SpVeh_10;

			TollObjective();

		}
		else if (VOT_Num >= 10 && CTS10 > VOT10)
		{
			//last vehicle type
			Toll_Adj = Tolled;
			//CTS = CTS9
			//VOT = VOT9
			//VOT_Prev = VOT9
			//VOT_Next = VOT10
			VolGP_Prev = VolGP_10;
			TVol_SOV_Prev = TVol_SOV_10;
			TVol_RHOV_M_Prev = TVol_RHOV_M_10;
			TVol_SOV_T_Prev = TVol_SOV_T_10;
			TVol_LTr_Prev = TVol_LTr_10;
			TVol_ELTr_Prev = TVol_ELTr_10;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_10;
			TVol_SpVeh_Prev = TVol_SpVeh_10;

			Vol_SOV_Add = 0;
			Vol_RHOV_M_Add = 0;
			Vol_SOV_T_Add = 0;
			Vol_LTr_Add = 0;
			Vol_ELTr_Add = 0;
			Vol_ELTr_T2_Add = 0;
			Vol_SpVeh_Add = 0;

			VolGP = VolGP_10;
			VolML = VolML_10;

		}
		else if (VOT_Num < 6)
		{
			CalculateTrueNumberOfVehicles(VOT_Num + 1);
		}
	}

    public final void CalculationCTS()
	{
		TGP = 0.8 * (1 + (Math.pow((VolGP / TCapGP), 4)));
		TML = 0.8 * (1 + (Math.pow((VolML / TCapML), 4)));
		DiffT = ((TGP * Length_GP) - (TML * Length_ML)) / Length_ML;
		CTS = 60 * Tolled / DiffT;
	}

    public final boolean TollObjective()
	{
		//Initialize values
		i = 0;
		//Find the equilibrium point between CTS and VOT
		boolean CTS_was_neg = CTS < 0;
		int origsign = (int)Math.signum(CTS - VOT);
		while ( ! (! (origsign == (int)Math.signum(CTS - VOT)))) //CTS - VOT < 0 AndAlso CTS - VOT > -0.09
		{
			i += 1;
			VolGP = VolGP_Prev + i;
			if ((int)Math.signum((int)java.lang.Math.round(Demand_Adj) - (int)java.lang.Math.round(VolGP)) == -1)
			{
                             try {
                        MessageBox(
                                "Overall volume in the general purpose lanes exceeded Demand. Please reduce demand in the User page. Calculation error");
                    } catch (IOException ex) {
                        Logger.getLogger(ResultController.class.getName()).log(Level.SEVERE, null, ex);
                    }
				return false;
			}
			VolML = Demand_Adj - VolGP;
			TGP = 0.8 * (1 + (Math.pow((VolGP / TCapGP), 4)));
			TML = 0.8 * (1 + (Math.pow((VolML / TCapML), 4)));
			DiffT = ((TGP * Length_GP) - (TML * Length_ML)) / Length_ML;

			//If DiffT < 0 Then MessageBox.Show("Travel time on GP Lane is less than ML", "Warning", MessageBoxButtons.OK, MessageBoxIcon.Exclamation)
			CTS = 60 * Toll_Adj / DiffT;
			VOT = VOT_Prev + (i / (Vol_SOV_Add + Vol_RHOV_M_Add + Vol_SOV_T_Add + Vol_LTr_Add + Vol_SpVeh_Add + Vol_ELTr_T2_Add + Vol_ELTr_Add) * (VOT_Next - VOT_Prev));

			//Check to see if cts is no longer neg
			if (CTS_was_neg && CTS > 0)
			{
				origsign = (int)Math.signum(CTS - VOT);
				CTS_was_neg = false;
			}
		}
		return true;
	}

    public final boolean SearchFinalVOTIntervalByVolML_VolGP(int VOT_Num)
	{
		//set the values to calculate CTS
//VB TO JAVA CONVERTER NOTE: The following VB 'Select Case' included either a non-ordinal switch expression or non-ordinal, range-type, or non-constant 'Case' expressions and was converted to Java 'if-else' logic:
//		Select Case VolGP
//ORIGINAL LINE: Case Is < VolGP_1
		if (VolGP < VolGP_1)
		{
			VOT_Prev = 0;
			VOT_Next = VOT1;
			VolGP_Prev = VolGP_Base_1;
			TVol_SOV_Prev = VolBase_SOV;
			TVol_RHOV_M_Prev = VolBase_RHOV_M;
			TVol_SOV_T_Prev = VolBase_SOV_T;
			TVol_LTr_Prev = VolBase_LTr;
			TVol_ELTr_Prev = VolBase_ELTr;
			TVol_ELTr_T2_Prev = VolBase_ELTr_T2;
			TVol_SpVeh_Prev = VolBase_SpVeh;

			Vol_SOV_Add = Vol_SOV_1;
			Vol_RHOV_M_Add = Vol_RHOV_M_1;
			Vol_SOV_T_Add = Vol_SOV_T_1;
			Vol_LTr_Add = Vol_LTr_1;
			Vol_ELTr_Add = Vol_ParaTran_1;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_1;
			Vol_SpVeh_Add = Vol_SpVeh_1;
		}
//ORIGINAL LINE: Case Is < VolGP_2
		else if (VolGP < VolGP_2)
		{
			VOT_Prev = VOT1;
			VOT_Next = VOT2;
			VolGP_Prev = VolGP_1;
			TVol_SOV_Prev = TVol_SOV_1;
			TVol_RHOV_M_Prev = TVol_RHOV_M_1;
			TVol_SOV_T_Prev = TVol_SOV_T_1;
			TVol_LTr_Prev = TVol_LTr_1;
			TVol_ELTr_Prev = TVol_ELTr_1;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_1;
			TVol_SpVeh_Prev = TVol_SpVeh_1;
			Vol_SOV_Add = Vol_SOV_2;
			Vol_RHOV_M_Add = Vol_RHOV_M_2;
			Vol_SOV_T_Add = Vol_SOV_T_2;
			Vol_LTr_Add = Vol_LTr_2;
			Vol_ELTr_Add = Vol_ParaTran_2;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_2;
			Vol_SpVeh_Add = Vol_SpVeh_2;
		}
//ORIGINAL LINE: Case Is < VolGP_3
		else if (VolGP < VolGP_3)
		{
			VOT_Prev = VOT2;
			VOT_Next = VOT3;
			VolGP_Prev = VolGP_2;
			TVol_SOV_Prev = TVol_SOV_2;
			TVol_RHOV_M_Prev = TVol_RHOV_M_2;
			TVol_SOV_T_Prev = TVol_SOV_T_2;
			TVol_LTr_Prev = TVol_LTr_2;
			TVol_ELTr_Prev = TVol_ELTr_2;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_2;
			TVol_SpVeh_Prev = TVol_SpVeh_2;
			Vol_SOV_Add = Vol_SOV_3;
			Vol_RHOV_M_Add = Vol_RHOV_M_3;
			Vol_SOV_T_Add = Vol_SOV_T_3;
			Vol_LTr_Add = Vol_LTr_3;
			Vol_ELTr_Add = Vol_ParaTran_3;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_3;
			Vol_SpVeh_Add = Vol_SpVeh_3;
		}
//ORIGINAL LINE: Case Is < VolGP_4
		else if (VolGP < VolGP_4)
		{
			VOT_Prev = VOT3;
			VOT_Next = VOT4;
			VolGP_Prev = VolGP_3;
			TVol_SOV_Prev = TVol_SOV_3;
			TVol_RHOV_M_Prev = TVol_RHOV_M_3;
			TVol_SOV_T_Prev = TVol_SOV_T_3;
			TVol_LTr_Prev = TVol_LTr_3;
			TVol_ELTr_Prev = TVol_ELTr_3;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_3;
			TVol_SpVeh_Prev = TVol_SpVeh_3;
			Vol_SOV_Add = Vol_SOV_4;
			Vol_RHOV_M_Add = Vol_RHOV_M_4;
			Vol_SOV_T_Add = Vol_SOV_T_4;
			Vol_LTr_Add = Vol_LTr_4;
			Vol_ELTr_Add = Vol_ParaTran_4;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_4;
			Vol_SpVeh_Add = Vol_SpVeh_4;
		}
//ORIGINAL LINE: Case Is < VolGP_5
		else if (VolGP < VolGP_5)
		{
			VOT_Prev = VOT4;
			VOT_Next = VOT5;
			VolGP_Prev = VolGP_4;
			TVol_SOV_Prev = TVol_SOV_4;
			TVol_RHOV_M_Prev = TVol_RHOV_M_4;
			TVol_SOV_T_Prev = TVol_SOV_T_4;
			TVol_LTr_Prev = TVol_LTr_4;
			TVol_ELTr_Prev = TVol_ELTr_4;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_4;
			TVol_SpVeh_Prev = TVol_SpVeh_4;
			Vol_SOV_Add = Vol_SOV_5;
			Vol_RHOV_M_Add = Vol_RHOV_M_5;
			Vol_SOV_T_Add = Vol_SOV_T_5;
			Vol_LTr_Add = Vol_LTr_5;
			Vol_ELTr_Add = Vol_ParaTran_5;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_5;
			Vol_SpVeh_Add = Vol_SpVeh_5;
		}
//ORIGINAL LINE: Case Is < VolGP_6
		else if (VolGP < VolGP_6)
		{
			VOT_Prev = VOT5;
			VOT_Next = VOT6;
			VolGP_Prev = VolGP_5;
			TVol_SOV_Prev = TVol_SOV_5;
			TVol_RHOV_M_Prev = TVol_RHOV_M_5;
			TVol_SOV_T_Prev = TVol_SOV_T_5;
			TVol_LTr_Prev = TVol_LTr_5;
			TVol_ELTr_Prev = TVol_ELTr_5;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_5;
			TVol_SpVeh_Prev = TVol_SpVeh_5;
			Vol_SOV_Add = Vol_SOV_6;
			Vol_RHOV_M_Add = Vol_RHOV_M_6;
			Vol_SOV_T_Add = Vol_SOV_T_6;
			Vol_LTr_Add = Vol_LTr_6;
			Vol_ELTr_Add = Vol_ParaTran_6;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_6;
			Vol_SpVeh_Add = Vol_SpVeh_6;
		}
//ORIGINAL LINE: Case Is < VolGP_7
		else if (VolGP < VolGP_7)
		{
			VOT_Prev = VOT6;
			VOT_Next = VOT7;
			VolGP_Prev = VolGP_6;
			TVol_SOV_Prev = TVol_SOV_6;
			TVol_RHOV_M_Prev = TVol_RHOV_M_6;
			TVol_SOV_T_Prev = TVol_SOV_T_6;
			TVol_LTr_Prev = TVol_LTr_6;
			TVol_ELTr_Prev = TVol_ELTr_6;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_6;
			TVol_SpVeh_Prev = TVol_SpVeh_6;
			Vol_SOV_Add = Vol_SOV_7;
			Vol_RHOV_M_Add = Vol_RHOV_M_7;
			Vol_SOV_T_Add = Vol_SOV_T_7;
			Vol_LTr_Add = Vol_LTr_7;
			Vol_ELTr_Add = Vol_ParaTran_7;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_7;
			Vol_SpVeh_Add = Vol_SpVeh_7;
		}
//ORIGINAL LINE: Case Is < VolGP_8
		else if (VolGP < VolGP_8)
		{
			VOT_Prev = VOT7;
			VOT_Next = VOT8;
			VolGP_Prev = VolGP_7;
			TVol_SOV_Prev = TVol_SOV_7;
			TVol_RHOV_M_Prev = TVol_RHOV_M_7;
			TVol_SOV_T_Prev = TVol_SOV_T_7;
			TVol_LTr_Prev = TVol_LTr_7;
			TVol_ELTr_Prev = TVol_ELTr_7;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_7;
			TVol_SpVeh_Prev = TVol_SpVeh_7;
			Vol_SOV_Add = Vol_SOV_8;
			Vol_RHOV_M_Add = Vol_RHOV_M_8;
			Vol_SOV_T_Add = Vol_SOV_T_8;
			Vol_LTr_Add = Vol_LTr_8;
			Vol_ELTr_Add = Vol_ParaTran_8;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_8;
			Vol_SpVeh_Add = Vol_SpVeh_8;
		}
//ORIGINAL LINE: Case Is < VolGP_9
		else if (VolGP < VolGP_9)
		{
			VOT_Prev = VOT8;
			VOT_Next = VOT9;
			VolGP_Prev = VolGP_8;
			TVol_SOV_Prev = TVol_SOV_8;
			TVol_RHOV_M_Prev = TVol_RHOV_M_8;
			TVol_SOV_T_Prev = TVol_SOV_T_8;
			TVol_LTr_Prev = TVol_LTr_8;
			TVol_ELTr_Prev = TVol_ELTr_8;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_8;
			TVol_SpVeh_Prev = TVol_SpVeh_8;
			Vol_SOV_Add = Vol_SOV_9;
			Vol_RHOV_M_Add = Vol_RHOV_M_9;
			Vol_SOV_T_Add = Vol_SOV_T_9;
			Vol_LTr_Add = Vol_LTr_9;
			Vol_ELTr_Add = Vol_ParaTran_9;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_9;
			Vol_SpVeh_Add = Vol_SpVeh_9;
		}
//ORIGINAL LINE: Case Is < VolGP_10
		else if (VolGP < VolGP_10)
		{
			VOT_Prev = VOT9;
			VOT_Next = VOT10;
			VolGP_Prev = VolGP_9;
			TVol_SOV_Prev = TVol_SOV_9;
			TVol_RHOV_M_Prev = TVol_RHOV_M_9;
			TVol_SOV_T_Prev = TVol_SOV_T_9;
			TVol_LTr_Prev = TVol_LTr_9;
			TVol_ELTr_Prev = TVol_ELTr_9;
			TVol_ELTr_T2_Prev = TVol_ELTr_T2_9;
			TVol_SpVeh_Prev = TVol_SpVeh_9;
			Vol_SOV_Add = Vol_SOV_10;
			Vol_RHOV_M_Add = Vol_RHOV_M_10;
			Vol_SOV_T_Add = Vol_SOV_T_10;
			Vol_LTr_Add = Vol_LTr_10;
			Vol_ELTr_Add = Vol_ParaTran_10;
			Vol_ELTr_T2_Add = Vol_ELTr_T2_10;
			Vol_SpVeh_Add = Vol_SpVeh_10;
		}
//ORIGINAL LINE: Case Is > VolGP_10
		else if (VolGP > VolGP_10)
		{
			if (VOT_Num >= 10)
			{
				VolGP_Prev = VolGP_10;
				TVol_SOV_Prev = TVol_SOV_10;
				TVol_RHOV_M_Prev = TVol_RHOV_M_10;
				TVol_SOV_T_Prev = TVol_SOV_T_10;
				TVol_LTr_Prev = TVol_LTr_10;
				TVol_ELTr_Prev = TVol_ELTr_10;
				TVol_ELTr_T2_Prev = TVol_ELTr_T2_10;
				TVol_SpVeh_Prev = TVol_SpVeh_10;
				Vol_SOV_Add = 0;
				Vol_RHOV_M_Add = 0;
				Vol_SOV_T_Add = 0;
				Vol_LTr_Add = 0;
				Vol_ELTr_Add = 0;
				Vol_ELTr_T2_Add = 0;
				Vol_SpVeh_Add = 0;
				VolGP = VolGP_10;
				VolML = VolML_10;
			}
			else
			{
				CalculateTrueNumberOfVehicles(VOT_Num + 1);
			}
		}
//VB TO JAVA CONVERTER NOTE: Inserted the following 'return' since all code paths must return a value in Java:
		return false;
	}

   public final void GenerateRandomAdditionalVehicle()
	{
		//initial values
		m = 0;
		n = 0;
		o = 0;
		p = 0;
		a = 0;
		c = 0;
		d = 0;

		// set the upperbound for additional vehicle calculations
		UB_SOV = PMxVeh_SOV * 10;
		UB_RHOV_M = UB_SOV + (PMxVeh_RHOV_M * 10);
		UB_SOV_T = UB_RHOV_M + (PMxVeh_SOV_T * 10);
		UB_LTr = UB_SOV_T + (PMxVeh_LTr * 10);
		UB_ParaTrans = UB_LTr + (PMxVeh_ELTr * 10);
		UB_ELTr_T2 = UB_LTr + (PMxVeh_ELTr_T2 * 10);
		UB_SpVeh = UB_ELTr_T2 + (PMxVeh_SpVeh * 10);


		//Generates vehicle mix for each class
		if (i > 1)
		{
                    while ( ! ((m + n + o + p + a + c + d) == i))
                    {
                        r = (int)Math.floor((double)(Math.random()* 1000));
                        int changed = 0;
                        if (r < UB_SOV && m < Math.round(Vol_SOV_Add) && Singleton.getInstance().getissovml().isSelected() == false)
                        {
                                m += 1;
                                changed += 1;
                        }
                        else if (r < UB_RHOV_M && n < Math.round(Vol_RHOV_M_Add) && Singleton.getInstance().getishovml().isSelected() == false)
                        {
                                n += 1;
                                changed += 1;
                        }
                        else if (r < UB_SOV_T && o < Math.round(Vol_SOV_T_Add) && Singleton.getInstance().getissovtml().isSelected() == false)
                        {
                                o += 1;
                                changed += 1;
                        }
                        else if (r < UB_LTr && p < Math.round(Vol_LTr_Add) && Singleton.getInstance().getissutml().isSelected() == false)
                        {
                                p += 1;
                                changed += 1;
                        }
                        else if (r < UB_ParaTrans && a < Math.round(Vol_ELTr_Add) && Singleton.getInstance().getissttml().isSelected() == false)
                        {
                                a += 1;
                                changed += 1;
                        }
                        else if (r < UB_ELTr_T2 && c < Math.round(Vol_ELTr_T2_Add) && Singleton.getInstance().getisstdml().isSelected() == false)
                        {
                                c += 1;
                                changed += 1;
                        }
                        else if (r < UB_SpVeh && d < Math.round(Vol_SpVeh_Add) && Singleton.getInstance().getisspvml().isSelected() == false)
                        {
                                d += 1;
                                changed += 1;
                        }
                        if (changed == 0)
                        {
                                if (r < UB_SOV && 0 < Math.round(Vol_SOV_Add) && Singleton.getInstance().getissovml().isSelected() == false)
                                {
                                        m += 1;
                                }
                                else if (r < UB_RHOV_M && 0 < Math.round(Vol_RHOV_M_Add) && Singleton.getInstance().getishovml().isSelected() == false)
                                {
                                        n += 1;
                                }
                                else if (r < UB_SOV_T && 0 < Math.round(Vol_SOV_T_Add) && Singleton.getInstance().getissovtml().isSelected() == false)
                                {
                                        o += 1;
                                }
                                else if (r < UB_LTr && 0 < Math.round(Vol_LTr_Add) && Singleton.getInstance().getissutml().isSelected() == false)
                                {
                                        p += 1;
                                }
                                else if (r < UB_ParaTrans && 0 < Math.round(Vol_ELTr_Add) && Singleton.getInstance().getissttml().isSelected() == false)
                                {
                                        a += 1;
                                }
                                else if (r < UB_ELTr_T2 && 0 < Math.round(Vol_ELTr_T2_Add) && Singleton.getInstance().getisstdml().isSelected() == false)
                                {
                                        c += 1;
                                }
                                else if (r < UB_SpVeh && 0 < Math.round(Vol_SpVeh_Add) && Singleton.getInstance().getisspvml().isSelected() == false)
                                {
                                        d += 1;
                                }
                        }
                    }
		}
	}

    public final void PrepareVOTdistributionTable_SOV()
	{
		//Calculate percentage of VOT based on toll policy
		VOT_SOV_1 = Double.parseDouble(Singleton.getInstance().getsovtime1().getText()) / 100;
		VOT_SOV_2 = Double.parseDouble(Singleton.getInstance().getsovtime2().getText()) / 100;
		VOT_SOV_3 = Double.parseDouble(Singleton.getInstance().getsovtime3().getText()) / 100;
		VOT_SOV_4 = Double.parseDouble(Singleton.getInstance().getsovtime4().getText()) / 100;
		VOT_SOV_5 = Double.parseDouble(Singleton.getInstance().getsovtime5().getText()) / 100;
		VOT_SOV_6 = Double.parseDouble(Singleton.getInstance().getsovtime6().getText()) / 100;
		VOT_SOV_7 = Double.parseDouble(Singleton.getInstance().getsovtime7().getText()) / 100;
		VOT_SOV_8 = Double.parseDouble(Singleton.getInstance().getsovtime8().getText()) / 100;
		VOT_SOV_9 = Double.parseDouble(Singleton.getInstance().getsovtime9().getText()) / 100;
		VOT_SOV_10 = Double.parseDouble(Singleton.getInstance().getsovtime10().getText()) / 100;

		UBcalvot = VOT1 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_SOV / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;


		LBVOT_SOV_1 = 0;
		UBVOT_SOV_1 = PercentVOT1;
		LBVOT_SOV_2 = UBVOT_SOV_1;
		UBVOT_SOV_2 = LBVOT_SOV_2 + PercentVOT2;
		LBVOT_SOV_3 = UBVOT_SOV_2;
		UBVOT_SOV_3 = LBVOT_SOV_3 + PercentVOT3;
		LBVOT_SOV_4 = UBVOT_SOV_3;
		UBVOT_SOV_4 = LBVOT_SOV_4 + PercentVOT4;
		LBVOT_SOV_5 = UBVOT_SOV_4;
		UBVOT_SOV_5 = LBVOT_SOV_5 + PercentVOT5;
		LBVOT_SOV_6 = UBVOT_SOV_5;
		UBVOT_SOV_6 = LBVOT_SOV_6 + PercentVOT6;
		LBVOT_SOV_7 = UBVOT_SOV_6;
		UBVOT_SOV_7 = LBVOT_SOV_7 + PercentVOT7;
		LBVOT_SOV_8 = UBVOT_SOV_7;
		UBVOT_SOV_8 = LBVOT_SOV_8 + PercentVOT8;
		LBVOT_SOV_9 = UBVOT_SOV_8;
		UBVOT_SOV_9 = LBVOT_SOV_9 + PercentVOT9;
		LBVOT_SOV_10 = UBVOT_SOV_9;
		UBVOT_SOV_10 = LBVOT_SOV_10 + PercentVOT10;


		LBVOT = LBVOT_SOV_1;
		UBVOT = UBVOT_SOV_1;
		CalculationVOT_SOV();
		PVOT_SOV_1 = PVOT;

		LBVOT = LBVOT_SOV_2;
		UBVOT = UBVOT_SOV_2;
		CalculationVOT_SOV();
		PVOT_SOV_2 = PVOT;

		LBVOT = LBVOT_SOV_3;
		UBVOT = UBVOT_SOV_3;
		CalculationVOT_SOV();
		PVOT_SOV_3 = PVOT;

		LBVOT = LBVOT_SOV_4;
		UBVOT = UBVOT_SOV_4;
		CalculationVOT_SOV();
		PVOT_SOV_4 = PVOT;

		LBVOT = LBVOT_SOV_5;
		UBVOT = UBVOT_SOV_5;
		CalculationVOT_SOV();
		PVOT_SOV_5 = PVOT;

		LBVOT = LBVOT_SOV_6;
		UBVOT = UBVOT_SOV_6;
		CalculationVOT_SOV();
		PVOT_SOV_6 = PVOT;

		LBVOT = LBVOT_SOV_7;
		UBVOT = UBVOT_SOV_7;
		CalculationVOT_SOV();
		PVOT_SOV_7 = PVOT;

		LBVOT = LBVOT_SOV_8;
		UBVOT = UBVOT_SOV_8;
		CalculationVOT_SOV();
		PVOT_SOV_8 = PVOT;

		LBVOT = LBVOT_SOV_9;
		UBVOT = UBVOT_SOV_9;
		CalculationVOT_SOV();
		PVOT_SOV_9 = PVOT;

		LBVOT = LBVOT_SOV_10;
		UBVOT = UBVOT_SOV_10;
		CalculationVOT_SOV();
		PVOT_SOV_10 = PVOT;
	}
    
    public final void CalculationPercentVOTintervalforAllClasses()
	{

		//CalculationPercentVOTinterval()
		if (UBcalvot <= VOT1)
		{
			PercentVOTdist = UBcalvot / VOT1;
		}
		else if (UBcalvot <= VOT2)
		{
			PercentVOTdist = 1 + ((UBcalvot - VOT1) / (VOT2 - VOT1));
		}
		else if (UBcalvot <= VOT3)
		{
			PercentVOTdist = 2 + ((UBcalvot - VOT2) / (VOT3 - VOT2));
		}
		else if (UBcalvot <= VOT4)
		{
			PercentVOTdist = 3 + ((UBcalvot - VOT3) / (VOT4 - VOT3));
		}
		else if (UBcalvot <= VOT5)
		{
			PercentVOTdist = 4 + ((UBcalvot - VOT4) / (VOT5 - VOT4));
		}
		else if (UBcalvot <= VOT6)
		{
			PercentVOTdist = 5 + ((UBcalvot - VOT5) / (VOT6 - VOT5));
		}
		else if (UBcalvot <= VOT7)
		{
			PercentVOTdist = 6 + ((UBcalvot - VOT6) / (VOT7 - VOT6));
		}
		else if (UBcalvot <= VOT8)
		{
			PercentVOTdist = 7 + ((UBcalvot - VOT7) / (VOT8 - VOT7));
		}
		else if (UBcalvot <= VOT9)
		{
			PercentVOTdist = 8 + ((UBcalvot - VOT8) / (VOT9 - VOT8));
		}
		else if (UBcalvot <= VOT10)
		{
			PercentVOTdist = 9 + ((UBcalvot - VOT9) / (VOT10 - VOT9));
		}
	}

	public final void CalculationVOT_SOV()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_SOV_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_SOV_1 * (1 - LBVOT)) + (VOT_SOV_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_SOV_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_SOV_2 * (2 - LBVOT)) + (VOT_SOV_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_SOV_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_SOV_3 * (3 - LBVOT)) + (VOT_SOV_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_SOV_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_SOV_4 * (4 - LBVOT)) + (VOT_SOV_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_SOV_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_SOV_5 * (5 - LBVOT)) + (VOT_SOV_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_SOV_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_SOV_6 * (6 - LBVOT)) + (VOT_SOV_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_SOV_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_SOV_7 * (7 - LBVOT)) + (VOT_SOV_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_SOV_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_SOV_8 * (8 - LBVOT)) + (VOT_SOV_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_SOV_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_SOV_9 * (9 - LBVOT)) + (VOT_SOV_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_SOV_10 * (UBVOT - LBVOT);
		}
	}

    public final void PrepareVOTdistributionTable_RHOV_M()
	{
		VOT_RHOV_M_1 = Double.parseDouble(Singleton.getInstance().gethovtime1().getText()) / 100;
		VOT_RHOV_M_2 = Double.parseDouble(Singleton.getInstance().gethovtime2().getText()) / 100;
		VOT_RHOV_M_3 = Double.parseDouble(Singleton.getInstance().gethovtime3().getText()) / 100;
		VOT_RHOV_M_4 = Double.parseDouble(Singleton.getInstance().gethovtime4().getText()) / 100;
		VOT_RHOV_M_5 = Double.parseDouble(Singleton.getInstance().gethovtime5().getText()) / 100;
		VOT_RHOV_M_6 = Double.parseDouble(Singleton.getInstance().gethovtime6().getText()) / 100;
		VOT_RHOV_M_7 = Double.parseDouble(Singleton.getInstance().gethovtime7().getText()) / 100;
		VOT_RHOV_M_8 = Double.parseDouble(Singleton.getInstance().gethovtime8().getText()) / 100;
		VOT_RHOV_M_9 = Double.parseDouble(Singleton.getInstance().gethovtime9().getText()) / 100;
		VOT_RHOV_M_10 = Double.parseDouble(Singleton.getInstance().gethovtime10().getText()) / 100;

		UBcalvot = VOT1 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_RHOV_M / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;

		LBVOT_RHOV_M_1 = 0;
		UBVOT_RHOV_M_1 = PercentVOT1;
		LBVOT_RHOV_M_2 = UBVOT_RHOV_M_1;
		UBVOT_RHOV_M_2 = LBVOT_RHOV_M_2 + PercentVOT2;
		LBVOT_RHOV_M_3 = UBVOT_RHOV_M_2;
		UBVOT_RHOV_M_3 = LBVOT_RHOV_M_3 + PercentVOT3;
		LBVOT_RHOV_M_4 = UBVOT_RHOV_M_3;
		UBVOT_RHOV_M_4 = LBVOT_RHOV_M_4 + PercentVOT4;
		LBVOT_RHOV_M_5 = UBVOT_RHOV_M_4;
		UBVOT_RHOV_M_5 = LBVOT_RHOV_M_5 + PercentVOT5;
		LBVOT_RHOV_M_6 = UBVOT_RHOV_M_5;
		UBVOT_RHOV_M_6 = LBVOT_RHOV_M_6 + PercentVOT6;
		LBVOT_RHOV_M_7 = UBVOT_RHOV_M_6;
		UBVOT_RHOV_M_7 = LBVOT_RHOV_M_7 + PercentVOT7;
		LBVOT_RHOV_M_8 = UBVOT_RHOV_M_7;
		UBVOT_RHOV_M_8 = LBVOT_RHOV_M_8 + PercentVOT8;
		LBVOT_RHOV_M_9 = UBVOT_RHOV_M_8;
		UBVOT_RHOV_M_9 = LBVOT_RHOV_M_9 + PercentVOT9;
		LBVOT_RHOV_M_10 = UBVOT_RHOV_M_9;
		UBVOT_RHOV_M_10 = LBVOT_RHOV_M_10 + PercentVOT10;

		LBVOT = LBVOT_RHOV_M_1;
		UBVOT = UBVOT_RHOV_M_1;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_1 = PVOT;

		LBVOT = LBVOT_RHOV_M_2;
		UBVOT = UBVOT_RHOV_M_2;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_2 = PVOT;

		LBVOT = LBVOT_RHOV_M_3;
		UBVOT = UBVOT_RHOV_M_3;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_3 = PVOT;

		LBVOT = LBVOT_RHOV_M_4;
		UBVOT = UBVOT_RHOV_M_4;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_4 = PVOT;

		LBVOT = LBVOT_RHOV_M_5;
		UBVOT = UBVOT_RHOV_M_5;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_5 = PVOT;

		LBVOT = LBVOT_RHOV_M_6;
		UBVOT = UBVOT_RHOV_M_6;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_6 = PVOT;

		LBVOT = LBVOT_RHOV_M_7;
		UBVOT = UBVOT_RHOV_M_7;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_7 = PVOT;

		LBVOT = LBVOT_RHOV_M_8;
		UBVOT = UBVOT_RHOV_M_8;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_8 = PVOT;

		LBVOT = LBVOT_RHOV_M_9;
		UBVOT = UBVOT_RHOV_M_9;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_9 = PVOT;

		LBVOT = LBVOT_RHOV_M_10;
		UBVOT = UBVOT_RHOV_M_10;
		CalculationVOT_RHOV_M();
		PVOT_RHOV_M_10 = PVOT;
	}
    
    public final void CalculationVOT_RHOV_M()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_RHOV_M_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_RHOV_M_1 * (1 - LBVOT)) + (VOT_RHOV_M_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_RHOV_M_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_RHOV_M_2 * (2 - LBVOT)) + (VOT_RHOV_M_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_RHOV_M_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_RHOV_M_3 * (3 - LBVOT)) + (VOT_RHOV_M_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_RHOV_M_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_RHOV_M_4 * (4 - LBVOT)) + (VOT_RHOV_M_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_RHOV_M_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_RHOV_M_5 * (5 - LBVOT)) + (VOT_RHOV_M_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_RHOV_M_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_RHOV_M_6 * (6 - LBVOT)) + (VOT_RHOV_M_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_RHOV_M_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_RHOV_M_7 * (7 - LBVOT)) + (VOT_RHOV_M_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_RHOV_M_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_RHOV_M_8 * (8 - LBVOT)) + (VOT_RHOV_M_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_RHOV_M_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_RHOV_M_9 * (9 - LBVOT)) + (VOT_RHOV_M_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_RHOV_M_10 * (UBVOT - LBVOT);
		}
	}


   private double CalculationVOT_RHOV_M(double lbvot, double ubvot, double[] vot)
	{
		double temp = 0;
		if (lbvot <= 1 && ubvot <= 1)
		{
			temp = vot[0] * (ubvot - lbvot);
		}
		else if (lbvot <= 1 && ubvot <= 2)
		{
			temp = (vot[0] * (1 - lbvot)) + (vot[1] * (ubvot - 1));
		}
		else if (lbvot <= 2 && ubvot <= 2)
		{
			temp = vot[1] * (ubvot - lbvot);
		}
		else if (lbvot <= 2 && ubvot <= 3)
		{
			temp = (vot[1] * (2 - lbvot)) + (vot[2] * (ubvot - 2));
		}
		else if (lbvot <= 3 && ubvot <= 3)
		{
			temp = vot[2] * (ubvot - lbvot);
		}
		else if (lbvot <= 3 && ubvot <= 4)
		{
			temp = (vot[2] * (3 - lbvot)) + (vot[3] * (ubvot - 3));
		}
		else if (lbvot <= 4 && ubvot <= 4)
		{
			temp = vot[3] * (ubvot - lbvot);
		}
		else if (lbvot <= 4 && ubvot <= 5)
		{
			temp = (vot[3] * (4 - lbvot)) + (vot[4] * (ubvot - 4));
		}
		else if (lbvot <= 5 && ubvot <= 5)
		{
			temp = vot[4] * (ubvot - lbvot);
		}
		else if (lbvot <= 5 && ubvot <= 6)
		{
			temp = (vot[4] * (5 - lbvot)) + (vot[5] * (ubvot - 5));
		}
		else if (lbvot <= 6 && ubvot <= 6)
		{
			temp = vot[5] * (ubvot - lbvot);
		}
		else if (lbvot <= 6 && ubvot <= 7)
		{
			temp = (vot[5] * (6 - lbvot)) + (vot[6] * (ubvot - 6));
		}
		else if (lbvot <= 7 && ubvot <= 7)
		{
			temp = vot[6] * (ubvot - lbvot);
		}
		else if (lbvot <= 7 && ubvot <= 8)
		{
			temp = (vot[6] * (7 - lbvot)) + (vot[7] * (ubvot - 7));
		}
		else if (lbvot <= 8 && ubvot <= 8)
		{
			temp = vot[7] * (ubvot - lbvot);
		}
		else if (lbvot <= 8 && ubvot <= 9)
		{
			temp = (vot[7] * (8 - lbvot)) + (vot[9] * (ubvot - 8));
		}
		else if (lbvot <= 9 && ubvot <= 9)
		{
			temp = vot[9] * (ubvot - lbvot);
		}
		else if (lbvot <= 9 && ubvot <= 10)
		{
			temp = (vot[9] * (9 - lbvot)) + (vot[10] * (ubvot - 9));
		}
		else if (lbvot <= 10 && ubvot <= 10)
		{
			temp = vot[10] * (ubvot - lbvot);
		}
		return temp;
	}

    public final void PrepareVOTdistributionTable_SOV_T()
	{

		// calculationtruenumber of SOV_T
		VOT_SOV_T_1 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_2 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_3 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_4 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_5 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_6 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_7 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_8 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_9 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;
		VOT_SOV_T_10 = Double.parseDouble(Singleton.getInstance().getsovttime1().getText()) / 100;


		UBcalvot = VOT1 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_SOV_T / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;


		LBVOT_SOV_T_1 = 0;
		UBVOT_SOV_T_1 = PercentVOT1;
		LBVOT_SOV_T_2 = UBVOT_SOV_T_1;
		UBVOT_SOV_T_2 = LBVOT_SOV_T_2 + PercentVOT2;
		LBVOT_SOV_T_3 = UBVOT_SOV_T_2;
		UBVOT_SOV_T_3 = LBVOT_SOV_T_3 + PercentVOT3;
		LBVOT_SOV_T_4 = UBVOT_SOV_T_3;
		UBVOT_SOV_T_4 = LBVOT_SOV_T_4 + PercentVOT4;
		LBVOT_SOV_T_5 = UBVOT_SOV_T_4;
		UBVOT_SOV_T_5 = LBVOT_SOV_T_5 + PercentVOT5;
		LBVOT_SOV_T_6 = UBVOT_SOV_T_5;
		UBVOT_SOV_T_6 = LBVOT_SOV_T_6 + PercentVOT6;
		LBVOT_SOV_T_7 = UBVOT_SOV_T_6;
		UBVOT_SOV_T_7 = LBVOT_SOV_T_7 + PercentVOT7;
		LBVOT_SOV_T_8 = UBVOT_SOV_T_7;
		UBVOT_SOV_T_8 = LBVOT_SOV_T_8 + PercentVOT8;
		LBVOT_SOV_T_9 = UBVOT_SOV_T_8;
		UBVOT_SOV_T_9 = LBVOT_SOV_T_9 + PercentVOT9;
		LBVOT_SOV_T_10 = UBVOT_SOV_T_9;
		UBVOT_SOV_T_10 = LBVOT_SOV_T_10 + PercentVOT10;

		LBVOT = LBVOT_SOV_T_1;
		UBVOT = UBVOT_SOV_T_1;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_1 = PVOT;

		LBVOT = LBVOT_SOV_T_2;
		UBVOT = UBVOT_SOV_T_2;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_2 = PVOT;

		LBVOT = LBVOT_SOV_T_3;
		UBVOT = UBVOT_SOV_T_3;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_3 = PVOT;

		LBVOT = LBVOT_SOV_T_4;
		UBVOT = UBVOT_SOV_T_4;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_4 = PVOT;

		LBVOT = LBVOT_SOV_T_5;
		UBVOT = UBVOT_SOV_T_5;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_5 = PVOT;

		LBVOT = LBVOT_SOV_T_6;
		UBVOT = UBVOT_SOV_T_6;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_6 = PVOT;

		LBVOT = LBVOT_SOV_T_7;
		UBVOT = UBVOT_SOV_T_7;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_7 = PVOT;

		LBVOT = LBVOT_SOV_T_8;
		UBVOT = UBVOT_SOV_T_8;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_8 = PVOT;

		LBVOT = LBVOT_SOV_T_9;
		UBVOT = UBVOT_SOV_T_9;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_9 = PVOT;

		LBVOT = LBVOT_SOV_T_10;
		UBVOT = UBVOT_SOV_T_10;
		CalculationVOT_SOV_T();
		PVOT_SOV_T_10 = PVOT;
	}

  public final void CalculationVOT_SOV_T()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_SOV_T_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_SOV_T_1 * (1 - LBVOT)) + (VOT_SOV_T_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_SOV_T_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_SOV_T_2 * (2 - LBVOT)) + (VOT_SOV_T_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_SOV_T_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_SOV_T_3 * (3 - LBVOT)) + (VOT_SOV_T_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_SOV_T_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_SOV_T_4 * (4 - LBVOT)) + (VOT_SOV_T_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_SOV_T_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_SOV_T_5 * (5 - LBVOT)) + (VOT_SOV_T_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_SOV_T_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_SOV_T_6 * (6 - LBVOT)) + (VOT_SOV_T_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_SOV_T_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_SOV_T_7 * (7 - LBVOT)) + (VOT_SOV_T_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_SOV_T_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_SOV_T_8 * (8 - LBVOT)) + (VOT_SOV_T_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_SOV_T_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_SOV_T_9 * (9 - LBVOT)) + (VOT_SOV_T_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_SOV_T_10 * (UBVOT - LBVOT);
		}
	}

    public final void PrepareVOTdistributionTable_LTr()
	{
		VOT_LTr_1 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_2 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_3 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_4 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_5 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_6 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_7 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_8 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_9 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;
		VOT_LTr_10 = Double.parseDouble(Singleton.getInstance().getsuttime1().getText()) / 100;

		UBcalvot = VOT1 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_LTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;


		LBVOT_LTr_1 = 0;
		UBVOT_LTr_1 = PercentVOT1;
		LBVOT_LTr_2 = UBVOT_LTr_1;
		UBVOT_LTr_2 = LBVOT_LTr_2 + PercentVOT2;
		LBVOT_LTr_3 = UBVOT_LTr_2;
		UBVOT_LTr_3 = LBVOT_LTr_3 + PercentVOT3;
		LBVOT_LTr_4 = UBVOT_LTr_3;
		UBVOT_LTr_4 = LBVOT_LTr_4 + PercentVOT4;
		LBVOT_LTr_5 = UBVOT_LTr_4;
		UBVOT_LTr_5 = LBVOT_LTr_5 + PercentVOT5;
		LBVOT_LTr_6 = UBVOT_LTr_5;
		UBVOT_LTr_6 = LBVOT_LTr_6 + PercentVOT6;
		LBVOT_LTr_7 = UBVOT_LTr_6;
		UBVOT_LTr_7 = LBVOT_LTr_7 + PercentVOT7;
		LBVOT_LTr_8 = UBVOT_LTr_7;
		UBVOT_LTr_8 = LBVOT_LTr_8 + PercentVOT8;
		LBVOT_LTr_9 = UBVOT_LTr_8;
		UBVOT_LTr_9 = LBVOT_LTr_9 + PercentVOT9;
		LBVOT_LTr_10 = UBVOT_LTr_9;
		UBVOT_LTr_10 = LBVOT_LTr_10 + PercentVOT10;

		LBVOT = LBVOT_LTr_1;
		UBVOT = UBVOT_LTr_1;
		CalculationVOT_LTr();
		PVOT_LTr_1 = PVOT;

		LBVOT = LBVOT_LTr_2;
		UBVOT = UBVOT_LTr_2;
		CalculationVOT_LTr();
		PVOT_LTr_2 = PVOT;

		LBVOT = LBVOT_LTr_3;
		UBVOT = UBVOT_LTr_3;
		CalculationVOT_LTr();
		PVOT_LTr_3 = PVOT;

		LBVOT = LBVOT_LTr_4;
		UBVOT = UBVOT_LTr_4;
		CalculationVOT_LTr();
		PVOT_LTr_4 = PVOT;

		LBVOT = LBVOT_LTr_5;
		UBVOT = UBVOT_LTr_5;
		CalculationVOT_LTr();
		PVOT_LTr_5 = PVOT;

		LBVOT = LBVOT_LTr_6;
		UBVOT = UBVOT_LTr_6;
		CalculationVOT_LTr();
		PVOT_LTr_6 = PVOT;

		LBVOT = LBVOT_LTr_7;
		UBVOT = UBVOT_LTr_7;
		CalculationVOT_LTr();
		PVOT_LTr_7 = PVOT;

		LBVOT = LBVOT_LTr_8;
		UBVOT = UBVOT_LTr_8;
		CalculationVOT_LTr();
		PVOT_LTr_8 = PVOT;

		LBVOT = LBVOT_LTr_9;
		UBVOT = UBVOT_LTr_9;
		CalculationVOT_LTr();
		PVOT_LTr_9 = PVOT;

		LBVOT = LBVOT_LTr_10;
		UBVOT = UBVOT_LTr_10;
		CalculationVOT_LTr();
		PVOT_LTr_10 = PVOT;
	}

    public final void CalculationVOT_LTr()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_LTr_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_LTr_1 * (1 - LBVOT)) + (VOT_LTr_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_LTr_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_LTr_2 * (2 - LBVOT)) + (VOT_LTr_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_LTr_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_LTr_3 * (3 - LBVOT)) + (VOT_LTr_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_LTr_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_LTr_4 * (4 - LBVOT)) + (VOT_LTr_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_LTr_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_LTr_5 * (5 - LBVOT)) + (VOT_LTr_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_LTr_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_LTr_6 * (6 - LBVOT)) + (VOT_LTr_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_LTr_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_LTr_7 * (7 - LBVOT)) + (VOT_LTr_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_LTr_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_LTr_8 * (8 - LBVOT)) + (VOT_LTr_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_LTr_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_LTr_9 * (9 - LBVOT)) + (VOT_LTr_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_LTr_10 * (UBVOT - LBVOT);
		}
	}

   public final void PrepareVOTdistributionTable_ELTr()
	{
		VOT_ELTr_1 = Double.parseDouble(Singleton.getInstance().getstttime1().getText()) / 100;
		VOT_ELTr_2 = Double.parseDouble(Singleton.getInstance().getstttime2().getText()) / 100;
		VOT_ELTr_3 = Double.parseDouble(Singleton.getInstance().getstttime3().getText()) / 100;
		VOT_ELTr_4 = Double.parseDouble(Singleton.getInstance().getstttime4().getText()) / 100;
		VOT_ELTr_5 = Double.parseDouble(Singleton.getInstance().getstttime5().getText()) / 100;
		VOT_ELTr_6 = Double.parseDouble(Singleton.getInstance().getstttime6().getText()) / 100;
		VOT_ELTr_7 = Double.parseDouble(Singleton.getInstance().getstttime7().getText()) / 100;
		VOT_ELTr_8 = Double.parseDouble(Singleton.getInstance().getstttime8().getText()) / 100;
		VOT_ELTr_9 = Double.parseDouble(Singleton.getInstance().getstttime9().getText()) / 100;
		VOT_ELTr_10 = Double.parseDouble(Singleton.getInstance().getstttime10().getText()) / 100;

		UBcalvot = VOT1 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_ELTr / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;


		LBVOT_ParaTran_1 = 0;
		UBVOT_ParaTran_1 = PercentVOT1;
		LBVOT_ParaTran_2 = UBVOT_ParaTran_1;
		UBVOT_ParaTran_2 = LBVOT_ParaTran_2 + PercentVOT2;
		LBVOT_ParaTran_3 = UBVOT_ParaTran_2;
		UBVOT_ParaTran_3 = LBVOT_ParaTran_3 + PercentVOT3;
		LBVOT_ParaTran_4 = UBVOT_ParaTran_3;
		UBVOT_ParaTran_4 = LBVOT_ParaTran_4 + PercentVOT4;
		LBVOT_ParaTran_5 = UBVOT_ParaTran_4;
		UBVOT_ParaTran_5 = LBVOT_ParaTran_5 + PercentVOT5;
		LBVOT_ParaTran_6 = UBVOT_ParaTran_5;
		UBVOT_ParaTran_6 = LBVOT_ParaTran_6 + PercentVOT6;
		LBVOT_ParaTran_7 = UBVOT_ParaTran_6;
		UBVOT_ParaTran_7 = LBVOT_ParaTran_7 + PercentVOT7;
		LBVOT_ParaTran_8 = UBVOT_ParaTran_7;
		UBVOT_ParaTran_8 = LBVOT_ParaTran_8 + PercentVOT8;
		LBVOT_ParaTran_9 = UBVOT_ParaTran_8;
		UBVOT_ParaTran_9 = LBVOT_ParaTran_9 + PercentVOT9;
		LBVOT_ParaTran_10 = UBVOT_ParaTran_9;
		UBVOT_ParaTran_10 = LBVOT_ParaTran_10 + PercentVOT10;


		LBVOT = LBVOT_ParaTran_1;
		UBVOT = UBVOT_ParaTran_1;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_1 = PVOT;

		LBVOT = LBVOT_ParaTran_2;
		UBVOT = UBVOT_ParaTran_2;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_2 = PVOT;

		LBVOT = LBVOT_ParaTran_3;
		UBVOT = UBVOT_ParaTran_3;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_3 = PVOT;

		LBVOT = LBVOT_ParaTran_4;
		UBVOT = UBVOT_ParaTran_4;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_4 = PVOT;

		LBVOT = LBVOT_ParaTran_5;
		UBVOT = UBVOT_ParaTran_5;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_5 = PVOT;

		LBVOT = LBVOT_ParaTran_6;
		UBVOT = UBVOT_ParaTran_6;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_6 = PVOT;

		LBVOT = LBVOT_ParaTran_7;
		UBVOT = UBVOT_ParaTran_7;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_7 = PVOT;

		LBVOT = LBVOT_ParaTran_8;
		UBVOT = UBVOT_ParaTran_8;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_8 = PVOT;

		LBVOT = LBVOT_ParaTran_9;
		UBVOT = UBVOT_ParaTran_9;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_9 = PVOT;

		LBVOT = LBVOT_ParaTran_10;
		UBVOT = UBVOT_ParaTran_10;
		CalculationVOT_ParaTrans();
		PVOT_ELTr_10 = PVOT;
	}
	public final void CalculationVOT_ParaTrans()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_ELTr_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_ELTr_1 * (1 - LBVOT)) + (VOT_ELTr_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_ELTr_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_ELTr_2 * (2 - LBVOT)) + (VOT_ELTr_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_ELTr_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_ELTr_3 * (3 - LBVOT)) + (VOT_ELTr_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_ELTr_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_ELTr_4 * (4 - LBVOT)) + (VOT_ELTr_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_ELTr_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_ELTr_5 * (5 - LBVOT)) + (VOT_ELTr_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_ELTr_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_ELTr_6 * (6 - LBVOT)) + (VOT_ELTr_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_ELTr_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_ELTr_7 * (7 - LBVOT)) + (VOT_ELTr_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_ELTr_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_ELTr_8 * (8 - LBVOT)) + (VOT_ELTr_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_ELTr_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_ELTr_9 * (9 - LBVOT)) + (VOT_ELTr_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_ELTr_10 * (UBVOT - LBVOT);
		}
	}


   public final void PrepareVOTdistributionTable_ELTr_T2()
	{
		//Calculate percentage of VOT based on toll policy
		VOT_ELTr_T2_1 = Double.parseDouble(Singleton.getInstance().getstdtime1().getText()) / 100;
		VOT_ELTr_T2_2 =Double.parseDouble(Singleton.getInstance().getstdtime2().getText()) / 100;
		VOT_ELTr_T2_3 = Double.parseDouble(Singleton.getInstance().getstdtime3().getText()) / 100;
		VOT_ELTr_T2_4 = Double.parseDouble(Singleton.getInstance().getstdtime4().getText()) / 100;
		VOT_ELTr_T2_5 = Double.parseDouble(Singleton.getInstance().getstdtime5().getText()) / 100;
		VOT_ELTr_T2_6 = Double.parseDouble(Singleton.getInstance().getstdtime6().getText()) / 100;
		VOT_ELTr_T2_7 = Double.parseDouble(Singleton.getInstance().getstdtime7().getText()) / 100;
		VOT_ELTr_T2_8 = Double.parseDouble(Singleton.getInstance().getstdtime8().getText()) / 100;
		VOT_ELTr_T2_9 = Double.parseDouble(Singleton.getInstance().getstdtime9().getText()) / 100;
		VOT_ELTr_T2_10 = Double.parseDouble(Singleton.getInstance().getstdtime10().getText()) / 100;

		UBcalvot = VOT1 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_ELTr_T2 / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;


		LBVOT_ELTr_T2_1 = 0;
		UBVOT_ELTr_T2_1 = PercentVOT1;
		LBVOT_ELTr_T2_2 = UBVOT_ELTr_T2_1;
		UBVOT_ELTr_T2_2 = LBVOT_ELTr_T2_2 + PercentVOT2;
		LBVOT_ELTr_T2_3 = UBVOT_ELTr_T2_2;
		UBVOT_ELTr_T2_3 = LBVOT_ELTr_T2_3 + PercentVOT3;
		LBVOT_ELTr_T2_4 = UBVOT_ELTr_T2_3;
		UBVOT_ELTr_T2_4 = LBVOT_ELTr_T2_4 + PercentVOT4;
		LBVOT_ELTr_T2_5 = UBVOT_ELTr_T2_4;
		UBVOT_ELTr_T2_5 = LBVOT_ELTr_T2_5 + PercentVOT5;
		LBVOT_ELTr_T2_6 = UBVOT_ELTr_T2_5;
		UBVOT_ELTr_T2_6 = LBVOT_ELTr_T2_6 + PercentVOT6;
		LBVOT_ELTr_T2_7 = UBVOT_ELTr_T2_6;
		UBVOT_ELTr_T2_7 = LBVOT_ELTr_T2_7 + PercentVOT7;
		LBVOT_ELTr_T2_8 = UBVOT_ELTr_T2_7;
		UBVOT_ELTr_T2_8 = LBVOT_ELTr_T2_8 + PercentVOT8;
		LBVOT_ELTr_T2_9 = UBVOT_ELTr_T2_8;
		UBVOT_ELTr_T2_9 = LBVOT_ELTr_T2_9 + PercentVOT9;
		LBVOT_ELTr_T2_10 = UBVOT_ELTr_T2_9;
		UBVOT_ELTr_T2_10 = LBVOT_ELTr_T2_10 + PercentVOT10;


		LBVOT = LBVOT_ELTr_T2_1;
		UBVOT = UBVOT_ELTr_T2_1;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_1 = PVOT;

		LBVOT = LBVOT_ELTr_T2_2;
		UBVOT = UBVOT_ELTr_T2_2;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_2 = PVOT;

		LBVOT = LBVOT_ELTr_T2_3;
		UBVOT = UBVOT_ELTr_T2_3;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_3 = PVOT;

		LBVOT = LBVOT_ELTr_T2_4;
		UBVOT = UBVOT_ELTr_T2_4;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_4 = PVOT;

		LBVOT = LBVOT_ELTr_T2_5;
		UBVOT = UBVOT_ELTr_T2_5;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_5 = PVOT;

		LBVOT = LBVOT_ELTr_T2_6;
		UBVOT = UBVOT_ELTr_T2_6;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_6 = PVOT;

		LBVOT = LBVOT_ELTr_T2_7;
		UBVOT = UBVOT_ELTr_T2_7;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_7 = PVOT;

		LBVOT = LBVOT_ELTr_T2_8;
		UBVOT = UBVOT_ELTr_T2_8;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_8 = PVOT;

		LBVOT = LBVOT_ELTr_T2_9;
		UBVOT = UBVOT_ELTr_T2_9;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_9 = PVOT;

		LBVOT = LBVOT_ELTr_T2_10;
		UBVOT = UBVOT_ELTr_T2_10;
		CalculationVOT_ELTr_T2();
		PVOT_ELTr_T2_10 = PVOT;
	}

  public final void CalculationVOT_ELTr_T2()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_ELTr_T2_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_ELTr_T2_1 * (1 - LBVOT)) + (VOT_ELTr_T2_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_ELTr_T2_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_ELTr_T2_2 * (2 - LBVOT)) + (VOT_ELTr_T2_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_ELTr_T2_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_ELTr_T2_3 * (3 - LBVOT)) + (VOT_ELTr_T2_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_ELTr_T2_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_ELTr_T2_4 * (4 - LBVOT)) + (VOT_ELTr_T2_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_ELTr_T2_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_ELTr_T2_5 * (5 - LBVOT)) + (VOT_ELTr_T2_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_ELTr_T2_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_ELTr_T2_6 * (6 - LBVOT)) + (VOT_ELTr_T2_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_ELTr_T2_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_ELTr_T2_7 * (7 - LBVOT)) + (VOT_ELTr_T2_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_ELTr_T2_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_ELTr_T2_8 * (8 - LBVOT)) + (VOT_ELTr_T2_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_ELTr_T2_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_ELTr_T2_9 * (9 - LBVOT)) + (VOT_ELTr_T2_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_ELTr_T2_10 * (UBVOT - LBVOT);
		}
	}

    public final void PrepareVOTdistributionTable_LightFreight()
	{
		//Calculate percentage of VOT based on toll policy
		VOT_SpVeh_1 = Double.parseDouble(Singleton.getInstance().getspvtime1().getText()) / 100;
		VOT_SpVeh_2 = Double.parseDouble(Singleton.getInstance().getspvtime2().getText()) / 100;
		VOT_SpVeh_3 = Double.parseDouble(Singleton.getInstance().getspvtime3().getText()) / 100;
		VOT_SpVeh_4 = Double.parseDouble(Singleton.getInstance().getspvtime4().getText()) / 100;
		VOT_SpVeh_5 = Double.parseDouble(Singleton.getInstance().getspvtime5().getText()) / 100;
		VOT_SpVeh_6 = Double.parseDouble(Singleton.getInstance().getspvtime6().getText()) / 100;
		VOT_SpVeh_7 = Double.parseDouble(Singleton.getInstance().getspvtime7().getText()) / 100;
		VOT_SpVeh_8 = Double.parseDouble(Singleton.getInstance().getspvtime8().getText()) / 100;
		VOT_SpVeh_9 = Double.parseDouble(Singleton.getInstance().getspvtime9().getText()) / 100;
		VOT_SpVeh_10 = Double.parseDouble(Singleton.getInstance().getspvtime10().getText()) / 100;

		UBcalvot = VOT1 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent1 = PercentVOTdist;
		PercentVOT1 = UBpercent1;

		UBcalvot = VOT2 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent2 = PercentVOTdist;
		PercentVOT2 = UBpercent2 - UBpercent1;

		UBcalvot = VOT3 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent3 = PercentVOTdist;
		PercentVOT3 = UBpercent3 - UBpercent2;

		UBcalvot = VOT4 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent4 = PercentVOTdist;
		PercentVOT4 = UBpercent4 - UBpercent3;

		UBcalvot = VOT5 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent5 = PercentVOTdist;
		PercentVOT5 = UBpercent5 - UBpercent4;

		UBcalvot = VOT6 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent6 = PercentVOTdist;
		PercentVOT6 = UBpercent6 - UBpercent5;


		UBcalvot = VOT7 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent7 = PercentVOTdist;
		PercentVOT7 = UBpercent7 - UBpercent6;


		UBcalvot = VOT8 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent8 = PercentVOTdist;
		PercentVOT8 = UBpercent8 - UBpercent7;

		UBcalvot = VOT9 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent9 = PercentVOTdist;
		PercentVOT9 = UBpercent9 - UBpercent8;

		UBcalvot = VOT10 * (TollPolicy_SpVeh / TollPolicyIteration);
		CalculationPercentVOTintervalforAllClasses();
		UBpercent10 = PercentVOTdist;
		PercentVOT10 = UBpercent10 - UBpercent9;


		LBVOT_SpVeh_1 = 0;
		UBVOT_SpVeh_1 = PercentVOT1;
		LBVOT_SpVeh_2 = UBVOT_SpVeh_1;
		UBVOT_SpVeh_2 = LBVOT_SpVeh_2 + PercentVOT2;
		LBVOT_SpVeh_3 = UBVOT_SpVeh_2;
		UBVOT_SpVeh_3 = LBVOT_SpVeh_3 + PercentVOT3;
		LBVOT_SpVeh_4 = UBVOT_SpVeh_3;
		UBVOT_SpVeh_4 = LBVOT_SpVeh_4 + PercentVOT4;
		LBVOT_SpVeh_5 = UBVOT_SpVeh_4;
		UBVOT_SpVeh_5 = LBVOT_SpVeh_5 + PercentVOT5;
		LBVOT_SpVeh_6 = UBVOT_SpVeh_5;
		UBVOT_SpVeh_6 = LBVOT_SpVeh_6 + PercentVOT6;
		LBVOT_SpVeh_7 = UBVOT_SpVeh_6;
		UBVOT_SpVeh_7 = LBVOT_SpVeh_7 + PercentVOT7;
		LBVOT_SpVeh_8 = UBVOT_SpVeh_7;
		UBVOT_SpVeh_8 = LBVOT_SpVeh_8 + PercentVOT8;
		LBVOT_SpVeh_9 = UBVOT_SpVeh_8;
		UBVOT_SpVeh_9 = LBVOT_SpVeh_9 + PercentVOT9;
		LBVOT_SpVeh_10 = UBVOT_SpVeh_9;
		UBVOT_SpVeh_10 = LBVOT_SpVeh_10 + PercentVOT10;


		LBVOT = LBVOT_SpVeh_1;
		UBVOT = UBVOT_SpVeh_1;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_1 = PVOT;

		LBVOT = LBVOT_SpVeh_2;
		UBVOT = UBVOT_SpVeh_2;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_2 = PVOT;

		LBVOT = LBVOT_SpVeh_3;
		UBVOT = UBVOT_SpVeh_3;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_3 = PVOT;

		LBVOT = LBVOT_SpVeh_4;
		UBVOT = UBVOT_SpVeh_4;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_4 = PVOT;

		LBVOT = LBVOT_SpVeh_5;
		UBVOT = UBVOT_SpVeh_5;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_5 = PVOT;

		LBVOT = LBVOT_SpVeh_6;
		UBVOT = UBVOT_SpVeh_6;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_6 = PVOT;

		LBVOT = LBVOT_SpVeh_7;
		UBVOT = UBVOT_SpVeh_7;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_7 = PVOT;

		LBVOT = LBVOT_SpVeh_8;
		UBVOT = UBVOT_SpVeh_8;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_8 = PVOT;

		LBVOT = LBVOT_SpVeh_9;
		UBVOT = UBVOT_SpVeh_9;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_9 = PVOT;

		LBVOT = LBVOT_SpVeh_10;
		UBVOT = UBVOT_SpVeh_10;
		CalculationVOT_SpVeh();
		PVOT_SpVeh_10 = PVOT;
	}

    public final void CalculationVOT_SpVeh()
	{
		if (LBVOT <= 1 && UBVOT <= 1)
		{
			PVOT = VOT_SpVeh_1 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 1 && UBVOT <= 2)
		{
			PVOT = (VOT_SpVeh_1 * (1 - LBVOT)) + (VOT_SpVeh_2 * (UBVOT - 1));
		}
		else if (LBVOT <= 2 && UBVOT <= 2)
		{
			PVOT = VOT_SpVeh_2 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 2 && UBVOT <= 3)
		{
			PVOT = (VOT_SpVeh_2 * (2 - LBVOT)) + (VOT_SpVeh_3 * (UBVOT - 2));
		}
		else if (LBVOT <= 3 && UBVOT <= 3)
		{
			PVOT = VOT_SpVeh_3 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 3 && UBVOT <= 4)
		{
			PVOT = (VOT_SpVeh_3 * (3 - LBVOT)) + (VOT_SpVeh_4 * (UBVOT - 3));
		}
		else if (LBVOT <= 4 && UBVOT <= 4)
		{
			PVOT = VOT_SpVeh_4 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 4 && UBVOT <= 5)
		{
			PVOT = (VOT_SpVeh_4 * (4 - LBVOT)) + (VOT_SpVeh_5 * (UBVOT - 4));
		}
		else if (LBVOT <= 5 && UBVOT <= 5)
		{
			PVOT = VOT_SpVeh_5 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 5 && UBVOT <= 6)
		{
			PVOT = (VOT_SpVeh_5 * (5 - LBVOT)) + (VOT_SpVeh_6 * (UBVOT - 5));
		}
		else if (LBVOT <= 6 && UBVOT <= 6)
		{
			PVOT = VOT_SpVeh_6 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 6 && UBVOT <= 7)
		{
			PVOT = (VOT_SpVeh_6 * (6 - LBVOT)) + (VOT_SpVeh_7 * (UBVOT - 6));
		}
		else if (LBVOT <= 7 && UBVOT <= 7)
		{
			PVOT = VOT_SpVeh_7 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 7 && UBVOT <= 8)
		{
			PVOT = (VOT_SpVeh_7 * (7 - LBVOT)) + (VOT_SpVeh_8 * (UBVOT - 7));
		}
		else if (LBVOT <= 8 && UBVOT <= 8)
		{
			PVOT = VOT_SpVeh_8 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 8 && UBVOT <= 9)
		{
			PVOT = (VOT_SpVeh_8 * (8 - LBVOT)) + (VOT_SpVeh_9 * (UBVOT - 8));
		}
		else if (LBVOT <= 9 && UBVOT <= 9)
		{
			PVOT = VOT_SpVeh_9 * (UBVOT - LBVOT);
		}
		else if (LBVOT <= 9 && UBVOT <= 10)
		{
			PVOT = (VOT_SpVeh_9 * (9 - LBVOT)) + (VOT_SpVeh_10 * (UBVOT - 9));
		}
		else if (LBVOT <= 10 && UBVOT <= 10)
		{
			PVOT = VOT_SpVeh_10 * (UBVOT - LBVOT);
		}
	}

    	public final boolean SpeedObjective()
	{
		//Calculate toll
		TGP = 0.8 * (1 + (Math.pow((VolGP / TCapGP), 4)));
		TML = 0.8 * (1 + (Math.pow((VolML / TCapML), 4)));
		DiffT = ((TGP * Length_GP) - (TML * Length_ML)) / Length_ML;
		//If DiffT < 0 Then MessageBox.Show("Travel time on GP Lane is less than ML", "Warning", MessageBoxButtons.OK, MessageBoxIcon.Exclamation)
		if ((int)Math.signum((int)uML - (int)uGP) == -1)
		{
                    try {
                        MessageBox(
                                "ML speed is less than GP speed. Please increase speed in the Objective page. Calculation error");
                    } catch (IOException ex) {
                        Logger.getLogger(ResultController.class.getName()).log(Level.SEVERE, null, ex);
                    }
			return false;
		}
		//CTS = 60 * Toll_Adj / DiffT
		//VOT = VOT_Prev + (i / (Vol_SOV_Add + Vol_RHOV_M_Add + Vol_SOV_T_Add + Vol_LTr_Add) * (VOT_Next - VOT_Prev))
		//CTS = VOT
		Toll_Adj = (DiffT / 60) * (VOT_Prev + (i / (Vol_SOV_Add + Vol_RHOV_M_Add + Vol_SOV_T_Add + Vol_LTr_Add + Vol_SpVeh_Add + Vol_ELTr_T2_Add + Vol_ELTr_Add) * (VOT_Next - VOT_Prev)));

		//TODO: CHANGED, validate -> Objective.TollCharge.Text = Toll_Adj
		//Calculate toll for SOV to use in final table
		if (TollPolicyIteration > 0)
		{
			Toll = Toll_Adj / TollPolicyIteration;
		}
		else
		{
			Toll = 0;
		}
		return true;
	}


    
}

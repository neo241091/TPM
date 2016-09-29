/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.text.DecimalFormat;

/**
 *
 * @author saravanakumar
 */
public class DataPoint
{
        DecimalFormat f = new DecimalFormat("##.00");
	//Declarations
	private String mTOLL;
	private String mREV;
	private vehType vehClass;
	private Lane mSpeed;
	private Lane mVolume;
	private Lane mSpeedInv;
	private Lane mSpeedSqr;
	private Lane LevelCO;
	private Lane LevelHC;
	private Lane LevelNO;
	private Lane LevelCO2;
	private Lane LevelSO2;

	//Constructors
	public DataPoint(vehType Type)
	{
		this.vehClass = Type;
		this.mSpeed = new Lane();
		this.mVolume = new Lane();
		LevelCO = new Lane();
		LevelHC = new Lane();
		LevelNO = new Lane();
		LevelCO2 = new Lane();
		LevelSO2 = new Lane();
                mTOLL = "0.0";
                mREV = "0.0";
                
	}

	//Properties
	public final Lane getSpeed()
	{
		return this.mSpeed;
	}
	public final void setSpeed(Lane value)
	{
		this.mSpeed = value;
	}
	public final String getType()
	{
//VB TO JAVA CONVERTER NOTE: The following VB 'Select Case' included either a non-ordinal switch expression or non-ordinal, range-type, or non-constant 'Case' expressions and was converted to Java 'if-else' logic:
//		Select Case vehClass
//ORIGINAL LINE: Case vehType.RHOV_M
		if (vehClass == vehType.RHOV_M)
		{
			return "RHOV_M";
		}
//ORIGINAL LINE: Case vehType.SOV_T
		else if (vehClass == vehType.SOV_T)
		{
			return "SOV_T+";
		}
//ORIGINAL LINE: Case vehType.SpVeh
		else if (vehClass == vehType.SpVeh)
		{
			return "SpVeh";
		}
//ORIGINAL LINE: Case vehType.ELTr_T2
		else if (vehClass == vehType.ELTr_T2)
		{
			return "Semi-Trailer Trucks(1 or 2 Trailer)";
		}
//ORIGINAL LINE: Case vehType.ELTr
		else if (vehClass == vehType.ELTr)
		{
			return "Semi-Trailer Trucks";
		}
//ORIGINAL LINE: Case vehType.Total
		else if (vehClass == vehType.Total)
		{
			return "Total";
		}
//ORIGINAL LINE: Case vehType.LTr
		else if (vehClass == vehType.LTr)
		{
			return "Single-Unit Trucks";
		}
//ORIGINAL LINE: Case Else
		else
		{
			return "SOV";
		}
	}
	public final Lane getVolume()
	{
		return mVolume;
	}
	public final String getTollValue()
	{
		double TollPolicy = GetPolicy(vehClass);
		double TollPerMile = Double.parseDouble(Singleton.getInstance().gettolltextsing().getText());
		double val = TollPolicy * TollPerMile;
		if (vehClass == vehType.Total)
		{
			return "-";
		}
		else if (val == 0)
		{
			return "Free";
		}
		else if ((int)Math.signum(val) == -1)
		{
			return "N/A";
		}
		else
		{
			return String.valueOf(f.format(val));
		}
	}
	public final String getTotalRevenue()
	{
		if (! (vehClass == vehType.Total))
		{
			String val = getTollValue();
			double toll = Double.parseDouble(val);
                        
			if (val.isEmpty() == false)
			{
				double CorridorLength = Double.parseDouble(Singleton.getInstance().getMLLength().getText());
				//Toll * Volume * Length
				this.mREV = String.valueOf(f.format(toll * (int)this.getVolume().getML() * CorridorLength));
			}
			else
			{
				this.mREV = String.valueOf(0);
			}
		}
		return this.mREV;
	}
	public final double getMLShare()
	{
		if (getVolume().getML() + getVolume().getGP() > 0)
		{
			return (getVolume().getML() / (getVolume().getML() + getVolume().getGP())) * 100;
		}
		else
		{
			return 0.0;
		}
	}

	//Methods
	private String mode = "grams";
	public final void ConvertAllDataToMetricTons()
	{
		mode = "tons";
	}
	public final void AddRevenue(String value)
	{
		this.mREV = String.valueOf( Double.parseDouble(value) + Double.parseDouble(this.mREV));
	}

	private double GetPolicy(vehType Type)
	{
		String val = "0";
//VB TO JAVA CONVERTER NOTE: The following VB 'Select Case' included either a non-ordinal switch expression or non-ordinal, range-type, or non-constant 'Case' expressions and was converted to Java 'if-else' logic:
//		Select Case Type
//ORIGINAL LINE: Case vehType.SOV
		if (Type == vehType.SOV)
		{
			val = Singleton.getInstance().getsovtoll().getText();
		}
//ORIGINAL LINE: Case vehType.RHOV_M
		else if (Type == vehType.RHOV_M)
		{
			val = Singleton.getInstance().gethovtoll().getText();
		}
//ORIGINAL LINE: Case vehType.SOV_T
		else if (Type == vehType.SOV_T)
		{
			val = Singleton.getInstance().getsovttoll().getText();
		}
//ORIGINAL LINE: Case vehType.LTr
		else if (Type == vehType.LTr)
		{
			val = Singleton.getInstance().getsuttoll().getText();
		}
//ORIGINAL LINE: Case vehType.ELTr
		else if (Type == vehType.ELTr)
		{
			val = Singleton.getInstance().getstttoll().getText();
		}
//ORIGINAL LINE: Case vehType.ELTr_T2
		else if (Type == vehType.ELTr_T2)
		{
			val = Singleton.getInstance().getstdtoll().getText();
		}
//ORIGINAL LINE: Case vehType.SpVeh
		else if (Type == vehType.SpVeh)
		{
			val = Singleton.getInstance().getspvtoll().getText();
		}
//ORIGINAL LINE: Case Else
		else
		{
			return -1; //N/A
		}
		return Double.parseDouble(val) / 100.0;
	}
}
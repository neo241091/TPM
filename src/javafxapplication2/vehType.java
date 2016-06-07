/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

/**
 *
 * @author saravanakumar
 */

public enum vehType
{
	SOV,
	RHOV_M,
	SOV_T,
	LTr,
	ELTr,
	ELTr_T2,
	SpVeh,
	Total;

	public int getValue()
	{
		return this.ordinal();
	}

	public static vehType forValue(int value)
	{
		return values()[value];
	}
        
}
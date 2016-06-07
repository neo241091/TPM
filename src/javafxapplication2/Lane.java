package javafxapplication2;

public class Lane
{
	private double mGP;
	private double mML;
	public final double getGP()
	{
		return mGP;
	}
	public final void setGP(double value)
	{
		mGP = value;
	}
	public final double getML()
	{
		return mML;
	}
	public final void setML(double value)
	{
		mML = value;
	}
	public final double getTotal()
	{
		return mGP + mML;
	}


//VB TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
///#Region " Operators "

	public static Lane OpAddition(double b, Lane x)
	{
		Lane a = new Lane();
		a.setGP(b + x.getGP());
		a.setML(b + x.getML());
		return a;
	}
	public static Lane OpSubtraction(double b, Lane x)
	{
		Lane a = new Lane();
		a.setGP(b - x.getGP());
		a.setML(b - x.getML());
		return a;
	}
	public static Lane OpDivision(double b, Lane x)
	{
		Lane a = new Lane();
		a.setGP(b / x.getGP());
		a.setML(b / x.getML());
		return a;
	}
	public static Lane OpMultiply(double b, Lane x)
	{
		Lane a = new Lane();
		a.setGP(b * x.getGP());
		a.setML(b * x.getML());
		return a;
	}
	public static Lane OpAddition(Lane x, double b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() + b);
		a.setML(x.getML() + b);
		return a;
	}
	public static Lane OpSubtraction(Lane x, double b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() - b);
		a.setML(x.getML() - b);
		return a;
	}
	public static Lane OpDivision(Lane x, double b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() / b);
		a.setML(x.getML() / b);
		return a;
	}
	public static Lane OpMultiply(Lane x, double b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() * b);
		a.setML(x.getML() * b);
		return a;
	}
	public static Lane OpAddition(Lane x, Lane b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() + b.getGP());
		a.setML(x.getML() + b.getML());
		return a;
	}
	public static Lane OpSubtraction(Lane x, Lane b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() - b.getGP());
		a.setML(x.getML() - b.getML());
		return a;
	}
	public static Lane OpDivision(Lane x, Lane b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() / b.getGP());
		a.setML(x.getML() / b.getML());
		return a;
	}
	public static Lane OpMultiply(Lane x, Lane b)
	{
		Lane a = new Lane();
		a.setGP(x.getGP() * b.getGP());
		a.setML(x.getML() * b.getML());
		return a;
	}

//VB TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
///#End Region

}

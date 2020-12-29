abstract class RBI
{
	abstract void loan();
}
class SBI extends RBI
{
	void loan()
	{
		System.out.println("SBI provides loans with 8% intrest");
	}
}
class axis extends RBI
{
	void loan()
	{
		System.out.println("Axis provides loans with 9% intrest");
	}
}
class ICICI extends RBI
{
	void loan()
	{
		System.out.println("ICICI provides loans with 10% intrest");
	}
}
class abstractiondemo
{
	public static void main(String args[])
	{
		System.out.println("Abstract class");
		SBI sb=new SBI();
		sb.loan();
		axis a=new axis();
		a.loan();
		ICICI i=new ICICI();
		i.loan();
		RBI r=new SBI();
		r.loan();
	}
}

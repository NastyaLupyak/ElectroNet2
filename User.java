

public class User {
	private double R;
	private boolean ON;
	public double I;
	public boolean Connected;
	public String name;
	public int power;
	
	public User(double R, boolean ON)
	{
		this.R = R;
		this.ON = ON;
		this.I = 0;
		this.Connected = false;
	}
	public double GetUserR()
	{
		return this.R;
	}
	
	public double GetUserI()
	{
		return this.I;
	}
	
	public boolean IsUserON()
	{
		return this.ON;
	}
	
	public boolean IsUserConnected()
	{
		return this.Connected;
	}
	
	public void SetUserR(double R)
	{
		this.R = R;
	}
	
	public void TurnUser()
	{
		if(this.ON == true)
			this.ON = false;
		else 
			this.ON = true;
	}
	
	
}

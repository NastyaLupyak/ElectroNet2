
public class Generator {
	private double I;
	private int NumOfUsers;
	private boolean ON;
	public int NumOfCurrentUsers;
	
	Generator(double I, int NumOfUsers, boolean ON)
	{
		this.I = I;
		this.NumOfUsers = NumOfUsers;
		this.ON = ON;
		this.NumOfCurrentUsers = 0;
	}
	
	public double GetGenI()
	{
		if(this.ON == false)
			return 0;
		return this.I;
	}
	
	public int GetGenNumOfUsers()
	{
		return this.NumOfUsers;
	}
	
	public boolean IsGenON()
	{
		return this.ON;
	}
	
	public void SetGenI(double I)
	{
		this.I = I;
	}
	
	public void TurnGen()
	{
		if(this.ON == true)
			this.ON = false;
		else 
			this.ON = true;
	}
	
	public boolean isAvialableForConnection()
	{
		if(this.NumOfCurrentUsers < this.NumOfUsers)
		{
			return true;
		}
		else
			return false;
	}
	
}

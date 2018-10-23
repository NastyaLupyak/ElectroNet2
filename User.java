
public class User {
	private double R; // опір користувача
	private boolean ON; // вімкн./вимкн.
	public double I; // сила струму
	public boolean Connected; // чи користувач з'єднано з генератором
	
	User(double R, boolean ON) // конструктор
	{
		this.R = R;
		this.ON = ON;
		this.I = 0;
		this.Connected = false;
	}
	
	public double GetUserR() // отримати значення опору користувача
	{
		return this.R;
	}
	
	public double GetUserI() // отримати значення сили струму користувача
	{
		return this.I;
	}
	
	public boolean IsUserON() // чи користувач вімкн.
	{
		return this.ON;
	}
	
	public boolean IsUserConnected() // чи користувач з'єднано за генератором 
	{
		return this.Connected;
	}
	
	public void SetUserR(double R) // встановити опір користувача
	{
		this.R = R;
	}
	
	public void TurnUser() // вимкн. користувача, якщо він вімкн. чи вимкн., якщо вімкн.
	{
		if(this.ON == true)
			this.ON = false;
		else 
			this.ON = true;
	}
}


public class Calculator {
	
	public static double calculatePowerOnUser(User obj)
	{
		double P;
		if(obj.IsUserON() == true && obj.IsUserConnected() == true)
		{
		double I = obj.GetUserI();
		double R = obj.GetUserR();
		P=I*I*R;
		}
		else 
			P=0;
		
		return P;
	}
	
}


public class ControlCenter {
	
	public static void main(String[] args)
	{
		Generator Gen_obj1 = new Generator(100, 1, true);
		User obj1 = new User(5, true);
		System.out.println(obj1.GetUserI());
		initializeConnection(Gen_obj1, obj1);
		System.out.println(obj1.GetUserI());
	}
	
	public static void initializeConnection(Generator objGenerator, User objUser)
	{
		if(objGenerator.isAvialableForConnection() == true)
		{
			objGenerator.NumOfCurrentUsers++;
			objUser.Connected = true;
			if(objUser.IsUserON() == true)
			{
				objUser.Connected = true;
				objUser.I = objGenerator.GetGenI();
			}
			else 
				objUser.I = 0;
		}
		else 
			System.out.println("Too many users on currrent generator. Impossible for connection.");
	}
	
}

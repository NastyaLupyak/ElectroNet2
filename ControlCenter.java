import java.util.*; 
public class ControlCenter {
	
	public static void main(String[] args)
	{
		Generator Gen_obj1 = new Generator(100, 2, true);
		User obj1 = new User(5, true);
		Calculator calc_obj = new Calculator();
		Search search_obj = new Search();
		initializeConnection(Gen_obj1, obj1);
		
		ArrayList<User> listOfTVs = new ArrayList<>();
		listOfTVs.add(new TV(35, true, "Samsung"));
		listOfTVs.add(new TV(15, true, "Philips"));
		Sort.SortByR(listOfTVs);
		search_obj.SearchR(listOfTVs, 35);
		search_obj.SearchR(listOfTVs, 20);
		search_obj.SearchName(listOfTVs, "Samsung");
		
		System.out.println(listOfTVs.get(0).I);
		initializeConnection(Gen_obj1, listOfTVs.get(0));
		System.out.println(listOfTVs.get(0).I);
		
		Sort.SortByPower(listOfTVs, calc_obj);
		search_obj.SearchPower(listOfTVs, calc_obj, 150);
		search_obj.SearchPower(listOfTVs, calc_obj, 150000);
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
				System.out.println("Connection initialized.");
			}
			else 
				objUser.I = 0;
		}
		else 
			System.out.println("Too many users on currrent generator. Impossible for connection.");
	}
	
}

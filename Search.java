import java.util.ArrayList;

public class Search {
	boolean existance = false;
	
	public void SearchR(ArrayList<User> array, int R)
	{
		existance = false;
		for(int i=0; i<array.size(); i++)
		{
			if (array.get(i).GetUserR() == R) {
				System.out.println("Such element in the list has resistance " + R + ": " + array.get(i).name);
				existance = true;
			} 
		}
		if (existance == false)
		System.out.println("No element with resistance = " + R);
	}
	
	public void SearchName(ArrayList<User> array, String name)
	{
		existance = false;
		for(int i=0; i<array.size(); i++)
		{
			if (array.get(i).name == name) {
				System.out.println("There is an element in the list with name " + name + " in the position: " + (i-1));
				existance = true;
			} 
		}
		if (existance == false)
		System.out.println("No element with name = " + name);
	}
	
	public void SearchPower(ArrayList<User> array, Calculator calc, int Power)
	{
		existance = false;
		for(int i=0; i<array.size(); i++)
		{
			if (calc.calculatePowerOnUser(array.get(i)) == Power) {
				System.out.println("Such element in the list has power " + Power + ": " + array.get(i).name);
				existance = true;
			} 
		}
		if (existance == false)
		System.out.println("No element with power = " + Power);
	}
}
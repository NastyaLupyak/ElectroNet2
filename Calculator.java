
public class Calculator {
	
	// функція для отримання значення миттєвої потужності користувача 
	public static double calculatePowerOnUser(User obj)
	{
		double P; // потужність користувача
		if(obj.IsUserON() == true && obj.IsUserConnected() == true) // якщо користувач вімкнено і під'єданно до генератора
		{
		double I = obj.GetUserI(); // отримати значення сили струму з об'єкта класа User
		double R = obj.GetUserR(); // отримати значення опору з об'єкта класа User
		P=I*I*R; // формула для знаходження потужності користувача 
		}
		else 
			P=0;
		
		return P; // повертаємо значення потужності 
	}
	
}

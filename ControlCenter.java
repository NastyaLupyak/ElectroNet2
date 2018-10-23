
public class ControlCenter {
	
	// в функції main створюємо генератори та користувачів, зв'язуємо їх
	public static void main(String[] args)
	{
		Generator Gen_obj1 = new Generator(100, 1, true);
		User obj1 = new User(5, true);
		Calculator calc_obj = new Calculator();
		System.out.println(obj1.GetUserI());
		initializeConnection(Gen_obj1, obj1);
		System.out.println(obj1.GetUserI());
		System.out.println(calc_obj.calculatePowerOnUser(obj1));
	}
	// функція для ініціалізації звязку між генератором та користувачем
	public static void initializeConnection(Generator objGenerator, User objUser)
	{
		if(objGenerator.isAvialableForConnection() == true) // якщо генератор доступний для з'єднання 
		{
			objGenerator.NumOfCurrentUsers++; // інкрементуємо змінну, що позначає кількість під'єднанних до генератора користувачив
			objUser.Connected = true; // задаємо значення true до змінної, що позначає чи з'єднан користувач з генератором
			if(objUser.IsUserON() == true) // якщо користувач вімнкнено
			{
				objUser.I = objGenerator.GetGenI(); // сила струмум на користувачі = силі струмму, що подає генератор
			}
			else // користувач вимкнений 
				objUser.I = 0; // струм на ньому не тече
		}
		else // генератор не доступний для з'єднання з користувачем 
			System.out.println("Too many users on currrent generator. Impossible for connection.");
	}
	
}

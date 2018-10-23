
public class Generator {
	private double I; // сила струму
	private int NumOfUsers; // кількість можливих користувачів 
	private boolean ON; // генератор вімкнено чи ні
	public int NumOfCurrentUsers; // кількість підключених на даний момент корисутвачів 
	
	Generator(double I, int NumOfUsers, boolean ON) // конструктор 
	{
		this.I = I;
		this.NumOfUsers = NumOfUsers;
		this.ON = ON;
		this.NumOfCurrentUsers = 0;
	}
	
	public double GetGenI() // функція для отримання сили струму на генераторі 
	{
		if(this.ON == false)
			return 0;
		return this.I;
	}
	
	public int GetGenNumOfUsers() // функція для отримання кількості користуавчів на генераторі
	{
		return this.NumOfUsers;
	}
	
	public boolean IsGenON() // функція для визначення чи генератор вімкнено 
	{
		return this.ON;
	}
	
	public void SetGenI(double I) // встановлення сили струму на генераторі 
	{
		this.I = I;
	}
	
	public void TurnGen() // вимкнути ген., якщо він вімкнен об вімкнути, ящко вимкнен
	{
		if(this.ON == true)
			this.ON = false;
		else 
			this.ON = true;
	}
	
	public boolean isAvialableForConnection() //т перевірка чи генератор досступен для з'єднання з користувачем
	{
		if(this.NumOfCurrentUsers < this.NumOfUsers) // кількість вже підк. користувачів < кількість можл. користувачів на генераторі  
		{
			return true;
		}
		else
			return false;
	}
	
}


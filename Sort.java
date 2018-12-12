import java.util.ArrayList;
import java.util.Comparator;

public class Sort {
	
	public static void SortByR(ArrayList<User> list) {
		// До сортування
		System.out.println("Before sorting:");

		list.forEach(User -> System.out.println(User.GetUserR()));
		
		list.sort(new Comparator<User>() {
		   @Override
		    public int compare(User o1, User o2) {
		          if (o1.GetUserR() == o2.GetUserR()) return 0;
		          else if (o1.GetUserR()> o2.GetUserR()) return 1;
		          else return -1;
		          }
		    });
		System.out.println("After sorting:");
		// Після сортування
		list.forEach(User -> System.out.println(User.GetUserR()));
	}
	
	public static void SortByPower(ArrayList<User> list, Calculator calc) {
		// До сортування
		System.out.println("Before sorting:");

		list.forEach(User -> System.out.println(calc.calculatePowerOnUser(User)));
		
		list.sort(new Comparator<User>() {
		   @Override
		    public int compare(User o1, User o2) {
		          if (calc.calculatePowerOnUser(o1) == calc.calculatePowerOnUser(o2)) return 0;
		          else if (calc.calculatePowerOnUser(o1)> calc.calculatePowerOnUser(o2)) return 1;
		          else return -1;
		          }
		    });
		System.out.println("After sorting:");
		// Після сортування
		list.forEach(User -> System.out.println(calc.calculatePowerOnUser(User)));
	}
}

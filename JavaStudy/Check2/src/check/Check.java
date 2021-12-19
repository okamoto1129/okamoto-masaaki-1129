package check;
import constants.Constants; 
public class Check {
	private static String firstName = "オカモト";
	private static String lastName = "マサアキ";
	private static void printName(String name1, String name2) {
		System.out.println("printNameメソッド➡" + name1+name2);
	}
	public static void main(String[] args) {
		printName(firstName,lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pet.introduce();
		robotPet.introduce();
	}

}

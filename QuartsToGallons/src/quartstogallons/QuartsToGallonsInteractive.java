package quartstogallons;
import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive 
{

	public static void main(String[] args) 
	{
		int Quarts_To_Gallon = 4;
		String quartsTold;
		int quartsNumber;
		int quartsShow;
		int gallonShow;
		
		quartsTold = JOptionPane.showInputDialog(null, "How many quarts would you like sir or madam", "Dialog 1", JOptionPane.INFORMATION_MESSAGE);
		quartsNumber = Integer.parseInt(quartsTold);
		gallonShow = quartsNumber/Quarts_To_Gallon;
		System.out.println("A job that needs " + quartsTold + " quarts requires " + (quartsNumber/Quarts_To_Gallon) + 
				" gallons and " + (quartsNumber%Quarts_To_Gallon) + " quarts.");
	}

}

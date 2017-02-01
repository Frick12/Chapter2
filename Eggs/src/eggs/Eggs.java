package eggs;

import javax.swing.JOptionPane;
public class Eggs 
{

	public static void main(String[] args) 
	{
		String orderedString;
		double dozenEggCost = 3.25;
		double individualEggCost = .45;
		int dozen = 12;
		int numEggsOrdered;
		int numDozenOrdered;
		int numEggsRemainder;
		double totalCost;
		
		orderedString = JOptionPane.showInputDialog(null, "How many eggs would you like?","", JOptionPane.QUESTION_MESSAGE);
		numEggsOrdered = Integer.parseInt(orderedString);
		
		numDozenOrdered = numEggsOrdered/dozen;
		numEggsRemainder = numEggsOrdered % dozen;
		totalCost = (dozenEggCost*numDozenOrdered) + (individualEggCost*numEggsRemainder);
		
		JOptionPane.showMessageDialog(null, "You ordered " + numEggsOrdered + " eggs. That's " + numDozenOrdered + " dozen at $" + dozenEggCost 
				+ "\neach and " + numEggsRemainder + " loose eggs at $" + individualEggCost + " each for a total of $" + totalCost, orderedString, JOptionPane.INFORMATION_MESSAGE, null);

	}

}

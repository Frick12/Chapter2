package nauticalMiles;

import javax.swing.JOptionPane;

public class NauticalMiles 
{

	public static void main(String[] args) 
	{
		double numKilo = 1.852;
		double numOfMiles = 1.50779;
		double convertNumKilo;
		double convertNumMiles;
		double inputNM;
		
		String NMString;
		
		NMString = JOptionPane.showInputDialog(null, "How many Nautical Miles?", "" , JOptionPane.QUESTION_MESSAGE);
		inputNM = Integer.parseInt(NMString);
		
		convertNumKilo = numKilo * inputNM;
		convertNumMiles = numOfMiles * inputNM;
		
		JOptionPane.showMessageDialog(null, inputNM + " Nautical Miles is the same distance as \n" + convertNumMiles + " miles or \n" + convertNumKilo + 
				" kilometers.", NMString, JOptionPane.INFORMATION_MESSAGE, null);
		
	}

}

package GuessingGame;

public class numberGuessingGame {
	public static void main(String[] args) {
		
	}
	
	public static String determineGuess(int response, int solution, int count) {
		if(response <= 0 || response > 100) {
			return "Your guess must be between 0 and 100.";
		} else if (response == solution) {
			return "Correct!" + "\n" + "Total Guesses: " + count; 
		} else if (response > solution) {
			return "Your guess is too high, try again." + "\n" + "Try Number: " + count;
		} else if (response < solution) {
			return "Your guess is too low, try again." + "\n" + "Try Number: " + count;
		} else {
			return "";
		}
	}
}

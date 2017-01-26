import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class PigLatinCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		String Word = "";
		String Piglatin;
		
		while(!Word.equalsIgnoreCase("end")){
			
			System.out.println("Please enter a word: ");
			Word = userInput.next();
			
			Piglatin = Piglatingenerator(Word);
			
			System.out.println(Piglatin);
		}
		
	}                

	private static String Piglatingenerator(String word) {
		// TODO Auto-generated method stub
		
		char[] Splitword = word.toCharArray();
		char[] Pigarray = new char[word.length() + 3];
		String Finalword = "";
		for( int i = 1; i < Splitword.length;i++){
			
			Pigarray[i - 1] = Splitword[i];
			
		}
		
		Pigarray[Splitword.length - 1] = '-';
		Pigarray[Splitword.length] = Splitword[0];
		Pigarray[Splitword.length + 1] = 'a';
		Pigarray[Splitword.length + 2] = 'y';
		
		for( int i = 0; i < Pigarray.length;i++){
			Finalword += Pigarray[i];
		}
		return Finalword;
	}

}

import java.util.*;
public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String antwort = scanner.nextLine();
		if(antwort.equalsIgnoreCase("nein"){
			System.out.println("Hast du Fachabitur?");
			antwort = scanner.nextLine();
			if(antwort.equalsIgnoreCase("ja"){
				System.out.println("Hast du eine Berufsausbildung?");
			}
		else if(antwort.equalsIgnoreCase("ja"){
			System.out.println("Bist du wissbegierig?");
		}
	}
}
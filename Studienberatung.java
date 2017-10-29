import java.util.*;
public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String antwort = scanner.nextLine();
		if(antwort.equalsIgnoreCase("nein"){
			System.out.println("Hast du Fachabitur?");
			if(antwort.equalsIgnoreCase("nein"){
				System.out.println("Nicht studieren");
				System.exit(0);
			}
		else if(antwort.equalsIgnoreCase("ja"){
			System.out.println("Bist du wissbegierig?");
		}
	}
}
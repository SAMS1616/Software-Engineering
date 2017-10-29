import java.util.*;
public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String antwort = scanner.nextLine();
		if(antwort.equalsIgnoreCase("nein")){
			System.out.println("Hast du Fachabitur?");
		}
		else if(antwort.equalsIgnoreCase("ja")){
			System.out.println("Bist du wissbegierig?");
			antwort = scanner.nextLine();
			if(antwort.equalsIgnoreCase("ja")){
				System.out.println("Auf jeden Fall studieren");
				System.exit(0);
			}
			else if(antwort.equalsIgnoreCase("nein")){
				antwort.equalsIgnoreCase("Nicht studieren");
				System.exit(0);
			}
		}
	}
}
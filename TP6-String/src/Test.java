import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String mot3 = "";
		String chain = "il fait beau aujourd'hui ";

		System.out.println("Dans <il fait beau aujourd'hui> quel mots voulez-vous changé ?");
		String mot = scan.nextLine();

		if ( chain.contains(mot)) {
			System.out.println("trouver");
			System.out.println("par quel mots voulez vous le remplacer?");
			String mot2 = scan.nextLine();
			chain = chain.replace(mot, mot2);
			System.out.println(chain);

		}
		else {
			System.out.println("introuvable");
		}
	}

}
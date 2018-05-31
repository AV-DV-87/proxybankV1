package presentation;

import java.util.Scanner;

/**
 * la classe lanceur permet d'echanger avec l'utilisateur
 * 
 * @author Badr
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Afficher le menu
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------MENU---------------------------------------");
		System.out.println("TAPER 1 si vous étes Gérant:");
		System.out.println("TAPER 2 si vous étes conseiller:");
		System.out.println("TAPER 0 pour quitter");
		
		int choix = sc.nextInt();
		//BOUCLE PRINCIPALE
		while (choix != 0) {
			if (choix == 1) {
				//SOUS MENU GERANT
				System.out.println("Menu Gerant");
				System.out.println("choix 1 Afficher agences / auditer une agence ");
				System.out.println("TAPER 0 pour revenir au menu principal");
				int choix2 = sc.nextInt();
				while(choix2 != 0 ) {
					if(choix2 == 1) {
						System.out.println("liste des agences et choix d'une agence");
						int choixAgence = sc.nextInt();
					}else {
						System.out.println("MAUVAIS CHOIX, Tapez 0 pour quitter");
						choix2 = sc.nextInt();
					}
					System.out.println("Menu Gerant");
					System.out.println("choix 1 Afficher agences / auditer une agence ");
					System.out.println("TAPER 0 pour revenir au menu principal");
					choix2 = sc.nextInt();
				}// END SOUS MENU GERANT
			} else if (choix == 2) {
				System.out.println("menu Conseiller");

			}else {
				System.out.println("MAUVAIS CHOIX, Tapez 0 pour quitter");
				choix = sc.nextInt();	
			}
			System.out.println("---------------------------MENU---------------------------------------");
			System.out.println("TAPER 1 si vous étes Gérant:");
			System.out.println("TAPER 2 si vous étes conseiller:");
			System.out.println("TAPER 0 pour quitter");
			choix = sc.nextInt();
		}//END BOUCLE PRINCIPALE
		System.out.println("A bientot");
	}
}

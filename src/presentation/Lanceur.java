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
		System.out.println("TAPER 2 si vous étes Conseiller:");
		System.out.println("TAPER 0 pour quitter");

		int choix = sc.nextInt();
		// BOUCLE PRINCIPALE
		while (choix != 0) {
			if (choix == 1) {
				// SOUS MENU GERANT
				System.out.println("-------------------------- Gérant-----------------------------");
				System.out.println("TAPER 1 pour Afficher agences / auditer une agence ");
				System.out.println("TAPER 0 pour quitter");
				int choix2 = sc.nextInt();
				while (choix2 != 0) {
					if (choix2 == 1) {
						System.out.println("liste des agences et choix d'une agence");
						int choix3 = sc.nextInt();
					} else {
						System.out.println("MAUVAIS CHOIX, TAPER 0 pour quitter");
						choix2 = sc.nextInt();
					}
					System.out.println("-------------------------- Gérant-----------------------------");
					System.out.println("TAPER 1 pour Afficher agences / auditer une agence ");
					System.out.println("TAPER 0 pour quitter");
					choix2 = sc.nextInt();
				} // END SOUS MENU GERANT

			} else if (choix == 2) {
				// SOUS MENU CONSEILLER
				System.out.println("-------------------------- Conseiller-----------------------------");
				System.out.println("TAPER 1 pour gérer des clients ");
				System.out.println("TAPER 2 pour gérer des comptes ");
				System.out.println("TAPER 3 pour effecteur un virement ");
				System.out.println("TAPER 4 pour efecteur un placement ");
				System.out.println("TAPER 0 pour quitter");
				int choixOptionConseiller = sc.nextInt();
				
				while (choixOptionConseiller != 0) {
					
					if (choixOptionConseiller == 1) {
						// 2eme SOUS MENU GESTION CLIENT
						System.out.println("-------------------------- Gestion Client-----------------------------");
						System.out.println("TAPER 1 pour ajouter un clinet ");
						System.out.println("TAPER 2 pour modifer un client ");
						System.out.println("TAPER 3 pour lister les clients ");
						System.out.println("TAPER 4 pour supprimer un client ");
						System.out.println("TAPER 0 pour quitter ");
						int choixGesionClient = sc.nextInt();
						while (choixGesionClient != 0) {
							if (choixGesionClient == 1) {
								// 3eme SOUS MENU GESTION CLIENT
								System.out.println("Client à Ajouter :");
							} else if (choixGesionClient == 2) {
								System.out.println("modifier un Client :");
							} else if (choixGesionClient == 3) {
								System.out.println("lister les Clients :");
							} else if (choixGesionClient == 4) {
								System.out.println("supprimer un Client :");
							} else {
								System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR OU Tapez 0 pour quitter");
							}
							System.out.println("-------------------------- Gestion Client-----------------------------");
							System.out.println("TAPER 1 pour ajouter un clinet ");
							System.out.println("TAPER 2 pour modifer un client ");
							System.out.println("TAPER 3 pour lister les clients ");
							System.out.println("TAPER 4 pour supprimer un client ");
							System.out.println("TAPER 0 pour quitter ");
							choixGesionClient = sc.nextInt();
						} // END 3eme SOUS MENU GESTION CLIENT
					} // END 2eme SOUS MENU GESTION CLIENT
					
					else if (choixOptionConseiller == 2) {
						// 2eme SOUS MENU GESTION CLIENT
						System.out.println("-------------------------- Gestion Compte-----------------------------");
						System.out.println("TAPER 1 pour ajouter un compte ");
						System.out.println("TAPER 2 pour modifer un compte ");
						System.out.println("TAPER 3 pour lister les comptes ");
						System.out.println("TAPER 4 pour supprimer un compte");
						System.out.println("TAPER 0 pour quitter");
						int choixGestionCompte = sc.nextInt();
						while (choixGestionCompte != 0) {
							if (choixGestionCompte == 1) {
								while (choixGestionCompte != 0) {
									// sous sous sous menu gestion compte
									if (choixGestionCompte == 1) {
										System.out.println("ajouter un compte:");
									} else if (choixGestionCompte == 2) {
										System.out.println("modifier un compte :");
									} else if (choixGestionCompte == 3) {
										System.out.println("lister les comptes :");
									} else if (choixGestionCompte == 4) {
										System.out.println("supprimer un compte :");
									} else {
										System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR OU Tapez 0 pour quitter");
									}
									System.out.println("-------------------------- Gestion Compte-----------------------------");
									System.out.println("TAPER 1 pour ajouter un compte ");
									System.out.println("TAPER 2 pour modifer un compte ");
									System.out.println("TAPER 3 pour lister les comptes ");
									System.out.println("TAPER 4 pour supprimer un compte");
									System.out.println("TAPER 0 pour quitter");
									choixGestionCompte = sc.nextInt();
								}
							}
						} // END 3eme SOUS MENU GESTION COMPTE
					} // 2eme SOUS MENU GESTION COMPTE
					
					else if (choixOptionConseiller == 3) {
						// 2em SOUS MENU VIREMENT
						System.out.println("-------------------------- Virement-----------------------------");
						System.out.println("TAPER 1 pour effectuer un virement compte a compte ");
						System.out.println("TAPER 0 pour quitter");
						int choixGestionCompte = sc.nextInt();
						while (choixGestionCompte != 0) {
							if (choixGestionCompte == 1) {
								while (choixGestionCompte != 0) {
									// 3eme SOUS MENU VIRMENT
									if (choixGestionCompte == 1) {

										System.out.println("choisir un client :");
										String choisirUnClient = sc.nextLine();

										System.out.println("choisir le compte a debité :");
										String CompteDebiter = sc.nextLine();

										System.out.println("choisir le compte à Créditer :");
										String CompteCrediter = sc.nextLine();

										System.out.println("choisir saisir l'ID :");
										int id = sc.nextInt();

										System.out.println("saisir le montant :");
										double sMontant = sc.nextDouble();

										System.out.println("saisir la date :");
										String sDate = sc.nextLine();

										System.out.println("saisir une discription :");
										String sdiscreption = sc.nextLine();

										System.out.println("Êtes vous sur d'exécuter ce virement :");
										String Sconfirm = sc.nextLine();

									}
									System.out.println("-------------------------- Virement-----------------------------");
									System.out.println("TAPER 1 pour effectuer un virement compte a compte ");
									System.out.println("TAPER 0 pour quitter");
									choixGestionCompte = sc.nextInt();
								} // END 3eme SOUS MENU VIRMENT
							}
						}

					} // END 2eme SOUS MENU VIRMENT
					
					else if (choixOptionConseiller == 3) {
						// 2em SOUS MENU PLECMENT
						System.out.println("-------------------------- Placement-----------------------------");
						System.out.println("TAPER 1 pour effectuer un Placment ");
						System.out.println("TAPER 0 pour quitter");
						int choixGestionCompte = sc.nextInt();
						while (choixGestionCompte != 0) {
							if (choixGestionCompte == 1) {
								while (choixGestionCompte != 0) {
									// 3em SOUS MENU PLECMENT
									if (choixGestionCompte == 1) {

										System.out.println("choisir une bourse :");
										String sBourse = sc.nextLine();

										System.out.println("choisir le compte de placemnt :");
										String CompteCrediter = sc.nextLine();

										System.out.println("choisir saisir l'ID :");
										int id = sc.nextInt();

										System.out.println("saisir le montant :");
										double sMontant = sc.nextDouble();

										System.out.println("saisir une discription :");
										String sdiscreption = sc.nextLine();

									}
									System.out.println("-------------------------- Placement-----------------------------");
									System.out.println("TAPER 1 pour effectuer un Placment ");
									System.out.println("TAPER 0 pour quitter");
									choixGestionCompte = sc.nextInt();
								} // END 3eme SOUS MENU PLACEMENT
							}
						}

					}// END 2eme SOUS MENU PLACEMENT

					else {
						System.out.println("MAUVAIS CHOIX ! , TAPER 0 pour quitter");
						choixOptionConseiller = sc.nextInt();
					}
					System.out.println("-------------------------- Conseiller-----------------------------");
					System.out.println("TAPER 1 pour gérer des clients ");
					System.out.println("TAPER 2 pour gérer des comptes ");
					System.out.println("TAPER 3 pour effecteur un virement ");
					System.out.println("TAPER 4 pour efecteur un placement ");
					System.out.println("TAPER 0 pour quitter");
					choixOptionConseiller = sc.nextInt();
				} // END SOUS MENU CONSEILLER

			} else {
				System.out.println("MAUVAIS CHOIX ! , TAPER 0 pour quitter");
				choix = sc.nextInt();
			}
			System.out.println("---------------------------MENU---------------------------------------");
			System.out.println("TAPER 1 si vous étes Gérant:");
			System.out.println("TAPER 2 si vous étes Conseiller:");
			System.out.println("TAPER 0 pour quitter");
			choix = sc.nextInt();
		} // END BOUCLE PRINCIPALE
		System.out.println("A bientot");
	}
}


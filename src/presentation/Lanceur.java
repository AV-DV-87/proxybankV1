package presentation;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Virement;
import service.Iservice;
import service.ServiceImpl;

/**
 * la classe lanceur permet d'echanger avec l'utilisateur
 * 
 * @author Badr
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//---------------DECLARATION INSTANCIATION SERVICE---------------
				Iservice service = new ServiceImpl();
				
				//---------------SIMULATION STRUCTURE BDD---------------
				
				//table client
				Map<Integer, Client> resultatsCl = new Hashtable<Integer, Client>();
				Client cl1 = new Client(1,"Martin","Jeremy", "Rue1", "75000", "Paris","0650456578");
				Client cl2 = new Client(2,"Gates","Badr", "Rue2", "75000", "Paris","0650656878");
				resultatsCl = service.ajouterClient(cl1);
				resultatsCl = service.ajouterClient(cl2);
				
				
				//table compte
				Map<Integer, Compte> resultatsC = new Hashtable<Integer, Compte>();
				Compte ce = new CompteEpargne(1, 5000.00,"31/05/2018", 0.04);
				Compte cc = new CompteCourant(2, 8000.00,"31/05/2018", 1000.00);
				Compte cc2 = new CompteCourant(3, 15000.00,"31/05/2018", 1000.00);
				Compte ce2 = new CompteEpargne(4, 1000000.00,"31/05/2018", 0.06);
				resultatsC = service.ajouterCompte(ce);
				resultatsC = service.ajouterCompte(cc);
				resultatsC = service.ajouterCompte(cc2);
				resultatsC = service.ajouterCompte(ce2);
				
				
				
				//table des virements
				Map<Integer, Virement> resultatsVi = new Hashtable<Integer, Virement>();
				Virement vir = new Virement(1, 5000.00, "31/05/2018","Opération conseiller");
				resultatsVi = service.creerVirement(vir);
				
				//attribuer les comptes aux client
				service.attribuerCompte(cc, cl1);
				service.attribuerCompte(ce, cl1);
				service.attribuerCompte(cc2, cl2);
				service.attribuerCompte(ce2, cl2);
		
		

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
						
						System.out.println("TAPER 1 pour modifer un client ");
						System.out.println("TAPER 2 pour lister les clients ");
						System.out.println("TAPER 3 pour supprimer un client ");
						System.out.println("TAPER 0 pour quitter ");
						int choixGesionClient = sc.nextInt();
						while (choixGesionClient != 0) {
							if (choixGesionClient == 1) {
								// 3eme SOUS MENU GESTION CLIENT
								System.out.println("modifier un Client :");
							} else if (choixGesionClient == 2) {
								System.out.println("liste des Clients : ");
								service.listeClient(resultatsCl);
							} else if (choixGesionClient == 3) {
								System.out.println("supprimer un Client :");
							} else {
								System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR OU Tapez 0 pour quitter");
							}
							System.out.println("-------------------------- Gestion Client-----------------------------");
							
							System.out.println("TAPER 1 pour modifer un client ");
							System.out.println("TAPER 2 pour lister les clients ");
							System.out.println("TAPER 3 pour supprimer un client ");
							System.out.println("TAPER 0 pour quitter ");
							choixGesionClient = sc.nextInt();
						} // END 3eme SOUS MENU GESTION CLIENT
					} // END 2eme SOUS MENU GESTION CLIENT
					
					else if (choixOptionConseiller == 2) {
						// 2eme SOUS MENU GESTION CLIENT
						System.out.println("-------------------------- Gestion Compte-----------------------------");
						System.out.println("TAPER 1 pour modifer un compte ");
						System.out.println("TAPER 2 pour lister les comptes ");
						System.out.println("TAPER 3 pour supprimer un compte");
						System.out.println("TAPER 0 pour quitter");
						int choixGestionCompte = sc.nextInt();
						while (choixGestionCompte != 0) {
							if (choixGestionCompte == 1) {
								while (choixGestionCompte != 0) {
									// sous sous sous menu gestion compte
									if (choixGestionCompte == 1) {
										System.out.println("modifier un compte :");
									} else if (choixGestionCompte == 2) {
										System.out.println("lister les comptes : ");
										service.listeCompte(resultatsC);
									} else if (choixGestionCompte == 3) {
										System.out.println("supprimer un compte :");
									} else {
										System.out.println("MAUVAIS CHOIX, MERCI DE RESAISSIR OU Tapez 0 pour quitter");
									}
									System.out.println("-------------------------- Gestion Compte-----------------------------");
									System.out.println("TAPER 1 pour modifer un compte ");
									System.out.println("TAPER 2 pour lister les comptes ");
									System.out.println("TAPER 3 pour supprimer un compte");
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

										//---------------Interface d'execution d'un virement---------------
										
										//1-Affichage de la liste des comptes
										Scanner scan = new Scanner(System.in);
										System.out.println("-----------LISTE DE COMPTES-----------");
										service.listeCompte(resultatsC);
										
										//2-Choix des comptes
										System.out.println("Veuillez taper l'id du compte à débiter");
										int debit = scan.nextInt();
										//recupération du compte à débiter
										Compte cdeb = resultatsC.get(debit);
										System.out.println(resultatsC.get(debit).toString());
										
										System.out.println("Veuillez taper l'id du compte à créditer");
										int credit = scan.nextInt();
										Compte ccred = resultatsC.get(credit);
										//recuperation compte à crediter
										System.out.println(resultatsC.get(credit).toString());
										
										System.out.println("Veuillez saisir un identifiant pour ce virement :");
										int id = scan.nextInt();
										
										System.out.println("Veuillez saisir un montant pour ce virement :");
										double montant = scan.nextDouble();
										
										System.out.println("Veuillez saisir une date (jj/mm/aaaa) pour ce virement :");
										String date = scan.next();
										
										System.out.println("Veuillez saisir une description pour ce virement :");
										String description = scan.next();
										
										//creation du virement
										Virement virU = new Virement(id,montant, date, description);
										resultatsVi = service.creerVirement(virU);
										
										System.out.println("Voulez-vous valider ce virement : 1 pour valider 0 pour annuler.");
										int validation = scan.nextInt();
										if(validation == 1) {
											
											service.executerVirement(virU, cdeb, cc);
										}else if(validation == 0) {
											
										}else {
											System.out.println("Veuillez saisir O pour valider et N pour quitter.");
										}

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


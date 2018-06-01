package presentation;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Personne;
import domaine.Placement;
import domaine.Virement;
import service.Iservice;
import service.ServiceImpl;

public class LanceurTest {
	public static void main(String[] args) {
		
		//---------------DECLARATION INSTANCIATION SERVICE---------------
		Iservice service = new ServiceImpl();
		
		//---------------SIMULATION STRUCTURE BDD---------------
		
		//table client
		Map<Integer, Client> resultatsCl = new Hashtable<Integer, Client>();
		Client cl1 = new Client(1,"Martin","Jeremy", "Rue1", "75000", "Paris","0650456578");
		Client cl2 = new Client(2,"Gates","Badr", "Rue2", "75000", "Paris","0650656878");
		resultatsCl = service.ajouterClient(cl1);
		resultatsCl = service.ajouterClient(cl2);
		System.out.println("-----------------------------------------------------");
		System.out.println("Affichage de la liste des clients");
		service.listeClient(resultatsCl);
		
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
		
		//table des placements
		Map<Integer, Placement> resultatsPla = new Hashtable<Integer, Placement>();
		Placement pla = new Placement(1, 50000.00, 0.08, 24,"Paris");
		resultatsPla = service.ajouterPlacement(pla);
		
		//attribuer les comptes aux client
		service.attribuerCompte(cc, cl1);
		service.attribuerCompte(ce, cl1);
		service.attribuerCompte(cc2, cl2);
		service.attribuerCompte(ce2, cl2);
		System.out.println("-----------------------------------------------------");
		System.out.println("Affichage de la liste des comptes et propriétaires");
		service.listeCompte(resultatsC);
		System.out.println("-----------------------------------------------------");
		System.out.println("Affichage de la liste des clients une fois des comptes attribué");
		service.listeClient(resultatsCl);
		
		//Execution d'un virement 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------LISTE DE COMPTES-----------");
		service.listeCompte(resultatsC);
		
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
		
		//Procéder à un placement
		service.executerPlacement(ce2, pla);
		System.out.println("-----------------------------------------------------");
		System.out.println("Affichage de la liste des comptes et propriétaires");
		service.listeCompte(resultatsC);		
		
		
	}
}

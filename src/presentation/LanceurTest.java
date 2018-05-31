package presentation;

import java.util.Hashtable;
import java.util.Map;

import domaine.Client;
import domaine.Compte;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Personne;
import domaine.Virement;
import service.Iservice;
import service.ServiceImpl;

public class LanceurTest {
	public static void main(String[] args) {
		//---------------SIMULATION STRUCTURE BDD---------------
		//table personne
		Map<Integer, Client> resultatsCl = new Hashtable<Integer, Client>();
		
		//table compte
		Map<Integer, Compte> resultatsC = new Hashtable<Integer, Compte>();
		//table des virements
		Map<Integer, Virement> resultatsVi = new Hashtable<Integer, Virement>();
		
	}
}

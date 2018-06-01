package service;

import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Personne;
import domaine.Virement;

/**
 * Interface du package service, déclare l'ensemble des méthodes nécessaire aux classes
 * de la couche domaine.
 * @author Arnaud
 *
 */
public interface Iservice {
	
	//AGENCE
	public Map<Integer, Agence> ajouterAgence(Agence a);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierAgence(Agence a);
	public void supprimerAgence(Agence a);
	public void listeAgence(Map<Integer, Agence> agences);
	public void afficherClient(Client c);
	
	//AUDITEUR
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a);
	
	//CB
	public Map<Integer, CB> ajouterCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierCB(CB cb);
	public void supprimerCB(CB cb);
	public void listeCB(Map<Integer, Map> CBlist);
	
	//CLIENT
	public Map<Integer, Client> ajouterClient(Client p);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierClient(Client p);
	public void supprimerClient(Client p);
	public void listeClient(Map<Integer, Client> clients);
	/**
	 * Permet d'attribuer un Compte à un Client.
	 * 
	 * @param Compte
	 * @param Client
	 */
	public void attribuerCompte(Compte c, Client cl);
	public void atttribuerCB(CB cb, Client c);
	
	//COMPTE
	public Map<Integer, Compte> ajouterCompte(Compte c);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierCompte(Compte c);
	public void supprimerCompte(Compte c);
	public void listeCompte(Map<Integer, Compte> comptes);
	public void crediterCompte(Compte c, double mt);
	public void debiterCompte(Compte c, double mt);
	
	
	//VIREMENT
	/**
	 * Stockage d'un virement dans une Collection.
	 * @param Virement
	 */
	public Map<Integer, Virement> creerVirement(Virement v);
	/**
	 * Cette méthode permet d'éxécuter un virement v, en débitant un compte
	 * c1 et en créditant un compte c2.
	 * 
	 * @param v Virement
	 * @param c1 Compte à débiter
	 * @param c2 Compte à créditer
	 */
	public void executerVirement(Virement v, Compte c1, Compte c2);
	
}

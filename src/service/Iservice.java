package service;

import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Personne;
import domaine.Placement;
import domaine.Virement;

/**
 * Interface du package service, déclare l'ensemble des méthodes nécessaire aux classes
 * de la couche domaine.
 * @author Arnaud
 *
 */
public interface Iservice {
	
	//------------------------AGENCE------------------------
	/**
	 * Permet d'afficher la liste de toutes les agences déjà enregistrée.
	 * @param Agence a Permet d'afficher la liste de toutes les agences déjà enregistrée.
	 * @return Map<Integer, Agence> la liste de toutes les agences déjà enregistrée.
	 */
	public Map<Integer, Agence> ajouterAgence(Agence a);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param  a Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void modifierAgence(Agence a);
	public void supprimerAgence(Agence a);
	
	public void listeAgence(Map<Integer, Agence> agences);
	
	public void afficherClient(Client c);
	
	
	//------------------------GERANT------------------------
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a);
	
	
	//------------------------CB------------------------
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public Map<Integer, CB> ajouterCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param cb Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void modifierCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void supprimerCB(CB cb);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void listeCB(Map<Integer, Map> CBlist);
	
	//------------------------CLIENT------------------------
	public Map<Integer, Client> ajouterClient(Client p);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void modifierClient(Client p);
	public void supprimerClient(Client p);
	public void listeClient(Map<Integer, Client> clients);
	/**
	 * Permet d'attribuer un Compte à un Client.
	 * 
	 * @param Compte Permet d'attribuer un Compte à un Client.
	 * @param Client Permet d'attribuer un Compte à un Client.
	 */
	public void attribuerCompte(Compte c, Client cl);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void atttribuerCB(CB cb, Client c);
	
	//------------------------COMPTE------------------------
	public Map<Integer, Compte> ajouterCompte(Compte c);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void modifierCompte(Compte c);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 */
	public void supprimerCompte(Compte c);
	/**
	 * Méthode permettant d'afficher la liste de l'ensemble des comptes.
	 * @param comptes Méthode permettant d'afficher la liste de l'ensemble des comptes.
	 */
	public void listeCompte(Map<Integer, Compte> comptes);
	public void crediterCompte(Compte c, double mt);
	public void debiterCompte(Compte c, double mt);
	
	//------------------------PLACEMENT------------------------
	/**
	 * Stockage d'un placement dans une collection.
	 * @param Placement p un placment à stocker
	 * @return Map<Integer, PLacement>
	 */
	public Map<Integer, Placement> ajouterPlacement(Placement p);
	/**
	 * Cette méthode sera implémentée en V2, une fois la couche DAO ajoutée.
	 * @author Arnaud
	 * @param Agence
	 */
	public void supprimerPlacement(Placement p);
	/**
	 * Méthode permettant d'effectuer un placement à partir d'un compte.
	 * @param Compte c
	 * @param Placement p
	 */
	public void executerPlacement(Compte c, Placement p);
	
	
	//------------------------VIREMENT------------------------
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

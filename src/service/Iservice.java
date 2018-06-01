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
 * Interface du package service, d�clare l'ensemble des m�thodes n�cessaire aux classes
 * de la couche domaine.
 * @author Arnaud
 *
 */
public interface Iservice {
	
	//------------------------AGENCE------------------------
	/**
	 * Permet d'afficher la liste de toutes les agences d�j� enregistr�e.
	 * @param Agence a Permet d'afficher la liste de toutes les agences d�j� enregistr�e.
	 * @return Map<Integer, Agence> la liste de toutes les agences d�j� enregistr�e.
	 */
	public Map<Integer, Agence> ajouterAgence(Agence a);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param  a Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void modifierAgence(Agence a);
	public void supprimerAgence(Agence a);
	
	public void listeAgence(Map<Integer, Agence> agences);
	
	public void afficherClient(Client c);
	
	
	//------------------------GERANT------------------------
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a);
	
	
	//------------------------CB------------------------
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public Map<Integer, CB> ajouterCB(CB cb);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param cb Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void modifierCB(CB cb);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void supprimerCB(CB cb);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void listeCB(Map<Integer, Map> CBlist);
	
	//------------------------CLIENT------------------------
	public Map<Integer, Client> ajouterClient(Client p);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void modifierClient(Client p);
	public void supprimerClient(Client p);
	public void listeClient(Map<Integer, Client> clients);
	/**
	 * Permet d'attribuer un Compte � un Client.
	 * 
	 * @param Compte Permet d'attribuer un Compte � un Client.
	 * @param Client Permet d'attribuer un Compte � un Client.
	 */
	public void attribuerCompte(Compte c, Client cl);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void atttribuerCB(CB cb, Client c);
	
	//------------------------COMPTE------------------------
	public Map<Integer, Compte> ajouterCompte(Compte c);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void modifierCompte(Compte c);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 */
	public void supprimerCompte(Compte c);
	/**
	 * M�thode permettant d'afficher la liste de l'ensemble des comptes.
	 * @param comptes M�thode permettant d'afficher la liste de l'ensemble des comptes.
	 */
	public void listeCompte(Map<Integer, Compte> comptes);
	public void crediterCompte(Compte c, double mt);
	public void debiterCompte(Compte c, double mt);
	
	//------------------------PLACEMENT------------------------
	/**
	 * Stockage d'un placement dans une collection.
	 * @param Placement p un placment � stocker
	 * @return Map<Integer, PLacement>
	 */
	public Map<Integer, Placement> ajouterPlacement(Placement p);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence
	 */
	public void supprimerPlacement(Placement p);
	/**
	 * M�thode permettant d'effectuer un placement � partir d'un compte.
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
	 * Cette m�thode permet d'�x�cuter un virement v, en d�bitant un compte
	 * c1 et en cr�ditant un compte c2.
	 * 
	 * @param v Virement
	 * @param c1 Compte � d�biter
	 * @param c2 Compte � cr�diter
	 */
	public void executerVirement(Virement v, Compte c1, Compte c2);
	
}

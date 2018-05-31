package service;

import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Personne;
import domaine.Virement;

/**
 * Interface du package service, d�clare l'ensemble des m�thodes n�cessaire aux classes
 * de la couche domaine.
 * @author Arnaud
 *
 */
public interface Iservice {
	
	//AGENCE
	public Map<Integer, Agence> ajouterAgence(Agence a);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierAgence(Agence a);
	
	public void supprimerAgence(Agence a);
	public void listeAgence(Map<Integer, Agence> agences);
	
	//AUDITEUR
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a);
	
	//CB
	public Map<Integer, CB> ajouterCB(CB cb);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierCB(CB cb);
	public void supprimerCB(CB cb);
	
	public void listeCB(Map<Integer, Map> CBlist);
	
	//CLIENT
	public void afficherClient(Client c);
	public void attribuerCompte(Compte c, Client cl);
	public void atttribuerCB(CB cb, Client c);
	
	//COMPTE
	public Map<Integer, Compte> ajouterCompte(Compte c);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierCompte(Compte c);
	public void supprimerCompte(Compte c);
	public void listeCompte(Map<Integer, Compte> comptes);
	public void crediterCompte(Compte c, double mt);
	public void debiterCompte(Compte c, double mt);
	
	//PERSONNE
	public Map<Integer, Personne> ajouterPersonne(Personne p);
	/**
	 * Cette m�thode sera impl�ment�e en V2, une fois la couche DAO ajout�e.
	 * @author Arnaud
	 * @param Agence
	 */
	public void modifierPersonne(Personne p);
	public void supprimerPersonne(Personne p);
	public void listePersonne(Map<Integer, Personne> personnes);
	
	//VIREMENT
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

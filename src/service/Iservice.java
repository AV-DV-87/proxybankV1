package service;

import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Personne;
import domaine.Virement;

/**
 * Interface du package service.
 * @author Arnaud
 *
 */
public interface Iservice {
	
	//AGENCE
	public Map<Integer, Agence> ajouterAgence(Agence a);
	public void modifierAgence(Agence a);
	public void supprimerAgence(Agence a);
	public void listeAgence(Map<Integer, Agence> agences);
	
	//AUDITEUR
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a);
	
	//CB
	public Map<Integer, CB> ajouterCB(CB cb);
	public void modifierCB(CB cb);
	public void supprimerCB(CB cb);
	public void listeCB(Map<Integer, Map> CBlist);
	
	//CLIENT
	public void afficherClient(Client c);
	public void attribuerCompte(Compte c, Client cl);
	public void atttribuerCB(CB cb, Client c);
	
	//COMPTE
	public Map<Integer, Compte> ajouterCompte(Compte c);
	public void modifierCompte(Compte c);
	public void supprimerCompte(Compte c);
	public void listeCompte(Map<Integer, Compte> comptes);
	
	//PERSONNE
	public Map<Integer, Personne> ajouterPersonne(Personne p);
	public void modifierPersonne(Personne p);
	public void supprimerPersonne(Personne p);
	public void listePersonne(Map<Integer, Personne> personnes);
	
	//VIREMENT
	public void ajouterVirement(Virement v, Compte c1, Compte c2);
	
}

package service;

import java.util.Hashtable;
import java.util.Map;

import domaine.Agence;
import domaine.CB;
import domaine.Client;
import domaine.Compte;
import domaine.Personne;
import domaine.Virement;

public class ServiceImpl implements Iservice {
	
	//DECLARATION ET INITIALISATION MAP POUR SIMULATION BDD
	private Map<Integer,Personne> personnes = new Hashtable<Integer,Personne>();
    private Map<Integer,Compte> comptes = new Hashtable<Integer,Compte>();
	private Map<Integer,Agence> agences = new Hashtable<Integer,Agence>();
	private  Map<Integer, CB> CBlist = new Hashtable<Integer,CB>();
	private Map<Integer, Virement> virements = new Hashtable<Integer, Virement>();
	
	@Override
	public Map<Integer, Agence> ajouterAgence(Agence a) {
		agences.put(a.getId(), a);
		return agences;
	}

	@Override
	public void modifierAgence(Agence a) {
		
		
	}

	@Override
	public void supprimerAgence(Agence a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeAgence(Map<Integer, Agence> agences) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<Integer, Compte> afficherComptesDebiteurs(Agence a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, CB> ajouterCB(CB cb) {
		CBlist.put(cb.getId(), cb);
		return CBlist;
	}

	@Override
	public void modifierCB(CB cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCB(CB cb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeCB(Map<Integer, Map> CBlist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerCompte(Compte c, Client cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atttribuerCB(CB cb, Client c) {
		// TODO Auto-generated method stub
		
	}
	
	//-----------------------------COMPTES-----------------------------
	
	@Override
	public Map<Integer, Compte> ajouterCompte(Compte c) {
		comptes.put(c.getId(), c);
		return comptes;
	}

	@Override
	public void modifierCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeCompte(Map<Integer, Compte> comptes) {
		for (Map.Entry<Integer, Compte> entry : comptes.entrySet()) {
			 System.out.println(entry);
			 if(entry.getValue().getProprietaire()!=null)
			 {
				 System.out.println("proriétaire="+entry.getValue().getProprietaire());
			 }
		 }
	}

	//-----------------------------PERSONNES-----------------------------
	
	@Override
	public Map<Integer, Personne> ajouterPersonne(Personne p) {
		personnes.put(p.getId(), p);
		return personnes;
	}

	@Override
	public void modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listePersonne(Map<Integer, Personne> personnes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterVirement(Virement v, Compte c1, Compte c2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO crediter gérer exceptions ou if
		c.setSolde(c.getSolde() + mt);
	}

	@Override
	public void debiterCompte(Compte c, double mt) {
		// TODO Auto-generated method stub
		c.setSolde(c.getSolde() - mt);
	}

	
	
	
}

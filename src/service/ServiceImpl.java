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
	private Map<Integer,Client> clients = new Hashtable<Integer,Client>();
    private Map<Integer,Compte> comptes = new Hashtable<Integer,Compte>();
	private Map<Integer,Agence> agences = new Hashtable<Integer,Agence>();
	private  Map<Integer, CB> CBlist = new Hashtable<Integer,CB>();
	private Map<Integer, Virement> virements = new Hashtable<Integer, Virement>();
	
	//-----------------------------AGENCES-----------------------------
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
	
	//-----------------------------CB-----------------------------
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
				 System.out.println("proriétaire="+entry.getValue().getProprietaire().getNom()+" "+entry.getValue().getProprietaire().getPrenom());
			 }
		 }
	}
	
	@Override
	public void crediterCompte(Compte c, double mt) {
		// TODO crediter gérer exceptions ou if
		c.setSolde(c.getSolde() + mt);
	}

	@Override
	public void debiterCompte(Compte c, double mt) {
		// TODO debiter 
		c.setSolde(c.getSolde() - mt);
	}

	//-----------------------------CLIENTS-----------------------------
	
		@Override
		public Map<Integer, Client> ajouterClient(Client cl) {
			clients.put(cl.getId(), cl);
			return clients;
		}

		@Override
		public void modifierClient(Client p) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void supprimerClient(Client p) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void listeClient(Map<Integer, Client> clients) {
			for (Map.Entry<Integer, Client> entry : clients.entrySet()) {
				 System.out.println(entry);
				 if(entry.getValue().getListCompte()!=null)
				 {
					 for (Compte compte : entry.getValue().getListCompte()) {
						System.out.println(compte);
					}
				 }
			 }
		}
		
		@Override
		public void attribuerCompte(Compte c, Client cl) {
			//récupère la liste des comptes du client et ajoute le compte
			cl.getListCompte().add(c);
			//a l'inverse défini le client comme propriétaire du compte
			c.setProprietaire(cl);
		}
	
	//-----------------------------VIREMENT-----------------------------
	
	@Override
	public void executerVirement(Virement v, Compte cd, Compte cc) {
		
		//1. debiter le compte du montant saisi à la création du virement
		debiterCompte(cd, v.getMontant());
		
		//2. crediter ce même montant saisi à la création du virement
		crediterCompte(cc, v.getMontant());
		
		//3. Affiche un message 
		System.out.println("Un virement de "+v.getMontant()+"€ a été effectué du compte numéro " +cd.getId()+" au compte numéro "+cc.getId()+".");
		
	}

	@Override
	public Map<Integer, Virement> creerVirement(Virement v) {
		virements.put(v.getId(), v);
		return virements;
		
	}	
	
	
}

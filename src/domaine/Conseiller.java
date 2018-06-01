package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Conseiller extends Personne {
	/**
	 * liste des clients gérer par un conseiller
	 */
	private Collection<Client> ListClient = new ArrayList();

	/**
	 * Constructeur avec paramètre
	 * 
	 * @param id identifiant conseiller
	 * @param nom nom conseiller
	 * @param prenom prenom conseiller
	 * @param listClient liste des client gerer par le conseiller
	 */
	public Conseiller(int id, String nom, String prenom, Collection<Client> listClient) {
		super(id, nom, prenom);
		ListClient = listClient;
	}

	/**
	 * getter
	 * 
	 * @return the listClient
	 */
	public Collection<Client> getListClient() {
		return ListClient;
	}

	/**
	 * setter
	 * 
	 * @param listClient
	 *            the listClient to set
	 */
	public void setListClient(Collection<Client> listClient) {
		ListClient = listClient;
	}

	/**
	 * Methode to string
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conseiller [nom=" + super.getNom() + ", prenom=" + super.getPrenom() + "]";
	}

}

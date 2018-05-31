package domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Conseiller extends Personne {
	private Collection<Client> ListClient= new ArrayList();

	/**
	 * Constructeur avec  paramètre
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param listClient
	 */
	public Conseiller(int id, String nom, String prenom, Collection<Client> listClient) {
		super(id, nom, prenom);
		ListClient = listClient;
	}

	/**
	 * getter
	 * @return the listClient
	 */
	public Collection<Client> getListClient() {
		return ListClient;
	}

	/**
	 * setter
	 * @param listClient the listClient to set
	 */
	public void setListClient(Collection<Client> listClient) {
		ListClient = listClient;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Conseiller [nom=" + super.getNom() + ", prenom=" + super.getPrenom() + "]";
	}
	
	
	

}

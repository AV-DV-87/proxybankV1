
package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * cette classe corresspond a l'objet Agence
 * @author badr
 * @version 1.0 ArnaudV et BadrA
 *
 */
public class Agence {
	
	private int id;
	private String dateCreation;
	private Gerant gerant;
	private Collection<Conseiller> ListConseiller= new ArrayList();
	
	
	/**
	 * constructeur avec paramètre
	 * @param  id correspend a l'identifiant de l'agence
	 * @param  dateCreation correspend la date de création de l'agence
	 * @param  gerant  c'est le gérant de l'agence il fait l'audite et gére l'agence
	 * @param  listConseiller ListeConseiller c'est la liste des Conseillers de l'agence
	 */
	public Agence(int id, String dateCreation, Gerant gerant, Collection<Conseiller> listConseiller) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
		ListConseiller = listConseiller;
	}

	/**
	 * constructeur par défaut
	 */
	public Agence() {
		super();
	}

	/**
	 * getters et setters
	 */
	/**
	 * @return the id 
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set 
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dateCreation 
	 */
	public String getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set 
	 */
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the gerant 
	 */
	public Gerant getGerant() {
		return gerant;
	}

	/**
	 * @param gerant the gerant to set 
	 */
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	/**
	 * @return the listConseiller 
	 */
	public Collection<Conseiller> getListConseiller() {
		return ListConseiller;
	}

	/**
	 * @param listConseiller the listConseiller to set 
	 */
	public void setListConseiller(Collection<Conseiller> listConseiller) {
		ListConseiller = listConseiller;
	}

	/**
	 * Méthode to String
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [id=" + id + ", dateCreation=" + dateCreation + "]";
	}
	
}

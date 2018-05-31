
package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * cette classe corresspond a une agence
 * @author badr
 *
 */
public class Agence {
	
	private int id;
	private String dateCreation;
	private Gerant gerant;
	private Collection<Conseiller> ListConseiller= new ArrayList();
	
	
	/**
	 * constructeur avec paremètre
	 */
	public Agence(int id, String dateCreation, Gerant gerant, Collection<Conseiller> listConseiller) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
		ListConseiller = listConseiller;
	}

	/**
	 * constructeur sans paramètre
	 */
	public Agence() {
		super();
	}

	/**
	 * getter et setter
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
	 * methode to String
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Agence [id=" + id + ", dateCreation=" + dateCreation + "]";
	}
	
}

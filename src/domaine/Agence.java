
package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * cette classe corresspond a l'objet agence
 * @author badr
 *
 */
public class Agence {
	/**
	 * le ID correspend a l'identifiant de l'agence
	 * 
	 */
	private int id;
	
	/**
	 * dateCreation correspend la date de cr�ation de l'agence
	 */
	private String dateCreation;
	
	/**
	 * gerant c'est le g�rant de l'agence il fait l'audite et g�re l'agence
	 */
	private Gerant gerant;
	
	/**
	 * ListeConseiller c'est la liste des Conseillers de l'agence
	 */
	private Collection<Conseiller> ListConseiller= new ArrayList();
	
	
	/**
	 * constructeur avec parem�tre
	 * @param id
	 * @param dateCreation
	 * @param gerant
	 * @param listConseiller
	 */
	public Agence(int id, String dateCreation, Gerant gerant, Collection<Conseiller> listConseiller) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
		ListConseiller = listConseiller;
	}

	/**
	 * constructeur par d�faut
	 * 
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

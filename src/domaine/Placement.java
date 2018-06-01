/**
 * 
 */
package domaine;

/**
 * @author Arnaud
 *
 */
public class Placement {
	private int id;
	private Double taux;
	private String duree;
	private String bourse;
	
	
	/**
	 * Constructeur all fields.
	 * @param id
	 * @param taux
	 * @param duree
	 * @param bourse
	 */
	public Placement(int id, Double taux, String duree, String bourse) {
		super();
		this.id = id;
		this.taux = taux;
		this.duree = duree;
		this.bourse = bourse;
	}


	/**
	 * Constructeur par défaut.
	 */
	public Placement() {
		super();
	}

	
	//GETTER AND SETTER
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
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}


	/**
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}


	/**
	 * @return the duree
	 */
	public String getDuree() {
		return duree;
	}


	/**
	 * @param duree the duree to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}


	/**
	 * @return the bourse
	 */
	public String getBourse() {
		return bourse;
	}


	/**
	 * @param bourse the bourse to set
	 */
	public void setBourse(String bourse) {
		this.bourse = bourse;
	}

	//TO STRING
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Placement [id=" + id + ", taux=" + taux + ", duree=" + duree + ", bourse=" + bourse + "]";
	}
	
	
}

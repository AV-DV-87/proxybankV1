/**
 * 
 */
package domaine;

/**
 * Classe correspondant aux objets de type Compte.
 * @author Arnaud
 *
 */
public abstract class Compte {
	/**
	 * id correspond � l'identifiant du compte
	 */
	private int id;
	/**
	 * solde correspond au Solde du compte
	 */
	protected double solde;
	/**
	 * dateOuverture correspond a la date du r�ation du compte
	 */
	protected String dateOuverture;
	/**
	 * proprietaire du compte de type client
	 */
	protected Client proprietaire;
	
	
	//CONSTRUCTEUR
	/**
	 * Constructeur par d�faut
	 */
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur avec tous les attributs.
	 * @param id
	 * @param solde
	 * @param dateOuverture
	 */
	public Compte(int id, double solde, String dateOuverture) {
		super();
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}


	//------GETTERS AND SETTERS------
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
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}


	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}


	/**
	 * @return the dateOuverture
	 */
	public String getDateOuverture() {
		return dateOuverture;
	}


	/**
	 * @param dateOuverture the dateOuverture to set
	 */
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}


	/**
	 * @return the proprietaire
	 */
	public Client getProprietaire() {
		return proprietaire;
	}


	/**
	 * @param proprietaire the proprietaire to set
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 * methode to String
	 */
	
	//TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
}

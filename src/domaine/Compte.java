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
	
	private int id;
	private double solde;
	private String dateOuverture;
	private Client proprietaire;
	private Virement operations;
	
	//CONSTRUCTEUR
	/**
	 * Constructeur par défaut
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
	 * @param proprietaire
	 * @param operations
	 */
	public Compte(int id, double solde, String dateOuverture, Client proprietaire, Virement operations) {
		super();
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.proprietaire = proprietaire;
		this.operations = operations;
	}


	//------GETTERS AND SETTERS------
	
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
	 * @return the operations
	 */
	public Virement getOperations() {
		return operations;
	}


	/**
	 * @param operations the operations to set
	 */
	public void setOperations(Virement operations) {
		this.operations = operations;
	}

	
	
	//TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [id=" + id + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
}

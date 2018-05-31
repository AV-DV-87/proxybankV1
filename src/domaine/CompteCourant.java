package domaine;

/**
 * Le Compte Courant est un compte sp�cifique avec une autorisation de d�couvert.
 * @author Arnaud
 *
 */
public class CompteCourant extends Compte {
	
	/**
	 * Decouvert autoris� sur ce compte.
	 */
	private double decouvert;
	
	//CONSTRUCTEUR
	/**
	 * Constructeur par d�faut
	 */
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructeur avec tous les attributs
	 * @param decouvert
	 */
	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

	//GETTER AND SETTER
	/**
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}


	/**
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	//TO STRING
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteCourant [id=" + super.getId() + ", solde=" + super.getSolde() + ", dateOuverture=" + super.getDateOuverture() + "decouvert=" + decouvert + "]";
	}
	
		
	
}

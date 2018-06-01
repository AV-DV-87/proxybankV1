package domaine;

/**
 * Classe CompteEpargne qui est Compte ayant un taux de rémunération.
 * 
 * @author Badr
 *
 */
public class CompteEpargne extends Compte {
	/**
	 * Taux d'intérêt définis par défaut .
	 */
	private double taux = 0.03;

	// CONSTRUCTEUR

	/**
	 * Constructeur par défaut
	 */
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Cosntructeur tous attributs.
	 * 
	 * @param taux
	 */
	public CompteEpargne(int id, double solde, String dateOuverture, double taux) {
		super(id, solde, dateOuverture);
		this.taux = taux;
	}

	// GETTER AND SETTER
	/**
	 * getter et setter
	 */
	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux
	 *            the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	// TO STRING
	/**
	 * methode to string
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CompteEpargne [id=" + super.getId() + ", solde=" + super.getSolde() + ", dateOuverture="
				+ super.getDateOuverture() + "taux=" + taux + "]";
	}

}

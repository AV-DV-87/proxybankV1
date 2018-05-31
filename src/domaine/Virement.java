package domaine;

/**
 * Classe de virement compte à compte.
 * @author Arnaud
 *
 */

public class Virement {
	
	/**
	 * identifiant du virement pour pouvoir tenir un historique des virements dans les comptes
	 */
	private int id;
	/**
	 * Montant du virement effectué
	 */
	private double montant;
	/**
	 * Date où le virement a été effectué
	 */
	private String dateVirement;
	/**
	 * Message saisi par le conseiller pour expliquer la raison de cette opération. 
	 */
	private String description;
	
	//CONSTRUCTOR
	/**
	 * @param id
	 * @param montant
	 * @param dateVirement
	 * @param description
	 */
	public Virement(int id, double montant, String dateVirement, String description) {
		super();
		this.id = id;
		this.montant = montant;
		this.dateVirement = dateVirement;
		this.description = description;
	}

	/**
	 * Constructeur par défaut
	 */
	public Virement() {
		super();
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Virement [id=" + id + ", montant=" + montant + ", dateVirement=" + dateVirement + ", description="
				+ description + "]";
	}
	
		
	
}

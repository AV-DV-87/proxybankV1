package domaine;

/**
 * Classe de virement compte � compte.
 * @author Arnaud
 *
 */

public class Virement {
	
	/**
	 * identifiant du virement pour pouvoir tenir un historique des virements dans les comptes
	 */
	private int id;
	/**
	 * Montant du virement effectu�
	 */
	private double montant;
	/**
	 * Date o� le virement a �t� effectu�
	 */
	private String dateVirement;
	/**
	 * Message saisi par le conseiller pour expliquer la raison de cette op�ration. 
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
	 * Constructeur par d�faut
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

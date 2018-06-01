package domaine;

/**
 * une classe abstraite qui permet de tester l'iligibilté à un crédit Conso ou
 * un crédit Immo
 * 
 * @author Badr
 *
 */
public abstract class Simulation {
	/**
	 * id correspond au Numero de simulation
	 */
	private int id;
	/**
	 * montant du pret
	 */
	protected double montant;
	/**
	 * duree du remboursement en Mois
	 */
	protected String duree;
	/**
	 * taux d'intret du pret
	 */
	protected double taux;
	/**
	 * constructeur sans paramètres
	 */
	public Simulation() {
		super();
	}
	/**
	 * constructeur avec touts les variables
	 * @param id
	 * @param montant
	 * @param date
	 * @param taux
	 */
	public Simulation(int id, double montant, String date, double taux) {
		super();
		this.id = id;
		this.montant = montant;
		this.duree = duree;
		this.taux = taux;
	}
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
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}
	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/**
	 * @return the date
	 */
	public String getDuree() {
		return duree;
	}
	/**
	 * @param date the date to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}
	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}
	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	/**
	 * Methode to string 
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Simulation [id=" + id + ", montant=" + montant + ", duree=" + duree + ", taux=" + taux + "]";
	}
	
	
	
	

}

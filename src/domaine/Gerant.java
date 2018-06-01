package domaine;

public class Gerant extends Personne {
	/**
	 * l'Agence gérer et auditer par le gérant
	 */
	private Agence agence;

	/**
	 * constructeur avec paramétre
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param agence
	 */
	
	public Gerant(int id, String nom, String prenom, Agence agence) {
		super(id, nom, prenom);
		this.agence = agence;
	}

	/**
	 * getter
	 * @return the agence
	 */
	public Agence getAgence() {
		return agence;
	}

	/**
	 * setter
	 * @param agence the agence to set
	 */
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	

}

package domaine;

public class Gerant extends Personne {
	/**
	 * l'Agence g�rer et auditer par le g�rant
	 */
	private Agence agence;

	/**
	 * constructeur avec param�tre
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

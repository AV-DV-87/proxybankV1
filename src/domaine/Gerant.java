package domaine;

public class Gerant extends Personne {
	/**
	 * l'Agence gérer et auditer par le gérant
	 */
	private Agence agence;

	/**
	 * constructeur avec paramétre
	 * @param id identifiant gerant
	 * @param nom nom gerant
	 * @param prenom prenom gerant
	 * @param agence objet agence de type agence
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

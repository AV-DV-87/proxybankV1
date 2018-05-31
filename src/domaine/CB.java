package domaine;

/**
 * Classe qui correspond au Carte Bancaire
 * @author ArnaudV
 *
 */
public class CB {
	
	//ATTRIBUTS
	
	private int id;
	private int code;
	private Client proprietaire;
	
	//CONSTRUCTEUR
	/**
	 * Constructeur par défaut
	 */
	public CB() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructeur tous attributs
	 * @param id
	 * @param code
	 * @param proprietaire
	 */
	public CB(int id, int code, Client proprietaire) {
		super();
		this.id = id;
		this.code = code;
		this.proprietaire = proprietaire;
	}

	//GETTER AND SETTER
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
	 * @return the code
	 */
	public int getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CB [id=" + id + ", code=" + code + ", proprietaire=" + proprietaire + "]";
	}
	
	
}

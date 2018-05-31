package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * la classe Client pour l'ojet client
 * @author Badr
 *
 */
public class Client extends Personne {
	private Collection<Compte> listCompte= new ArrayList();
	private CB carte;
	private String adresse;
	private String codeP;
	private String ville;
	private String tel;
	
	/**
	 * constructeur avec paramètre
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param codeP
	 * @param ville
	 * @param tel
	 */
	public Client(int id, String nom, String prenom, String adresse,
			String codeP, String ville, String tel) {
		super(id, nom, prenom);
		adresse = adresse;
		this.codeP = codeP;
		this.ville = ville;
		this.tel = tel;
	}

	/**
	 * constructeur par défaut
	 */
	public Client() {
		super();
	}

	/**
	 * getter
	 * @return the listCompte
	 */
	public Collection<Compte> getListCompte() {
		return listCompte;
	}

	/**
	 * setter
	 * @param listCompte the listCompte to set
	 */
	public void setListCompte(Collection<Compte> listCompte) {
		listCompte = listCompte;
	}

	/**
	 * getter
	 * @return the carte
	 */
	public CB getCarte() {
		return carte;
	}

	/**
	 * setter
	 * @param carte the carte to set
	 */
	public void setCarte(CB carte) {
		this.carte = carte;
	}

	/**
	 * getter
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		adresse = adresse;
	}

	
	/**
	 * getter
	 * @return the codeP
	 */
	public String getCodeP() {
		return codeP;
	}

	/**
	 * setter
	 * @param codeP the codeP to set
	 */
	public void setCodeP(String codeP) {
		this.codeP = codeP;
	}

	/**
	 * getter
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * setter
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * getter
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * setter
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [listCompte=" + listCompte + ", adresse=" + adresse + ", codeP=" + codeP + ", ville=" + ville
				+ ", tel=" + tel + "]";
	}

	
	
	
	
}

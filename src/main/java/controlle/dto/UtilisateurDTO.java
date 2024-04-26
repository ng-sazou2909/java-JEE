package controlle.dto;

import java.io.Serializable;

public class UtilisateurDTO implements Serializable{
	private String id;
	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String phone;
	
	public UtilisateurDTO() {}

	public UtilisateurDTO(String id, String nom, String prenom, String adresse, String mail, String phone) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.mail = mail;
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

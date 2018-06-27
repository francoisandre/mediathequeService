package test.mas.ws.vo.v4_0;

public abstract class Personne {

	private String nom;
	private String prenom;

	public String getNom() {
		return nom;
	}

	public Personne setNom(final String nom) {
		this.nom = nom;
		return this;
	}

	public String getPrenom() {
		return prenom;
	}

	public Personne setPrenom(final String prenom) {
		this.prenom = prenom;
		return this;
	}

}

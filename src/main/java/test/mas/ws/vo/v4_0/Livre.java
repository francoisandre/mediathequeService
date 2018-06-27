package test.mas.ws.vo.v4_0;

public class Livre {

	private String titre;
	private Auteur auteur;
	private int nombrePages;

	public String getTitre() {
		return titre;
	}

	public Livre setTitre(final String titre) {
		this.titre = titre;
		return this;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public Livre setAuteur(final Auteur auteur) {
		this.auteur = auteur;
		return this;
	}

	public int getNombrePages() {
		return nombrePages;
	}

	public Livre setNombrePages(final int nombrePages) {
		this.nombrePages = nombrePages;
		return this;
	}

}

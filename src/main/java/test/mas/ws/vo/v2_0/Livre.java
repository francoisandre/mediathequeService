package test.mas.ws.vo.v2_0;

import test.mas.ws.vo.v1_0.Auteur;

public class Livre {

	private String titre;
	private Auteur auteur;
	private String nombrePages;

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

	public String getNombrePages() {
		return nombrePages;
	}

	public Livre setNombrePages(final String nombrePages) {
		this.nombrePages = nombrePages;
		return this;
	}

}

package test.mas.ws.vo.v4_0;

import java.util.List;

public class Disque {

	private String titre;
	private List < Interprete > interpretes;

	public String getTitre() {
		return titre;
	}

	public Disque setTitre(final String titre) {
		this.titre = titre;
		return this;
	}

	public List < Interprete > getInterpretes() {
		return interpretes;
	}

	public Disque setInterpretes(final List < Interprete > interpretes) {
		this.interpretes = interpretes;
		return this;
	}

}

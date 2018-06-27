package test.mas.ws.service.v4_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test.mas.ws.vo.v4_0.Auteur;
import test.mas.ws.vo.v4_0.Disque;
import test.mas.ws.vo.v4_0.Interprete;
import test.mas.ws.vo.v4_0.Livre;

public class MediathequeServiceImpl implements IMediathequeService {

	private static List < Livre > livres = new ArrayList < Livre >();
	private static List < Disque > disques = new ArrayList < Disque >();

	static {
		livres.add(new Livre().setTitre("La ligne verte").setNombrePages(300)
			.setAuteur((Auteur) new Auteur().setNom("King").setPrenom("Stephen")));
		livres.add(new Livre().setTitre("Le K").setNombrePages(400)
			.setAuteur((Auteur) new Auteur().setNom("Buzzati").setPrenom("Dino")));
		livres.add(new Livre().setTitre("Cent ans de solitude").setNombrePages(400)
			.setAuteur((Auteur) new Auteur().setNom("Garcia-Marquez").setPrenom("Gabriel")));

		Interprete paul = (Interprete) new Interprete().setNom("McCartney").setPrenom("Paul");
		Interprete john = (Interprete) new Interprete().setNom("Lennon").setPrenom("John");

		ArrayList < Interprete > beatles = new ArrayList < Interprete >();
		beatles.add(john);
		beatles.add(paul);
		beatles.add((Interprete) new Interprete().setNom("Harrison").setPrenom("George"));
		beatles.add((Interprete) new Interprete().setNom("Starr").setPrenom("Ringo"));

		disques.add(new Disque().setTitre("Ram").setInterpretes(Collections.singletonList(paul)));
		disques.add(new Disque().setTitre("Imagine").setInterpretes(Collections.singletonList(john)));
		disques.add(new Disque().setTitre("Abbey road").setInterpretes(beatles));
	}

	public List < Livre > getLivres() {
		return livres;
	}

	public List < Disque > getDisques() {
		return disques;
	}

}

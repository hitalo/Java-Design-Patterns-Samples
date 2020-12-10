package br.main;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Subject {

	protected ArrayList<Observer> inscritos = new ArrayList<Observer>();
	protected String ultimoVideo;
	
	public void addInscrito(Inscrito inscrito) {
		this.inscritos.add(inscrito);
	}
	
	public String getUltimoVideo() {
		return this.ultimoVideo;
	}
	
	protected void notificar() {
		Iterator<Observer> it = inscritos.iterator();
		
		while(it.hasNext()) {
			it.next().update();
		}
	}
}

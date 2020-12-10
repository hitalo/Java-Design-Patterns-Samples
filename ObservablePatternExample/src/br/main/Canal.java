package br.main;

public class Canal extends Subject {
	
	

	public void publicarVideo(String nome) {
		this.ultimoVideo = nome;
		notificar();
	}
	
	
}

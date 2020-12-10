package br.main;

public class Inscrito extends Observer {

	
	private String nome;
	
	
	public Inscrito(String nome, Subject canal) {
		this.nome = nome;
		this.canal = canal;
		this.canal.addInscrito(this);
	}

	public void update() {
		System.out.println(this.nome + " diz: " + this.canal.getUltimoVideo());
	}
	
}

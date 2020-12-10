package br.main;

import java.util.ArrayList;

public class Email {
	private ArrayList<String> destinatarios = new ArrayList<>();
	private String titulo;
	private String corpo;
	private boolean saudacao = false;
	
	public ArrayList<String> getDestinatarios() {
		return destinatarios;
	}
	public void addDestinatario(String destinatario) {
		this.destinatarios.add(destinatario);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public boolean isSaudacao() {
		return saudacao;
	}
	public void addSaudacao() {
		this.saudacao = true;
	}
	
	@Override
	public String toString() {
		return "Email [destinatarios=" + destinatarios + ", titulo=" + titulo + ", corpo=" + corpo + ", saudacao="
				+ saudacao + "]";
	}
	
}

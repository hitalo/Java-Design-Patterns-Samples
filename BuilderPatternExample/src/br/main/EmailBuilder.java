package br.main;


public class EmailBuilder {
	private Email email;
	
	
	public EmailBuilder() {
		this.email = new Email();
	}

	public EmailBuilder addDestinatario(String destinatario) {
		this.email.addDestinatario(destinatario);
		return this;
	}
	
	public EmailBuilder setTitulo(String titulo) {
		this.email.setTitulo(titulo);
		return this;
	}
	
	public EmailBuilder setCorpo(String corpo) {
		this.email.setCorpo(corpo);
		return this;
	}

	public EmailBuilder addSaudacao() {
		this.email.addSaudacao();
		return this;
	}
	
	public Email build() {
		return this.email;
	}
}

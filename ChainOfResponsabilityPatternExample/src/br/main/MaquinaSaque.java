package br.main;

public class MaquinaSaque {

	private Nota50Chain nota50;
	private Nota20Chain nota20;
	private Nota10Chain nota10;
	private Chain inicio;
	
	public MaquinaSaque() {
		
		nota50 = new Nota50Chain();
		nota20 = new Nota20Chain();
		nota10 = new Nota10Chain();
		inicio = nota50;
		
		nota50.setNextChain(nota20);
		nota20.setNextChain(nota10);
		
	}
	
	
	public void sacar(Moeda valor) {
		inicio.despachar(valor);
	}
}

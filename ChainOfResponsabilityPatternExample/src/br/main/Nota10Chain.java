package br.main;

public class Nota10Chain implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;
	}

	@Override
	public void despachar(Moeda valor) {
		
		if(valor.getValor() >= 10) {
			
			int v = valor.getValor();
			int numNotas = v/10;
			System.out.println(numNotas + " notas de 10");
			
			int resto = v%10;
			if(resto > 0)
				this.nextChain.despachar(new Moeda(resto));
		}
		
	}

}

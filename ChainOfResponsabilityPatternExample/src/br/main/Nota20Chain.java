package br.main;

public class Nota20Chain implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;
	}

	@Override
	public void despachar(Moeda valor) {
		
		if(valor.getValor() >= 20) {
			
			int v = valor.getValor();
			int numNotas = v/20;
			System.out.println(numNotas + " notas de 20");
			
			int resto = v%20;
			if(resto > 0)
				this.nextChain.despachar(new Moeda(resto));
		} else {
			this.nextChain.despachar(valor);
		}
		
	}

}

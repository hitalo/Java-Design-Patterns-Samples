package br.main;

public class Nota50Chain implements Chain{

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain chain) {
		this.nextChain = chain;
	}

	@Override
	public void despachar(Moeda valor) {
		
		if(valor.getValor() >= 50) {
			
			int v = valor.getValor();
			int numNotas = v/50;
			System.out.println(numNotas + " notas de 50");
			
			int resto = v%50;
			if(resto > 0)
				this.nextChain.despachar(new Moeda(resto));
		} else {
			this.nextChain.despachar(valor);
		}
		
	}

}

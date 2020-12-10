package br.main;

public class Livro {
	
	private LivroState state;
	
	
	
	public Livro() {
		super();
		this.state = DisponivelState.instacia();
	}

	
	public void solicitar() {
		this.state.solicitar(this);
	}
	
	public void devolver() {
		this.state.devolver(this);
	}
	

	public void setState(LivroState state) {
		this.state = state;
	}



	@Override
	public String toString() {
		return "Livro [state=" + state + "]";
	}
	
	
}

package br.main;

public class DisponivelState extends LivroState {

	private static DisponivelState instancia;
	
	@Override
	public void solicitar(Livro livro) {
		System.out.println("Livro sendo solicitado!");
		livro.setState(EmprestadoState.instacia());
	}

	@Override
	public void devolver(Livro livro) {
		System.out.println("Livro já está disponível!");
	}

	
	public static DisponivelState instacia() {
		if(instancia == null)
			instancia = new DisponivelState();
		
		return instancia;
	}
}

package br.man;

public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Escola escola = new Escola("UERN");
		Trabalho trabalho = new Trabalho("NASA");
		
		
		escola.accept(aluno);
		escola.accept(professor);
		trabalho.accept(aluno);
		trabalho.accept(professor);
		
	}

}

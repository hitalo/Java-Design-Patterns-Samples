package br.man;

public class Aluno implements Visitor {

	@Override
	public void visit(Escola escola) {
		System.out.println("Aluno estuda na escola " + escola.getName());
	}

	@Override
	public void visit(Trabalho trabalho) {
		System.out.println("Aluno visitando a empresa " + trabalho.getName());
	}

}

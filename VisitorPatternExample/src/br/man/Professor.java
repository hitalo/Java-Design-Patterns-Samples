package br.man;

public class Professor implements Visitor{

	@Override
	public void visit(Escola escola) {
		System.out.println("Professor ensina na escola " + escola.getName());
	}

	@Override
	public void visit(Trabalho trabalho) {
		System.out.println("Professor também trabalha em " + trabalho.getName());
	}

}

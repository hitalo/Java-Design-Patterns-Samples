package br.man;

public class Trabalho implements Visitable {

	private String name;
	
	public Trabalho(String name) {
		this.name = name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return name;
	}
}

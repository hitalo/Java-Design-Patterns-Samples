package br.man;

public class Escola implements Visitable {

	private String name;
	
	public Escola(String name) {
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

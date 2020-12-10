package br.main;

public abstract class Observer {
	protected Subject canal;
	public abstract void update();
}

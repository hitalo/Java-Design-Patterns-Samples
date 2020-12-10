package br.main;

public interface Chain {
 public void setNextChain(Chain chain);
 public void despachar(Moeda valor);
}

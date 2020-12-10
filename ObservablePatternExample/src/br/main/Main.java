package br.main;

public class Main {

	public static void main(String[] args) {

		Canal canalYouTube = new Canal();
		new Inscrito("Maria", canalYouTube);
		new Inscrito("Carlos", canalYouTube);
		
		canalYouTube.publicarVideo("Project patterns");
		canalYouTube.publicarVideo("Project patterns 2");
	}

}

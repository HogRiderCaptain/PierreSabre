package personnages;

public class Humain { 
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent){
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void gagnerArgent(int gain) {
		assert gain > 0;
		argent += gain;
	}

	public void perdreArgent(int gain) {
		assert gain <= argent;
		argent -= gain;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix){
		if(prix > argent)
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à  "+ prix +" sous");
		else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir une " + bien + " à "+ prix + " sous");
			perdreArgent(prix);
		}
	}

	public void parler(String texte) {
		System.out.println("(Prof) - " + texte);
	}
}
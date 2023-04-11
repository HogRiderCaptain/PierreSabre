package personnages;

public class Humain { 
	private String nom;
	private String boisson;
	private int argent;
	private Humain memoire[] = new Humain[30];
	protected int nbConnaissance = 0;

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

	protected int getArgent() {
		return argent;
	}

	protected void setArgent(int argent) {
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
		System.out.println("("+getNom()+") - " + texte);
	}

	private void memoriser(Humain autreHumain) {
		if (nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = autreHumain;
			nbConnaissance ++;
		}else {
			for (int i=0;i<memoire.length-1;i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[memoire.length-1] = autreHumain;
		}	
	}

	private void repondre(Humain autreHumain) {
		direBonjour();
		this.memoriser(autreHumain);
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void listerConnaissance() {
		if (nbConnaissance > 0) {
			System.out.print("("+getNom()+") - Je connais beaucoup de monde dont : ");
			for (int i = 0; i < nbConnaissance -1; i++) {
				if (memoire[i] != null) {
					System.out.print(memoire[i].getNom() + " , ");
				}
			}
			System.out.print(memoire[nbConnaissance-1].getNom());
		}
		System.out.println();
	}
}
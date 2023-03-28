package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}
	
	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + " , si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J’ai piqué les " + gain + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
		int gain = getArgent();
		setArgent(0);
		if (reputation > 1 )
			reputation --;
		
		parler("J’ai perdu mon duel et mes " + gain + " sous, snif... J'ai déshonoré le clan de " + clan);
		return gain;
	}

	public int gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
		return gain;
	}
}
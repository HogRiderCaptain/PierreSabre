package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous.");
		beneficiaire.parler(don + " sous ! Je te remercie généreux donateur!");
		beneficiaire.gagnerArgent(don);
		perdreArgent(don);
	}
	
	public void provoquer(Yakuza adversaire){
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n" + 
				"marchand!");
		int force_ronin = honneur*2;
		int force_yakuza = adversaire.getReputation();
		
		if (force_ronin >= force_yakuza) {
			honneur ++;
			parler("Je t’ai eu petit yakusa!");
			setArgent(adversaire.perdre());
		} else {
			if (honneur > 0)
				honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			setArgent(adversaire.gagner(getArgent()));
		}
	}
}

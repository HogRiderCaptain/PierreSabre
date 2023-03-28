package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof= new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		System.out.println("-----------------------------------------------------------------");
		Commercant marco= new Commercant("Marco",20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("-----------------------------------------------------------------");
		Yakuza yaku= new Yakuza("Yaku Le Noir","whisky",30,"Warsong",4);
		yaku.direBonjour();
		yaku.extorquer(marco);
		System.out.println("-----------------------------------------------------------------");
		Ronin roro = new Ronin("Roro","shochu",60);
		roro.direBonjour();
		roro.donner(marco);
		System.out.println("-----------------------------------------------------------------");
		roro.provoquer(yaku);
	}

}

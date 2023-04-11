package histoire;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;


public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong",0);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		
		marco.faireConnaissanceAvec(roro);
		System.out.println("-----------------------------------------------------------------");
		marco.faireConnaissanceAvec(yaku);
		System.out.println("-----------------------------------------------------------------");
		marco.faireConnaissanceAvec(chonin);
		System.out.println("-----------------------------------------------------------------");
		marco.faireConnaissanceAvec(kumi);
		System.out.println("-----------------------------------------------------------------");
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();	
		System.out.println("-----------------------------------------------------------------");
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		marco.faireConnaissanceAvec(akimoto);
		akimoto.boire("thé");
	}

}

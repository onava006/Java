package objectsMaster;

public class Game {

	public static void main(String[] args) {
		Integer samuraiHealth = 200;
		Integer wizardHealth = 50;
		Integer wizardIntelligence = 8;
		Integer ninjaStealth = 10;
		
		
		Wizard Jose = new Wizard (wizardHealth,wizardIntelligence);
		Samurai Fumito = new Samurai(samuraiHealth); 
		Ninja Naruto = new Ninja(100,ninjaStealth);
		
		System.out.println(Naruto.getHealth());
		
		Jose.fireBall(Naruto);
		Naruto.runAray();
		
		Fumito.deahBlow(Jose);
		System.out.print(Naruto.getHealth());
	}

}

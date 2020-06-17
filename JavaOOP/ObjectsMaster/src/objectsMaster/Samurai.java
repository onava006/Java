package objectsMaster;

public class Samurai extends Human{

	static int number = 0;
	public Samurai(Integer health) {
		super(health);
		number++;
		// TODO Auto-generated constructor stub
	}	
	
	void deahBlow(Human target) {
		target.setHealth(0);
		Integer halfLifePoints = this.getHealth()/2;
		this.setHealth(-halfLifePoints);
		
	}
	void meditate() {
		Integer meditate = 10;
		setHealth(meditate);
	}
	public int howMany() {
		return number;
	}
}

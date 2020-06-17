package objectsMaster;

public class Ninja extends Human{
	
	
	public Ninja(Integer health, Integer stealth) {
		super(health);
		this.stealth = stealth;
	}
	
	public void steal(Human target) {
		Integer toSteal = this.stealth ;
		target.setHealth(-toSteal);
		this.setHealth(toSteal);
	}
	
	public void runAray() {
		this.setHealth(-10);
		System.out.println("Escapé juyuuuu");
	}
}

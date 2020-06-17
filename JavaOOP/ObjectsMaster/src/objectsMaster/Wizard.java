package objectsMaster;

public class Wizard extends Human{
	
	
	public Wizard(Integer health, Integer intelligence) {
		this.health = health;
		this.intelligence = intelligence;
	}
	
	
	public void heal(Human target){
		Integer toCure = this.intelligence;
		target.setHealth(toCure);
	}
	
	public void fireBall(Human target) {
		Integer toDamage = (this.intelligence) * 3;
		target.setHealth(-toDamage);		
	}
	
	

	
	
}

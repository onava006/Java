package objectsMaster;

public class Human {
	Integer strength = 3;
	Integer intelligence = 3; 
	Integer stealth = 3;
	Integer max;
	private Integer health = 100; 
		
		
	public Human(Integer health) {
		this.health = health;
		this.max = health;
	}
	
	public Human(Integer intelligence) {		
		this.intelligence = intelligence;
	}
	
	

	public void attack(Human target) {
		target.health = -(strength);
		System.out.println("se hizo un ataque");	 
	}
	
	void setHealth(Integer healing) {
		health += healing; 
		if(health > max) {
			health = max;
		} else if (health < 0) {
			health = 0;
			System.out.println("El personaje ha morido");
		}
	}
	
	Integer getHealth() {
		return health;
	}

}

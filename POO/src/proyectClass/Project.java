package proyectClass;

public class Project {
	String nombre;
	String descripcion;
	double initialCost;
	
	public Project(){		
	}	
	public Project(String name){
		this.nombre = name;
	}	
	public Project(String name, String description){
			this.nombre = name;
			this.descripcion = description;			
	}
	
	//setter y getter variable nombre;
	public void setName(String name) {
		nombre = name;
	}
	public String getName() {
		return nombre;
	}

	//setter y getter variable descripcion;
	public void setDescription(String description) {
		descripcion = description;
	}
	public String getDescription() {
		return descripcion;
	}
	
	//getter ambas variables; 
	
	public String elevatorPitch() {		
		return nombre + " : " + descripcion;
	}
}

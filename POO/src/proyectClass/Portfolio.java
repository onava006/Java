package proyectClass;

import java.util.ArrayList;

public class Portfolio<T> {
	ArrayList<T> projects = new ArrayList<T>();	

//setter de projects
	public void addProject(T project) {
	projects.add(project);
	}
	public void getProjects() {
		System.out.println("Los projectos anclados son" + projects);
		System.out.println("El detalle de estos es");
		
		for(T elements : projects) {
			System.out.println(elements);

		}
		
	}
	
	
}



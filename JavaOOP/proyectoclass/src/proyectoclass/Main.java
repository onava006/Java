package proyectoclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project noConstructor = new Project();
		Project nameConstructor = new Project("pepito");
		Project bothConstructor = new Project("Juanito","Crea programas muy random a pedido");

		noConstructor.setName("bryan");
		noConstructor.setDescription("La descripcion es muy random");
		//System.out.println(noConstructor.elevatorPitch());

		nameConstructor.setDescription("Solo con fines académicos");
		//System.out.println(nameConstructor.elevatorPitch());
		//System.out.println(bothConstructor.elevatorPitch());

		Portfolio<Project> test = new Portfolio<Project>();

		test.addProject(noConstructor);
		test.addProject(bothConstructor);
		test.addProject(nameConstructor);


		Project forArrayList = new Project();
		System.out.println("Los proyectos almacenados son estos: ");
		System.out.println();
		for(int i = 0; i < test.projects.size(); i++) {
			forArrayList = test.projects.get(i);
			System.out.println(forArrayList.elevatorPitch());
		}
	}
}

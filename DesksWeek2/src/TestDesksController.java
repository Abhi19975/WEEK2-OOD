
public class TestDesksController {

	public static void main(String[] args) {
		
		//Factory   
		
		DesksFactory SchoolDeskFactory = DeskMakerFactory.getDeskFactory("School");
		Desks wooden = SchoolDeskFactory.makeDesks("Wooden");
		wooden.sale();
		Desks metal = SchoolDeskFactory.makeDesks("Metal");
		metal.sale();
		
		//Singleton Design
		DesksSingleton desk = DesksSingleton.getInstance();
		desk.shape("Wooden");
		desk.shape("Metal");
		DesksSingleton desk1 = DesksSingleton.getInstance();
		 
		
			
			
	}

}

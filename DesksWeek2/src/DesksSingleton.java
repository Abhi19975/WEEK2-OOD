
public class DesksSingleton {
	
	
	private static DesksSingleton uniqueInstance;
  
	
  
	public static DesksSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("\n\n\nCreating a unique instance");
			uniqueInstance = new DesksSingleton();
		}
		System.out.println("\nReturning instance");
		return uniqueInstance;
	}
	
	public void shape(String material)
	{
		if(material.equals("Wooden"))
		{
			System.out.println("Shape of |"+material+"| can be Round or Square or Rectangle");
		}
		else if (material.equals("Metal"))
		{
			System.out.println("Shape of |"+material+"| can be Round or Square or Rectangle or Hexagonal");
		}
		else
		{}
	}

}


public class SchoolDeskFactory implements DesksFactory {
	
	int size;
	public SchoolDeskFactory(int size)
	{
		this.size = size;
	}
	
	public Desks makeDesks(String material) 
	{
		System.out.println("Making Desks for School....");
		if("Wooden".equalsIgnoreCase(material)) 
		{
			return new Wooden(size);
	    }  
	    if("Metal".equalsIgnoreCase(material)) 
	    {
	    	return new Metal(size);
	    }
	    return null;
	}

}

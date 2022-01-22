
//I am keeping it simple, but we can add as many functionality and more classes as we want
public class DeskMakerFactory {

public static DesksFactory getDeskFactory(String deskType) {
        
        if("School".equalsIgnoreCase(deskType)) {
            return new SchoolDeskFactory(4);
        }  
        
        return null;
    }

}

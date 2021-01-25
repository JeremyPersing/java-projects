package name.search;


public class NameGuide {
    private String[] popularNames = {"Jacob", "Michael", "Joshua", "Matthew", "Daniel", "Christopher",
                            "Andrew", "Ethan", "Joseph", "William", "Anthony", "David", "Alexander",
                            "Emily", "Madison", "Emma", "Olivia", "Hannah", "Sophia", "Grace", 
                            "Brianna", "Kayla", "Mia"};
    private String name;
    
    
    public NameGuide(String userName) {
        name = userName;
    }
    
    public boolean isPopular() {
        boolean popular = false;
        int index = 0;
        
        while (!popular && index < popularNames.length) {
            if (popularNames[index].equalsIgnoreCase(name)) {
                popular = true;
            }
            else {
                index++;
            }
        }
        
        return popular;
    }
}

package ryanapplicationmain;

import animal.Dog;

/**
 *
 * @author ryanl
 */
public class RyanApplicationMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        // Create Dog objects
        Dog dog1 = new Dog("Doberman", 13, "Alert", 1500.00);
        Dog dog2 = new Dog("pug", 12, "Chill", 550.00);
        
        // Call setters (we don't need this anymore now that we have our constructor
        /*
        dog1.setBreed("Doberman");
        dog1.setLifespan(13);
        dog1.setBehavior("alert");
        dog1.setPrice(500.00);
        
        dog2.setBreed("Pug");
        dog2.setLifespan(12);
        dog2.setBehavior("chill");
        dog2.setPrice(550.00);
        */
        

        // Call getters
        System.out.println("Breed: " + dog1.getBreed()); 
        System.out.println("Lifespan: " + dog1.getLifespan()+ " years");
        System.out.println("Behavior: " + dog1.getBehavior());    
        System.out.println("Price: $" + dog1.getPrice()); 
        
        // This adds a blank line in betwen the two calls for the getters
        System.out.println("");
        
        // 2nd dog printing the getters
        System.out.println("Breed: " + dog2.getBreed());
        System.out.println("Lifespan: " + dog2.getLifespan() + " years");
        System.out.println("Behavior: " + dog2.getBehavior());    
        System.out.println("Price:  $" + dog2.getPrice()); 
    }
        
}

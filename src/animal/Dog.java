package animal;

/**
 * @author ryanl
 */
public class Dog extends Animal{
    
    private String sound;

    public String getSound() {
        return "Bark!";
    }

    public void setSound(String sound) {
        this.sound = sound;
    } 
}

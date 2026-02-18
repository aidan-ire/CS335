/**
 * Concrete implementation of a German electrical plug connector.
 * Represents a Zest brand German plug that can deliver electricity.
 */
public final class ZestPlug implements GermanPlugConnector {
    
    /**
     * Delivers electricity through the Zest German plug connector.
     * Prints a message to indicate the action.
     */
    public void giveElectricity(){
        System.out.println("giving electricity to a zest plug.");
    }
}